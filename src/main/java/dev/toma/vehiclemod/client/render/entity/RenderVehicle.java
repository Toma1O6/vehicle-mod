package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.util.DevUtil;
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

public abstract class RenderVehicle<V extends EntityVehicle> extends Render<V> {
	
	public RenderVehicle(RenderManager manager) {
		super(manager);
	}
	
	public abstract ModelVehicle getVehicleModel();
	
	@Override
	protected ResourceLocation getEntityTexture(V entity) {
		if(entity != null) {
			return entity.getTexture().getResource();
		}
		return VehicleTexture.WHITE.getResource();
	}

	@Override
	public void doRender(V entity, double x, double y, double z, float entityYaw, float partialTicks) {
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

	private void drawInfo(V vehicle, Minecraft mc, float x, float y, float z) {
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
		int i = renderer.getStringWidth(vehicle.getName()) / 2;
		if(i < 50) i = 50;
		GlStateManager.disableTexture2D();
		double of = -vehicle.height - 70;
		int left = -i - 1;
		int right = i + 10;
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
		bufferbuilder.pos(left, of, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos(left, of + 88, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos(right, of + 88, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		bufferbuilder.pos(right, of, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
		tessellator.draw();
		GlStateManager.enableTexture2D();
		GlStateManager.depthMask(true);
		renderer.drawString(vehicle.getName(), -i + 5, -68, -1);
		renderer.drawString("Health: " + (int)((vehicle.health/vehicle.getActualStats().maxHealth)*100) + " %", -i + 5, -57, -1);
		renderer.drawString("Fuel: " + (int)(100 * (vehicle.fuel / vehicle.getActualStats().fuelCapacity)) + " %", -i + 5, -44, -1);
		renderer.drawString("Distance: " + new DecimalFormat("#.#").format(vehicle.getTravelledDistance()) + " km", -i + 5, -33, -1);
		VehicleStats stats = vehicle.getActualStats();
		float speedStat = (stats.maxSpeed - VehicleStats.topSpeedMin) / (VehicleStats.topSpeedMax - VehicleStats.topSpeedMin);
		float accelerationStat = (stats.acceleration - VehicleStats.accelerationMin) / (VehicleStats.accelerationMax - VehicleStats.accelerationMin);
		float handlingStat = (stats.turnSpeed - VehicleStats.handlingMin) / (VehicleStats.handlingMax - VehicleStats.handlingMin);
		float brakingStat = (stats.brakeSpeed - VehicleStats.brakingMin) / (VehicleStats.brakingMax - VehicleStats.brakingMin);
		int px = left + 20;
		int width = right - px - 3;
		DevUtil.drawColor(px - 1, -22, px + width + 1, -17, 0.0F, 0.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px, -21, (int)(px + width * speedStat), -18, -0.01, 0.0F, 1.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px - 1, -13, px + width + 1, -8, 0.0F, 0.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px, -12, (int)(px + width * accelerationStat), -9, -0.01, 1.0F, 0.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px - 1, -4, px + width + 1, 1, 0.0F, 0.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px, -3, (int)(px + width * handlingStat), 0, -0.01, 0.0F, 0.0F, 1.0F, 1.0F);
		DevUtil.drawColor(px - 1, 5, px + width + 1, 10, 0.0F, 0.0F, 0.0F, 1.0F);
		DevUtil.drawColor(px, 6, (int)(px + width * brakingStat), 9, -0.01, 1.0F, 1.0F, 0.0F, 1.0F);
		renderer.drawString("SPD", left + 1, -23, 0x00ff00);
		renderer.drawString("ACC", left + 1, -14, 0xff0000);
		renderer.drawString("HDL", left + 1, -5, 0xff);
		renderer.drawString("BRK", left + 1,  4, 0xffff00);
		GlStateManager.enableLighting();
		GlStateManager.disableBlend();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.popMatrix();
	}
}
