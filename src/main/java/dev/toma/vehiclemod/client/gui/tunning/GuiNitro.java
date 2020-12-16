package dev.toma.vehiclemod.client.gui.tunning;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.container.ContainerNitro;
import dev.toma.vehiclemod.common.entity.vehicle.NitroHandler;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.ResourceLocation;

public class GuiNitro extends GuiTunning<InventoryBasic, ContainerNitro> {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/nitro_tab.png");

    public GuiNitro(InventoryPlayer player, NitroHandler handler) {
        super(player, handler.getInventory(), (playerInv, inv) -> new ContainerNitro(player, handler), EnumTunningType.NITRO);
        ySize = 153;
    }

    @Override
    public boolean isButtonEnabled(EnumTunningType tunningType) {
        return tunningType != EnumTunningType.NEONS || !container.getNitroHandler().getVehicle().getVehiclePositions().areNeonsDisabled();
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}
