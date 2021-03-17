package dev.toma.vehiclemod.common.properties;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.proxy.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;

import java.util.function.Function;

public class PropertyRaceCreation implements Property<Boolean, EntityPlayer> {

    Function<EntityPlayer, Boolean> func;

    PropertyRaceCreation() {
        CommonProxy proxy = VehicleMod.proxy;
        func = proxy::isOp;
    }

    @Override
    public void set(Function<EntityPlayer, Boolean> function) {
        this.func = function;
    }

    @Override
    public Boolean get(EntityPlayer player) {
        return func.apply(player);
    }
}
