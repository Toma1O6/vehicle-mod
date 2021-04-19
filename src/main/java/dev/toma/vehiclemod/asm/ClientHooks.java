package dev.toma.vehiclemod.asm;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;

public class ClientHooks {

    public static void playerPreRenderCallback(AbstractClientPlayer player) {
        if(player.getRidingEntity() instanceof EntityVehicle) {
            GlStateManager.translate(0, -0.6, 0);
            GlStateManager.scale(0.6, 0.6, 0.6);
        }
    }
}
