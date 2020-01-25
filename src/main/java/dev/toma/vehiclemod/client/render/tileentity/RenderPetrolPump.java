package dev.toma.vehiclemod.client.render.tileentity;

import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.GL11;

public class RenderPetrolPump extends TileEntitySpecialRenderer<TileEntityPetrolPump> {

    @Override
    public void render(TileEntityPetrolPump te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        if(!te.getWorld().getBlockState(te.getPos()).getValue(BlockPetrolPump.UP)) return;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        GlStateManager.disableTexture2D();
        GlStateManager.disableCull();
        GlStateManager.shadeModel(GL11.GL_SMOOTH);
        EnumFacing facing = EnumFacing.getHorizontal(te.getBlockMetadata());
        builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        switch (facing) {
            case NORTH: {
                builder.pos(x + 0.2, y + 0.85, z + 0.11).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.85, z + 0.11).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.7, z + 0.11).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.7, z + 0.11).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.6, z + 0.11).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.6, z + 0.11).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.45, z + 0.11).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.45, z + 0.11).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                break;
            }
            case SOUTH: {
                builder.pos(x + 0.2, y + 0.85, z + 0.89).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.85, z + 0.89).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.7, z + 0.89).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.7, z + 0.89).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.6, z + 0.89).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.6, z + 0.89).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.8, y + 0.45, z + 0.89).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.2, y + 0.45, z + 0.89).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;
            }
            case EAST: {
                builder.pos(x + 0.89, y + 0.85, z + 0.2).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.85, z + 0.8).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.7, z + 0.8).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.7, z + 0.2).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.6, z + 0.2).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.6, z + 0.8).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.45, z + 0.8).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.89, y + 0.45, z + 0.2).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                break;
            }
            case WEST: {
                builder.pos(x + 0.11, y + 0.85, z + 0.2).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.85, z + 0.8).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.7, z + 0.8).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.7, z + 0.2).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.6, z + 0.2).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.6, z + 0.8).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.45, z + 0.8).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.11, y + 0.45, z + 0.2).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;
            }
        }
        this.renderIcons(facing, builder, te, x, y, z);
        tessellator.draw();
        GlStateManager.shadeModel(GL11.GL_FLAT);
        GlStateManager.enableCull();
        GlStateManager.enableTexture2D();
    }

    private void renderIcons(EnumFacing facing, BufferBuilder builder, TileEntityPetrolPump tileEntityPetrolPump, double x, double y, double z) {
        this.renderIcon(facing, builder, tileEntityPetrolPump.storedAmount / 100.0F, x, y + 0.75, z);
        if(tileEntityPetrolPump.pairedVehicle != null) this.renderIcon(facing, builder, tileEntityPetrolPump.pairedVehicle.fuel / 100.0F, x, y + 0.5, z);
    }

    private void renderIcon(EnumFacing facing, BufferBuilder builder, float amount, double x, double y, double z) {
        switch (facing) {
            case NORTH: {
                builder.pos(x + 0.79 - (0.6 * amount), y + 0.1, z + 0.1).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.81 - (0.6 * amount), y + 0.1, z + 0.1).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.81 - (0.6 * amount), y - 0.05, z + 0.1).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.79 - (0.6 * amount), y - 0.05, z + 0.1).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;
            }
            case SOUTH: {
                builder.pos(x + 0.19 + (0.6 * amount), y + 0.1, z + 0.9).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.21 + (0.6 * amount), y + 0.1, z + 0.9).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.21 + (0.6 * amount), y - 0.05, z + 0.9).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.19 + (0.6 * amount), y - 0.05, z + 0.9).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;
            }
            case EAST: {
                builder.pos(x + 0.9, y + 0.1, z + 0.79 - (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.9, y + 0.1, z + 0.81 - (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.9, y - 0.05, z + 0.81 - (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.9, y - 0.05, z + 0.79 - (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;

            }
            case WEST: {
                builder.pos(x + 0.1, y + 0.1, z + 0.19 + (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.1, y + 0.1, z + 0.21 + (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.1, y - 0.05, z + 0.21 + (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                builder.pos(x + 0.1, y - 0.05, z + 0.19 + (0.6 * amount)).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
                break;
            }
        }
    }
}
