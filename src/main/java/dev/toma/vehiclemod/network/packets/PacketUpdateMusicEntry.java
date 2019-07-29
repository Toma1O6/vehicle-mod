package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.blocks.BlockMusicPlayer;
import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.util.MusicEntry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketUpdateMusicEntry implements IMessage {

    private MusicEntry entry;
    private BlockPos pos;

    public PacketUpdateMusicEntry() {}

    public PacketUpdateMusicEntry(MusicEntry entry, BlockPos pos) {
        this.entry = entry;
        this.pos = pos;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(SoundEvent.REGISTRY.getIDForObject(entry.music));
        buf.writeInt(entry.recordTime);
        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        MusicEntry en = new MusicEntry(SoundEvent.REGISTRY.getObjectById(buf.readInt()), buf.readInt());
        for(MusicEntry e : BlockMusicPlayer.SONGS) {
            if(en.equals(e)) {
                entry = e;
                break;
            }
        }
        this.pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
    }

    public static class Handler implements IMessageHandler<PacketUpdateMusicEntry, IMessage> {

        @Override
        public IMessage onMessage(PacketUpdateMusicEntry message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                TileEntity te = player.world.getTileEntity(message.pos);
                if(te != null && te instanceof TileEntityMusicPlayer) {
                    TileEntityMusicPlayer t = (TileEntityMusicPlayer)te;
                    t.currentEntry = message.entry;
                }
            });
            return null;
        }
    }
}
