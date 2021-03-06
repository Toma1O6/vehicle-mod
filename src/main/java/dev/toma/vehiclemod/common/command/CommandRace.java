package dev.toma.vehiclemod.common.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

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

    }
}
