package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiLockpicking<L extends ILockpickable> extends GuiScreen {

    static final ResourceLocation LOCK = VehicleMod.getResource("textures/gui/lock.png");
    private int guiLeft, guiTop;
    private final int xSize = 176, ySize = 166;
    private final int[] combinations;
    private int offset;
    private final L lockpickable;

    public GuiLockpicking(L lockpickable) {
        this.lockpickable = lockpickable;
        this.combinations = lockpickable.getCombinations();
    }

    @Override
    public void initGui() {
        this.guiLeft = (width - xSize) / 2;
        this.guiTop = (height - ySize) / 2;

        int buttons = combinations.length;
        int totalWidth = buttons * 25 - 5;
        int center = guiLeft + xSize / 2;
        int left = center - totalWidth / 2;
        for (int i = 0; i < buttons; i++) {
            addButton(new GuiButton(i, left + i * 25, guiTop + ySize - 60, 20, 20, ""));
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        DevUtil.drawImage2D(mc, LOCK, guiLeft + xSize / 2 - 16, guiTop + ySize / 2 - 16, 32, 32);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        VMNetworkManager.instance().sendToServer(lockpickable.createLockpickPacket(button.id, offset++));
        button.enabled = false;
    }
}
