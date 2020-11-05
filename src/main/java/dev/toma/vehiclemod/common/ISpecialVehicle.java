package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.client.VMTickableSound;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface ISpecialVehicle {

    SoundEvent getSoundEvent();

    @SideOnly(Side.CLIENT)
    VMTickableSound getPlayingSound();

    @SideOnly(Side.CLIENT)
    void setPlayingSound(VMTickableSound sound);

    boolean isEffectActive();

    void setEffectActive(boolean active);
}
