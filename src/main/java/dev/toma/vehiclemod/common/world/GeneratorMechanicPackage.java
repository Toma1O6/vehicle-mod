package dev.toma.vehiclemod.common.world;

import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.WeightedRandom;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class GeneratorMechanicPackage implements IWorldGenerator {

    private static final WeightedRandom<BlockMechanicPackage.Variant> VARIANT = new WeightedRandom<>(BlockMechanicPackage.Variant::getSpawnChance, BlockMechanicPackage.Variant.values());

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(random.nextFloat() > 0.1F)
            return;
        BlockMechanicPackage.Variant variant = VARIANT.getRandom();
        int x = (chunkX << 4) + random.nextInt(16);
        int z = (chunkZ << 4) + random.nextInt(16);
        int y = world.getHeight(x, z);
        BlockPos pos = new BlockPos(x, y, z);
        Material material = world.getBlockState(pos.down()).getMaterial();
        if(!DevUtil.MATERIAL_VALIDATOR.test(material))
            return;
        world.setBlockState(pos, variant.getPackage().getDefaultState());
        TileEntity tileEntity = world.getTileEntity(pos);
        if(tileEntity instanceof TileEntityMechanicPackage) {
            ((TileEntityMechanicPackage) tileEntity).fill(variant);
        }
    }
}
