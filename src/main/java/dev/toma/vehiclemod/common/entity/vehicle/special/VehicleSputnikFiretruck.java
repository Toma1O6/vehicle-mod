package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnikFiretruck extends EntityVehicleSpecial {

    static final VehicleTexture[] VALID_COLORS = {VehicleTexture.GRAY, VehicleTexture.RED, VehicleTexture.UTILITY_YELLOW, VehicleTexture.HELL};
    static final Vector3f[] PARTS = {};

    public VehicleSputnikFiretruck(World world) {
        super(world);
    }

    public VehicleSputnikFiretruck(World world, BlockPos pos) {
        super(world, pos);
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
    public Vector3f[] getPartVecs() {
        return new Vector3f[] {new Vector3f(), new Vector3f()};
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.sputnikFiretruck;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK_FIRETRUCK_ACC)
                .brk(VMSounds.SPUTNIK_FIRETRUCK_BRAKE)
                .rls(VMSounds.SPUTNIK_FIRETRUCK_GAS)
                .str(VMSounds.SPUTNIK_FIRETRUCK_START)
                .build();
    }
}
