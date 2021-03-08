package dev.toma.vehiclemod.client.gui.widget;

import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class WidgetContainer extends Widget {

    protected List<Widget> widgets = new ArrayList<>();

    public WidgetContainer(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public <W extends Widget> W add(W w) {
        widgets.add(w);
        return w;
    }

    @Override
    public void render(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        widgets.forEach(widget -> widget.render(mc, mouseX, mouseY, partialTicks));
    }
}
