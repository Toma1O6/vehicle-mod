package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.container.ContainerFuelMaker;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiFuelMaker extends GuiContainer {

    private static final ResourceLocation TEXTURE = new ResourceLocation(VehicleMod.Constants.ID, "textures/gui/fuel_maker.png");
    private final TileEntityFuelMaker tileEntityFuelMaker;

    public GuiFuelMaker(InventoryPlayer player, TileEntityFuelMaker tileEntityFuelMaker) {
        super(new ContainerFuelMaker(player, tileEntityFuelMaker));
        this.tileEntityFuelMaker = tileEntityFuelMaker;
        this.xSize = 176;
        this.ySize = 169;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        GlStateManager.disableLighting();
        drawFuelBar(5, 1, tileEntityFuelMaker.getIngredientAmount());
        drawFuelBar(5, 0, TileEntityFuelMaker.MAX_STORED_AMOUNT);
        drawFuelBar(151, 2, tileEntityFuelMaker.getProductAmount());
        drawFuelBar(151, 0, TileEntityFuelMaker.MAX_STORED_AMOUNT);
        if(tileEntityFuelMaker.isWorking()) {
            float prg = tileEntityFuelMaker.getProcessTimer() / 600.0F;
            int diff = 208 - 176;
            double aus = 176 / 256D;
            double aue = (176 + diff * prg) / 256D;
            double avs = 73 / 256D;
            double ave = 84 / 256D;
            mc.getTextureManager().bindTexture(TEXTURE);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder builder = tessellator.getBuffer();
            builder.begin(7, DefaultVertexFormats.POSITION_TEX);
            builder.pos(72, 36, 0).tex(aus, ave).endVertex();
            builder.pos(72 + diff * prg, 36, 0).tex(aue, ave).endVertex();
            builder.pos(72 + diff * prg, 25, 0).tex(aue, avs).endVertex();
            builder.pos(72, 25, 0).tex(aus, avs).endVertex();
            tessellator.draw();
        }
        GlStateManager.enableLighting();
        int x = mouseX - guiLeft;
        int y = mouseY - guiTop;
        if(x >= 5 && x <= 24 && y >= 6 && y <= 78) {
            this.drawHoveringText("Active substance: " + 100*(tileEntityFuelMaker.getIngredientAmount() / (float)TileEntityFuelMaker.MAX_STORED_AMOUNT) + "%", x, y);
        } else if(x >= 151 && x <= 170 && y >= 6 && y <= 78) {
            this.drawHoveringText("Fuel: " + 100*(tileEntityFuelMaker.getProductAmount() / (float)TileEntityFuelMaker.MAX_STORED_AMOUNT) + "%", x, y);
        } else this.renderHoveredToolTip(mouseX - guiLeft, mouseY - guiTop);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(TEXTURE);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    private void drawFuelBar(int x, int texture, int value) {
        float tex = (float)value / TileEntityFuelMaker.MAX_STORED_AMOUNT;
        float posMod = 73 * Math.abs(1.0F - tex);
        double startU = (176 + texture * 20) / 256.0D;
        double endU = startU + 20 / 256.0D;
        mc.getTextureManager().bindTexture(TEXTURE);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        builder.pos(x, 79, 0).tex(startU, 73/256d).endVertex();
        builder.pos(x + 20, 79, 0).tex(endU, 73/256d).endVertex();
        builder.pos(x + 20, 6 + posMod, 0).tex(endU, 0).endVertex();
        builder.pos(x, 6 + posMod, 0).tex(startU, 0).endVertex();
        tessellator.draw();
    }
}
