package dev.toma.vehiclemod.common.command;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.Checkpoint;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.StartPoint;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import java.util.Iterator;

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
        if(args.length == 0) {
            throw new CommandException("Not enough arguments");
        }
        switch (args[0]) {
            case "track":
                cmdHandleTrack(server, sender, args);
                break;
        }
    }

    void cmdHandleTrack(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length <= 2) {
            throw new CommandException("Not enough arguments");
        }
        RacingData data = RacingDataImpl.get(sender.getEntityWorld());
        switch (args[1]) {
            case "create":
                if(args.length < 3)
                    throw new CommandException("You must specify track name");
                data.addTrack(new RaceTrack(args[2]));
                sender.sendMessage(new TextComponentString("Added new track " + args[2]));
                break;
            case "delete":
                if(args.length < 3)
                    throw new CommandException("You must specify track name");
                Iterator<RaceTrack> itr = data.getTracks().iterator();
                while (itr.hasNext()) {
                    RaceTrack track = itr.next();
                    if(track.id().equalsIgnoreCase(args[2])) {
                        sender.sendMessage(new TextComponentString("Removed track " + track.id()));
                        itr.remove();
                        break;
                    }
                }
                throw new CommandException("Unknown track: " + args[2]);
            case "checkpoint":
                if(args.length < 3)
                    throw new CommandException("You must specify track name");
                int rad = 3;
                if(args.length == 4) {
                    try {
                        rad = Integer.parseInt(args[3]);
                    } catch (NumberFormatException exception) {
                        throw new CommandException("Invalid value: ", args[3]);
                    }
                }
                for (RaceTrack track : data.getTracks()) {
                    if(track.id().equalsIgnoreCase(args[2])) {
                        Checkpoint checkpoint = new Checkpoint(sender.getPosition(), rad);
                        track.getCheckpoints().add(checkpoint);
                        sender.sendMessage(new TextComponentString(String.format("Added checkpoint (%s, %d) to %s track", checkpoint.getPos().toString(), checkpoint.getRadius(), track.id())));
                        break;
                    }
                }
                break;
            case "startpoint":
                if(args.length < 3)
                    throw new CommandException("You must specify track name");
                for (RaceTrack track : data.getTracks()) {
                    if(track.id().equalsIgnoreCase(args[2])) {
                        StartPoint sp = new StartPoint(sender.getPosition());
                        track.getPoints().add(sp);
                        sender.sendMessage(new TextComponentString(String.format("Added start position (%s) to %s track", sp.getPos().toString(), track.id())));
                        break;
                    }
                }
                break;
            default:
                throw new CommandException("Unknown argument: " + args[1]);
        }
    }
}
