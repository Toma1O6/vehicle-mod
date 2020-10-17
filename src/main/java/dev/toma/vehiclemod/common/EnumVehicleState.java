package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import net.minecraft.util.SoundEvent;

import java.util.function.Function;

public enum EnumVehicleState {

    IDLE(VehicleSoundPack::idle),
    ACCELERATING(VehicleSoundPack::accelerate),
    BRAKING(VehicleSoundPack::brake),
    KEEPING_SPEED(VehicleSoundPack::release);

    final Function<VehicleSoundPack, SoundEvent> function;

    EnumVehicleState(Function<VehicleSoundPack, SoundEvent> function) {
        this.function = function;
    }

    public SoundEvent getSound(VehicleSoundPack soundPack) {
        return function.apply(soundPack);
    }
}
