package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketSendSpecialVehicleStatus;
import net.minecraft.entity.player.EntityPlayerMP;

import dev.toma.vehiclemod.client.CarSound;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface ISpecialVehicle {

    boolean isEffectActive();

    void setEffectActive(boolean effect);

    SoundEvent getSoundEvent();

    @SideOnly(Side.CLIENT)
    CarSound getPlayingSound();

    @SideOnly(Side.CLIENT)
    void setPlayingSound(CarSound sound);

    default <V extends EntityVehicle & ISpecialVehicle> void startTracking(V vehicle, EntityPlayerMP player) {
        VMNetworkManager.instance().sendTo(new CPacketSendSpecialVehicleStatus(CPacketSendSpecialVehicleStatus.EnumState.START_TRACKING, vehicle), player);
    }

    default <V extends EntityVehicle & ISpecialVehicle> void stopTracking(V vehicle, EntityPlayerMP player) {
        VMNetworkManager.instance().sendTo(new CPacketSendSpecialVehicleStatus(CPacketSendSpecialVehicleStatus.EnumState.STOP_TRACKING, vehicle), player);
    }
}
