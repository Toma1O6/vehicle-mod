package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.client.gui.widget.TextWidget;
import dev.toma.vehiclemod.client.gui.widget.Widget;
import dev.toma.vehiclemod.client.gui.widget.WidgetContainer;
import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.Race;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class GuiRaces extends GuiWidgets {

    private final boolean isOp;
    private Race[] races;
    private RacingData data;

    public GuiRaces(World world, boolean isOp) {
        this.data = RacingDataImpl.get(world);
        this.isOp = isOp;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        Widget.drawColorShape(0, 0, width, height, 0.0F, 0.0F, 0.0F, 0.2F);
        drawWidgets(mc, mouseX, mouseY, partialTicks);
    }

    @Override
    public void init() {
        races = data.getRaces().values().toArray(new Race[0]);
        addWidget(new RaceListWidget(0, 0, width / 3, height));
    }

    @Override
    public void update() {
        data = RacingDataImpl.get(mc.world);
        if(data.getRaces().size() != this.races.length) {
            initGui();
        }
        super.update();
    }

    static class SelectionWidget extends WidgetContainer {

    }

    class RaceListWidget extends WidgetContainer {

        RaceListWidget(int x, int y, int width, int height) {
            super(x, y, width, height);
            add(new TextWidget(x + 3, y, width - 3, 15, "Mode: " + (GuiRaces.this.isOp ? "Admin" : "User"), 0xffffff, TextWidget.Alignment.CENTER_LEFT));
        }

        @Override
        public void render(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            Widget.drawColorShape(0, 0, width, height, 0.0F, 0.0F, 0.0F, 0.2F);
            super.render(mc, mouseX, mouseY, partialTicks);
        }
    }
}
