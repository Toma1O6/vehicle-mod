package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.config.VehicleStats;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CPacketSyncConfig implements IMessage {

	private VehicleStats beamer, fedoratti, tracer, sputnik;
	private long time;
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(System.currentTimeMillis());
		VehicleStats.writeStatsToBuf(buf, VMConfig.beamer_s120);
		VehicleStats.writeStatsToBuf(buf, VMConfig.fedoratti_vulcan);
		VehicleStats.writeStatsToBuf(buf, VMConfig.tracer_t1);
		VehicleStats.writeStatsToBuf(buf, VMConfig.sputnik2000L);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		time = buf.readLong();
		beamer = VehicleStats.readStatsFromBuf(buf);
		fedoratti = VehicleStats.readStatsFromBuf(buf);
		tracer = VehicleStats.readStatsFromBuf(buf);
		sputnik = VehicleStats.readStatsFromBuf(buf);
	}
	
	public static class Handler implements IMessageHandler<CPacketSyncConfig, IMessage> {
		
		@Override
		public IMessage onMessage(CPacketSyncConfig message, MessageContext ctx) {
			if(ctx.side.isClient()) {
				Minecraft.getMinecraft().addScheduledTask(() -> {
					VMConfig.beamer_s120 = message.beamer;
					VMConfig.fedoratti_vulcan = message.fedoratti;
					VMConfig.tracer_t1 = message.tracer;
					VMConfig.sputnik2000L = message.sputnik;
					long ms = System.currentTimeMillis() - message.time;
					VehicleMod.logger.info("Config sync completed in {} miliseconds.", ms);
				});
			}
			return null;
		}
	}
}
