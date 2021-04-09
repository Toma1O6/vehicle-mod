package dev.toma.vehiclemod.common.command;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.points.Checkpoint;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.points.RotatedPoint;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CommandTrack extends CommandBase {

    @Override
    public String getName() {
        return "track";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/track [action] [name] <data>";
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) {
        RacingData data = RacingDataImpl.get(sender.getEntityWorld());
        switch (args.length) {
            case 1:
                return getListOfStringsMatchingLastWord(args, "create", "delete", "checkpoint", "startpoint");
            case 2:
                switch (args[0]) {
                    case "delete":
                    case "checkpoint":
                    case "startpoint":
                        return getListOfStringsMatchingLastWord(args, data.getTracks().stream().map(RaceTrack::id).collect(Collectors.toList()));
                    default:
                        return Collections.emptyList();
                }
            default:
                return Collections.emptyList();
        }
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length == 0) {
            throw new CommandException("Not enough arguments");
        }
        RacingData data = RacingDataImpl.get(sender.getEntityWorld());
        switch (args[0]) {
            case "create":
                if(args.length < 2)
                    throw new CommandException("You must specify track name");
                data.addTrack(new RaceTrack(args[1]));
                sender.sendMessage(new TextComponentString("Added new track " + args[1]));
                break;
            case "delete":
                if(args.length < 2)
                    throw new CommandException("You must specify track name");
                Iterator<RaceTrack> itr = data.getTracks().iterator();
                while (itr.hasNext()) {
                    RaceTrack track = itr.next();
                    if(track.id().equalsIgnoreCase(args[1])) {
                        sender.sendMessage(new TextComponentString("Removed track " + track.id()));
                        itr.remove();
                        return;
                    }
                }
                throw new CommandException("Unknown track: " + args[1]);
            case "checkpoint":
                if(args.length < 2)
                    throw new CommandException("You must specify track name");
                int rad = 3;
                if(args.length == 3) {
                    try {
                        rad = Integer.parseInt(args[2]);
                    } catch (NumberFormatException exception) {
                        throw new CommandException("Invalid value: ", args[2]);
                    }
                }
                for (RaceTrack track : data.getTracks()) {
                    if(track.id().equalsIgnoreCase(args[1])) {
                        Checkpoint checkpoint = new Checkpoint(sender.getPosition(), rad);
                        track.getCheckpoints().add(checkpoint);
                        sender.sendMessage(new TextComponentString(String.format("Added checkpoint (%s, %d) to %s track", checkpoint.getPos().toString(), checkpoint.getRadius(), track.id())));
                        break;
                    }
                }
                break;
            case "startpoint":
                if(args.length < 2)
                    throw new CommandException("You must specify track name");
                for (RaceTrack track : data.getTracks()) {
                    if(track.id().equalsIgnoreCase(args[1])) {
                        RotatedPoint sp = new RotatedPoint(sender.getPosition());
                        Entity entity = sender.getCommandSenderEntity();
                        if(entity != null) {
                            float rawYaw = entity.rotationYaw;
                            float[] rotations = {0.0F, 45.0F, 90.0F, 135.0F, 180.0F, 225.0F, 270.0F, 315.0F, 360.0F};
                            while (rawYaw < 0)
                                rawYaw += 360;
                            rawYaw %= 360;
                            for (float f : rotations) {
                                float diff = Math.abs(rawYaw - f);
                                if(diff <= 22.5F) {
                                    sp.setRotation(f % 360);
                                    break;
                                }
                            }
                        }
                        track.getPoints().add(sp);
                        sender.sendMessage(new TextComponentString(String.format("Added start position (%s) to %s track", sp.getPos().toString(), track.id())));
                        break;
                    }
                }
                break;
            default:
                throw new CommandException("Unknown argument: " + args[0]);
        }
        data.syncAll();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 2;
    }
}
