package dev.toma.vehiclemod.asm;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;

public class ClientHooks {

    public static void playerPreRenderCallback(AbstractClientPlayer player) {
        if(player.getRidingEntity() instanceof EntityVehicle) {
            GlStateManager.translate(0, -0.6, 0);
            GlStateManager.scale(0.6, 0.6, 0.6);
        }
    }
}
