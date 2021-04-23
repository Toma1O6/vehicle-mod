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

public class VehicleMcgFiretruck extends EntityVehicleSirens {

    static final VehicleStyle.Texture[] VALID_COLORS = {VehicleStyle.Texture.GRAY, VehicleStyle.Texture.RED, VehicleStyle.Texture.UTILITY_YELLOW, VehicleStyle.Texture.HELL};

    public VehicleMcgFiretruck(World world) {
        super(world);
    }

    public VehicleMcgFiretruck(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected void setSize() {
        setSize(2.0F, 2.4F);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 27);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.mcgFiretruck;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.MCG_FIRETRUCK_ACC).brk(VMSounds.MCG_FIRETRUCK_BRAKE).rls(VMSounds.MCG_FIRETRUCK_GAS).str(VMSounds.MCG_FIRETRUCK_START).honk(VMSounds.HORN_12).starting(VMSounds.CAR_START_D).build();
    }

    @Override
    public SoundEvent getSpecialEffectSound() {
        return VMSounds.FIRETRUCK_SIREN;
    }

    public static VehicleStyle.Texture getRandomTexture(Random random) {
        return VALID_COLORS[random.nextInt(3)];
    }

    public static boolean canApplyTexture(VehicleStyle.Texture texture) {
        return DevUtil.contains(texture, VALID_COLORS, (t0, t1) -> t0 == t1);
    }
}
