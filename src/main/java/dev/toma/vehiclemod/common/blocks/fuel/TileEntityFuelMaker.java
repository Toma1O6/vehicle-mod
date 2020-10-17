package dev.toma.vehiclemod.common.blocks.fuel;

import dev.toma.vehiclemod.Registries;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

import javax.annotation.Nullable;

public class TileEntityFuelMaker extends TileEntity implements IInventory, ITickable {

    public static final int MAX_STORED_AMOUNT = 25000;

    private int ingredient = 0;
    private int product = 0;
    private NonNullList<ItemStack> inventory = NonNullList.withSize(7, ItemStack.EMPTY);
    private int processTimer;

    public int getIngredientAmount() {
        return ingredient;
    }

    public int getProductAmount() {
        return product;
    }

    public boolean isWorking() {
        return processTimer > 0;
    }

    public int getProcessTimer() {
        return processTimer;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        ItemStackHelper.saveAllItems(compound, inventory);
        compound.setInteger("ingredient", ingredient);
        compound.setInteger("product", product);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        ItemStackHelper.loadAllItems(compound, inventory);
        this.ingredient = compound.getInteger("ingredient");
        this.product = compound.getInteger("product");
    }

    @Override
    public void update() {
        if(hasFilters() && ingredient > 0 && product < MAX_STORED_AMOUNT) {
            if(++processTimer >= 600) {
                processTimer = 0;
                for(int i = 4; i < 7; i++) {
                    getStackInSlot(i).shrink(1);
                }
                world.playEvent(1035, pos, 0);
                int amount = Math.min(ingredient, 1000);
                ingredient -= amount;
                product += amount / 2;
            }
        } else {
            processTimer = 0;
        }
        if(ingredient < MAX_STORED_AMOUNT) {
            if(getStackInSlot(0).getItem() == Registries.VMItems.BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE && getStackInSlot(1).getCount() < 64) {
                getStackInSlot(0).shrink(1);
                setInventorySlotContents(1, new ItemStack(Items.BUCKET, getStackInSlot(1).isEmpty() ? 1 : getStackInSlot(1).getCount() + 1));
                ingredient += 1000;
            }
        }
        if(product >= 1000) {
            if(!getStackInSlot(2).isEmpty()) {
                getStackInSlot(2).shrink(1);
                ItemStack stack = getStackInSlot(3);
                setInventorySlotContents(3, new ItemStack(Registries.VMItems.BUCKET_OF_FUEL, stack.isEmpty() ? 1 : stack.getCount() + 1));
                product -= 1000;
            }
        }
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return writeToNBT(new NBTTagCompound());
    }

    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(pos, getBlockMetadata(), getUpdateTag());
    }

    private boolean hasFilters() {
        for(int i = 4; i < 7; i++) {
            if(getStackInSlot(i).getItem() != Registries.VMItems.FUEL_FILTER) {
                return false;
            }
        }
        return true;
    }

    // SOME IINVENTORY CRAP -----------------------------------------------------

    @Override
    public String getName() {
        return "container.fuel_maker.vm";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return 7;
    }

    @Override
    public boolean isEmpty() {
        for(ItemStack stack : inventory) {
            if(!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        inventory = NonNullList.withSize(7, ItemStack.EMPTY);
        markDirty();
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return index >= 0 && index < getSizeInventory() ? inventory.get(index) : ItemStack.EMPTY;
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack stack = ItemStackHelper.getAndSplit(inventory, index, count);
        if(!stack.isEmpty()) {
            markDirty();
        }
        return stack;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack stack = getStackInSlot(index);
        if(!stack.isEmpty()) {
            inventory.set(index, ItemStack.EMPTY);
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        inventory.set(index, stack);
        if(!stack.isEmpty() && stack.getCount() > getInventoryStackLimit()) {
            stack.setCount(getInventoryStackLimit());
        }
        markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {
    }

    @Override
    public void closeInventory(EntityPlayer player) {
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index == 6;
    }

    @Override
    public void markDirty() {
        super.markDirty();
    }
}
