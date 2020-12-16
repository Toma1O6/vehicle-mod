package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnikAmbulance extends EntityVehicleSirens {

    private static final VehicleTexture[] VALID_TEXTURES = {VehicleTexture.BLUE, VehicleTexture.RED, VehicleTexture.UTILITY_YELLOW, VehicleTexture.BRICK};
    private static final PositionManager POSITIONS = PositionManager.Builder.create().engine(2.5, 0.65, 0).exhaust(-2.8, -0.35, 0.7).build();

    public VehicleSputnikAmbulance(World world) {
        super(world);
        setSize(2.25F, 1.8F);
    }

    public VehicleSputnikAmbulance(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.25F, 1.8F);
    }

    @Override
    public VehicleTexture getBaseTexture() {
        return VALID_TEXTURES[world.rand.nextInt(3)];
    }

    @Override
    public void setTexture(VehicleTexture texture) {
        if(texture == VehicleTexture.YELLOW)
            texture = VehicleTexture.UTILITY_YELLOW;
        this.texture = texture;
    }

    @Override
    public boolean canRepaint(VehicleTexture texture) {
        return DevUtil.contains(texture, VALID_TEXTURES, (t0, t1) -> t0 == t1) || texture == VehicleTexture.YELLOW;
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 27);
    }

    @Override
    public PositionManager getVehiclePositions() {
        return PositionManager.Builder.create()
                .engine(2.5, 0.65, 0)
                .exhaust(-2.8, -0.35, 0.7)
                .frontNeon(2.8)
                .backNeon(2.6)
                .sideNeons(1.0, 0.1)
                .sideLength(3.0)
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.sputnikAmbulance;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 3;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK_AMBULANCE_ACC)
                .brk(VMSounds.SPUTNIK_AMBULANCE_BRAKE)
                .rls(VMSounds.SPUTNIK_AMBULANCE_GAS)
                .str(VMSounds.SPUTNIK_AMBULANCE_START)
                .honk(VMSounds.HORN_2)
                .starting(VMSounds.CAR_START_E)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.2;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 1.2 : -1.0;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.55 : 0.55;
    }

    @Override
    public SoundEvent getSpecialEffectSound() {
        return VMSounds.AMBULANCE_SIREN;
    }
}
