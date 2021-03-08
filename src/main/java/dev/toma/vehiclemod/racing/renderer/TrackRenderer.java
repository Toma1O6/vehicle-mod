package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.client.render.entity.RenderVehicle;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.racing.Checkpoint;
import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.StartPoint;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.List;

public abstract class TrackRenderer<R extends Race> implements RenderRace<R> {

    @Override
    public final void renderRaceInfo(World world, R r, double x, double y, double z, float partialTicks) {

    }

    public static void renderTracks(List<RaceTrack> tracks, double x, double y, double z) {
        GlStateManager.disableCull();
        GlStateManager.enableBlend();
        GlStateManager.shadeModel(GL11.GL_SMOOTH);
        GlStateManager.translate(x, y, z);
        for (RaceTrack track : tracks) {
            List<Checkpoint> checkpoints = track.getCheckpoints();
            List<StartPoint> startPoints = track.getPoints();
            int i = 0;
            for (Checkpoint checkpoint : checkpoints) {
                drawCheckpoint(checkpoint);
                int j = track.getNextCheckpoint(i);
                if(j < 0)
                    continue;
                Checkpoint next = track.getCheckpoint(j);
                Tessellator tessellator = Tessellator.getInstance();
                BufferBuilder builder = tessellator.getBuffer();
                GlStateManager.disableTexture2D();
                builder.begin(3, DefaultVertexFormats.POSITION_COLOR);
                BlockPos p1 = checkpoint.getPos();
                BlockPos p2 = next.getPos();
                builder.pos(p1.getX() + 0.5, p1.getY() + 0.01, p1.getZ() + 0.5).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(p2.getX() + 0.5, p2.getY() + 0.01, p2.getZ() + 0.5).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                tessellator.draw();
                GlStateManager.enableTexture2D();
                ++i;
            }
            for (StartPoint point : startPoints) {
                drawStartpoint(point);
            }
        }
        GlStateManager.shadeModel(GL11.GL_FLAT);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
    }

    public static void drawStartpoint(StartPoint point) {
        GlStateManager.pushMatrix();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        BlockPos pos = point.getPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        Minecraft.getMinecraft().getTextureManager().bindTexture(RenderVehicle.NEON);
        builder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        builder.pos(x, y, z).tex(0, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y, z).tex(1, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y + 1, z).tex(1, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x, y + 1, z).tex(0, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x, y, z).tex(0, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x, y, z + 1).tex(1, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x, y + 1, z + 1).tex(1, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x, y + 1, z).tex(0, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x, y, z + 1).tex(0, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y, z + 1).tex(1, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y + 1, z + 1).tex(1, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x, y + 1, z + 1).tex(0, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x + 1, y, z).tex(0, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y, z + 1).tex(1, 0).color(0.0F, 0.7F, 0.0F, 0.6F).endVertex();
        builder.pos(x + 1, y + 1, z + 1).tex(1, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        builder.pos(x + 1, y + 1, z).tex(0, 1).color(0.0F, 0.7F, 0.0F, 0.1F).endVertex();
        tessellator.draw();

        Vec3d face = new Vec3d(2.5, 0.0, 0.0).rotateYaw(-point.getYaw() * 0.017453292F - ((float) Math.PI / 2f)).addVector(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
        builder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        builder.pos(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5).color(0.0F, 0.0F, 0.7F, 1.0F).endVertex();
        builder.pos(face.x, face.y, face.z).color(0.0F, 0.0F, 0.7F, 1.0F).endVertex();
        tessellator.draw();
        GlStateManager.popMatrix();
    }

    public static void drawCheckpoint(Checkpoint checkpoint) {
        GlStateManager.pushMatrix();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        BlockPos pos = checkpoint.getPos();
        int rad = checkpoint.getRadius();
        double height = VMConfig.clientConfig.checkpointHeight;
        float r = 1.0F;
        float g = 0.98F;
        float b = 0.43F;
        float as = 0.80F;
        float am = 0.15F;
        double cx = pos.getX() + 0.5;
        double cy = pos.getY();
        double cz = pos.getZ() + 0.5;
        Minecraft.getMinecraft().getTextureManager().bindTexture(RenderVehicle.NEON);
        builder.pos(cx - rad, cy - 3, cz + rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy - 3, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz + rad).tex(1, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz + rad).tex(0, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz + rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height * 2, cz + rad).tex(1, 1).color(r, g, b, am).endVertex();
        builder.pos(cx - rad, cy + height * 2, cz + rad).tex(0, 1).color(r, g, b, am).endVertex();
        builder.pos(cx + rad, cy - 3, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy - 3, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz + rad).tex(1, 1).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz - rad).tex(0, 1).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height * 2, cz + rad).tex(1, 1).color(r, g, b, am).endVertex();
        builder.pos(cx + rad, cy + height * 2, cz - rad).tex(0, 1).color(r, g, b, am).endVertex();
        builder.pos(cx - rad, cy - 3, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy - 3, cz - rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz - rad).tex(1, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz - rad).tex(0, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height, cz - rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx + rad, cy + height * 2, cz - rad).tex(1, 1).color(r, g, b, am).endVertex();
        builder.pos(cx - rad, cy + height * 2, cz - rad).tex(0, 1).color(r, g, b, am).endVertex();
        builder.pos(cx - rad, cy - 3, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy - 3, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz + rad).tex(1, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz - rad).tex(0, 1).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz - rad).tex(0, 0).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height, cz + rad).tex(1, 0).color(r, g, b, as).endVertex();
        builder.pos(cx - rad, cy + height * 2, cz + rad).tex(1, 0).color(r, g, b, am).endVertex();
        builder.pos(cx - rad, cy + height * 2, cz - rad).tex(0, 1).color(r, g, b, am).endVertex();
        tessellator.draw();
        GlStateManager.popMatrix();
    }
}
