package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import net.minecraft.client.model.ModelRenderer;

public class TurnIndicatorLights<V extends EntityVehicle> extends BasicLightEntry<V> {

    final LightController.TurnLightStatus status;
    final int cycle;

    public TurnIndicatorLights(int cycleLength, LightController.TurnLightStatus status, ModelRenderer... renderers) {
        super(1.0F, renderers);
        this.cycle = cycleLength;
        this.status = status;
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        boolean flag = false;
        if(vehicle == null)
            return false;
        LightController controller = vehicle.lightController;
        LightController.TurnLightStatus status = controller.getTurnLightStatus();
        if(status == LightController.TurnLightStatus.WARNING || status == this.status) {
            long time = System.currentTimeMillis();
            int cycleSwap = cycle / 2;
            flag = time % cycle < cycleSwap;
        }
        return flag;
    }
}
