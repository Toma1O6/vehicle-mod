package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceType;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SideOnly(Side.CLIENT)
public class RacingRenderManager {

    static final Map<RaceType<?>, RenderRace<?>> RENDERERS = new HashMap<>();
    static boolean debugInfo;

    public void renderWorld(World world, double x, double y, double z, float partialTicks) {


    }

    public void renderOverlay(int width, int height, float partialTicks) {

    }

    public static <R extends Race> void registerRenderer(RaceType<R> type, RenderRace<R> renderer) {
        RENDERERS.put(type, renderer);
    }

    @SuppressWarnings("unchecked")
    public static <R extends Race> Optional<RenderRace<R>> getRenderer(R race) {
        return getRenderer((RaceType<R>) race.getType());
    }

    @SuppressWarnings("unchecked")
    public static <R extends Race> Optional<RenderRace<R>> getRenderer(RaceType<R> type) {
        return Optional.ofNullable((RenderRace<R>) RENDERERS.get(type));
    }

    public static boolean isDebugActive() {
        return debugInfo;
    }

    public static void toggleDebugRender() {
        debugInfo = !debugInfo;
    }
}
