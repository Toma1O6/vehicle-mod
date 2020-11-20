package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.util.SoundEvent;

import java.util.Objects;

public class VehicleSoundPack {

    final SoundEvent accelerate;
    final SoundEvent brake;
    final SoundEvent release;
    final SoundEvent start;
    final SoundEvent honk;

    private VehicleSoundPack(Builder<?> builder) {
        this.accelerate = builder.acc;
        this.brake = builder.brk;
        this.release = builder.rls;
        this.start = builder.str;
        this.honk = builder.honk;
    }

    public SoundEvent accelerate() {
        return accelerate;
    }

    public SoundEvent brake() {
        return brake;
    }

    public SoundEvent release() {
        return release;
    }

    public SoundEvent start() {
        return start;
    }

    public SoundEvent honk() {
        return honk;
    }

    public static class Builder<V extends EntityVehicle> {

        final V v;
        SoundEvent acc, brk, rls, str, honk;

        Builder(V v) {
            this.v = v;
        }

        public Builder<V> acc(SoundEvent event) {
            this.acc = event;
            return this;
        }

        public Builder<V> brk(SoundEvent event) {
            this.brk = event;
            return this;
        }

        public Builder<V> rls(SoundEvent event) {
            this.rls = event;
            return this;
        }

        public Builder<V> str(SoundEvent event) {
            this.str = event;
            return this;
        }

        public Builder<V> honk(SoundEvent event) {
            this.honk = event;
            return this;
        }

        public VehicleSoundPack build() {
            Objects.requireNonNull(acc, "Undefined Accelerate sound");
            Objects.requireNonNull(brk, "Undefined Brake sound");
            Objects.requireNonNull(rls, "Undefined Release sound");
            Objects.requireNonNull(str, "Undefined Start sound");
            Objects.requireNonNull(honk, "Undefined Honk sound");
            return new VehicleSoundPack(this);
        }

        public static <V extends EntityVehicle> Builder<V> create(V v) {
            return new Builder<>(Objects.requireNonNull(v, "Vehicle cannot be null!"));
        }
    }
}
