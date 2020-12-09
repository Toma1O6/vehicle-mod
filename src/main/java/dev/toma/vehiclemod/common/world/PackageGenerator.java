package dev.toma.vehiclemod.common.world;

import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.WeightedRandom;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public abstract class PackageGenerator implements IWorldGenerator {

    public static final WeightedRandom<BlockMechanicPackage.Variant> VARIANT = new WeightedRandom<>(BlockMechanicPackage.Variant::getSpawnChance, BlockMechanicPackage.Variant.values());

    public abstract float getChance();

    public abstract void generateBlock(BlockPos pos, World world, Random random);

    @Override
    public final void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(random.nextFloat() > this.getChance())
            return;
        int x = (chunkX << 4) + random.nextInt(16);
        int z = (chunkZ << 4) + random.nextInt(16);
        int y = world.getHeight(x, z);
        BlockPos pos = new BlockPos(x, y, z);
        Material material = world.getBlockState(pos.down()).getMaterial();
        if(material == Material.LEAVES) {
            pos = findGround(world, pos);
            material = world.getBlockState(pos.down()).getMaterial();
        }
        if(!DevUtil.MATERIAL_VALIDATOR.test(material))
            return;
        this.generateBlock(pos, world, random);
    }

    static BlockPos findGround(World world, BlockPos pos) {
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos(pos);
        while (mutableBlockPos.getY() > 1) {
            mutableBlockPos.setY(mutableBlockPos.getY() - 1);
            BlockPos down = mutableBlockPos.down();
            if(!world.isAirBlock(down) && world.getBlockState(down).getMaterial() != Material.LEAVES) {
                break;
            }
        }
        return mutableBlockPos.toImmutable();
    }
}
