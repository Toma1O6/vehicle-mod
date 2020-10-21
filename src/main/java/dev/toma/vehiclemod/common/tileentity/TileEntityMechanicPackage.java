package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.item.ItemStack;
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
        }
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
}
