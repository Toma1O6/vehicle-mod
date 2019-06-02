package dev.toma.vehiclemod.network.packets;

import java.util.ArrayList;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CPacketSyncConfig implements IMessage {
	
	private String[] fuels;
	private int fuelAmount;
	private VehicleStats beamer;
	private long time;
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(System.currentTimeMillis());
		buf.writeInt(VMConfig.fuels.length);
		for(int i = 0; i < VMConfig.fuels.length; i++) {
			ByteBufUtils.writeUTF8String(buf, VMConfig.fuels[i]);
		}
		VehicleStats.writeStatsToBuf(buf, VMConfig.beamer_s120);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		time = buf.readLong();
		fuelAmount = buf.readInt();
		ArrayList<String> list = new ArrayList<>(fuelAmount);
		for(int i = 0; i < fuelAmount; i++) {
			list.add(ByteBufUtils.readUTF8String(buf));
		}
		fuels = list.toArray(new String[0]);
		beamer = VehicleStats.readStatsFromBuf(buf);
	}
	
	public static class Handler implements IMessageHandler<CPacketSyncConfig, IMessage> {
		
		@Override
		public IMessage onMessage(CPacketSyncConfig message, MessageContext ctx) {
			if(ctx.side.isClient()) {
				Minecraft.getMinecraft().addScheduledTask(() -> {
					VMConfig.fuels = message.fuels;
					VMConfig.beamer_s120 = message.beamer;
					long ms = System.currentTimeMillis() - message.time;
					VehicleMod.logger.info("Config sync completed in {} miliseconds.", ms);
				});
			}
			return null;
		}
	}
}
