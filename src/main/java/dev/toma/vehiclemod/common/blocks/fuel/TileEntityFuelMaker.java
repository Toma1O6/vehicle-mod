package dev.toma.vehiclemod.common.blocks.fuel;

import dev.toma.vehiclemod.common.fluids.*;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

import javax.annotation.Nullable;

public class TileEntityFuelMaker extends TileEntity implements IInventory, ITickable {

    public static final int MAX_STORED_AMOUNT = 250000;

    private FluidEntry inputFluid = FluidEntry.EMPTY;
    private FluidEntry outputFluid = FluidEntry.EMPTY;
    private NonNullList<ItemStack> inventory = NonNullList.withSize(9, ItemStack.EMPTY);
    private boolean processing;
    private int processTimer;

    public boolean isWorking() {
        return processTimer > 0;
    }

    public int getProcessTimer() {
        return processTimer;
    }

    public FluidEntry getInput() {
        return inputFluid;
    }

    public FluidEntry getOutput() {
        return outputFluid;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        ItemStackHelper.saveAllItems(compound, inventory);
        compound.setBoolean("isProcessing", processing);
        compound.setInteger("processTimer", processTimer);
        if(!inputFluid.isEmpty())
            compound.setTag("inputFluid", inputFluid.serializeNBT());
        if(!outputFluid.isEmpty())
            compound.setTag("outputFluid", outputFluid.serializeNBT());
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        ItemStackHelper.loadAllItems(compound, inventory);
        processing = compound.getBoolean("isProcessing");
        processTimer = compound.getInteger("processTimer");
        if(compound.hasKey("inputFluid"))
            inputFluid = new FluidEntry(compound.getCompoundTag("inputFluid"), MAX_STORED_AMOUNT);
        if(compound.hasKey("outputFluid"))
            outputFluid = new FluidEntry(compound.getCompoundTag("outputFluid"), MAX_STORED_AMOUNT);
    }

    public void runAction(int actionID, boolean shiftClick) {
        switch (actionID) {
            case 0:
                dumpInput();
                break;
            case 1:
                transferOutputToInput();
                break;
            case 2:
                processFluidIntoItem(inputFluid, 1, shiftClick);
                break;
            case 3:
                processFluidIntoItem(outputFluid, 2, shiftClick);
                break;
            default:
                throw new IllegalArgumentException("Unknown action ID (" + actionID + ")");
        }
    }

    public void dumpInput() {
        if(!inputFluid.isEmpty()) {
            inputFluid = FluidEntry.EMPTY;
        }
    }

    public void transferOutputToInput() {
        if(inputFluid.isEmpty()) {
            inputFluid = outputFluid;
            outputFluid = FluidEntry.EMPTY;
        } else if(inputFluid.canMix(outputFluid.getType())) {
            inputFluid.mix(outputFluid);
            outputFluid = FluidEntry.EMPTY;
        }
    }

    public void processFluidIntoItem(FluidEntry entry, int output, boolean max) {
        if(entry.isEmpty() || !entry.getType().hasFluidHolder())
            return;
        FluidType type = entry.getType();
        Item item = type.getBehavior().getFluidItem();
        ItemStack stack = this.getStackInSlot(output);
        if(stack.isEmpty()) {
           int amount = Math.min(this.getBucketCount(), max ? entry.getAmount() / 10000 : 1);
           ItemStack out = new ItemStack(item, amount);
           for (int i = 0; i < amount; i++) {
               int bucketIndex = getSlotWithBucket();
               if(bucketIndex == -1)
                   throw new IllegalStateException("Couldn't find bucket");
               this.getStackInSlot(bucketIndex).shrink(1);
           }
           entry.reduce(amount * 10000);
           setInventorySlotContents(output, out);
        } else if(stack.getItem() == item) {
            int present = stack.getCount();
            int maxAmount = this.getInventoryStackLimit() - present;
            int amount = Math.min(maxAmount, Math.min(this.getBucketCount(), max ? entry.getAmount() / 10000 : 1));
            for (int i = 0; i < amount; i++) {
                int bucketIndex = getSlotWithBucket();
                if(bucketIndex == -1)
                    throw new IllegalStateException("Couldn't find bucket");
                this.getStackInSlot(bucketIndex).shrink(1);
            }
            entry.reduce(amount * 10000);
            stack.setCount(present + amount);
        }
    }

    public int getBucketCount() {
        int count = 0;
        for (int i = 6; i < 9; i++) {
            ItemStack stack = this.getStackInSlot(i);
            if(!stack.isEmpty() && stack.getItem() == Items.BUCKET) {
                count += stack.getCount();
            }
        }
        return count;
    }

    public int getSlotWithBucket() {
        for (int i = 6; i < 9; i++) {
            ItemStack stack = this.getStackInSlot(i);
            if(stack.getItem() == Items.BUCKET) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update() {
        // processing
        if(!this.inputFluid.isEmpty() && this.inputFluid.getType().hasResult() && this.hasFilters()) {
            FluidProcessResult result = this.inputFluid.getType().getProcessResult();
            if(this.inputFluid.getAmount() >= result.getRequiredAmount() && (this.outputFluid.isEmpty() || this.outputFluid.canMix(result.getType())) && outputFluid.getAmount() + result.getResultAmount() <= MAX_STORED_AMOUNT) {
                if(!processing) {
                    processing = true;
                } else if(++processTimer >= result.getProcessTime()) {
                    processTimer = 0;
                    if(this.outputFluid.isEmpty()) {
                        this.outputFluid = new FluidEntry(result.getType(), MAX_STORED_AMOUNT);
                    }
                    outputFluid.add(result.getResultAmount());
                    inputFluid.reduce(result.getRequiredAmount());
                    world.playEvent(1035, pos, 0);
                    for (int i = 3; i < 6; i++) {
                        getStackInSlot(i).shrink(1);
                    }
                    markDirty();
                }
            } else stopProcessing();
        } else stopProcessing();

        // input handling
        ItemStack stack = this.getStackInSlot(0);
        if(stack.getItem() instanceof IFuelMakerItem) {
            IFuelMakerItem item = (IFuelMakerItem) stack.getItem();
            FluidType type = item.getFluid();
            if(inputFluid.isEmpty()) {
                this.inputFluid = new FluidEntry(type, MAX_STORED_AMOUNT);
            }
            if(inputFluid.canMix(type)) {
                int maxAdd = MAX_STORED_AMOUNT - this.inputFluid.getAmount();
                int amount = Math.min(maxAdd, item.getFluidAmount(stack));
                if(amount > 0) {
                    inputFluid.add(amount);
                    ItemStack processed = item.processInsertion(stack.copy(), amount);
                    setInventorySlotContents(0, processed);
                    markDirty();
                    if(item.shouldCreateEmptyBucket()) {
                        boolean created = false;
                        for (int i = 6; i < 9; i++) {
                            ItemStack itemStack = this.getStackInSlot(i);
                            if(itemStack.isEmpty()) {
                                setInventorySlotContents(i, new ItemStack(Items.BUCKET));
                                created = true;
                                break;
                            } else if(itemStack.getItem() == Items.BUCKET && itemStack.getCount() < itemStack.getMaxStackSize()) {
                                itemStack.setCount(itemStack.getCount() + 1);
                                created = true;
                                break;
                            }
                        }
                        if(!created) {
                            if(!world.isRemote) {
                                EntityItem entityItem = new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.2, pos.getZ() + 0.5, new ItemStack(Items.BUCKET));
                                world.spawnEntity(entityItem);
                            }
                        }
                    }
                }
            }
        }

        // custom item behavior tick
        this.tickOutputSlot(1, this.inputFluid);
        this.tickOutputSlot(2, this.outputFluid);
    }

    boolean hasFilters() {
        for(int i = 3; i < 6; i++) {
            if(!(getStackInSlot(i).getItem() instanceof IFilter)) {
                return false;
            }
        }
        return true;
    }

    void stopProcessing() {
        processing = false;
        processTimer = 0;
    }

    void tickOutputSlot(int slotID, FluidEntry entry) {
        ItemStack stack = this.getStackInSlot(slotID);
        if(entry.isEmpty() || stack.isEmpty())
            return;
        FluidType type = entry.getType();
        if(!type.hasFluidItemBehavior())
            return;
        FluidItemBehavior behavior = type.getBehavior();
        if(behavior.canProcess(stack, entry.getAmount())) {
            behavior.process(stack, entry, slotID, this);
            markDirty();
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
        return 9;
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
