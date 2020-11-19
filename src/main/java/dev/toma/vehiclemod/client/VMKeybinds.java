package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.ISpecialVehicle;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketSiren;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber(Side.CLIENT)
public class VMKeybinds {

    public static KeyBinding CAR_SIREN;

    public static void init() {
        CAR_SIREN = new KeyBinding("car_siren", Keyboard.KEY_G, VehicleMod.MODID);
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
        }
    }
}
