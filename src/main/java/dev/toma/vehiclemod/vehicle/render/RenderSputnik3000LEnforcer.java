package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.entity.VehicleSputnik3000LEnforcer;
import dev.toma.vehiclemod.vehicle.model.ModelSputnik3000LEnforcer;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSputnik3000LEnforcer extends RenderSputnik3000L<VehicleSputnik3000LEnforcer> {

    private static final ResourceLocation LOCATION = VehicleMod.getResource("textures/vehicle/white.png");
    private final ModelSputnik3000LEnforcer model = new ModelSputnik3000LEnforcer();

    public RenderSputnik3000LEnforcer(RenderManager manager) {
        super(manager);
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return model;
    }

    @Override
    protected ResourceLocation getEntityTexture(VehicleSputnik3000LEnforcer entity) {
        return LOCATION;
    }
}
