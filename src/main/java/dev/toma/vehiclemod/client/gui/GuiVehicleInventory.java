package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.container.ContainerVehicle;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.util.ResourceLocation;

public class GuiVehicleInventory extends GuiContainer {

    public static final ResourceLocation SLOT = VehicleMod.getResource("textures/gui/slot.png");
    private final EntityVehicle vehicle;

    public GuiVehicleInventory(InventoryPlayer player, EntityVehicle vehicle) {
        super(new ContainerVehicle(player, vehicle));
        this.vehicle = vehicle;
        ySize = 51 + 18 * ((this.inventorySlots.getInventory().size() / 9) + 1);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        drawDefaultBackground();
        GlStateManager.disableTexture2D();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        float c = 0.75f;
        builder.pos(guiLeft, guiTop + ySize, 0).color(c, c, c, 1.0F).endVertex();
        builder.pos(guiLeft + xSize, guiTop + ySize, 0).color(c, c, c, 1.0F).endVertex();
        builder.pos(guiLeft + xSize, guiTop, 0).color(c, c, c, 1.0F).endVertex();
        builder.pos(guiLeft, guiTop, 0).color(c, c, c, 1.0F).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        mc.getTextureManager().bindTexture(SLOT);
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        for(Slot slot : inventorySlots.inventorySlots) {
            drawSlot(builder, slot);
        }
        tessellator.draw();
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        mc.fontRenderer.drawString(vehicle.getDisplayName().getFormattedText(), 8, 5, 0x353535);
        mc.fontRenderer.drawString("Inventory", 8, 18 * (vehicle.getInventory().getSizeInventory() / 9 + 1) + 23, 0x353535);
        renderHoveredToolTip(mouseX - guiLeft, mouseY - guiTop);
    }

    private void drawSlot(BufferBuilder bb, Slot slot) {
        bb.pos(guiLeft + slot.xPos - 1, guiTop - 1 + slot.yPos + 18, 0).tex(0, 1).endVertex();
        bb.pos(guiLeft + slot.xPos + 18 - 1, guiTop - 1 + slot.yPos + 18, 0).tex(1, 1).endVertex();
        bb.pos(guiLeft + slot.xPos + 18 - 1, guiTop - 1 + slot.yPos, 0).tex(1, 0).endVertex();
        bb.pos(guiLeft + slot.xPos - 1, guiTop - 1 + slot.yPos, 0).tex(0, 0).endVertex();
    }
}
