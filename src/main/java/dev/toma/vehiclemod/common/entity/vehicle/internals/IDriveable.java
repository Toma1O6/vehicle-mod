package dev.toma.vehiclemod.common.entity.vehicle.internals;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IDriveable {

    boolean shouldAcceptInputFrom(Entity entity);

    void handleInputs(byte encodedInput);

    @SideOnly(Side.CLIENT)
    byte encode(GameSettings fromSettings);
}
