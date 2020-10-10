package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class VMItem extends Item {

    public VMItem(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(VehicleMod.MODID, name));
        this.setCreativeTab(VehicleMod.TAB);
    }
}
