package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISpecialVehicle;
import net.minecraft.client.model.ModelRenderer;

import java.util.function.Function;

public class SirenLights<V extends EntityVehicle & ISpecialVehicle> extends BasicLightEntry<V> {

    private final int cycle;
    private final Function<Float, Float> outModifier;

    public SirenLights(int cycle, Function<Float, Float> outModifier, ModelRenderer... renderers) {
        super(0.0F, renderers);
        this.cycle = cycle;
        this.outModifier = outModifier;
    }

    public SirenLights(int cycle, ModelRenderer... renderers) {
        this(cycle, Function.identity(), renderers);
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        if(vehicle == null || !vehicle.isEffectActive()) {
            return false;
        }
        long time = System.currentTimeMillis();
        float half = cycle / 2.0F;
        long modified = time % cycle;
        float intensity = outModifier.apply(Math.abs((half - modified) / half));
        int coords = (int) (240 * intensity);
        this.setLightmapX(coords);
        this.setLightmapY(coords);
        return true;
    }
}
