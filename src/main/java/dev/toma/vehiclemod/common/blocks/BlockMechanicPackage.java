package dev.toma.vehiclemod.common.blocks;

import net.minecraft.block.material.Material;

public class BlockMechanicPackage extends BlockBasic {

    private final Variant variant;

    public BlockMechanicPackage(Variant variant) {
        super("mechanic_package_" + variant.name().toLowerCase(), Material.IRON);
        this.variant = variant;
    }

    public Variant getVariant() {
        return variant;
    }

    public enum Variant {

        BRONZE   (0.55F, 1, 0.60F, 0.25F, 0.08F, 0.05F, 0.02F, 0.00F, 0.00F),
        SILVER   (0.30F, 1, 0.30F, 0.40F, 0.15F, 0.08F, 0.05F, 0.02F, 0.00F),
        GOLDEN   (0.10F, 2, 0.15F, 0.35F, 0.20F, 0.15F, 0.08F, 0.05F, 0.02F),
        PLATINUM (0.05F, 2, 0.00F, 0.15F, 0.33F, 0.27F, 0.13F, 0.08F, 0.04F);

        final float spawnChance;
        final int partCount;
        final float lvl1;
        final float lvl2;
        final float lvl3;
        final float lvl4;
        final float lvl5;
        final float lvl6;
        final float lvl7;

        Variant(float spawnChance, int parts, float l1, float l2, float l3, float l4, float l5, float l6, float l7) {
            this.spawnChance = spawnChance;
            this.partCount = parts;
            this.lvl1 = l1;
            this.lvl2 = l2;
            this.lvl3 = l3;
            this.lvl4 = l4;
            this.lvl5 = l5;
            this.lvl6 = l6;
            this.lvl7 = l7;
        }
    }
}
