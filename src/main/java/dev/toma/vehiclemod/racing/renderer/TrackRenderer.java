package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.render.entity.RenderVehicle;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.racing.points.Checkpoint;
import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.points.RotatedPoint;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
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
        GlStateManager.translate(x, y, z);
        for (RaceTrack track : tracks) {
            List<Checkpoint> checkpoints = track.getCheckpoints();
            List<RotatedPoint> startPoints = track.getPoints();
            int i = 0;
            CheckpointStyle style = track.getCheckpointStyle();
            for (Checkpoint checkpoint : checkpoints) {
                int j = track.getNextCheckpoint(i);
                drawCheckpoint(checkpoint, style, j);
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
            GlStateManager.enableBlend();
            for (RotatedPoint point : startPoints) {
                drawStartpoint(point);
            }
        }
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
    }

    public static void drawStartpoint(RotatedPoint point) {
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

        Vec3d face = new Vec3d(2.5, 0.0, 0.0).rotateYaw(-point.getRotation() * 0.017453292F - ((float) Math.PI / 2f)).addVector(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
        builder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        builder.pos(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5).color(0.0F, 0.0F, 0.7F, 1.0F).endVertex();
        builder.pos(face.x, face.y, face.z).color(0.0F, 0.0F, 0.7F, 1.0F).endVertex();
        tessellator.draw();
        GlStateManager.popMatrix();
    }

    public static void drawCheckpoint(Checkpoint checkpoint, CheckpointStyle style, int idx) {
        GlStateManager.pushMatrix();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.alphaFunc(516, 0.003921569F);
        builder.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
        int color = style.getColorFromScheme(idx);
        float r = ((color >> 16) & 0xff) / 255.0F;
        float g = ((color >>  8) & 0xff) / 255.0F;
        float b = ( color        & 0xff) / 255.0F;
        float a = 1.0F;
        // TODO improve lighting values
        int i = 240;
        int j = 240;
        double rad = Math.toRadians(checkpoint.getRotation());
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double dx = cos * style.getWidth();
        double dz = sin * style.getWidth();
        Minecraft mc = Minecraft.getMinecraft();
        mc.entityRenderer.enableLightmap();
        mc.getTextureManager().bindTexture(style.getTexture());
        Vec3d left = checkpoint.getLeft();
        Vec3d right = checkpoint.getRight();
        builder.pos(left.x - dx, left.y, left.z - dz).tex(0, 1).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(left.x + dx, left.y, left.z + dz).tex(1, 1).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(left.x + dx, left.y + style.getHeight(), left.z + dz).tex(1, 0).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(left.x - dx, left.y + style.getHeight(), left.z - dz).tex(0, 0).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(right.x - dx, right.y, right.z - dz).tex(0, 1).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(right.x + dx, right.y, right.z + dz).tex(1, 1).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(right.x + dx, right.y + style.getHeight(), right.z + dz).tex(1, 0).color(r, g, b, a).lightmap(i, j).endVertex();
        builder.pos(right.x - dx, right.y + style.getHeight(), right.z - dz).tex(0, 0).color(r, g, b, a).lightmap(i, j).endVertex();
        tessellator.draw();
        GlStateManager.popMatrix();
        GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GlStateManager.alphaFunc(516, 0.1F);
        RenderHelper.disableStandardItemLighting();
    }
}
