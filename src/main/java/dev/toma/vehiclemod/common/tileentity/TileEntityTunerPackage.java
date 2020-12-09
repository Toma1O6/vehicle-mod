package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.items.ITunerPackageEntry;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.IntHashMap;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TileEntityTunerPackage extends TileEntityInventory implements ILockpickable {

    private static final LazyLoad<IntHashMap<List<Item>>> LOOT_POOL = new LazyLoad<>(TileEntityTunerPackage::genLootPool);
    private int[] combinations;
    private NonNullList<ItemStack> inventory = NonNullList.withSize(1, ItemStack.EMPTY);

    public void fill(int tier) {
        if(!isInvalid() && !world.isRemote) {
            List<Item> pool = LOOT_POOL.get().lookup(tier);
            Item item = getRandom(pool, VehicleMod.random);
            setInventorySlotContents(0, new ItemStack(item));
            combinations = new int[5 + tier];
            for (int i = 0; i < combinations.length; i++)
                combinations[i] = i;
            ILockpickable.shuffle(combinations);
        }
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return serializeNBT();
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(getPos(), -1, getUpdateTag());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        deserializeNBT(pkt.getNbtCompound());
    }

    @Override
    public NonNullList<ItemStack> getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(NonNullList<ItemStack> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getKeyForName() {
        return "tuner_package";
    }

    @Override
    public int[] getCombinations() {
        return combinations;
    }

    @Override
    public SPacketLockpickAttempt createLockpickPacket(int index, int offset) {
        return SPacketLockpickAttempt.lockpickPackage(index, offset, pos);
    }

    @Override
    public void handleUnlock(EntityPlayer player, World world) {
        for (int i = 0; i < getSizeInventory(); i++) {
            ItemStack stack = getStackInSlot(i);
            if(!stack.isEmpty()) {
                player.addItemStackToInventory(stack.copy());
            }
        }
        world.destroyBlock(pos, false);
    }

    @Override
    public boolean shouldBreakLockpick(Random random) {
        return random.nextBoolean();
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setIntArray("combinations", combinations);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        combinations = compound.getIntArray("combinations");
    }

    static <I extends Item & ITunerPackageEntry> IntHashMap<List<Item>> genLootPool() {
        List<I> items = ForgeRegistries.ITEMS.getValuesCollection().stream()
                .filter(item -> item instanceof ITunerPackageEntry)
                .map(it -> (I) it)
                .collect(Collectors.toList());
        IntHashMap<List<Item>> map = new IntHashMap<>();
        for (I i : items) {
            int tier = i.getTier();
            lookup(map, tier).add(i);
        }
        return map;
    }

    static <T> List<T> lookup(IntHashMap<List<T>> map, int hashEntry) {
        List<T> list = map.lookup(hashEntry);
        if(list == null) {
            list = new ArrayList<>();
            map.addKey(hashEntry, list);
        }
        return list;
    }

    static <T> T getRandom(List<T> list, Random random) {
        return list.get(random.nextInt(list.size()));
    }
}
