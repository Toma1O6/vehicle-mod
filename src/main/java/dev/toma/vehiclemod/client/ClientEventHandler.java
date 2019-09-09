package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.FuelHandler;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler {

	private static final ResourceLocation VEHICLE_HUD = new ResourceLocation(VehicleMod.Constants.ID + ":textures/vehicle/vehicle_hud.png");

	@SubscribeEvent
	public static void renderTooltip(ItemTooltipEvent e) {
		if(FuelHandler.instance().isFuel(e.getItemStack())) {
			String name = e.getItemStack().getItem().getRegistryName().getResourcePath();
			float f = name.contains("bottle") ? VMConfig.values.bottle : name.contains("bucket") ? VMConfig.values.bucket : VMConfig.values.other;
			e.getToolTip().add("Fuel: " + f + "l");
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
				float fuel = car.fuel / 100.0F;
				boolean lowFuel = fuel <= 0.17F;
				float health = car.health / car.getStats().maxHealth;
				boolean lowHealth = health <= 0.35;
				VehicleHUDType type = VehicleHUDType.FUEL_STATE;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 0, resolution.getScaledHeight() - 25, 120, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				type = lowFuel ? VehicleHUDType.FUEL_LOW : VehicleHUDType.FUEL;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 110, resolution.getScaledHeight() - 26,20, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				type = VehicleHUDType.INDICATOR;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, (int)(-1 + fuel * 90), resolution.getScaledHeight() - 25, 32, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
				if(!lowHealth) {
					return;
				}
				type = health <= 0.15F ? VehicleHUDType.ENGINE_FATAL : VehicleHUDType.ENGINE_WARN;
				DevUtil.drawImage2D(mc, VEHICLE_HUD, 128, resolution.getScaledHeight() - 25, 20, 20, type.uv.uStart, type.uv.vStart, type.uv.uEnd, type.uv.vEnd);
			}
		}
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
