package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ItemVehicleUpgrade extends VMItem {

    private final Type type;
    private final int level;

    public ItemVehicleUpgrade(Type type, int level) {
        super(type.name().toLowerCase() + "_" + level);
        this.type = type;
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Attributes:");
        this.type.getTooltipHandler().accept(tooltip, this.getValues());
    }

    private float[] getValues() {
        float[] fs = new float[type.modifiers.length];
        int j = 0;
        for(float[] fs2 : type.modifiers) {
            fs[j] = fs2[level-1];
            ++j;
        }
        return fs;
    }

    public enum Type {
        BODY((up, floats, level) -> up.addHealth(floats[0][level]), new float[][]{
                {0.15F, 0.25F, 0.40F, 0.50F, 0.65F, 0.80F, 1.00F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Durability")),
        BRAKES((up, floats, level) -> up.addBraking(floats[0][level]), new float[][]{
                {0.05F, 0.10F, 0.15F, 0.22F, 0.30F, 0.40F, 0.50F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Braking")),
        ECU((up, floats, level) -> {
            up.addTopSpeed     (floats[0][level]);
            up.addAcceleration (floats[1][level]);
            up.addHealth       (floats[2][level]);
        }, new float[][]{
                { 0.02F,  0.03F,  0.05F,  0.08F,  0.10F,  0.13F,  0.15F},
                { 0.02F,  0.03F,  0.05F,  0.08F,  0.10F,  0.13F,  0.15F},
                {-0.05F, -0.10F, -0.15F, -0.20F, -0.25F, -0.30F, -0.40F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Top speed", "Acceleration", "Durability")),
        ENGINE((up, floats, level) -> {
            up.addTopSpeed     (floats[0][level]);
            up.addFuelCons     (floats[1][level]);
        }, new float[][]{
                {0.04F, 0.07F, 0.10F, 0.15F, 0.20F, 0.25F, 0.30F},
                {-0.03F, -0.07F, -0.11F, -0.17F, -0.25F, -0.32F, -0.40F}
        }, (strings, floats) -> insertWithNames(strings, floats, 1, "Top speed", "Fuel consumption")),
        FUEL_TANK((up, floats, level) -> up.addFuelCap(floats[0][level]), new float[][]{
                {0.10F, 0.20F, 0.35F, 0.50F, 0.65F, 0.80F, 1.00F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Fuel capacity")),
        SUSPENSION((up, floats, level) -> up.addHandling(floats[0][level]), new float[][]{
                {0.02F, 0.04F, 0.06F, 0.09F, 0.13F, 0.17F, 0.20F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Handling")),
        TRANSMISSION((up, floats, level) -> {
            up.addTopSpeed     (floats[0][level]);
            up.addAcceleration (floats[1][level]);
        }, new float[][]{
                {0.02F, 0.04F, 0.06F, 0.08F, 0.10F, 0.12F, 0.15F},
                {0.01F, 0.03F, 0.05F, 0.06F, 0.08F, 0.09F, 0.10F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Top speed", "Acceleration")),
        TURBO((up, floats, level) -> {
            up.addAcceleration (floats[0][level]);
            up.addFuelCons     (floats[1][level]);
        }, new float[][]{
                { 0.04F,  0.07F,  0.09F,  0.12F,  0.16F,  0.21F,  0.25F},
                {-0.02F, -0.04F, -0.06F, -0.10F, -0.15F, -0.20F, -0.25F}
        }, (strings, floats) -> insertWithNames(strings, floats, 1, "Acceleration", "Fuel consumption")),
        TIRES((up, floats, level) -> {
            up.addHandling     (floats[0][level]);
            up.addBraking      (floats[1][level]);
        }, new float[][]{
                {0.03F, 0.06F, 0.10F, 0.14F, 0.19F, 0.24F, 0.30F},
                {0.01F, 0.03F, 0.05F, 0.07F, 0.09F, 0.12F, 0.15F}
        }, (strings, floats) -> insertWithNames(strings, floats, "Handling", "Braking"));

        static final Map<Integer, EnumDyeColor> LEVEL_TO_COLOR_MAP = DevUtil.make(new HashMap<>(), map -> {
            map.put(1, EnumDyeColor.GRAY);
            map.put(2, EnumDyeColor.YELLOW);
            map.put(3, EnumDyeColor.GREEN);
            map.put(4, EnumDyeColor.BLUE);
            map.put(5, EnumDyeColor.PURPLE);
            map.put(6, EnumDyeColor.ORANGE);
            map.put(7, EnumDyeColor.RED);
        });
        final UpgradeHandler handler;
        final float[][] modifiers;
        final BiConsumer<List<String>, float[]> tooltipHandler;
        final String niceName;

        Type(UpgradeHandler handler, float[][] floats, BiConsumer<List<String>, float[]> tooltipHandler) {
            this.handler = handler;
            this.modifiers = floats;
            this.tooltipHandler = tooltipHandler;
            String[] words = name().toLowerCase().split("_");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                boolean isLast = i == words.length - 1;
                builder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
                if(!isLast)
                    builder.append(" ");
            }
            this.niceName = builder.toString();
        }

        public String getNiceName() {
            return niceName;
        }

        public UpgradeHandler getHandler() {
            return handler;
        }

        public float[][] getModifiers() {
            return modifiers;
        }

        public BiConsumer<List<String>, float[]> getTooltipHandler() {
            return tooltipHandler;
        }

        public static EnumDyeColor getColor(int level) {
            return DevUtil.getSafe(LEVEL_TO_COLOR_MAP, level, EnumDyeColor.BLACK);
        }

        static void insertWithNames(List<String> list, float[] values, String... names) {
            insertWithNames(list, values, -1, names);
        }

        static void insertWithNames(List<String> list, float[] values, int invert, String... names) {
            for (int i = 0; i < values.length; i++) {
                int j = (int)(values[i] * 100);
                String formatting;
                if(i == invert) {
                    j = Math.abs(j);
                    formatting = j > 0 ? TextFormatting.RED + "+" : TextFormatting.GREEN.toString();
                } else {
                    formatting = j > 0 ? TextFormatting.GREEN + "+" : TextFormatting.RED.toString();
                }
                list.add(names[i] + ": " + formatting + j + "%");
            }
        }
    }

    public interface UpgradeHandler {
        void applyUpgradeTo(VehicleUpgrades upgrades, float[][] values, int level);
    }
}
