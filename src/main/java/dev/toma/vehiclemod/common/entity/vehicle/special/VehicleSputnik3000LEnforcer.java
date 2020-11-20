package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.ISpecialVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.vecmath.Vector3f;

public class VehicleSputnik3000LEnforcer extends EntityVehicleSpecial implements ISpecialVehicle {

    @SideOnly(Side.CLIENT)
    private CarSound siren;
    private boolean effect;

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
                .build();
    }

    @Override
    protected void writeExtraData(NBTTagCompound compound) {
        compound.setBoolean("effect", effect);
    }

    @Override
    protected void readExtraData(NBTTagCompound compound) {
        effect = compound.getBoolean("effect");
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.sputnik3000LEnf;
    }

    @Override
    public boolean canRepaint(VehicleTexture texture) {
        return texture == VehicleTexture.WHITE;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return VehicleSputnik3000L.PARTS;
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
        return new VehicleUpgrades(getConfigStats(), fill(9, 2));
    }

    @Override
    public SoundEvent getSoundEvent() {
        return VMSounds.POLICE_SIREN;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public CarSound getPlayingSound() {
        return siren;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setPlayingSound(CarSound sound) {
        siren = sound;
    }

    @Override
    public boolean isEffectActive() {
        return effect;
    }

    @Override
    public void setEffectActive(boolean effect) {
        this.effect = effect;
    }
}
