package dev.toma.vehiclemod.client.render.item;

import dev.toma.vehiclemod.common.items.ItemVehicleSpawner;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;

public class RenderItemSpawner extends TileEntityItemStackRenderer {

    @Override
    public void renderByItem(ItemStack itemStackIn) {
        Class<? extends EntityVehicle> vClass = ((ItemVehicleSpawner<?>) itemStackIn.getItem()).getVehicleClass();
        Minecraft mc = Minecraft.getMinecraft();
        RenderManager manager = mc.getRenderManager();
        Render<? extends EntityVehicle> render = manager.getEntityClassRenderObject(vClass);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.5, 0.3, 0.0);
        GlStateManager.scale(0.2, 0.2, 0.2);
        GlStateManager.rotate(30.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.rotate(-45.0F, 0.0F, 1.0F, 0.0F);
        render.doRender(null, 0, 0, 0, 0.0F, 1.0F);
        GlStateManager.popMatrix();
    }
}
