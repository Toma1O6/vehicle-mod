package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityDriveable;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.math.MathHelper;

public class MoveController {

    private float motion;
    private float rotation;
    private float momentum = 0.9F;
    private boolean reversing;

    public void inputChanged(byte key, boolean value) {
        if (key == EntityDriveable.BACKWARD && value) {
            if (motion == 0 && !reversing) {
                reversing = true;
            }
        }
    }

    public void moveForward(VehicleUpgrades upgrades, double motionX, double motionZ) {
        float maxSpeed = 44.4F / 20f; // km/h
        float acceleration = 0.0004F; // +speed/tick

        float currentSpeed = (float) Math.sqrt(motionX * motionX + motionZ * motionZ);
        float maxSpeedDelta = (maxSpeed - currentSpeed) / maxSpeed;
        motion += acceleration * maxSpeedDelta;
    }

    public void moveBack(VehicleUpgrades upgrades) {
        if (motion > 0) {
            motion = Math.max(0.0F, motion - 0.01F);
        } else if (reversing) {
            motion = -0.01F;
        }
    }

    public void moveRight(VehicleUpgrades upgrades) {
        rotation += 1.0F;
    }

    public void moveLeft(VehicleUpgrades upgrades) {
        rotation -= 1.0F;
    }

    public void useHandbrake() {
        rotation = MathHelper.clamp(rotation * 2.5F, -5.0F, 5.0F);
        motion *= 0.96F;
    }

    public void applyOn(EntityVehicle vehicle) {
        if (vehicle.getPassengers().isEmpty())
            vehicle.clearInput();
        if (!vehicle.hasMovementInput()) {
            motion *= 0.98F;
            vehicle.motionX *= 0.98F;
            vehicle.motionZ *= 0.98F;
        }
        if (vehicle.getEntitySpeed() < 0.01F)
            rotation = 0;

        float moveMomentum = 0.9F;
        float driftMomentum = 0.4F;
        vehicle.rotationYaw += rotation;
        vehicle.motionY -= 0.1F;
        rotation *= driftMomentum;
        vehicle.motionX *= 0.95F;
        vehicle.motionZ *= 0.95F;
        vehicle.motionX += Math.sin(-vehicle.rotationYaw * VehicleStyle.PI_D_180) * motion;
        vehicle.motionZ += Math.cos(vehicle.rotationYaw * VehicleStyle.PI_D_180) * motion;

        //motion = 0;
    }
}
