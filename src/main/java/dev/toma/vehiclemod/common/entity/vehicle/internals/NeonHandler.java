package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.inventory.InventoryNeons;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.function.Function;

public class NeonHandler implements INBTSerializable<NBTTagCompound> {

    private final EntityVehicle vehicle;
    private InventoryNeons neons;

    public NeonHandler(EntityVehicle vehicle) {
        this.vehicle = vehicle;
        this.neons = new InventoryNeons(vehicle);
    }

    public ItemStack getPulserUpgrade() {
        return neons.getStackInSlot(0);
    }

    public ItemStack getNeon(Direction direction) {
        return neons.getStackInSlot(1 + direction.ordinal());
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return DevUtil.inventoryToNBTCompound(neons);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        DevUtil.loadInventoryFromNBTCompound(neons, nbt);
    }

    public InventoryNeons getNeons() {
        return neons;
    }

    public enum Direction {
        FRONT(PositionManager::getFrontNeon, false, false),
        RIGHT(PositionManager::getRightNeon, true, false),
        BACK(PositionManager::getBackNeon, false, true),
        LEFT(PositionManager::getLeftNeon, true, true);

        final Function<PositionManager, Vec3d> position;
        final boolean vertical;
        final boolean invert;

        Direction(Function<PositionManager, Vec3d> position, boolean vertical, boolean invert) {
            this.position = position;
            this.vertical = vertical;
            this.invert = invert;
        }

        public Vec3d getPosition(PositionManager manager) {
            return position.apply(manager);
        }

        public boolean isVertical() {
            return vertical;
        }

        public boolean shouldInvert() {
            return invert;
        }
    }
}
