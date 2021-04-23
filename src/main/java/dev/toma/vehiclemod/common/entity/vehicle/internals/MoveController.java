package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityDriveable;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.util.math.Vec3d;

public class MoveController {

    private float motion;
    private float rotation;
    private float momentum = 0.9F;
    private boolean reversing;
    private boolean drifting;

    public void inputChanged(byte key, boolean value) {
        if (key == EntityDriveable.BACKWARD && value) {
            if (motion == 0 && !reversing) {
                reversing = true;
            }
        }
        if(key == EntityDriveable.HANDBRAKE) {
            drifting = value;
        }
    }

    public void moveForward(VehicleUpgrades upgrades, double motionX, double motionZ) {
        float maxSpeed = 44.4F / 20f; // km/h
        float acceleration = 0.004F; // +speed/tick

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
        //rotation = MathHelper.clamp(rotation * 2.5F, -5.0F, 5.0F);
        //motion *= 0.96F;
    }

    public void applyOn(EntityVehicle vehicle) {
        if (vehicle.getPassengers().isEmpty())
            vehicle.clearInput();
        if (!vehicle.hasMovementInput()) {
            handleSpeedDecreasing(vehicle);
        }
        // TODO dynamic rotation limits
        if (vehicle.getEntitySpeed() < 0.01F)
            rotation = 0;
        float driftMomentum = 0.55F; // TODO dynamic value based on surface
        vehicle.rotationYaw += rotation;
        vehicle.motionY -= 0.1F;
        rotation *= driftMomentum;
        Vec3d lookVector = vehicle.getLookVec();
        if(drifting) {
            vehicle.motionX += lookVector.x * motion * 0.04;
            vehicle.motionZ += lookVector.z * motion * 0.04;
            motion = (float) vehicle.getEntitySpeed();
        } else {
            vehicle.motionX = lookVector.x * motion;
            vehicle.motionZ = lookVector.z * motion;
        }
    }

    private void handleSpeedDecreasing(EntityVehicle vehicle) {
        double motionDecrease = 0.001;
        if(vehicle.motionX != 0) {
            if(Math.abs(vehicle.motionX) <= motionDecrease) {
                vehicle.motionX = 0;
            } else {
                vehicle.motionX += vehicle.motionX > 0 ? -motionDecrease : motionDecrease;
            }
        }
        if(vehicle.motionZ != 0) {
            if(Math.abs(vehicle.motionZ) <= motionDecrease) {
                vehicle.motionZ = 0;
            } else {
                vehicle.motionZ += vehicle.motionZ > 0 ? -motionDecrease : motionDecrease;
            }
        }
        motion = (float) vehicle.getEntitySpeed();
    }
}
