package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class VehicleMcgAmbulance extends EntityVehicleSirens {

    private static final VehicleStyle.Texture[] VALID_TEXTURES = {VehicleStyle.Texture.BLUE, VehicleStyle.Texture.RED, VehicleStyle.Texture.UTILITY_YELLOW, VehicleStyle.Texture.BRICK};

    public VehicleMcgAmbulance(World world) {
        super(world);
    }

    public VehicleMcgAmbulance(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected void setSize() {
        setSize(2.25F, 1.8F);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 27);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.mcgAmbulance;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.MCG_AMBULANCE_ACC).brk(VMSounds.MCG_AMBULANCE_BRAKE).rls(VMSounds.MCG_AMBULANCE_GAS).str(VMSounds.MCG_AMBULANCE_START).honk(VMSounds.HORN_2).starting(VMSounds.CAR_START_E).build();
    }

    @Override
    public SoundEvent getSpecialEffectSound() {
        return VMSounds.AMBULANCE_SIREN;
    }

    public static VehicleStyle.Texture getRandomTexture(Random random) {
        return VALID_TEXTURES[random.nextInt(VALID_TEXTURES.length - 1)];
    }

    public static boolean canApplyTexture(VehicleStyle.Texture texture) {
        return DevUtil.contains(texture, VALID_TEXTURES, (t0, t1) -> t0 == t1);
    }
}
