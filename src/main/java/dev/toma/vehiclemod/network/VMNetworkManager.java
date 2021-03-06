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
	
	private static int id = 0;
	
	public static SimpleNetworkWrapper instance() {
		return INSTANCE;
	}
	
	private static void registerClientPackets() {
		registerClientPacket(CPacketVehicleData.Handler.class, CPacketVehicleData.class);
		registerClientPacket(CPacketUpdateEntity.Handler.class, CPacketUpdateEntity.class);
		registerClientPacket(CPacketSendSpecialVehicleStatus.Handler.class, CPacketSendSpecialVehicleStatus.class);
		registerClientPacket(CPacketHonk.Handler.class, CPacketHonk.class);
		registerClientPacket(CPacketSendLightStatus.Handler.class, CPacketSendLightStatus.class);
		registerClientPacket(CPacketCloudStatus.Handler.class, CPacketCloudStatus.class);
		registerClientPacket(CPacketSyncRaceCap.Handler.class, CPacketSyncRaceCap.class);
		registerClientPacket(CPacketOpenRaceScreen.Handler.class, CPacketOpenRaceScreen.class);
	}
	
	private static void registerServerPackets() {
		registerServerPacket(SPacketInput.Handler.class, SPacketInput.class);
		registerServerPacket(SPacketUpdateTileEntity.Handler.class, SPacketUpdateTileEntity.class);
		registerServerPacket(SPacketSetNBT.Handler.class, SPacketSetNBT.class);
		registerServerPacket(SPacketOpenVehicleComponentGUI.Handler.class, SPacketOpenVehicleComponentGUI.class);
		registerServerPacket(SPacketLockpickAttempt.Handler.class, SPacketLockpickAttempt.class);
		registerServerPacket(SPacketSiren.Handler.class, SPacketSiren.class);
		registerServerPacket(SPacketHonk.Handler.class, SPacketHonk.class);
		registerServerPacket(SPacketFuelMakerAction.Handler.class, SPacketFuelMakerAction.class);
		registerServerPacket(SPacketChangeLightStatus.Handler.class, SPacketChangeLightStatus.class);
		registerServerPacket(SPacketVehicleAction.Handler.class, SPacketVehicleAction.class);
		registerServerPacket(SPacketCloudStatus.Handler.class, SPacketCloudStatus.class);
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
