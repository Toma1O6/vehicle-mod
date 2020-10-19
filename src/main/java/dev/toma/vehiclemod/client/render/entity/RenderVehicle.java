package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.util.VehicleTexture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;

import java.text.DecimalFormat;

public abstract class RenderVehicle<E extends EntityVehicle> extends Render<E> {
	
	public RenderVehicle(RenderManager manager) {
		super(manager);
	}
	
	public abstract ModelVehicle getVehicleModel();
	
	@Override
	protected ResourceLocation getEntityTexture(E entity) {
		if(entity != null) {
			return entity.getTexture().getResource();
		}
		return VehicleTexture.WHITE.getResource();
	}

	@Override
	public void doRender(E entity, double x, double y, double z, float entityYaw, float partialTicks) {
		if(entity != null)
			if(this.renderOutlines) {
				this.renderName(entity, x, y, z);
			}
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayerSP player = mc.player;
		RayTraceResult result = mc.objectMouseOver;
		if(player.isSneaking() && result != null && result.typeOfHit == RayTraceResult.Type.ENTITY && result.entityHit == entity && entity != null) {
			float f2 = entity.height + 0.5F;
			this.drawInfo(entity, mc, (float)x, (float)y + f2, (float)z);
		}
	}

	private void drawInfo(E e, Minecraft mc, float x, float y, float z) {
		FontRenderer renderer = mc.fontRenderer;
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate((float)(mc.gameSettings.thirdPersonView == 2 ? -1 : 1) * this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		GlStateManager.scale(-0.025F, -0.025F, 0.025F);
		GlStateManager.disableLighting();
		GlStateManager.depthMask(false);
		GlStateManager.enableBlend();
		GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		int i = mc.fontRenderer.getStringWidth(e.getName()) / 2;
		if(i < 50) i = 50;
		GlStateManager.disableTexture2D();
		double of = -e.height -40;
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
		bufferbuilder.pos((-i - 1), of, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos((-i - 1), of + 53, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos((i + 10), of + 53, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos((i + 10), of, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		tessellator.draw();
		GlStateManager.enableTexture2D();
		GlStateManager.depthMask(true);
		renderer.drawString(e.getName(), -i + 5, -38, -1);
		renderer.drawString("Health: " + (int)((e.health/e.getStats().maxHealth)*100) + " %", -i + 5, -25, -1);
		renderer.drawString("Fuel: " + (int)(100 * (e.fuel / e.getStats().fuelCapacity)) + " %", -i + 5, -12, -1);
		renderer.drawString("Distance: " + new DecimalFormat("#.#").format(e.getTravelledDistance()) + " km", -i + 5, 1, -1);
		GlStateManager.enableLighting();
		GlStateManager.disableBlend();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.popMatrix();
	}
}
