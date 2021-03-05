package dev.toma.vehiclemod.client.gui.tunning;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.container.ContainerVehicleComponents;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.inventory.InventoryUpgrades;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiVehicleComponents extends GuiTunning<InventoryUpgrades, ContainerVehicleComponents> {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/tunning_tab.png");

    public GuiVehicleComponents(InventoryPlayer player, InventoryUpgrades components) {
        super(player, components, ContainerVehicleComponents::new, EnumTunningType.STATS);
        xSize = 205;
        ySize = 176;
    }

    @Override
    public boolean isButtonEnabled(EnumTunningType tunningType) {
        return tunningType != EnumTunningType.NEONS || !container.getIInventory().getVehicle().getVehiclePositions().areNeonsDisabled();
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        InventoryUpgrades components = ((ContainerVehicleComponents) inventorySlots).getIInventory();
        EntityVehicle vehicle = components.getVehicle();
        VehicleUpgrades upgrades = vehicle.getUpgrades();
        if(components.getVehicle() != null) {
            VehicleStats stats = components.getVehicle().getActualStats();
            float speedStat = fixValue((stats.maxSpeed - VehicleStats.topSpeedMin) / (VehicleStats.topSpeedMax - VehicleStats.topSpeedMin));
            float accelerationStat = fixValue((stats.acceleration - VehicleStats.accelerationMin) / (VehicleStats.accelerationMax - VehicleStats.accelerationMin));
            float handlingStat = fixValue((stats.turnSpeed - VehicleStats.handlingMin) / (VehicleStats.handlingMax - VehicleStats.handlingMin));
            float brakingStat = fixValue((stats.brakeSpeed - VehicleStats.brakingMin) / (VehicleStats.brakingMax - VehicleStats.brakingMin));
            int total = VehicleStats.getTotalVehicleRating(stats);
            String text = "Power rating: " + total;
            int w = fontRenderer.getStringWidth(text);
            fontRenderer.drawString(text, (xSize - w) / 2 - 10, 45, 0x222222);
            text = "Class " + vehicle.getVehicleType().name();
            w = fontRenderer.getStringWidth(text);
            fontRenderer.drawString(text, (xSize - w) / 2 - 15, 35, 0x222222);
            char vehicleClass = getClassFromRating(total);
            int classColor = getClassColor(vehicleClass);
            fontRenderer.drawString(vehicleClass + "", (xSize - w) / 2 - 10 + w, 35, classColor);
            fontRenderer.drawString("SPD", 8, 54, 0xaa00);
            fontRenderer.drawString("ACC", 8, 63, 0xaa0000);
            fontRenderer.drawString("HDL", 8, 72, 0xaa);
            fontRenderer.drawString("BRK", 8, 81, 0xaaaa00);
            DevUtil.drawColor(27, 55, (int)(27 + 119 * speedStat), 60, 0.0F, 1.0F, 0.0F, 1.0F);
            DevUtil.drawColor(27, 64, (int)(27 + 119 * accelerationStat), 69, 1.0F, 0.0F, 0.0F, 1.0F);
            DevUtil.drawColor(27, 73, (int)(27 + 119 * handlingStat), 78, 0.0F, 0.0F, 1.0F, 1.0F);
            DevUtil.drawColor(27, 82, (int)(27 + 119 * brakingStat), 87, 1.0F, 1.0F, 0.0F, 1.0F);
            fontRenderer.drawString(VehicleStats.getTopSpeedRating(stats) + "", 150, 54, 0xaa00);
            fontRenderer.drawString(VehicleStats.getAccelerationRating(stats) + "", 150, 63, 0xaa0000);
            fontRenderer.drawString(VehicleStats.getHandlingRating(stats) + "", 150, 72, 0xaa);
            fontRenderer.drawString(VehicleStats.getBrakeRating(stats) + "", 150, 81, 0xaaaa00);
        }
    }

    static float fixValue(float in) {
        return in > 0.999F ? 1.0F : in;
    }

    char getClassFromRating(int rating) {
        if(rating > 900)
            return 'X';
        else if(rating >= 750)
            return 'S';
        else if(rating > 600)
            return 'A';
        else if(rating > 450)
            return 'B';
        else if(rating > 300)
            return 'C';
        else if(rating > 150)
            return 'D';
        else return 'E';
    }

    int getClassColor(char vehicleClass) {
        switch (vehicleClass) {
            case 'X': return 0xff0000;
            case 'S': return 0xff8c00;
            case 'A': return 0xff00d0;
            case 'B': return 0xff;
            case 'C': return 0xaa00;
            case 'D': return 0xb5fff0;
            case 'E': return 0x222222;
            default: return 0;
        }
    }
}
