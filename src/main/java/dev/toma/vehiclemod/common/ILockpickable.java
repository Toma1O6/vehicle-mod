package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;

public interface ILockpickable {

    int[] getCombinations();

    boolean shouldBreakLockpick(Random random);

    void handleUnlock(EntityPlayer player, World world);

    SPacketLockpickAttempt createLockpickPacket(int index, int offset);
}
