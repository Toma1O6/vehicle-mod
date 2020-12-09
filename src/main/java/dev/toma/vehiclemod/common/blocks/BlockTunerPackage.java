package dev.toma.vehiclemod.common.blocks;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.tileentity.TileEntityTunerPackage;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockTunerPackage extends BlockBasic {

    final int tier;

    public BlockTunerPackage(String name, int tier) {
        super(name, Material.IRON);
        this.tier = tier;
        setHardness(2.2F);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BlockMechanicPackage.AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return BlockMechanicPackage.AABB;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTunerPackage();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.AIR;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if(tileEntity instanceof TileEntityTunerPackage) {
            ((TileEntityTunerPackage) tileEntity).fill(tier);
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(playerIn.getHeldItemMainhand().getItem() != Registries.VMItems.LOCKPICK) {
            if(!worldIn.isRemote)
                playerIn.sendStatusMessage(new TextComponentString("You must use lockpick to unlock this"), true);
            return true;
        }
        if(worldIn.isRemote) {
            VehicleMod.proxy.openLockpickUI((TileEntityTunerPackage) worldIn.getTileEntity(pos));
        }
        return true;
    }
}
