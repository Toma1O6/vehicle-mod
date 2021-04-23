package dev.toma.vehiclemod.client;

import net.minecraft.util.SoundEvent;

import java.util.Objects;

public class VehicleSoundPack {

    final SoundEvent accelerate;
    final SoundEvent brake;
    final SoundEvent release;
    final SoundEvent start;
    final SoundEvent honk;
    final SoundEvent starting;

    private VehicleSoundPack(Builder builder) {
        this.accelerate = builder.acc;
        this.brake = builder.brk;
        this.release = builder.rls;
        this.start = builder.str;
        this.honk = builder.honk;
        this.starting = builder.starting;
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

    public SoundEvent starting() {
        return starting;
    }

    public static class Builder {

        SoundEvent acc, brk, rls, str, honk, starting;

        private Builder() {
        }

        public Builder acc(SoundEvent event) {
            this.acc = event;
            return this;
        }

        public Builder brk(SoundEvent event) {
            this.brk = event;
            return this;
        }

        public Builder rls(SoundEvent event) {
            this.rls = event;
            return this;
        }

        public Builder str(SoundEvent event) {
            this.str = event;
            return this;
        }

        public Builder honk(SoundEvent event) {
            this.honk = event;
            return this;
        }

        public Builder starting(SoundEvent event) {
            this.starting = event;
            return this;
        }

        public VehicleSoundPack build() {
            Objects.requireNonNull(acc, "Undefined Accelerate sound");
            Objects.requireNonNull(brk, "Undefined Brake sound");
            Objects.requireNonNull(rls, "Undefined Release sound");
            Objects.requireNonNull(str, "Undefined Start sound");
            Objects.requireNonNull(honk, "Undefined Honk sound");
            Objects.requireNonNull(starting, "Undefined Starting sound");
            return new VehicleSoundPack(this);
        }

        public static Builder create() {
            return new Builder();
        }
    }
}
