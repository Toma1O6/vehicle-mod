package dev.toma.vehiclemod.client.gui.tunning;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.container.ContainerNeons;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.inventory.InventoryNeons;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Mouse;

import java.io.IOException;

public class GuiNeons extends GuiTunning<InventoryNeons, ContainerNeons> {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/neons_tab.png");
    private int scale = 15;
    private int prevDragMouseX, prevDragMouseY;
    private float yaw = 45.0F;
    private float pitch = -45.0F;

    public GuiNeons(InventoryPlayer playerInventory, InventoryNeons neons) {
        super(playerInventory, neons, ContainerNeons::new, EnumTunningType.NEONS);
        ySize = 196;
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
        EntityVehicle vehicle = this.container.getIInventory().getVehicle();
        if(vehicle != null) {
            drawEntityOnScreen(vehicle);
        }
    }

    @Override
    public void handleMouseInput() throws IOException {
        int i = Integer.signum(Mouse.getEventDWheel());
        if(i != 0) {
            this.scale = MathHelper.clamp(scale + i, 10, 30);
        }
        super.handleMouseInput();
    }

    @Override
    protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {
        if(clickedMouseButton == 0 && mouseX >= guiLeft + 7 && mouseX <= guiLeft + 168 && mouseY >= guiTop + 7 && mouseY <= guiTop + 85) {
            int xDelta = prevDragMouseX - mouseX;
            int yDelta = prevDragMouseY - mouseY;
            if(Math.abs(xDelta) < 30) {
                modifyYaw(xDelta);
            }
            if(Math.abs(yDelta) < 30) {
                modifyPitch(yDelta);
            }
            this.prevDragMouseX = mouseX;
            this.prevDragMouseY = mouseY;
        }
        super.mouseClickMove(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
    }

    void modifyYaw(int delta) {
        float newYaw = yaw + delta;
        while (newYaw > 180.0F) {
            newYaw -= 360.0F;
        }
        while (newYaw < -180.0F) {
            newYaw += 360.0F;
        }
        yaw = newYaw;
    }

    void modifyPitch(int delta) {
        pitch = MathHelper.clamp(pitch + delta, -60.0F, 60.0F);
    }

    void drawEntityOnScreen(Entity ent) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate(88.0F, 60.0F, 60.0F);
        GlStateManager.scale((float)(-scale), (float)scale, (float)scale);
        GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(-((float)Math.atan((pitch / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.translate(0.0F, 0.0F, 0.0F);
        RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
        rendermanager.setPlayerViewY(180.0F);
        rendermanager.setRenderShadow(false);
        rendermanager.renderEntity(ent, 0.0D, 0.0D, 0.0D, yaw, 1.0F, false);
        rendermanager.setRenderShadow(true);
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
}
