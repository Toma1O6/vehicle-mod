package dev.toma.vehiclemod.common.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySecret extends TileEntity {
	
	private String objectName = "nothing";
	
	public void setName(String name) {
		this.objectName = name;
	}
	
	public String getObjectName() {
		return objectName;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setString("objectName", objectName);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		objectName = compound.getString("objectName");
	}
}
