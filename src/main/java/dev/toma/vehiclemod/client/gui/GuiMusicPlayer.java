package dev.toma.vehiclemod.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dev.toma.vehiclemod.VehicleMod.Constants;
import dev.toma.vehiclemod.common.blocks.BlockMusicPlayer;
import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.util.MusicEntry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class GuiMusicPlayer extends GuiScreen {
	
	private static final ResourceLocation PNG = new ResourceLocation(Constants.ID + ":textures/gui/music_player.png");
	private List<MusicButton> musicButtons = new ArrayList<>();
	private final TileEntityMusicPlayer te;
	private int guiLeft;
	private int guiTop;
	private int xSize;
	private int ySize;
	private int page;
	
	public GuiMusicPlayer(TileEntityMusicPlayer te) {
		this.te = te;
		xSize = 214;
		ySize = 166;
	}
	
	public void refresh() {
		for(int i = page * 10; i < (page + 1) * 16; i++) {
			int j = i - page*10;
			if(i >= BlockMusicPlayer.SONGS.size()) {
				return;
			}
			int k = j;
			if(j >= 8) k -= 8;
			this.musicButtons.add(new MusicButton(j, guiLeft + (j >= 8 ? 108 : 4), guiTop + 4 + k * 20, BlockMusicPlayer.SONGS.get(i)));
		}
	}
	
	@Override
	public void initGui() {
		this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        this.refresh();
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.mc.getTextureManager().bindTexture(PNG);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		for(MusicButton bt : musicButtons) {
			bt.drawButton(mc, mouseX, mouseY, partialTicks);
		}
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		if(mouseButton == 0) {
			for(int i = 0; i < musicButtons.size(); i++) {
				MusicButton btn = musicButtons.get(i);
				if(btn.mousePressed(mc, mouseX, mouseY)) {
					// TODO updateTileentity
					te.currentEntry = btn.entry;
				}
			}
		}
	}
	
	private static class MusicButton extends GuiButton {
		
		static final ResourceLocation BUTTON = new ResourceLocation(Constants.ID + ":textures/gui/mp_button.png");
		final MusicEntry entry;
		
		public MusicButton(int id, int x, int y, MusicEntry entry) {
			super(id, x, y, 100, 18, "");
			this.entry = entry;
		}
		
		@Override
		public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
			hovered = mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
			GlStateManager.pushMatrix();
			String name = entry.music.getRegistryName().getResourcePath();
			String displayName = name.substring(0, 1).toUpperCase() + name.substring(1);
			double v0 = hovered ? 0.5D : 0;
			double v1 = hovered ? 1.0D : 0.5D;
			drawButton(mc, BUTTON, x, y, v0, v1);
			mc.fontRenderer.drawString(displayName, x+4, y+5, 0xFFFFFF);
			GlStateManager.popMatrix();
		}
		
		private static void drawButton(Minecraft mc, ResourceLocation rl, int x, int y, double v0, double v1) {
			mc.getTextureManager().bindTexture(rl);
			Tessellator ts = Tessellator.getInstance();
			BufferBuilder buf = ts.getBuffer();
			
			buf.begin(7, DefaultVertexFormats.POSITION_TEX);
			buf.pos(x, y + 18, 0).tex(0, v1).endVertex();
			buf.pos(x + 100, y + 18, 0).tex(1, v1).endVertex();
			buf.pos(x + 100, y, 0).tex(1, v0).endVertex();
			buf.pos(x, y, 0).tex(0, v0).endVertex();
			
			GlStateManager.color(1f, 1f, 1f);
			ts.draw();
		}
	}
}
