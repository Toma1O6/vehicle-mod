package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.*;
import java.util.stream.Collectors;

public class TileEntityMechanicPackage extends TileEntityInventory implements ILockpickable {

    private static final LazyLoad<Map<Integer, List<ItemVehicleUpgrade>>> tunningLoot = new LazyLoad<>(TileEntityMechanicPackage::loadTunningLoot);
    private static final LazyLoad<Map<Integer, List<ItemPerk>>> perkLoot = new LazyLoad<>(TileEntityMechanicPackage::loadPerkLoot);
    private NonNullList<ItemStack> inventory = NonNullList.withSize(3, ItemStack.EMPTY);
    private int[] combinations;

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
        return "mechanic_package";
    }

    public void fill(BlockMechanicPackage.Variant variant) {
        if(!isInvalid() && !world.isRemote) {
            float[] levelChances = variant.getLevelChances();
            Random random = VehicleMod.random;
            for (int i = 0; i < variant.getPartCount(); i++) {
                float f = random.nextFloat();
                for (int j = 6; j >= 0; j--) {
                    float f1 = levelChances[j];
                    if(f <= f1) {
                        int level = j + 1;
                        List<ItemVehicleUpgrade> list = tunningLoot.get().get(level);
                        ItemVehicleUpgrade upgrade = list.get(random.nextInt(list.size()));
                        setInventorySlotContents(i, new ItemStack(upgrade));
                        break;
                    }
                    f -= f1;
                }
            }
            float f = random.nextFloat();
            for (int i = 9; i > 6; i--) {
                float f1 = levelChances[i];
                if(f <= f1) {
                    int level = i - 7;
                    List<ItemPerk> list = perkLoot.get().get(level);
                    ItemPerk perk = list.get(random.nextInt(list.size()));
                    setInventorySlotContents(2, new ItemStack(perk));
                    break;
                }
                f -= f1;
            }
            combinations = new int[variant.getButtons()];
            for (int i = 0; i < combinations.length; i++) {
                combinations[i] = i;
            }
            ILockpickable.shuffle(combinations);
        }
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

    @Override
    public int[] getCombinations() {
        if(combinations.length == 0) {
            generateCombinations();
        }
        return combinations;
    }

    @Override
    public boolean shouldBreakLockpick(Random random) {
        return random.nextBoolean();
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
    public SPacketLockpickAttempt createLockpickPacket(int index, int offset) {
        return SPacketLockpickAttempt.lockpickPackage(index, offset, getPos());
    }

    static Map<Integer, List<ItemVehicleUpgrade>> loadTunningLoot() {
        List<ItemVehicleUpgrade> list = ForgeRegistries.ITEMS.getValuesCollection()
                .stream()
                .filter(i -> i instanceof ItemVehicleUpgrade)
                .map(i -> (ItemVehicleUpgrade) i)
                .collect(Collectors.toList());
        Map<Integer, List<ItemVehicleUpgrade>> map = new HashMap<>();
        for (ItemVehicleUpgrade upgrade : list) {
            map.computeIfAbsent(upgrade.getLevel(), i -> new ArrayList<>()).add(upgrade);
        }
        return map;
    }

    static Map<Integer, List<ItemPerk>> loadPerkLoot() {
        List<ItemPerk> perks = ForgeRegistries.ITEMS.getValuesCollection().stream().filter(i -> i instanceof ItemPerk).map(i -> (ItemPerk) i).collect(Collectors.toList());
        Map<Integer, List<ItemPerk>> map = new HashMap<>();
        for (ItemPerk perk : perks) {
            int index = getPerkCategory(perk);
            map.computeIfAbsent(index, i -> new ArrayList<>()).add(perk);
        }
        return map;
    }

    static int getPerkCategory(ItemPerk perk) {
        String name = perk.getRegistryName().getResourcePath();
        if(name.contains("gold"))
            return 2;
        else if(name.contains("silver"))
            return 1;
        else return 0;
    }

    void generateCombinations() {
        IBlockState state = world.getBlockState(pos);
        if(state.getBlock() instanceof BlockMechanicPackage) {
            BlockMechanicPackage.Variant variant = ((BlockMechanicPackage) state.getBlock()).getVariant();
            combinations = new int[variant.getButtons()];
            for (int i = 0; i < combinations.length; i++) {
                combinations[i] = i;
            }
            ILockpickable.shuffle(combinations);
        } else {
            combinations = new int[1];
        }
    }
}
