package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnik3000LEnforcer extends EntityVehicleSirens {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.75, 0.65, 0)
            .exhaust(-1.9, 0.25, 0.5)
            .frontNeon(2.3)
            .backNeon(1.8)
            .sideNeons(1.0)
            .backLength(1.4)
            .frontLength(1.6)
            .disable()
            .build();

    public VehicleSputnik3000LEnforcer(World world) {
        super(world);
        setSize(2.0f, 1.5f);
    }

    public VehicleSputnik3000LEnforcer(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleTexture getBaseTexture() {
        return VehicleTexture.WHITE;
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK3_ACC)
                .brk(VMSounds.SPUTNIK3_BRAKE)
                .rls(VMSounds.SPUTNIK3_GAS)
                .str(VMSounds.SPUTNIK3_START)
                .honk(VMSounds.HORN_29S)
                .starting(VMSounds.CAR_START_A)
                .build();
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 0;
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.sputnik3000L;
    }

    @Override
    public boolean canRepaint(VehicleTexture texture) {
        return texture == VehicleTexture.WHITE;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.4 : -0.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 1);
    }

    @Override
    public SoundEvent getSpecialEffectSound() {
        return VMSounds.POLICE_SIREN;
    }
}
