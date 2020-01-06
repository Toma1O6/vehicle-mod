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
    private static final ResourceLocation OUTLINE = new ResourceLocation(VehicleMod.Constants.ID, "textures/gui/fuel_maker_outline.png");
    private static final ResourceLocation INGREDIENT = new ResourceLocation(VehicleMod.Constants.ID, "textures/gui/fuel_maker_ingredient.png");
    private static final ResourceLocation PRODUCT = new ResourceLocation(VehicleMod.Constants.ID, "textures/gui/fuel_maker_product.png");
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
        drawFuelBar(134, INGREDIENT, tileEntityFuelMaker.getIngredientAmount());
        drawFuelBar(134, OUTLINE, 1000);
        drawFuelBar(152, PRODUCT, tileEntityFuelMaker.getProductAmount());
        drawFuelBar(152, OUTLINE, 1000);
        /*Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        mc.getTextureManager().bindTexture(OUTLINE);
        builder.pos(134, 81, 0).tex(0, 1).endVertex();
        builder.pos(150, 81, 0).tex(1, 1).endVertex();
        builder.pos(150, 8, 0).tex(1, 0).endVertex();
        builder.pos(134, 8, 0).tex(0, 0).endVertex();
        builder.pos(152, 81, 0).tex(0, 1).endVertex();
        builder.pos(168, 81, 0).tex(1, 1).endVertex();
        builder.pos(168, 8, 0).tex(1, 0).endVertex();
        builder.pos(152, 8, 0).tex(0, 0).endVertex();
        tessellator.draw();*/
        GlStateManager.enableLighting();
        int x = mouseX - guiLeft;
        int y = mouseY - guiTop;
        if(x >= 134 && x <= 150 && y >= 8 && y <= 81) {
            this.drawHoveringText("Active substance: " + tileEntityFuelMaker.getIngredientAmount() / 10 + "%", x, y);
        } else if(x >= 152 && x <= 168 && y >= 8 && y <= 81) {
            this.drawHoveringText("Fuel: " + tileEntityFuelMaker.getProductAmount() / 10 + "%", x, y);
        } else this.renderHoveredToolTip(mouseX - guiLeft, mouseY - guiTop);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(TEXTURE);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    private void drawFuelBar(int x, ResourceLocation location, int value) {
        float tex = value / 1000F;
        float posMod = 73 * Math.abs(1.0F - tex);
        mc.getTextureManager().bindTexture(location);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        builder.pos(x, 81, 0).tex(0, 0).endVertex();
        builder.pos(x + 16, 81, 0).tex(1, 0).endVertex();
        builder.pos(x + 16, 8 + posMod, 0).tex(1, tex).endVertex();
        builder.pos(x, 8 + posMod, 0).tex(0, tex).endVertex();
        tessellator.draw();
    }
}
