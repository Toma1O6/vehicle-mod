package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TileEntityMechanicPackage extends TileEntityInventory {

    private static final LazyLoad<Map<Integer, List<ItemVehicleUpgrade>>> loot = new LazyLoad<>(TileEntityMechanicPackage::loadLoot);
    private NonNullList<ItemStack> inventory = NonNullList.withSize(2, ItemStack.EMPTY);
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
            for (int i = 0; i < variant.getPartCount(); i++) {
                float f = VehicleMod.random.nextFloat();
                for (int j = levelChances.length - 1; j >= 0; j--) {
                    float f1 = levelChances[j];
                    if(f <= f1) {
                        int level = j + 1;
                        List<ItemVehicleUpgrade> list = loot.get().get(level);
                        ItemVehicleUpgrade upgrade = list.get(VehicleMod.random.nextInt(list.size()));
                        setInventorySlotContents(i, new ItemStack(upgrade));
                        break;
                    }
                    f -= f1;
                }
            }
            List<Integer> list = fillList(variant.getButtons());
            combinations = new int[list.size()];
            int at = 0;
            while (at < combinations.length) {
                int id = VehicleMod.random.nextInt(list.size());
                combinations[at] = list.get(id);
                int n = list.remove(id);
                ++at;
            }
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

    public int[] getCombinations() {
        if(combinations.length == 0) {
            generateCombinations();
        }
        return combinations;
    }

    static Map<Integer, List<ItemVehicleUpgrade>> loadLoot() {
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

    static List<Integer> fillList(int buttons) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < buttons; i++) {
            list.add(i);
        }
        return list;
    }

    void generateCombinations() {
        IBlockState state = world.getBlockState(pos);
        if(state.getBlock() instanceof BlockMechanicPackage) {
            BlockMechanicPackage.Variant variant = ((BlockMechanicPackage) state.getBlock()).getVariant();
            List<Integer> list = fillList(variant.getButtons());
            combinations = new int[list.size()];
            int at = 0;
            while (at < combinations.length) {
                int id = VehicleMod.random.nextInt(list.size());
                combinations[at] = list.get(id);
                int n = list.remove(id);
                ++at;
            }
        } else {
            combinations = new int[1];
        }
    }
}
