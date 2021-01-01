package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.ISpecialVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.NitroHandler;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.*;
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

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(Side.CLIENT)
public class VMKeybinds {

    static final String CATEGORY = "category." + VehicleMod.MODID;
    public static KeyBinding CAR_SIREN;
    public static KeyBinding CAR_HORN;
    public static KeyBinding CAR_LIGHTS;
    public static KeyBinding INDICATOR_RIGHT;
    public static KeyBinding INDICATOR_LEFT;
    public static KeyBinding INDICATOR_WARNING;
    public static KeyBinding ECO_MODE;
    public static KeyBinding START;
    public static KeyBinding NITRO;

    public static void init() {
        CAR_SIREN = new KeyBinding("key.vehiclemod.car_siren", Keyboard.KEY_G, CATEGORY);
        CAR_HORN = new KeyBinding("key.vehiclemod.car_horn", Keyboard.KEY_H, CATEGORY);
        CAR_LIGHTS = new KeyBinding("key.vehiclemod.car_lights", Keyboard.KEY_L, CATEGORY);
        INDICATOR_RIGHT = new KeyBinding("key.vehiclemod.indicator_right", Keyboard.KEY_V, CATEGORY);
        INDICATOR_LEFT = new KeyBinding("key.vehiclemod.indicator_left", Keyboard.KEY_X, CATEGORY);
        INDICATOR_WARNING = new KeyBinding("key.vehiclemod.indicator_warning", Keyboard.KEY_C, CATEGORY);
        ECO_MODE = new KeyBinding("key.vehiclemod.eco_mode", Keyboard.KEY_K, CATEGORY);
        START = new KeyBinding("key.vehiclemod.start", Keyboard.KEY_R, CATEGORY);
        NITRO = new KeyBinding("key.vehiclemod.nitro", Keyboard.KEY_LCONTROL, CATEGORY);
        ClientRegistry.registerKeyBinding(CAR_SIREN);
        ClientRegistry.registerKeyBinding(CAR_HORN);
        ClientRegistry.registerKeyBinding(CAR_LIGHTS);
        ClientRegistry.registerKeyBinding(INDICATOR_RIGHT);
        ClientRegistry.registerKeyBinding(INDICATOR_LEFT);
        ClientRegistry.registerKeyBinding(INDICATOR_WARNING);
        ClientRegistry.registerKeyBinding(ECO_MODE);
        ClientRegistry.registerKeyBinding(START);
        ClientRegistry.registerKeyBinding(NITRO);
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
        } else if(ECO_MODE.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                VMNetworkManager.instance().sendToServer(SPacketVehicleAction.eco(!vehicle.isEcoMode()));
            }
        } else if(START.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                if(!vehicle.isStarted() && vehicle.getStartCooldown() == 0) {
                    VMNetworkManager.instance().sendToServer(SPacketVehicleAction.start());
                }
            }
        } else if(NITRO.isPressed()) {
            Entity entity = player.getRidingEntity();
            if(entity instanceof EntityVehicle && player == entity.getControllingPassenger()) {
                EntityVehicle vehicle = (EntityVehicle) entity;
                if(vehicle.isStationary())
                    return;
                NitroHandler handler = vehicle.getNitroHandler();
                int slot = handler.getFirstUsableNitroSlot();
                if(vehicle.isStarted() && slot != -1) {
                    handler.initiateUse(player, slot);
                    VMNetworkManager.instance().sendToServer(SPacketVehicleAction.nitro(slot));
                }
            }
        }
    }

    static KeyStateListener hornKeyListener = new KeyStateListener(vehicle -> CAR_HORN.isKeyDown(), (aBoolean, vehicle) -> VMNetworkManager.instance().sendToServer(new SPacketHonk(aBoolean, vehicle)));
    static KeyStateListener nitroKeyListener = new KeyStateListener(vehicle -> {
        NitroHandler handler = vehicle.getNitroHandler();
        int nitroSlot = handler.getFirstUsableNitroSlot();
        return NITRO.isKeyDown() && nitroSlot >= 0 && vehicle.isStationary();
    }, (aBoolean, vehicle) -> VMNetworkManager.instance().sendToServer(new SPacketCloudStatus(aBoolean)));

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.player;
        if(event.phase == TickEvent.Phase.END || player == null)
            return;
        Entity entity = player.getRidingEntity();
        if(entity instanceof EntityVehicle && entity.getControllingPassenger() == player) {
            EntityVehicle vehicle = (EntityVehicle) entity;
            hornKeyListener.tick(vehicle);
            nitroKeyListener.tick(vehicle);
        }
    }

    static class KeyStateListener {

        boolean savedState;
        final Predicate<EntityVehicle> condition;
        final BiConsumer<Boolean, EntityVehicle> action;

        KeyStateListener(Predicate<EntityVehicle> condition, BiConsumer<Boolean, EntityVehicle> action) {
            this.condition = condition;
            this.action = action;
        }

        void tick(EntityVehicle vehicle) {
            boolean actualState = condition.test(vehicle);
            if(actualState != savedState) {
                action.accept(actualState, vehicle);
            }
            savedState = actualState;
        }
    }
}
