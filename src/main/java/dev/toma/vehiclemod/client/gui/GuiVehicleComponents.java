package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.container.ContainerVehicleComponents;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.inventory.InventoryComponents;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class GuiVehicleComponents extends GuiContainer {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/vehicle_components.png");

    public GuiVehicleComponents(InventoryPlayer player, InventoryComponents components) {
        super(new ContainerVehicleComponents(player, components));
        ySize = 138;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(TEXTURE);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        VehicleUpgrades upgrades = ((ContainerVehicleComponents) inventorySlots).getIInventory().getUpgrades();
        Map<ItemVehicleUpgrade.Type, Integer> map = upgrades.getUpgradeMap();
        int j = 0;
        for (Map.Entry<ItemVehicleUpgrade.Type, Integer> entry : map.entrySet()) {
            String text = String.format("[%d]", entry.getValue());
            fontRenderer.drawString(text, 8 + j * 18 + (18 - fontRenderer.getStringWidth(text)) / 2, 28, ItemVehicleUpgrade.Type.getColor(entry.getValue()).getColorValue());
            ++j;
        }
    }
}
