package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.tunning.StatModifierType;
import dev.toma.vehiclemod.common.tunning.StatPackage;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        this.type.getPackage().forEachModifier(mod -> mod.getType().addToTooltip(tooltip, mod.getValue(level - 1)));
    }

    public enum Type {
        BODY(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.DURABILITY)
                    .values(0.15F, 0.25F, 0.40F, 0.50F, 0.65F, 0.80F, 1.00F)
                    .build()
                .attribute()
                    .type(StatModifierType.HANDLING)
                    .values(0.03F, 0.05F, 0.07F, 0.10F, 0.13F, 0.16F, 0.20F)
                    .build()
                .createPackage()),
        BRAKES(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.BRAKING)
                    .values(0.08F, 0.15F, 0.22F, 0.30F, 0.39F, 0.49F, 0.60F)
                    .build()
                .createPackage()),
        ENGINE(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.TOP_SPEED)
                    .values( 0.04F,  0.07F,  0.10F,  0.15F,  0.20F,  0.25F,  0.30F)
                    .build()
                .attribute()
                    .type(StatModifierType.FUEL_CONSUMPTION)
                    .values(-0.03F, -0.07F, -0.11F, -0.17F, -0.25F, -0.32F, -0.40F)
                    .build()
                .createPackage()),
        ECU(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.TOP_SPEED)
                    .values( 0.02F,  0.03F,  0.05F,  0.08F,  0.10F,  0.13F,  0.15F)
                    .build()
                .attribute()
                    .type(StatModifierType.ACCELERATION)
                    .values( 0.03F,  0.06F,  0.09F,  0.13F,  0.18F,  0.24F,  0.30F)
                    .build()
                .attribute()
                    .type(StatModifierType.DURABILITY)
                    .values(-0.05F, -0.10F, -0.15F, -0.20F, -0.25F, -0.30F, -0.40F)
                    .build()
                .createPackage()),
        FUEL_TANK(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.FUEL_CAPACITY)
                    .values(0.10F, 0.20F, 0.35F, 0.50F, 0.65F, 0.80F, 1.00F)
                    .build()
                .createPackage()),
        SUSPENSION(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.HANDLING)
                    .values(0.05F, 0.10F, 0.15F, 0.21F, 0.27F, 0.33F, 0.40F)
                    .build()
                .createPackage()),
        TRANSMISSION(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.TOP_SPEED)
                    .values(0.02F, 0.05F, 0.08F, 0.11F, 0.14F, 0.17F, 0.20F)
                    .build()
                .attribute()
                    .type(StatModifierType.ACCELERATION)
                    .values(0.02F, 0.05F, 0.08F, 0.11F, 0.14F, 0.17F, 0.20F)
                    .build()
                .createPackage()),
        TURBO(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.ACCELERATION)
                    .values( 0.06F,  0.10F,  0.15F,  0.20F,  0.26F,  0.32F,  0.40F)
                    .build()
                .attribute()
                    .type(StatModifierType.FUEL_CONSUMPTION)
                    .values(-0.02F, -0.04F, -0.06F, -0.10F, -0.15F, -0.20F, -0.25F)
                    .build()
                .createPackage()),
        TIRES(new StatPackage.Builder()
                .attribute()
                    .type(StatModifierType.HANDLING)
                    .values(0.05F, 0.09F, 0.14F, 0.20F, 0.27F, 0.35F, 0.45F)
                    .build()
                .attribute()
                    .type(StatModifierType.BRAKING)
                    .values(0.03F, 0.05F, 0.08F, 0.11F, 0.15F, 0.20F, 0.25F)
                    .build()
                .createPackage());

        static final Map<Integer, EnumDyeColor> LEVEL_TO_COLOR_MAP = DevUtil.make(new HashMap<>(), map -> {
            map.put(1, EnumDyeColor.GRAY);
            map.put(2, EnumDyeColor.YELLOW);
            map.put(3, EnumDyeColor.GREEN);
            map.put(4, EnumDyeColor.BLUE);
            map.put(5, EnumDyeColor.PURPLE);
            map.put(6, EnumDyeColor.ORANGE);
            map.put(7, EnumDyeColor.RED);
        });

        final StatPackage statPackage;
        final String niceName;

        Type(StatPackage statPackage) {
            this.statPackage = statPackage;
            String[] words = name().toLowerCase().split("_");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                boolean isLast = i == words.length - 1;
                builder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
                if (!isLast)
                    builder.append(" ");
            }
            this.niceName = builder.toString();
        }

        public String getNiceName() {
            return niceName;
        }

        public StatPackage getPackage() {
            return statPackage;
        }

        public static EnumDyeColor getColor(int level) {
            return DevUtil.getSafe(LEVEL_TO_COLOR_MAP, level, EnumDyeColor.BLACK);
        }
    }
}
