package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.ISpecialVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketChangeLightStatus;
import dev.toma.vehiclemod.network.packets.SPacketHonk;
import dev.toma.vehiclemod.network.packets.SPacketSiren;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber(Side.CLIENT)
public class VMKeybinds {

    static final String CATEGORY = "category." + VehicleMod.MODID;
    public static KeyBinding CAR_SIREN;
    public static KeyBinding CAR_HORN;
    public static KeyBinding CAR_LIGHTS;
    public static KeyBinding INDICATOR_RIGHT;
    public static KeyBinding INDICATOR_LEFT;
    public static KeyBinding INDICATOR_WARNING;

    public static void init() {
        CAR_SIREN = new KeyBinding("key.vehiclemod.car_siren", Keyboard.KEY_G, CATEGORY);
        CAR_HORN = new KeyBinding("key.vehiclemod.car_horn", Keyboard.KEY_H, CATEGORY);
        CAR_LIGHTS = new KeyBinding("key.vehiclemod.car_lights", Keyboard.KEY_L, CATEGORY);
        INDICATOR_RIGHT = new KeyBinding("key.vehiclemod.indicator_right", Keyboard.KEY_V, CATEGORY);
        INDICATOR_LEFT = new KeyBinding("key.vehiclemod.indicator_left", Keyboard.KEY_X, CATEGORY);
        INDICATOR_WARNING = new KeyBinding("key.vehiclemod.indicator_warning", Keyboard.KEY_C, CATEGORY);
        ClientRegistry.registerKeyBinding(CAR_SIREN);
        ClientRegistry.registerKeyBinding(CAR_HORN);
        ClientRegistry.registerKeyBinding(CAR_LIGHTS);
        ClientRegistry.registerKeyBinding(INDICATOR_RIGHT);
        ClientRegistry.registerKeyBinding(INDICATOR_LEFT);
        ClientRegistry.registerKeyBinding(INDICATOR_WARNING);
    }

    @SubscribeEvent
    public static void keyInput(InputEvent.KeyInputEvent event) {
        Minecraft minecraft = Minecraft.getMinecraft();
        EntityPlayer player = minecraft.player;
        if(CAR_SIREN.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof ISpecialVehicle && player == entity.getControllingPassenger()) {
                VMNetworkManager.instance().sendToServer(new SPacketSiren());
            }
        } else if(CAR_LIGHTS.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                VMNetworkManager.instance().sendToServer(SPacketChangeLightStatus.headlights(vehicle, !vehicle.lightController.getLightFlag()));
            }
        } else if(INDICATOR_RIGHT.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                VMNetworkManager.instance().sendToServer(SPacketChangeLightStatus.turnStatus(vehicle, LightController.TurnLightStatus.RIGHT));
            }
        } else if(INDICATOR_LEFT.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                VMNetworkManager.instance().sendToServer(SPacketChangeLightStatus.turnStatus(vehicle, LightController.TurnLightStatus.LEFT));
            }
        } else if(INDICATOR_WARNING.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                VMNetworkManager.instance().sendToServer(SPacketChangeLightStatus.turnStatus(vehicle, LightController.TurnLightStatus.WARNING));
            }
        }
    }

    static boolean hornKeyState;

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.player;
        if(event.phase == TickEvent.Phase.END || player == null)
            return;
        Entity entity = player.getRidingEntity();
        if(entity instanceof EntityVehicle && entity.getControllingPassenger() == player) {
            boolean current = CAR_HORN.isKeyDown();
            if(current != hornKeyState) {
                VMNetworkManager.instance().sendToServer(new SPacketHonk(current, (EntityVehicle) entity));
            }
            hornKeyState = current;
        }
    }
}
