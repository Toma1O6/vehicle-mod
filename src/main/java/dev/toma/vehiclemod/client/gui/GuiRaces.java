package dev.toma.vehiclemod.client.gui;

import dev.toma.vehiclemod.client.gui.widget.TextWidget;
import dev.toma.vehiclemod.client.gui.widget.Widget;
import dev.toma.vehiclemod.client.gui.widget.WidgetContainer;
import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.Race;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

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
        addWidget(new RaceListWidget(0, 0, width / 4, height));
    }

    @Override
    public void update() {
        data = RacingDataImpl.get(mc.world);
        if(data.getRaces().size() != this.races.length) {
            initGui();
        }
        super.update();
    }

    static class SelectionWidget extends Widget {

        private final List<SelectionEntry> list = new ArrayList<>();

        SelectionWidget(int x, int y, int width, int height) {
            super(x, y, width, height);
        }

        public <T extends SelectionEntry> T add(T t) {
            list.add(t);
            layoutWidgets();
            return t;
        }

        void layoutWidgets() {
            int size = list.size();
            int h = (height - 5) / size;
            for (int i = 0; i < size; i++) {
                SelectionEntry t = list.get(i);
                t.selected = i == 0;
                t.x = x;
                t.y = y + 5 + h * i;
                t.width = width;
                t.height = h - 5;
            }
        }

        @Override
        public void render(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            for (SelectionEntry t : list) {
                t.render(mc, mouseX, mouseY, partialTicks);
            }
        }

        @Override
        public boolean handleClicked(int mouseX, int mouseY, int button) {
            for (SelectionEntry entry : list) {
                entry.unselect();
                if(entry.handleClicked(mouseX, mouseY, button)) {
                    entry.select();
                }
            }
            return false;
        }
    }

    static class SelectionEntry extends TextWidget {

        boolean selected;

        SelectionEntry(String text, int color) {
            super(0, 0, 0, 0, text, color, Alignment.CENTER_CENTER);
        }

        SelectionEntry(String text) {
            this(text, 0xffffff);
        }

        public void unselect() {
            this.selected = false;
        }

        public void select() {
            this.selected = true;
        }

        @Override
        public void renderBackground(int mouseX, int mouseY) {
            if(selected)
                drawColorShape(x, y, x + width, y + height, 1.0F, 1.0F, 1.0F, 0.4F);
            else if(isMouseOver(mouseX, mouseY)) {
                drawColorShape(x, y, x + width, y + height, 1.0F, 1.0F, 1.0F, 0.3F);
            }
        }

        @Override
        public void onClick(int mouseX, int mouseY, int button) {
            select();
        }
    }

    class RaceListWidget extends WidgetContainer {

        RaceListWidget(int x, int y, int width, int height) {
            super(x, y, width, height);
            boolean opFlag = GuiRaces.this.isOp;
            add(new TextWidget(x + 5, y, width - 3, 15, "Mode: " + (opFlag ? "Admin" : "User"), 0xffffff, TextWidget.Alignment.CENTER_LEFT));
            SelectionWidget widget = add(new SelectionWidget(x + 5, 15, width - 10, 75));
            widget.add(new SelectionEntry("Races"));
            if(opFlag) {
                widget.add(new SelectionEntry("Add race", 0x008800));
            }
            widget.add(new SelectionEntry("Tracks"));
        }

        @Override
        public void render(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
            Widget.drawColorShape(0, 0, width, height, 0.0F, 0.0F, 0.0F, 0.2F);
            super.render(mc, mouseX, mouseY, partialTicks);
        }
    }
}
