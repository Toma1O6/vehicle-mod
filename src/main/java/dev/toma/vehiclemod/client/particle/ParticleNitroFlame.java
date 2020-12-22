package dev.toma.vehiclemod.client.particle;

import net.minecraft.client.particle.ParticleFlame;
import net.minecraft.world.World;

public class ParticleNitroFlame extends ParticleFlame {

    public ParticleNitroFlame(World world, double posX, double posY, double posZ) {
        super(world, posX, posY, posZ, 0.0D, 0.0D, 0.0D);

    }

    @Override
    public int getBrightnessForRender(float f) {
        int l = 240;
        return l | l << 16;
    }
}
