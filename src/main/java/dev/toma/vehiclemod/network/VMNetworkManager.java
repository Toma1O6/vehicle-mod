package dev.toma.vehiclemod.network;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.network.packets.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class VMNetworkManager {

	private static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(VehicleMod.MODID);
	
	private static int id = -1;
	
	public static SimpleNetworkWrapper instance() {
		return INSTANCE;
	}
	
	private static void registerClientPackets() {
		registerClientPacket(CPacketVehicleData.Handler.class, CPacketVehicleData.class);
		registerClientPacket(CPacketSyncConfig.Handler.class, CPacketSyncConfig.class);
		registerClientPacket(CPacketUpdateEntity.Handler.class, CPacketUpdateEntity.class);
		registerClientPacket(CPacketSendSpecialVehicleStatus.Handler.class, CPacketSendSpecialVehicleStatus.class);
	}
	
	private static void registerServerPackets() {
		registerServerPacket(SPacketInput.Handler.class, SPacketInput.class);
		registerServerPacket(SPacketUpdateTileEntity.Handler.class, SPacketUpdateTileEntity.class);
		registerServerPacket(SPacketSetNBT.Handler.class, SPacketSetNBT.class);
		registerServerPacket(SPacketOpenVehicleComponentGUI.Handler.class, SPacketOpenVehicleComponentGUI.class);
		registerServerPacket(SPacketLockpickAttempt.Handler.class, SPacketLockpickAttempt.class);
		registerServerPacket(SPacketSiren.Handler.class, SPacketSiren.class);
	}
	
	private static <REQ extends IMessage, REPLY extends IMessage> void registerClientPacket(Class<? extends IMessageHandler<REQ, REPLY>> handler, Class<REQ> packet) {
		instance().registerMessage(handler, packet, id++, Side.CLIENT);
	}
	
	private static <REQ extends IMessage, REPLY extends IMessage> void registerServerPacket(Class<? extends IMessageHandler<REQ, REPLY>> handler, Class<REQ> packet) {
		instance().registerMessage(handler, packet, id++, Side.SERVER);
	}
	
	public static void init() {
		registerServerPackets();
		registerClientPackets();
	}
}
