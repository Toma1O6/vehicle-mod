package dev.toma.vehiclemod.client.gui.tunning;

import dev.toma.vehiclemod.common.container.ModContainer;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketOpenVehicleComponentGUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiFunction;

public abstract class GuiTunning<I extends IInventory, C extends ModContainer<I>> extends GuiContainer {

    protected final C container;
    final EnumTunningType tunningType;

    @SuppressWarnings("unchecked")
    public GuiTunning(InventoryPlayer player, I inventory, BiFunction<InventoryPlayer, I, C> containerFactory, EnumTunningType tunningType) {
        super(containerFactory.apply(player, inventory));
        this.container = (C) inventorySlots;
        this.tunningType = tunningType;
    }

    public abstract ResourceLocation getTexture();

    @Override
    public void initGui() {
        this.mc.player.openContainer = this.inventorySlots;
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = 10 + (this.height - this.ySize) / 2;
        int i = 0;
        for (EnumTunningType type : EnumTunningType.values()) {
            TabButton button = addButton(new TabButton(this, i, guiLeft + 5 + i * 32, guiTop - 27, 30, 27, type));
            button.visible = this.isButtonEnabled(type);
            button.enabled = button.visible && this.tunningType != button.type;
            ++i;
        }
    }

    public boolean isButtonEnabled(EnumTunningType tunningType) {
        return true;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(this.getTexture());
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button instanceof TabButton) {
            TabButton tabButton = (TabButton) button;
            VMNetworkManager.instance().sendToServer(new SPacketOpenVehicleComponentGUI(tabButton.type.getGuiID()));
        }
    }

    static class TabButton extends GuiButton {

        final GuiTunning<?, ?> parent;
        final EnumTunningType type;

        public TabButton(GuiTunning<?, ?> parent, int id, int x, int y, int w, int h, EnumTunningType type) {
            super(id, x, y, w, h, "");
            this.type = type;
            this.parent = parent;
        }

        @Override
        public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            mc.getTextureManager().bindTexture(parent.getTexture());
            if(visible) {
                if(enabled) {
                    drawTexture(x, y, width, height, 0.0D, 27 / 256.0D);
                    if(hovered) {
                        FontRenderer renderer = mc.fontRenderer;
                        int textWidth = renderer.getStringWidth(type.getDisplayName());
                        renderer.drawString(type.getDisplayName(), x + (width - textWidth) / 2.0F, y - 8, 0xffffff, false);
                    }
                } else {
                    drawTexture(x, y, width, height + 3, 27.0D / 256.0D, 57 / 256.0D);
                }
            } else {
                drawTexture(x, y, width, height, 57 / 256.0D, 84 / 256.0D);
            }
            mc.getRenderItem().renderItemIntoGUI(type.getDisplayIcon(), x + 7, y + 7);
        }

        static void drawTexture(int x, int y, int w, int h, double v1, double v2) {
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder builder = tessellator.getBuffer();
            builder.begin(7, DefaultVertexFormats.POSITION_TEX);
            builder.pos(x, y + h, 0).tex(0.87890625, v2).endVertex();
            builder.pos(x + w, y + h, 0).tex(1.0, v2).endVertex();
            builder.pos(x + w, y, 0).tex(1.0, v1).endVertex();
            builder.pos(x, y, 0).tex(0.87890625, v1).endVertex();
            tessellator.draw();
        }
    }
}
