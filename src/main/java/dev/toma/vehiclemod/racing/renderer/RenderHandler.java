package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class RenderHandler {

    RacingRenderManager manager = new RacingRenderManager();

    @SubscribeEvent
    public static void renderWorld(RenderWorldLastEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        World world = mc.world;
        RacingData data = RacingDataImpl.get(world);
        Entity entity = mc.getRenderViewEntity();
        float partialTicks = event.getPartialTicks();
        double x = -interpolate(entity.posX, entity.lastTickPosX, partialTicks);
        double y = -interpolate(entity.posY, entity.lastTickPosY, partialTicks);
        double z = -interpolate(entity.posZ, entity.lastTickPosZ, partialTicks);
        if(RacingRenderManager.isDebugActive()) {
            TrackRenderer.renderTracks(data.getTracks(), x, y, z);
            return;
        }

    }

    static double interpolate(double at, double prev, float partial) {
        return prev + (at - prev) * partial;
    }
}
