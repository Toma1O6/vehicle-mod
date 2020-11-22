package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.SpeedDisplayUnit;
import dev.toma.vehiclemod.common.container.ContainerVehicleComponents;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.inventory.InventoryComponents;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.text.DecimalFormat;
import java.util.Map;

public class GuiVehicleComponents extends GuiContainer {

    private static final DecimalFormat F = new DecimalFormat("###.###");
    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/vehicle_components.png");

    public GuiVehicleComponents(InventoryPlayer player, InventoryComponents components) {
        super(new ContainerVehicleComponents(player, components));
        xSize = 205;
        ySize = 176;
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
        InventoryComponents components = ((ContainerVehicleComponents) inventorySlots).getIInventory();
        VehicleUpgrades upgrades = components.getUpgrades();
        if(components.getVehicle() != null) {
            VehicleStats stats = components.getVehicle().getActualStats();
            float speedStat = fixValue((stats.maxSpeed - VehicleStats.topSpeedMin) / (VehicleStats.topSpeedMax - VehicleStats.topSpeedMin));
            float accelerationStat = fixValue((stats.acceleration - VehicleStats.accelerationMin) / (VehicleStats.accelerationMax - VehicleStats.accelerationMin));
            float handlingStat = fixValue((stats.turnSpeed - VehicleStats.handlingMin) / (VehicleStats.handlingMax - VehicleStats.handlingMin));
            float brakingStat = fixValue((stats.brakeSpeed - VehicleStats.brakingMin) / (VehicleStats.brakingMax - VehicleStats.brakingMin));
            fontRenderer.drawString("SPD", 8, 54, 0xaa00);
            fontRenderer.drawString("ACC", 8, 63, 0xaa0000);
            fontRenderer.drawString("HDL", 8, 72, 0xaa);
            fontRenderer.drawString("BRK", 8, 81, 0xaaaa00);
            DevUtil.drawColor(27, 55, (int)(27 + 142 * speedStat), 60, 0.0F, 1.0F, 0.0F, 1.0F);
            DevUtil.drawColor(27, 64, (int)(27 + 142 * accelerationStat), 69, 1.0F, 0.0F, 0.0F, 1.0F);
            DevUtil.drawColor(27, 73, (int)(27 + 142 * handlingStat), 78, 0.0F, 0.0F, 1.0F, 1.0F);
            DevUtil.drawColor(27, 82, (int)(27 + 142 * brakingStat), 87, 1.0F, 1.0F, 0.0F, 1.0F);
        }
        Map<ItemVehicleUpgrade.Type, Integer> map = upgrades.getUpgradeMap();
        int j = 0;
        for (Map.Entry<ItemVehicleUpgrade.Type, Integer> entry : map.entrySet()) {
            String text = String.format("[%d]", entry.getValue());
            fontRenderer.drawString(text, 8 + j * 18 + (18 - fontRenderer.getStringWidth(text)) / 2, 28, ItemVehicleUpgrade.Type.getColor(entry.getValue()).getColorValue());
            ++j;
        }
    }

    static float fixValue(float in) {
        return in > 0.999F ? 1.0F : in;
    }
}
