package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnikAmbulance extends EntityVehicleSirens {

    private static final VehicleTexture[] VALID_TEXTURES = {VehicleTexture.BLUE, VehicleTexture.RED, VehicleTexture.UTILITY_YELLOW, VehicleTexture.BRICK};
    private static final Vector3f[] PARTS = {new Vector3f(2.5F, 0.4F, 0.0F), new Vector3f(-2.8F, -0.1F, 0.7F)};

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
    public Vector3f[] getPartVecs() {
        return PARTS;
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
