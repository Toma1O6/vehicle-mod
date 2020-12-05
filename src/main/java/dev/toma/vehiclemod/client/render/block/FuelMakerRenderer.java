package dev.toma.vehiclemod.client.render.block;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.fluids.FluidEntry;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.animation.FastTESR;

public class FuelMakerRenderer extends FastTESR<TileEntityFuelMaker> {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/blocks/fuel_maker.png");

    @Override
    public void renderTileEntityFast(TileEntityFuelMaker te, double x, double y, double z, float partialTicks, int destroyStage, float partial, BufferBuilder buffer) {
        World world = te.getWorld();
        BlockPos pos = te.getPos();
        IBlockState state = world.getBlockState(pos);
        TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(TEXTURE);
        int j = state.getPackedLightmapCoords(world, pos);
        int k = j >> 16 & 65535;
        int l = j & 65535;
        FluidEntry input = te.getInput();
        if(!input.isEmpty()) {
            render3DShape(x + 6.1 / 16.0D, y + 0.01 / 16.0D, z + 3.1 / 16.0D, input.getFilledPct(), input.getType().getFluidColor(), k, l, buffer);
        }
        FluidEntry output = te.getOutput();
        if(!output.isEmpty()) {
            render3DShape(x + 6.1 / 16.0D, y + 0.01 / 16.0D, z + 9.1 / 16.0D, output.getFilledPct(), output.getType().getFluidColor(), k, l, buffer);
        }
    }

    void render3DShape(double x, double y, double z, float f, int color, int k, int l, BufferBuilder buffer) {
        float r = ((color >> 16) & 255) / 255.0F;
        float g = ((color >>  8) & 255) / 255.0F;
        float b = ( color        & 255) / 255.0F;
        double u1 = 12 / 16.0D;
        double y1 = y + 1 / 16.0D;
        double y2 = y1 + (9.5 / 16.0D) * f;
        double w = 3.8 / 16.0D;
        buffer.pos(x, y2, z + w).color(r, g, b, 1.0F).tex(u1, 1.0D).lightmap(k, l).endVertex();
        buffer.pos(x + w, y2, z + w).color(r, g, b, 1.0F).tex(1.0D, 1.0D).lightmap(k, l).endVertex();
        buffer.pos(x + w, y2, z).color(r, g, b, 1.0F).tex(1.0D, 0.0D).lightmap(k, l).endVertex();
        buffer.pos(x, y2, z).color(r, g, b, 1.0F).tex(u1, 0.0D).lightmap(k, l).endVertex();
        drawSphere(x, y1, z, x + w, y2, z, u1, r, g, b, k, l, buffer);
        drawSphere(x, y1, z + w, x + w, y2, z + w, u1, r, g, b, k, l, buffer);
        drawSphere(x + w, y1, z, x + w, y2, z + w, u1, r, g, b, k, l, buffer);
        drawSphere(x, y1, z, x, y2, z + w, u1, r, g, b, k, l, buffer);
    }

    void drawSphere(double x1, double y1, double z1, double x2, double y2, double z2, double u1, float r, float g, float b, int k, int l, BufferBuilder buffer) {
        buffer.pos(x1, y2, z1).color(r, g, b, 1.0F).tex(u1, 1.0).lightmap(k, l).endVertex();
        buffer.pos(x2, y2, z2).color(r, g, b, 1.0F).tex(1.0, 1.0).lightmap(k, l).endVertex();
        buffer.pos(x2, y1, z2).color(r, g, b, 1.0F).tex(1.0, 0.0).lightmap(k, l).endVertex();
        buffer.pos(x1, y1, z1).color(r, g, b, 1.0F).tex(u1, 0.0).lightmap(k, l).endVertex();
    }
}
