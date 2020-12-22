package dev.toma.vehiclemod.client.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;

public class Particles {

    public static final Type<ParticleNitroCloud> NITRO_CLOUD = Type.createParticleType(ParticleNitroCloud::new);
    public static final Type<ParticleNitroFlame> NITRO_FLAME = Type.createParticleType((world, posX, posY, posZ, motionX, motionY, motionZ, data) -> new ParticleNitroFlame(world, posX, posY, posZ));

    public static class Type<P extends Particle> {
        IFactory<P> particleFactory;

        Type(IFactory<P> particleFactory) {
            this.particleFactory = particleFactory;
        }

        public static <P extends Particle> Type<P> createParticleType(IFactory<P> particleFactory) {
            return new Type<>(particleFactory);
        }

        public P produce(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, int data) {
            return particleFactory.newParticle(world, posX, posY, posZ, motionX, motionY, motionZ, data);
        }
    }

    public interface IFactory<P extends Particle> {

        P newParticle(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, int data);
    }
}
