package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.List;

public class TileEntityPetrolPump extends TileEntityInventory implements ITickable {

    public NonNullList<ItemStack> inventory = NonNullList.withSize(2, ItemStack.EMPTY);
    public float storedAmount;
    @Nullable
    public EntityVehicle pairedVehicle;
    public boolean transfer;

    @Override
    public NonNullList<ItemStack> getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(NonNullList<ItemStack> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getKeyForName() {
        return "petrol_pump";
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(pos, getBlockMetadata(), this.getUpdateTag());
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setFloat("stored", storedAmount);
        compound.setBoolean("transfer", transfer);
        if(pairedVehicle != null) compound.setInteger("vehicleID", pairedVehicle.getEntityId());
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        storedAmount = compound.getFloat("stored");
        transfer = compound.getBoolean("transfer");
        if(world == null) return;
        Entity entity = compound.hasKey("vehicleID") ? world.getEntityByID(compound.getInteger("vehicleID")) : null;
        if(entity instanceof EntityVehicle) {
            pairedVehicle = (EntityVehicle) entity;
        }
    }

    @Override
    public void update() {
        if(getStackInSlot(0).getItem() == Registries.VMItems.BUCKET_OF_FUEL) {
            if(storedAmount < 2500 && getStackInSlot(1).getCount() < 16) {
                getStackInSlot(0).shrink(1);
                setInventorySlotContents(1, new ItemStack(Items.BUCKET, getStackInSlot(1).getCount() + 1));
                storedAmount = storedAmount > 2490 ? 2500 : storedAmount + 10;
            }
        }
        if(this.pairedVehicle != null) {
            if(canReach()) {
                if(transfer && pairedVehicle.fuel < pairedVehicle.getActualStats().fuelCapacity && storedAmount > 0.0F) {
                    pairedVehicle.fuel += 0.1F;
                    storedAmount -= 0.1F;
                } else transfer = false;
            } else {
                pairedVehicle = null;
                if(!world.isRemote) {
                    world.getMinecraftServer().getPlayerList().getPlayers().forEach(entityPlayerMP -> entityPlayerMP.connection.sendPacket(this.getUpdatePacket()));
                }
            }
        }
    }

    @Nullable
    public EntityVehicle pair(EnumFacing facing) {
        BlockPos pos = this.getPos().offset(facing, 2);
        this.pairedVehicle = this.nearestVehicle(pos);
        return this.pairedVehicle;
    }

    @Nullable
    private EntityVehicle nearestVehicle(BlockPos pos) {
        List<EntityVehicle> list = this.getWorld().getEntitiesWithinAABB(EntityVehicle.class, Block.FULL_BLOCK_AABB.offset(pos).grow(2));
        double latest = Double.MAX_VALUE;
        EntityVehicle vehicle = null;
        for(EntityVehicle v : list) {
            double d = this.distanceTo(v, pos);
            if(d < latest && d < 3) {
                latest = d;
                vehicle = v;
            }
        }
        return vehicle;
    }

    private double distanceTo(Entity entity, BlockPos pos) {
        return Math.sqrt(sqr(entity.posX - pos.getX() + 0.5) + sqr(entity.posZ - pos.getZ() + 0.5));
    }

    private double sqr(double val) {
        return val * val;
    }

    private boolean canReach() {
        double dist = distanceTo(pairedVehicle, pos);
        return dist < 5;
    }
}
