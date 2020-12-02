package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LightController implements INBTSerializable<NBTTagCompound> {

    private boolean lights = true;
    private TurnLightStatus turnLightStatus = TurnLightStatus.OFF;

    @SideOnly(Side.CLIENT)
    public boolean areLightsOn(EntityVehicle vehicle) {
        return lights;
    }

    @SideOnly(Side.CLIENT)
    public boolean isReversing(EntityVehicle vehicle) {
        if(vehicle.getControllingPassenger() == Minecraft.getMinecraft().player) {
            return vehicle.currentSpeed <= vehicle.prevSpeed && vehicle.currentSpeed < 0 && vehicle.inputBack;
        }
        return vehicle.currentSpeed < 0 && vehicle.currentSpeed <= vehicle.prevSpeed;
    }

    @SideOnly(Side.CLIENT)
    public boolean isBraking(EntityVehicle vehicle) {
        if(vehicle.getControllingPassenger() == Minecraft.getMinecraft().player) {
            return vehicle.inputBack && vehicle.currentSpeed >= 0;
        }
        return vehicle.currentSpeed > 0 && vehicle.currentState == EnumVehicleState.BRAKING;
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
        if(turnLightStatus == status) {
            turnLightStatus = TurnLightStatus.OFF;
        } else {
            this.turnLightStatus = status;
        }
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
