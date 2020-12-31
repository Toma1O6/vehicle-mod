package dev.toma.vehiclemod.common.world;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.blocks.BlockTunerPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityTunerPackage;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IntHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class GeneratorTunerPackage extends PackageGenerator {

    private static final LazyLoad<IntHashMap<BlockTunerPackage>> TIER_TO_BLOCK_MAP = new LazyLoad<>(() -> DevUtil.make(new IntHashMap<>(), map -> {
        map.addKey(0, Registries.VMBlocks.BRONZE_TUNER_PACKAGE);
        map.addKey(1, Registries.VMBlocks.SILVER_TUNER_PACKAGE);
        map.addKey(2, Registries.VMBlocks.GOLDEN_TUNER_PACKAGE);
        map.addKey(3, Registries.VMBlocks.PLATINUM_TUNER_PACKAGE);
    }));

    @Override
    public float getChance() {
        return VMConfig.worldConfig.getTunerPackageSpawnChance();
    }

    @Override
    public void generateBlock(BlockPos pos, World world, Random random) {
        int tier = VARIANT.getRandom().ordinal();
        IBlockState state = TIER_TO_BLOCK_MAP.get().lookup(tier).getDefaultState();
        world.setBlockState(pos, state);
        TileEntity tileEntity = world.getTileEntity(pos);
        if(tileEntity instanceof TileEntityTunerPackage) {
            ((TileEntityTunerPackage) tileEntity).fill(tier);
        }
    }
}
