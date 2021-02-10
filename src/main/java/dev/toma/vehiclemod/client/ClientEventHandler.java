package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.NitroHandler;
import dev.toma.vehiclemod.common.inventory.InventoryUpgrades;
import dev.toma.vehiclemod.common.items.ItemNitroCan;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketOpenVehicleComponentGUI;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.GuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.opengl.GL11;

@EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler {

	private static final ResourceLocation VEHICLE_HUD = new ResourceLocation(VehicleMod.MODID + ":textures/entity/vehicle_hud.png");
	private static final ResourceLocation[] COMPONENT_ICONS = DevUtil.make(new ResourceLocation[9], resourceLocations -> {
		for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
			resourceLocations[type.ordinal()] = VehicleMod.getResource("textures/items/" + type.name().toLowerCase() + ".png");
		}
	});

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void openGUI(GuiOpenEvent event) {
		EntityPlayer player = Minecraft.getMinecraft().player;
		if(event.getGui() instanceof InventoryEffectRenderer && player.getRidingEntity() instanceof EntityVehicle) {
			EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();
			if(!vehicle.isStarted() && vehicle.isStationary() && vehicle.getControllingPassenger() == player) {
				event.setCanceled(true);
				VMNetworkManager.instance().sendToServer(new SPacketOpenVehicleComponentGUI(GuiHandler.VEHICLE_COMPONENT));
			}
		}
	}

	@SubscribeEvent
	public static void stitchTextures(TextureStitchEvent.Pre event) {
		TextureMap map = event.getMap();
		map.registerSprite(VehicleMod.getResource("items/perk_empty"));
		map.registerSprite(VehicleMod.getResource("items/filter_empty"));
		map.registerSprite(VehicleMod.getResource("items/bucket_empty"));
		map.registerSprite(VehicleMod.getResource("items/neon_empty"));
		map.registerSprite(VehicleMod.getResource("items/neon_pulser_empty"));
		map.registerSprite(VehicleMod.getResource("items/nitro_can_empty"));
		map.registerSprite(VehicleMod.getResource("items/nitro_cloud_spray_empty"));
		map.registerSprite(VehicleMod.getResource("items/nitro_cloud_spray_empty_disabled"));
		map.registerSprite(VehicleMod.getResource("items/nitro_led_empty"));
	}

	@SubscribeEvent
	public static void setupCamera(EntityViewRenderEvent.CameraSetup event) {
		if(Minecraft.getMinecraft().gameSettings.thirdPersonView != 1) return;
		if(event.getEntity().isRiding() && event.getEntity().getRidingEntity() instanceof EntityVehicle) {
			EntityVehicle vehicle = (EntityVehicle) event.getEntity().getRidingEntity();
			VehicleStats.Vector3i vector3i = vehicle.getConfigStats().cameraOff;
			GlStateManager.translate(vector3i.getX(), vector3i.getY(), vector3i.getZ());
		}
	}

	@SubscribeEvent
	public static void renderOverlayEvent(RenderGameOverlayEvent.Post e) {
		if(e.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			Minecraft mc = Minecraft.getMinecraft();
			ScaledResolution resolution = e.getResolution();
			EntityPlayer player = mc.player;
			if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
				EntityVehicle car = (EntityVehicle)player.getRidingEntity();
				float fuel = car.fuel / (float)car.getActualStats().fuelCapacity;
				boolean lowFuel = fuel <= 0.17F;
				float health = car.health / car.getActualStats().maxHealth;
				boolean lowHealth = health <= 0.5;
				double speed = Math.sqrt(car.motionX*car.motionX + car.motionZ*car.motionZ) * 40;
				SpeedDisplayUnit unit = VMConfig.speedUnit;
				String speedString = unit.getDisplayString(speed);
				mc.fontRenderer.drawStringWithShadow(speedString, 16, resolution.getScaledHeight() - 35, 0xFFFFFF);
				if(car.isEcoMode()) {
					mc.fontRenderer.drawStringWithShadow("Eco", 16, resolution.getScaledHeight() - 45, 0x00ff00);
				}
				NitroHandler nitroHandler = car.getNitroHandler();
				IInventory nitroInventory = nitroHandler.getInventory();
				for (int i = 0; i < 5; i++) {
					ItemStack stack = nitroInventory.getStackInSlot(i);
					ResourceLocation icon = ItemNitroCan.EMPTY_ICON;
					if(stack.getItem() instanceof ItemNitroCan) {
						boolean flag = nitroHandler.isNitroActive() && nitroHandler.getActiveSlot() == i;
						if(stack.getItemDamage() < stack.getMaxDamage() || flag) {
							ItemNitroCan can = (ItemNitroCan) stack.getItem();
							icon = flag ? can.getIcon_active() : can.getIcon_available();
						}
					}
					DevUtil.drawImage2D(mc, icon, 74 + i * 10, resolution.getScaledHeight() - 40, 16, 16);
				}
				int componentRenderIndex = 0;
				InventoryUpgrades upgrades = car.getUpgrades().getInventory();
				for (int i = 0; i < 9; i++) {
					ItemStack stack = upgrades.getStackInSlot(i);
					if(!stack.isEmpty()) {
						float dmgPct = 1.0F - (stack.getItemDamage() / (float) stack.getMaxDamage());
						if(dmgPct < 0.5F) {
							float r = 1.0F;
							float g = 1.0F;
							if(dmgPct < 0.15F) {
								g = 0.0F;
							}
							mc.getTextureManager().bindTexture(COMPONENT_ICONS[i]);
							coloredShape(10 + componentRenderIndex * 18, resolution.getScaledHeight() - 60, 16, 16, r, g, 0.0F, 1.0F);
							++componentRenderIndex;
						}
					} else {
						mc.getTextureManager().bindTexture(COMPONENT_ICONS[i]);
						coloredShape(10 + componentRenderIndex * 18, resolution.getScaledHeight() - 60, 16, 16, 0.3F, 0.3F, 0.3F, 1.0F);
						mc.fontRenderer.drawString("!", 8 + componentRenderIndex * 18, resolution.getScaledHeight() - 59, 0xFF0000);
						++componentRenderIndex;
					}
				}
				VehicleHUDType type = VehicleHUDType.FUEL_STATE;
				int x = (int)((33 * 120) / 256F);
				int y = resolution.getScaledHeight() - 15;
				int w = (int)((222 * 120) / 256F) - x + 1;
				int h = 8;
				Tessellator tessellator = Tessellator.getInstance();
				BufferBuilder builder = tessellator.getBuffer();
				GlStateManager.disableTexture2D();
				GlStateManager.color(1f, 1f, 1f, 1f);
				GlStateManager.shadeModel(GL11.GL_SMOOTH);
				builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
				builder.pos(x, y + h, 0).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
				builder.pos(x + w * fuel, y + h, 0).color(1.0F * (1 - fuel), 1.0F * fuel, 0.0F, 1.0F).endVertex();
				builder.pos(x + w * fuel, y, 0).color(1.0F * (1 - fuel), 1.0F * fuel, 0.0F, 1.0F).endVertex();
				builder.pos(x, y, 0).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
				tessellator.draw();
				GlStateManager.shadeModel(GL11.GL_FLAT);
				GlStateManager.disableBlend();
				GlStateManager.enableTexture2D();
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 0, resolution.getScaledHeight() - 25, 120, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				type = lowFuel ? VehicleHUDType.FUEL_LOW : VehicleHUDType.FUEL;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 110, resolution.getScaledHeight() - 26,20, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				type = VehicleHUDType.INDICATOR;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, (int)(-1 + fuel * 90), resolution.getScaledHeight() - 30, 32, 25, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				if(!lowHealth) {
					return;
				}
				type = health <= 0.25F ? VehicleHUDType.ENGINE_FATAL : VehicleHUDType.ENGINE_WARN;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 128, resolution.getScaledHeight() - 25, 20, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
			}
		}
	}

	private static void coloredShape(int x, int y, int width, int height, float r, float g, float b, float a) {
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder builder = tessellator.getBuffer();
		builder.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_COLOR);
		builder.pos(x, y + height, 0).tex(0, 1).color(r, g, b, a).endVertex();
		builder.pos(x + width, y + height, 0).tex(1, 1).color(r, g, b, a).endVertex();
		builder.pos(x + width, y, 0).tex(1, 0).color(r, g, b, a).endVertex();
		builder.pos(x, y, 0).tex(0, 0).color(r, g, b, a).endVertex();
		tessellator.draw();
	}

	private enum VehicleHUDType {
		FUEL(new UVCoords(0, 0, 0.5D, 0.5D)),
		FUEL_LOW(new UVCoords(0.5D, 0, 1.0D, 0.5D)),
		FUEL_STATE(new UVCoords(0, 0.5D, 1, 160/256D)),
		INDICATOR(new UVCoords(0, 160/256D, 32/256D, 190/256D)),
		ENGINE_WARN(new UVCoords(0, 192/256D, 64/256D, 1.0D)),
		ENGINE_FATAL(new UVCoords(64/256D, 192/256D, 128/256D, 1.0D));

		public final UVCoords uv;

		VehicleHUDType(UVCoords uv) {
			this.uv = uv;
		}
	}

	private static class UVCoords {
		public final double uStart, uEnd, vStart, vEnd;

		public UVCoords(double d0, double d1, double d2, double d3) {
			this.uStart = d0;
			this.vStart = d1;
			this.uEnd = d2;
			this.vEnd = d3;
		}
	}
}
