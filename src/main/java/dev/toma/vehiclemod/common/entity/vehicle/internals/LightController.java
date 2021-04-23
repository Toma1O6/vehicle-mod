package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LightController implements ISerializationListener {

    private boolean lights = true;
    private TurnLightStatus turnLightStatus = TurnLightStatus.OFF;

    @SideOnly(Side.CLIENT)
    public boolean areLightsOn(EntityVehicle vehicle) {
        return lights;
    }

    @SideOnly(Side.CLIENT)
    public boolean isReversing(EntityVehicle vehicle) {
        /*double current = vehicle.getEntitySpeed();
        double prev = vehicle.getLastEntitySpeed();
        if(vehicle.getControllingPassenger() == Minecraft.getMinecraft().player) {
            return current >= prev && vehicle.isBitActive(EntityDriveable.BACKWARD);
        }
        // ??
        return vehicle.currentSpeed < 0 && vehicle.currentSpeed <= vehicle.prevSpeed;*/
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean isBraking(EntityVehicle vehicle) {
        /*if(vehicle.getControllingPassenger() == Minecraft.getMinecraft().player) {
            return vehicle.isBitActive(EntityDriveable.BACKWARD) && vehicle.currentSpeed >= 0;
        }
        // ?
        return vehicle.currentSpeed > 0 && vehicle.currentState == EnumVehicleState.BRAKING;*/
        return false;
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

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagCompound data = new NBTTagCompound();
        data.setBoolean("lights", lights);
        data.setByte("turnStatus", (byte) turnLightStatus.ordinal());
        nbt.setTag("lightController", data);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("lightController", Constants.NBT.TAG_COMPOUND)) {
            NBTTagCompound data = nbt.getCompoundTag("lightController");
            lights = data.getBoolean("lights");
            turnLightStatus = TurnLightStatus.values()[nbt.getByte("turnStatus")];
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        buf.writeBoolean(lights);
        buf.writeByte(turnLightStatus.ordinal());
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        lights = buf.readBoolean();
        turnLightStatus = TurnLightStatus.values()[buf.readByte()];
    }

    public enum TurnLightStatus {
        OFF,
        RIGHT,
        LEFT,
        WARNING
    }
}
