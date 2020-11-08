package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.model.vehicle.ModelSputnik3000LEnforcer;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleSputnik3000LEnforcer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSputnik3000LEnforcer extends RenderSputnik3000L<VehicleSputnik3000LEnforcer, ModelSputnik3000LEnforcer> {

    private static final ResourceLocation LOCATION = VehicleMod.getResource("textures/entity/white.png");

    public RenderSputnik3000LEnforcer(RenderManager manager) {
        super(manager, new ModelSputnik3000LEnforcer());
    }

    @Override
    protected ResourceLocation getEntityTexture(VehicleSputnik3000LEnforcer entity) {
        return LOCATION;
    }
}
