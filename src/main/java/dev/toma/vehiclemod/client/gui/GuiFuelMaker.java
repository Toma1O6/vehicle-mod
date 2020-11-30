package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.container.ContainerFuelMaker;
import dev.toma.vehiclemod.common.fluids.FluidEntry;
import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketFuelMakerAction;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class GuiFuelMaker extends GuiContainer {

    static final DecimalFormat FORMAT = new DecimalFormat("###.##");
    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        FORMAT.setDecimalFormatSymbols(symbols);
    }
    public static final ResourceLocation TEXTURE = new ResourceLocation(VehicleMod.MODID, "textures/gui/fuel_maker.png");
    private final TileEntityFuelMaker tileEntityFuelMaker;

    public GuiFuelMaker(InventoryPlayer player, TileEntityFuelMaker tileEntityFuelMaker) {
        super(new ContainerFuelMaker(player, tileEntityFuelMaker));
        this.tileEntityFuelMaker = tileEntityFuelMaker;
        this.xSize = 176;
        this.ySize = 230;
    }

    @Override
    public void initGui() {
        super.initGui();
        addButton(new ActionButton(0, guiLeft + 5, guiTop + 97, 8, 8, "Dump fluid"));
        addButton(new ActionButton(1, guiLeft + 145, guiTop + 5, 8, 8, "Transfer"));
        addButton(new ActionButton(2, guiLeft + 37, guiTop + 106, 8, 8, "To bucket"));
        addButton(new ActionButton(3, guiLeft + 145, guiTop + 106, 8, 8, "To bucket"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        VMNetworkManager.instance().sendToServer(new SPacketFuelMakerAction(tileEntityFuelMaker.getPos(), button.id, isShiftKeyDown()));
        try {
            tileEntityFuelMaker.runAction(button.id, isShiftKeyDown());
        } catch (IllegalArgumentException ex) {
            // ignore the exception, server will handle it
        }
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        GlStateManager.disableLighting();
        FluidEntry input = tileEntityFuelMaker.getInput();
        drawFluid(25, input);
        drawFuelBarIndicator(25);
        drawFluid(133, tileEntityFuelMaker.getOutput());
        drawFuelBarIndicator(133);
        if(tileEntityFuelMaker.isWorking()) {
            float prg = tileEntityFuelMaker.getProcessTimer() / (float) input.getType().getProcessResult().getProcessTime();
            int diff = 208 - 176;
            double aus = 176 / 256D;
            double aue = (176 + diff * prg) / 256D;
            double avs = 73 / 256D;
            double ave = 84 / 256D;
            mc.getTextureManager().bindTexture(TEXTURE);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder builder = tessellator.getBuffer();
            builder.begin(7, DefaultVertexFormats.POSITION_TEX);
            builder.pos(72, 61, 0).tex(aus, ave).endVertex();
            builder.pos(72 + diff * prg, 61, 0).tex(aue, ave).endVertex();
            builder.pos(72 + diff * prg, 50, 0).tex(aue, avs).endVertex();
            builder.pos(72, 50, 0).tex(aus, avs).endVertex();
            tessellator.draw();
        }
        GlStateManager.enableLighting();
        int x = mouseX - guiLeft;
        int y = mouseY - guiTop;
        if(x >= 25 && x <= 42 && y >= 28 && y <= 100) {
            drawFluidInfo(tileEntityFuelMaker.getInput(), x, y);
        } else if(x >= 133 && x <= 150 && y >= 28 && y <= 100) {
            drawFluidInfo(tileEntityFuelMaker.getOutput(), x, y);
        } else this.renderHoveredToolTip(mouseX - guiLeft, mouseY - guiTop);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(TEXTURE);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        for (GuiButton button : this.buttonList) {
            if(button instanceof ActionButton && ((ActionButton) button).isHovered()) {
                String text = ((ActionButton) button).text;
                this.drawHoveringText(text, mouseX, mouseY);
                break;
            }
        }
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    private void drawFluidInfo(FluidEntry entry, int x, int y) {
        if(entry.isEmpty())
            return;
        String text = String.format("%s [%sL / %sL]", entry.getType().getDisplayName().getFormattedText(), FORMAT.format(entry.getAmount() / 1000F), FORMAT.format(entry.getLimit() / 1000F));
        this.drawHoveringText(text, x, y);
    }

    private void drawFluid(int x, FluidEntry entry) {
        if(entry.isEmpty() || entry.getAmount() == 0)
            return;
        float f = entry.getAmount() / (float) TileEntityFuelMaker.MAX_STORED_AMOUNT;
        double u1 = 194.0D / 256.0D;
        double u2 = 212.0D / 256.0D;
        double v2 = 73 / 256.0D;
        double v1 = v2 * (1.0F - f);
        int color = entry.getType().getFluidColor();
        float r = ((color >> 16) & 255) / 255.0F;
        float g = ((color >> 8) & 255) / 255.0F;
        float b = (color & 255) / 255.0F;
        mc.getTextureManager().bindTexture(TEXTURE);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        builder.pos(x, 101, 0).tex(u1, v2).color(r, g, b, 1.0F).endVertex();
        builder.pos(x + 18, 101, 0).tex(u2, v2).color(r, g, b, 1.0F).endVertex();
        builder.pos(x + 18, 101 - 73 * f, 0).tex(u2, v1).color(r, g, b, 1.0F).endVertex();
        builder.pos(x, 101 - 73 * f, 0).tex(u1, v1).color(r, g, b, 1.0F).endVertex();
        tessellator.draw();
    }

    private void drawFuelBarIndicator(int x) {
        double startU = 176 / 256.0D;
        double endU = 194 / 256.0D;
        mc.getTextureManager().bindTexture(TEXTURE);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        builder.pos(x, 101, 0).tex(startU, 73/256d).endVertex();
        builder.pos(x + 18, 101, 0).tex(endU, 73/256d).endVertex();
        builder.pos(x + 18, 28, 0).tex(endU, 0).endVertex();
        builder.pos(x, 28, 0).tex(startU, 0).endVertex();
        tessellator.draw();
    }

    static class ActionButton extends GuiButton {

        static final ResourceLocation TXT = VehicleMod.getResource("textures/gui/mini_buttons.png");
        final String text;

        ActionButton(int i, int x, int y, int width, int heigth, String text) {
            super(i, x, y, width, heigth, "");
            this.text = text;
        }

        @Override
        public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            hovered = mouseX >= this.x && mouseX <= this.x + this.width && mouseY >= this.y && mouseY <= this.y + this.height;
            double v1 = hovered ? 0.5 : 0.0;
            double v2 = hovered ? 1.0 : 0.5;
            DevUtil.drawImage2D(mc, TXT, x, y, width, height, 0.0, v1, 1.0, v2);
        }

        boolean isHovered() {
            return hovered;
        }
    }
}
