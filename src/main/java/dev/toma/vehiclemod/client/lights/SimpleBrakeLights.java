package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.LightController;
import net.minecraft.client.model.ModelRenderer;

public class SimpleBrakeLights<V extends EntityVehicle> extends BrakeLights<V> {

    private boolean brakeState;

    public SimpleBrakeLights(ModelRenderer... renderers) {
        super(renderers);
        setLightmapX(160);
        setLightmapY(160);
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        if(vehicle == null)
            return false;
        LightController controller = vehicle.getLightController();
        boolean actual = controller.isBraking(vehicle);
        boolean flag = controller.areLightsOn(vehicle);
        if(actual != brakeState) {
            this.brakeState = actual;
            int coords = actual ? 240 : flag ? 160 : 0;
            this.setLightmapX(coords);
            this.setLightmapY(coords);
        }
        return actual || flag;
    }
}
