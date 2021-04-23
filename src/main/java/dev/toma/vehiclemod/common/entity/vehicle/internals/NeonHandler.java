package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.inventory.InventoryNeons;
import dev.toma.vehiclemod.util.DevUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import java.util.function.Function;

public class NeonHandler implements ISerializationListener {

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

    public InventoryNeons getNeons() {
        return neons;
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagList list = DevUtil.inventoryToNBT(neons);
        nbt.setTag("neons", list);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("neons", Constants.NBT.TAG_LIST)) {
            DevUtil.loadInventoryFromNBT(neons, nbt.getTagList("neons", Constants.NBT.TAG_COMPOUND));
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        NBTTagCompound data = new NBTTagCompound();
        onNBTWrite(data);
        ByteBufUtils.writeTag(buf, data);
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        NBTTagCompound data = ByteBufUtils.readTag(buf);
        onNBTRead(data);
    }

    public enum Direction {
        FRONT(VehicleStyle::getNeonFront, false, false),
        RIGHT(VehicleStyle::getNeonRight, true, false),
        BACK(VehicleStyle::getNeonBack, false, true),
        LEFT(VehicleStyle::getNeonLeft, true, true);

        final Function<VehicleStyle, Vec3d> position;
        final boolean vertical;
        final boolean invert;

        Direction(Function<VehicleStyle, Vec3d> position, boolean vertical, boolean invert) {
            this.position = position;
            this.vertical = vertical;
            this.invert = invert;
        }

        public Vec3d getPosition(VehicleStyle style) {
            return position.apply(style);
        }

        public boolean isVertical() {
            return vertical;
        }

        public boolean shouldInvert() {
            return invert;
        }
    }
}
