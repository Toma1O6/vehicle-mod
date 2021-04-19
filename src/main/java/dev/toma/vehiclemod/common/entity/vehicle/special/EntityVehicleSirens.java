package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISpecialVehicle;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityVehicleSirens extends EntityVehicleSpecial implements ISpecialVehicle {

    protected boolean sirenEffect;
    @SideOnly(Side.CLIENT)
    protected CarSound sirenSound;

    EntityVehicleSirens(World world) {
        super(world);
    }

    EntityVehicleSirens(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected void writeExtraData(NBTTagCompound compound) {
        compound.setBoolean("effect", sirenEffect);
    }

    @Override
    protected void readExtraData(NBTTagCompound compound) {
        sirenEffect = compound.getBoolean("effect");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public CarSound getPlayingSound() {
        return sirenSound;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setPlayingSound(CarSound sound) {
        this.sirenSound = sound;
    }

    @Override
    public boolean isEffectActive() {
        return sirenEffect;
    }

    @Override
    public void setEffectActive(boolean effect) {
        this.sirenEffect = effect;
    }
}
