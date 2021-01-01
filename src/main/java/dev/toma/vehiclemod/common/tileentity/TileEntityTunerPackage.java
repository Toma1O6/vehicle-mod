package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.items.ITunerPackageEntry;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.ArgWeightedRandom;
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

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TileEntityTunerPackage extends TileEntityInventory implements ILockpickable {

    private static final LazyLoad<IntHashMap<Map<ITunerPackageEntry.Category, List<Item>>>> LOOT_POOL = new LazyLoad<>(TileEntityTunerPackage::genLootPool);
    private static final ArgWeightedRandom<ITunerPackageEntry.Category, Integer> CATEGORIES = new ArgWeightedRandom<>(ITunerPackageEntry.Category::getChance, ITunerPackageEntry.Category.values());
    private int[] combinations;
    private NonNullList<ItemStack> inventory = NonNullList.withSize(2, ItemStack.EMPTY);

    public void fill(int tier) {
        if(!isInvalid() && !world.isRemote) {
            for (int i = 0; i < 2; i++) {
                ITunerPackageEntry.Category category = CATEGORIES.getRandom(tier);
                List<Item> pool = LOOT_POOL.get().lookup(tier).getOrDefault(category, Collections.emptyList());
                if(pool.isEmpty()) {
                    VehicleMod.logger.error("Found empty loot pool (T:{},C:{})", tier, category);
                    continue;
                }
                Item item = getRandom(pool, VehicleMod.random);
                setInventorySlotContents(i, new ItemStack(item));
            }
            combinations = new int[6 + tier];
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

    static <I extends Item & ITunerPackageEntry> IntHashMap<Map<ITunerPackageEntry.Category, List<Item>>> genLootPool() {
        List<I> items = ForgeRegistries.ITEMS.getValuesCollection().stream()
                .filter(item -> item instanceof ITunerPackageEntry)
                .map(it -> (I) it)
                .collect(Collectors.toList());
        IntHashMap<Map<ITunerPackageEntry.Category, List<Item>>> lootPool = new IntHashMap<>();
        for (I i : items) {
            int tier = i.getTier();
            ITunerPackageEntry.Category category = i.getCategory();
            lookup(lootPool, tier, HashMap::new).computeIfAbsent(category, cat -> new ArrayList<>()).add(i);
        }
        return lootPool;
    }

    static <T> T lookup(IntHashMap<T> map, int hashEntry, Supplier<T> factory) {
        T t = map.lookup(hashEntry);
        if(t == null) {
            t = factory.get();
            map.addKey(hashEntry, t);
        }
        return t;
    }

    static <T> T getRandom(List<T> list, Random random) {
        return list.get(random.nextInt(list.size()));
    }
}
