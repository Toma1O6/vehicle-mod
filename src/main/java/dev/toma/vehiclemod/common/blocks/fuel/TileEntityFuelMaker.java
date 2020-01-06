package dev.toma.vehiclemod.common.blocks.fuel;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
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

    private static final int SIZE = 5;
    private static final int INPUT = 0;
    private static final int OUTPUT = 4;

    private int ingredient = 0;
    private int product = 0;
    private NonNullList<ItemStack> inventory = NonNullList.withSize(SIZE, ItemStack.EMPTY);

    public int getIngredientAmount() {
        return ingredient;
    }

    public int getProductAmount() {
        return product;
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
        if(world.getWorldTime() % 20 == 0 && hasFilters() && ingredient >= 2 && product < 1000) {
            ingredient -= 2;
            ++product;
            if(!world.isRemote) {
                int slot = 1 + VehicleMod.getRNG().nextInt(3);
                ItemStack stack = this.getStackInSlot(slot);
                if(stack.getItemDamage() == stack.getMaxDamage() - 1) {
                    setInventorySlotContents(slot, ItemStack.EMPTY);
                } else {
                    stack.setItemDamage(stack.getItemDamage() + 1);
                }
            }
        }
        if(getStackInSlot(INPUT).getItem() == Registries.VMItems.BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE && ingredient < 1000) {
            this.ingredient = ingredient <= 900 ? ingredient + 100 : 1000;
            setInventorySlotContents(INPUT, new ItemStack(Items.BUCKET));
        }
        if(getStackInSlot(OUTPUT).getItem() == Items.BUCKET && product >= 100) {
            product -= 100;
            setInventorySlotContents(OUTPUT, new ItemStack(Registries.VMItems.BUCKET_OF_FUEL));
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
        for(int i = 1; i < 4; i++) {
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
        return SIZE;
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
        inventory = NonNullList.withSize(SIZE, ItemStack.EMPTY);
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
        return index < SIZE - 1;
    }

    @Override
    public void markDirty() {
        super.markDirty();
    }
}
