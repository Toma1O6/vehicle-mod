package dev.toma.vehiclemod.client.command;

import com.mojang.authlib.GameProfile;
import dev.toma.vehiclemod.common.properties.DefaultProperties;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketOpenRaceScreen;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.UserListOpsEntry;

public class CommandRace extends CommandBase {

    @Override
    public String getName() {
        return "race";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/race";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(sender instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) sender;
            GameProfile profile = player.getGameProfile();
            UserListOpsEntry entry = server.getPlayerList().getOppedPlayers().getEntry(profile);
            boolean flag = entry != null ? entry.getPermissionLevel() >= server.getOpPermissionLevel() : server.getOpPermissionLevel() >= 2;
            VMNetworkManager.instance().sendTo(new CPacketOpenRaceScreen(DefaultProperties.CREATE_RACE.getProperty().get(player)), player);
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
