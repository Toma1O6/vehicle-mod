package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleTexture;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VehicleMcgFiretruck extends EntityVehicleSirens {

    static final VehicleTexture[] VALID_COLORS = {VehicleTexture.GRAY, VehicleTexture.RED, VehicleTexture.UTILITY_YELLOW, VehicleTexture.HELL};
    private static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(3.4, 0.65, 0)
            .exhaust(new Vec3d(-3.2, 0.45, 0.9), new Vec3d(-3.2, 0.45, -0.9))
            .frontNeon(3.5)
            .backNeon(2.9)
            .sideNeons(1.2, 0.6)
            .frontLength(2.3)
            .sideLength(2.1)
            .backLength(2.3)
            .nitroExit(3.5, 0.8, 0.4, 0.1, 0.02, 0.15)
            .nitroExit(3.5, 0.8, -0.4, 0.1, 0.02, -0.15)
            .nitroExit(1.4, 0.5, 1.0, 0.1, 0.0, 0.2)
            .nitroExit(1.4, 0.5, -1.0, 0.1, 0.0, -0.2)
            .nitroExit(-2.5, 0.6, 1.0, -0.1, 0.0, 0.1)
            .nitroExit(-2.5, 0.6, -1.0, -0.1, 0.0, -0.1)
            .build();

    public VehicleMcgFiretruck(World world) {
        super(world);
        setSize(2.0F, 2.4F);
    }

    public VehicleMcgFiretruck(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0F, 2.4F);
    }

    @Override
    public VehicleTexture getBaseTexture() {
        return VALID_COLORS[world.rand.nextInt(3)];
    }

    @Override
    public boolean canRepaint(VehicleTexture texture) {
        return DevUtil.contains(texture, VALID_COLORS, (t0, t1) -> t0 == t1) || texture == VehicleTexture.YELLOW;
    }

    @Override
    public void setTexture(VehicleTexture texture) {
        if(texture == VehicleTexture.YELLOW)
            texture = VehicleTexture.UTILITY_YELLOW;
        super.setTexture(texture);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 27);
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.mcgFiretruck;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 3;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.MCG_FIRETRUCK_ACC)
                .brk(VMSounds.MCG_FIRETRUCK_BRAKE)
                .rls(VMSounds.MCG_FIRETRUCK_GAS)
                .str(VMSounds.MCG_FIRETRUCK_START)
                .honk(VMSounds.HORN_12)
                .starting(VMSounds.CAR_START_D)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.55;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 2.75;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return -0.65 + id * 0.65;
    }

    @Override
    public SoundEvent getSpecialEffectSound() {
        return VMSounds.FIRETRUCK_SIREN;
    }
}
