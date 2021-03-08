package dev.toma.vehiclemod.client.gui.widget;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public class TextWidget extends Widget {

    final String text;
    final int color;
    final int bgColor;
    final Alignment alignment;

    public TextWidget(int x, int y, int width, int height, String text) {
        this(x, y, width, height, text, 0xFFFFFF);
    }

    public TextWidget(int x, int y, int width, int height, String text, int color) {
        this(x, y, width, height, text, color, Alignment.CENTER_CENTER);
    }

    public TextWidget(int x, int y, int width, int height, String text, int color, Alignment alignment) {
        this(x, y, width, height, text, color, -1, alignment);
    }

    public TextWidget(int x, int y, int width, int height, String text, int color, int bgColor, Alignment alignment) {
        super(x, y, width, height);
        this.text = text;
        this.color = color;
        this.bgColor = bgColor;
        this.alignment = alignment;
    }

    @Override
    public void render(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if(bgColor != -1) {
            float a = ((bgColor >> 24) & 0xff) / 255.0F;
            float r = ((bgColor >> 16) & 0xff) / 255.0F;
            float g = ((bgColor >>  8) & 0xff) / 255.0F;
            float b = ( bgColor        & 0xff) / 255.0F;
            drawColorShape(x, y, width, height, r, g, b, a);
        }
        alignment.getRender().render(mc.fontRenderer, text, x, y, width, height, color);
    }

    public enum Alignment {

        TOP_LEFT((renderer, text, x, y, width, height, color) -> {
            renderer.drawString(text, x, y, color);
        }),
        TOP_CENTER((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + (width - textWidth) / 2, y, color);
        }),
        TOP_RIGHT((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + width - textWidth, y, color);
        }),
        CENTER_LEFT((renderer, text, x, y, width, height, color) -> {
            renderer.drawString(text, x, y + (height - renderer.FONT_HEIGHT) / 2, color);
        }),
        CENTER_CENTER((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + (width - textWidth) / 2, y + (height - renderer.FONT_HEIGHT) / 2, color);
        }),
        CENTER_RIGHT((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + width - textWidth, y + (height - renderer.FONT_HEIGHT) / 2, color);
        }),
        BOTTOM_LEFT((renderer, text, x, y, width, height, color) -> {
            renderer.drawString(text, x, y + height - renderer.FONT_HEIGHT, color);
        }),
        BOTTOM_CENTER((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + (width - textWidth) / 2, y + height - renderer.FONT_HEIGHT, color);
        }),
        BOTTOM_RIGHT((renderer, text, x, y, width, height, color) -> {
            int textWidth = renderer.getStringWidth(text);
            renderer.drawString(text, x + width - textWidth, y + height - renderer.FONT_HEIGHT, color);
        });

        final TextRender render;

        Alignment(TextRender render) {
            this.render = render;
        }

        TextRender getRender() {
            return render;
        }

        @FunctionalInterface
        interface TextRender {
            void render(FontRenderer renderer, String text, int x, int y, int width, int height, int color);
        }
    }
}
