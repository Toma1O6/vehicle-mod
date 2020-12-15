package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.NeonHandler;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.common.items.ItemNeon;
import dev.toma.vehiclemod.common.items.ItemNeonPulser;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.text.DecimalFormat;

public abstract class RenderVehicle<V extends EntityVehicle> extends Render<V> {

	static final ResourceLocation NEON = VehicleMod.getResource("textures/entity/neon_texture.png");

	public RenderVehicle(RenderManager manager) {
		super(manager);
	}
	
	public abstract ModelVehicle<V> getVehicleModel();
	
	@Override
	protected ResourceLocation getEntityTexture(V entity) {
		if(entity != null) {
			return entity.getTexture().getResource();
		}
		return this.getDefaultResource();
	}

	protected ResourceLocation getDefaultResource() {
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
		// neons
		if(entity != null) {
			drawNeons(entity, x, y, z, entityYaw);
		}
	}

	private void drawNeons(V vehicle, double x, double y, double z, float yaw) {
		PositionManager positions = vehicle.getVehiclePositions();
		NeonHandler neonHandler = vehicle.getNeonHandler();
		ItemStack pulserStack = neonHandler.getPulserUpgrade();
		int pulse = pulserStack.isEmpty() ? 0 : ((ItemNeonPulser) pulserStack.getItem()).getPulseLength();
		float aMax = 0.53F;
		if(pulse > 0) {
			int time = vehicle.ticksExisted % pulse;
			float half = pulse / 2.0F;
			float diff = Math.abs((time - half) / half);
			aMax = Math.max(0.1F, aMax * diff);
		}
		float aMin = Math.max(0.0F, aMax - 0.42F);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		GlStateManager.rotate(-yaw, 0.0F, 1.0F, 0.0F);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableBlend();
		GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		GlStateManager.disableLighting();
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240, 240);
		GlStateManager.shadeModel(GL11.GL_SMOOTH);
		GlStateManager.disableCull();
		Minecraft.getMinecraft().getTextureManager().bindTexture(NEON);
		for (NeonHandler.Direction direction : NeonHandler.Direction.values()) {
			drawNeon(vehicle, direction, neonHandler, positions, yaw, aMax, aMin);
		}
		GlStateManager.enableCull();
		GlStateManager.shadeModel(GL11.GL_FLAT);
		GlStateManager.disableBlend();
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}

	private void drawNeon(V vehicle, NeonHandler.Direction direction, NeonHandler handler, PositionManager manager, float yaw, float aMax, float aMin) {
		ItemStack stack = handler.getNeon(direction);
		if(stack.isEmpty())
			return;
		int color = ((ItemNeon) stack.getItem()).getNeonColor();
		float r = ((color >> 16) & 255) / 255.0F;
		float g = ((color >>  8) & 255) / 255.0F;
		float b = ( color        & 255) / 255.0F;
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder builder = tessellator.getBuffer();
		builder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
		double length = vehicle.width;
		double neonWidth = 0.15;
		Vec3d pos = direction.getPosition(manager);
		if(direction.isVertical()) {
			if(manager.hasCustomNeonLength()) {
				length = manager.getCustomLength();
			}
			double l = length / 2.0;
			double w = neonWidth / 2.0;
			Vec3d p1 = new Vec3d(pos.x - neonWidth, 0.01, +l);
			Vec3d p2 = new Vec3d(pos.x + neonWidth, 0.01, -l);
			float a1 = direction.shouldInvert() ? aMin : aMax;
			float a2 = direction.shouldInvert() ? aMax : aMin;
			builder.pos(p1.x, p1.y, p2.z).tex(0, 1).color(r, g, b, a1).endVertex();
			builder.pos(p2.x, p1.y, p2.z).tex(1, 1).color(r, g, b, a2).endVertex();
			builder.pos(p2.x, p1.y, p1.z).tex(1, 0).color(r, g, b, a2).endVertex();
			builder.pos(p1.x, p1.y, p1.z).tex(0, 0).color(r, g, b, a1).endVertex();
		} else {
			double d = length / 2.0;
			Vec3d p1 = new Vec3d(+d, 0.01, pos.z - neonWidth);
			Vec3d p2 = new Vec3d(-d, 0.01, pos.z + neonWidth);
			float a1 = direction.shouldInvert() ? aMin : aMax;
			float a2 = direction.shouldInvert() ? aMax : aMin;
			builder.pos(p1.x, p1.y, p2.z).tex(0, 1).color(r, g, b, a2).endVertex();
			builder.pos(p2.x, p1.y, p2.z).tex(1, 1).color(r, g, b, a2).endVertex();
			builder.pos(p2.x, p1.y, p1.z).tex(1, 0).color(r, g, b, a1).endVertex();
			builder.pos(p1.x, p1.y, p1.z).tex(0, 0).color(r, g, b, a1).endVertex();
		}
		tessellator.draw();
	}

	private void drawInfo(V vehicle, Minecraft mc, float x, float y, float z) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
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
		float aBG = VMConfig.clientConfig.opaqueColors ? 1.0F : 0.25F;
		double of = -vehicle.height - 70;
		int left = -i - 1;
		int right = i + 10;
		VehicleStats stats = vehicle.getActualStats();
		float speedStat = (stats.maxSpeed - VehicleStats.topSpeedMin) / (VehicleStats.topSpeedMax - VehicleStats.topSpeedMin);
		float accelerationStat = (stats.acceleration - VehicleStats.accelerationMin) / (VehicleStats.accelerationMax - VehicleStats.accelerationMin);
		float handlingStat = (stats.turnSpeed - VehicleStats.handlingMin) / (VehicleStats.handlingMax - VehicleStats.handlingMin);
		float brakingStat = (stats.brakeSpeed - VehicleStats.brakingMin) / (VehicleStats.brakingMax - VehicleStats.brakingMin);
		int px = left + 19;
		int width = right - px - 2;
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
		bufferbuilder.pos(left, of, 0.0D).color(0.0F, 0.0F, 0.0F, aBG).endVertex();
		bufferbuilder.pos(left, of + 88, 0.0D).color(0.0F, 0.0F, 0.0F, aBG).endVertex();
		bufferbuilder.pos(right, of + 88, 0.0D).color(0.0F, 0.0F, 0.0F, aBG).endVertex();
		bufferbuilder.pos(right, of, 0.0D).color(0.0F, 0.0F, 0.0F, aBG).endVertex();
		addColorShapeToBuffer(bufferbuilder, px, -22, px + width, -18,-0.01, 0.0F, 0.5F, 0.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, -22, (int)(px + width * speedStat), -18, -0.02, 0.0F, 1.0F, 0.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, -13, px + width, -8, -0.01, 0.5F, 0.0F, 0.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, -13, (int)(px + width * accelerationStat), -8, -0.02, 1.0F, 0.0F, 0.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, -4, px + width, 1, -0.01, 0.0F, 0.0F, 0.5F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, -4, (int)(px + width * handlingStat), 1, -0.02, 0.0F, 0.0F, 1.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, 5, px + width, 10, -0.01, 0.5F, 0.5F, 0.0F, 1.0F);
		addColorShapeToBuffer(bufferbuilder, px, 5, (int)(px + width * brakingStat), 10, -0.02, 1.0F, 1.0F, 0.0F, 1.0F);
		tessellator.draw();
		GlStateManager.enableTexture2D();
		GlStateManager.depthMask(true);
		renderer.drawString(vehicle.getName(), -i + 5, -68, -1);
		renderer.drawString("Health: " + (int)((vehicle.health/vehicle.getActualStats().maxHealth)*100) + " %", -i + 5, -57, -1);
		renderer.drawString("Fuel: " + (int)(100 * (vehicle.fuel / vehicle.getActualStats().fuelCapacity)) + " %", -i + 5, -44, -1);
		renderer.drawString("Distance: " + new DecimalFormat("#.#").format(vehicle.getTravelledDistance()) + " km", -i + 5, -33, -1);
		renderer.drawString("SPD", left + 1, -23, 0x00ff00);
		renderer.drawString("ACC", left + 1, -14, 0xff0000);
		renderer.drawString("HDL", left + 1, -5, 0xff);
		renderer.drawString("BRK", left + 1,  4, 0xffff00);
		GlStateManager.enableLighting();
		GlStateManager.disableBlend();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.popMatrix();
	}

	static void addColorShapeToBuffer(BufferBuilder buffer, int x1, int y1, int x2, int y2, double z, float r, float g, float b, float a) {
		buffer.pos(x1, y2, z).color(r, g, b, a).endVertex();
		buffer.pos(x2, y2, z).color(r, g, b, a).endVertex();
		buffer.pos(x2, y1, z).color(r, g, b, a).endVertex();
		buffer.pos(x1, y1, z).color(r, g, b, a).endVertex();
	}
}