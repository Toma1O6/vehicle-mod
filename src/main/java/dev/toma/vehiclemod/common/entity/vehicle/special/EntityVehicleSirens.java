package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISerializationListener;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISpecialVehicle;
import io.netty.buffer.ByteBuf;
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
        serializationListenerEventHandler.subscribe(new AdditionalDataSerializer());
    }

    EntityVehicleSirens(World world, BlockPos pos) {
        super(world, pos);
        serializationListenerEventHandler.subscribe(new AdditionalDataSerializer());
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

    private class AdditionalDataSerializer implements ISerializationListener {

        @Override
        public void onNBTWrite(NBTTagCompound nbt) {
            nbt.setBoolean("effect", EntityVehicleSirens.this.sirenEffect);
        }

        @Override
        public void onNBTRead(NBTTagCompound nbt) {
            EntityVehicleSirens.this.sirenEffect = nbt.getBoolean("effect");
        }

        @Override
        public void onBytesWrite(ByteBuf buf) {
            buf.writeBoolean(EntityVehicleSirens.this.sirenEffect);
        }

        @Override
        public void onBytesRead(ByteBuf buf) {
            EntityVehicleSirens.this.sirenEffect = buf.readBoolean();
        }
    }
}
