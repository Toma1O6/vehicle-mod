package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.util.DevUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class VehicleContainer extends InventoryBasic implements ISerializationListener {

    public VehicleContainer(EntityVehicle entityVehicle, int slots) {
        super(entityVehicle.getDisplayName() + " container", false, slots);
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagList list = DevUtil.inventoryToNBT(this);
        nbt.setTag("inventory", list);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("inventory", Constants.NBT.TAG_LIST)) {
            DevUtil.loadInventoryFromNBT(this, nbt.getTagList("inventory", Constants.NBT.TAG_COMPOUND));
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
}
