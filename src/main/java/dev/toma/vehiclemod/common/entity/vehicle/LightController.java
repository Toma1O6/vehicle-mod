package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class LightController implements INBTSerializable<NBTTagCompound> {

    private boolean lights = true;
    private TurnLightStatus turnLightStatus = TurnLightStatus.OFF;

    public boolean areLightsOn(EntityVehicle vehicle) {
        return vehicle.fuel > 0.0F && lights;
    }

    public boolean isReversing(EntityVehicle vehicle) {
        return vehicle.currentSpeed <= vehicle.prevSpeed && vehicle.currentSpeed < 0 && vehicle.inputBack;
    }

    public boolean isBraking(EntityVehicle vehicle) {
        return vehicle.inputBack && vehicle.currentSpeed >= 0;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setBoolean("lights", lights);
        nbt.setInteger("turnStatus", turnLightStatus.ordinal());
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        lights = nbt.getBoolean("lights");
        turnLightStatus = DevUtil.getEnumFromNBT("turnStatus", nbt, TurnLightStatus.class);
    }

    public void setLightState(boolean lights) {
        this.lights = lights;
    }

    public void setTurnLightStatus(TurnLightStatus status) {
        this.turnLightStatus = status;
    }

    public boolean getLightFlag() {
        return lights;
    }

    public TurnLightStatus getTurnLightStatus() {
        return turnLightStatus;
    }

    public enum TurnLightStatus {

        OFF,
        RIGHT,
        LEFT,
        WARNING
    }
}
