package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SoundController {

    private VehicleSoundPack pack;
    @SideOnly(Side.CLIENT) private CarSound currentSound;
    @SideOnly(Side.CLIENT) private CarSound hornSound;

    public void setPack(VehicleSoundPack pack) {
        this.pack = pack;
    }

    @SideOnly(Side.CLIENT)
    public void updateSounds(EntityVehicle vehicle) {
        if(vehicle.hasStateChanged()) {
            Minecraft mc = Minecraft.getMinecraft();
            SoundHandler handler = mc.getSoundHandler();
            EntityPlayer player = mc.player;
            if(!vehicle.isPassenger(player)) return;
            SoundEvent event = vehicle.getActualState().getSound(pack);
            if(currentSound != null && handler.isSoundPlaying(currentSound)) {
                handler.stopSound(currentSound);
            }
            if(event == null) return;
            CarSound sound = new CarSound(event, vehicle);
            currentSound = sound;
            handler.playSound(sound);
        }
    }
}
