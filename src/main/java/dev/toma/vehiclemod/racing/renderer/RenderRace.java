package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.racing.Race;
import net.minecraft.world.World;

public interface RenderRace<R extends Race> {

    void renderRaceInfo(World world, R r, double x, double y, double z, float partialTicks);

    void renderRaceOverlay(R r, int width, int height, float partialTicks);
}
