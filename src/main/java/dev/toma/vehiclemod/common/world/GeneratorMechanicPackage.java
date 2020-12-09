package dev.toma.vehiclemod.common.world;

import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import dev.toma.vehiclemod.util.WeightedRandom;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class GeneratorMechanicPackage extends PackageGenerator {

    @Override
    public float getChance() {
        return 0.08F;
    }

    @Override
    public void generateBlock(BlockPos pos, World world, Random random) {
        BlockMechanicPackage.Variant variant = VARIANT.getRandom();
        world.setBlockState(pos, variant.getPackage().getDefaultState());
        TileEntity tileEntity = world.getTileEntity(pos);
        if(tileEntity instanceof TileEntityMechanicPackage) {
            ((TileEntityMechanicPackage) tileEntity).fill(variant);
        }
    }
}
