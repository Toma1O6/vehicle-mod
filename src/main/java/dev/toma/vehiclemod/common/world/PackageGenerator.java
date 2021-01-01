package dev.toma.vehiclemod.common.world;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.blocks.BlockTunerPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityTunerPackage;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.WeightedRandom;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IntHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class PackageGenerator implements IWorldGenerator {

    private static final LazyLoad<IntHashMap<BlockTunerPackage>> TIER_TO_BLOCK_MAP = new LazyLoad<>(() -> DevUtil.make(new IntHashMap<>(), map -> {
        map.addKey(0, Registries.VMBlocks.BRONZE_TUNER_PACKAGE);
        map.addKey(1, Registries.VMBlocks.SILVER_TUNER_PACKAGE);
        map.addKey(2, Registries.VMBlocks.GOLDEN_TUNER_PACKAGE);
        map.addKey(3, Registries.VMBlocks.PLATINUM_TUNER_PACKAGE);
    }));
    public static final WeightedRandom<BlockMechanicPackage.Variant> VARIANT = new WeightedRandom<>(BlockMechanicPackage.Variant::getSpawnChance, BlockMechanicPackage.Variant.values());
    public static final WeightedRandom<PackageSpawner> PACKAGE = new WeightedRandom.NullableWeightedRandom<>(PackageSpawner::getChance, new PackageSpawner[] {
            new PackageSpawner(VMConfig.worldConfig.mechanicPackageSpawnChance, (pos, world, random) -> {
                BlockMechanicPackage.Variant variant = VARIANT.getRandom();
                world.setBlockState(pos, variant.getPackage().getDefaultState(), 2 | 16);
                TileEntity tileEntity = world.getTileEntity(pos);
                if(tileEntity instanceof TileEntityMechanicPackage) {
                    ((TileEntityMechanicPackage) tileEntity).fill(variant);
                }
            }),
            new PackageSpawner(VMConfig.worldConfig.tunerPackageSpawnChance, (pos, world, random) -> {
                int tier = VARIANT.getRandom().ordinal();
                IBlockState state = TIER_TO_BLOCK_MAP.get().lookup(tier).getDefaultState();
                world.setBlockState(pos, state, 2 | 16);
                TileEntity tileEntity = world.getTileEntity(pos);
                if(tileEntity instanceof TileEntityTunerPackage) {
                    ((TileEntityTunerPackage) tileEntity).fill(tier);
                }
            })
    }, total -> 1.0F - total / 100.0F);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        PackageSpawner spawner = PACKAGE.getRandom();
        if(spawner == null)
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
        spawner.getGenerator().runGenerator(pos, world, random);
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

    public static class PackageSpawner {

        private final int chance;
        private final Generator generator;

        public PackageSpawner(int chance, Generator generator) {
            this.chance = chance;
            this.generator = generator;
        }

        public int getChance() {
            return chance;
        }

        public Generator getGenerator() {
            return generator;
        }
    }

    public interface Generator {

        void runGenerator(BlockPos pos, World world, Random random);
    }
}
