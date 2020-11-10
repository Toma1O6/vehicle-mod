package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;

public interface ILockpickable {

    int[] getCombinations();

    boolean shouldBreakLockpick(Random random);

    void handleUnlock(EntityPlayer player, World world);

    SPacketLockpickAttempt createLockpickPacket(int index, int offset);

    static void shuffle(int[] input) {
        int index;
        Random random = VehicleMod.random;
        for (int i = input.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if(index != i) {
                input[index] ^= input[i];
                input[i] ^= input[index];
                input[index] ^= input[i];
            }
        }
    }
}
