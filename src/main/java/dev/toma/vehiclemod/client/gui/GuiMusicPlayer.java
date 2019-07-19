package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.VehicleMod.Constants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiMusicPlayer extends GuiScreen {
	
	private static final ResourceLocation PNG = new ResourceLocation(Constants.ID + ":textures/gui/music_player.png");
	private int guiLeft;
	private int guiTop;
	private int xSize;
	private int ySize;
	
	public GuiMusicPlayer() {
		xSize = 175;
		ySize = 165;
	}
	
	@Override
	public void initGui() {
		this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.mc.getTextureManager().bindTexture(PNG);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
}
