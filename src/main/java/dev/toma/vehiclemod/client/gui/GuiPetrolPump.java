package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.container.ContainerPetrolPump;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketUpdateTileEntity;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class GuiPetrolPump extends GuiContainer {

    private static final ResourceLocation TEXTURE = VehicleMod.getResource("textures/gui/petrol_pump.png");
    private final TileEntityPetrolPump petrolPump;

    public GuiPetrolPump(InventoryPlayer inv, TileEntityPetrolPump petrolPump) {
        super(new ContainerPetrolPump(inv, petrolPump));
        this.petrolPump = petrolPump;
        xSize = 176;
        ySize = 169;
    }

    @Override
    public void initGui() {
        super.initGui();
        addButton(new GuiButton(0, guiLeft + xSize - 37, guiTop + 7, 30, 20, "Find"));
        addButton(new GuiButton(1, guiLeft + xSize - 37, guiTop + 32, 30, 20, "Start"));
        addButton(new GuiButton(2, guiLeft + xSize - 37, guiTop + 57, 30, 20, "Stop"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        switch (button.id) {
            case 0:
                petrolPump.pair(mc.world.getBlockState(petrolPump.getPos()).getValue(BlockPetrolPump.FACING));
                sync();
                break;
            case 1:
                petrolPump.transfer = true;
                sync();
                break;
            case 2:
                petrolPump.transfer = false;
                sync();
                break;
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(TEXTURE);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        drawFuelBar(11, petrolPump.storedAmount / TileEntityPetrolPump.CAPACITY);
        if(petrolPump.pairedVehicle != null) {
            drawFuelBar(50, petrolPump.pairedVehicle.fuel / (float)petrolPump.pairedVehicle.getActualStats().fuelCapacity);
        }
        mc.fontRenderer.drawStringWithShadow("Stored: " + (int)petrolPump.storedAmount + "L", guiLeft + 33, guiTop + 25, 0xFFFFFFFF);
        mc.fontRenderer.drawStringWithShadow("Vehicle: " + (petrolPump.pairedVehicle != null ? (int)petrolPump.pairedVehicle.fuel + "L" : "No vehicle"), guiLeft + 33, guiTop + 63, 0xFFFFFFFF);
    }

    private void sync() {
        VMNetworkManager.instance().sendToServer(new SPacketUpdateTileEntity(petrolPump.getPos(), petrolPump.writeToNBT(new NBTTagCompound())));
    }

    private void drawFuelBar(int y, float amount) {
        GlStateManager.disableTexture2D();
        GlStateManager.shadeModel(GL11.GL_SMOOTH);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        builder.pos(guiLeft + 32, guiTop + y + 10, 0).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 133, guiTop + y + 10, 0).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 133, guiTop + y, 0).color(0.0F, 1.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 32, guiTop + y, 0).color(1.0F, 0.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 32 + 101 * amount - 1, guiTop + y + 10, 0).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 32 + 101 * amount + 1, guiTop + y + 10, 0).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 32 + 101 * amount + 1, guiTop + y, 0).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
        builder.pos(guiLeft + 32 + 101 * amount - 1, guiTop + y, 0).color(0.0F, 0.0F, 0.0F, 1.0F).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel(GL11.GL_FLAT);
        GlStateManager.enableTexture2D();
    }
}
