package dev.toma.vehiclemod.client.widget;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public abstract class Widget {

    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public Widget(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void render(Minecraft mc, int mouseX, int mouseY, float partialTicks);

    public void onClick(int button) {

    }

    public void onScroll(int n) {

    }

    public boolean isMouseOver(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    public static void drawColorShape(int x1, int y1, int x2, int y2, float r, float g, float b, float a) {
        drawColorShape(x1, y1, x2, y2, 0, r, g, b, a);
    }

    public static void drawColorShape(int x1, int y1, int x2, int y2, int depth, float r, float g, float b, float a) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        builder.pos(x1, y2, depth).color(r, g, b, a).endVertex();
        builder.pos(x2, y2, depth).color(r, g, b, a).endVertex();
        builder.pos(x2, y1, depth).color(r, g, b, a).endVertex();
        builder.pos(x1, y1, depth).color(r, g, b, a).endVertex();
        tessellator.draw();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    public static void drawTexturedShape(int x1, int y1, int x2, int y2) {
        drawTexturedShape(x1, y1, x2, y2, 0);
    }

    public static void drawTexturedShape(int x1, int y1, int x2, int y2, int depth) {
        drawTexturedShape(x1, y1, x2, y2, depth, 0.0, 0.0, 1.0, 1.0);
    }

    public static void drawTexturedShape(int x1, int y1, int x2, int y2, double u1, double v1, double u2, double v2) {
        drawTexturedShape(x1, y1, x2, y2, 0, u1, v1, u2, v2);
    }

    public static void drawTexturedShape(int x1, int y1, int x2, int y2, int depth, double u1, double v1, double u2, double v2) {
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX);
        builder.pos(x1, y2, depth).tex(u1, v2).endVertex();
        builder.pos(x2, y2, depth).tex(u2, v2).endVertex();
        builder.pos(x2, y1, depth).tex(u2, v1).endVertex();
        builder.pos(x1, y1, depth).tex(u1, v1).endVertex();
        tessellator.draw();
        GlStateManager.disableBlend();
    }

    public static void drawTexturedColorShape(int x1, int y1, int x2, int y2, float r, float g, float b, float a) {
        drawTexturedColorShape(x1, y1, x2, y2, 0, r, g, b, a);
    }

    public static void drawTexturedColorShape(int x1, int y1, int x2, int y2, int depth, float r, float g, float b, float a) {
        drawTexturedColorShape(x1, y1, x2, y2, depth, 0.0, 0.0, 1.0, 1.0, r, g, b, a);
    }

    public static void drawTexturedColorShape(int x1, int y1, int x2, int y2, double u1, double v1, double u2, double v2, float r, float g, float b, float a) {
        drawTexturedColorShape(x1, y1, x2, y2, 0, u1, v1, u2, v2, r, g, b, a);
    }

    public static void drawTexturedColorShape(int x1, int y1, int x2, int y2, int depth, double u1, double v1, double u2, double v2, float r, float g, float b, float a) {
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        builder.pos(x1, y2, depth).tex(u1, v2).color(r, g, b, a).endVertex();
        builder.pos(x2, y2, depth).tex(u2, v2).color(r, g, b, a).endVertex();
        builder.pos(x2, y1, depth).tex(u2, v1).color(r, g, b, a).endVertex();
        builder.pos(x1, y1, depth).tex(u1, v1).color(r, g, b, a).endVertex();
        tessellator.draw();
        GlStateManager.disableBlend();
    }
}
