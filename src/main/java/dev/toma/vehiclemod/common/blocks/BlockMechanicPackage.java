package dev.toma.vehiclemod.common.blocks;

import com.google.common.base.Preconditions;
import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.gui.GuiLockpicking;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
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

public class BlockMechanicPackage extends BlockBasic {

    protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 0.3, 0.9);
    private final Variant variant;

    public BlockMechanicPackage(Variant variant) {
        super("mechanic_package_" + variant.name().toLowerCase(), Material.IRON);
        this.variant = variant;
        this.variant.aPackage = this;
        setHardness(2.2F);
    }

    public Variant getVariant() {
        return variant;
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
        return AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return AABB;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityMechanicPackage();
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if(tileEntity instanceof TileEntityMechanicPackage) {
            ((TileEntityMechanicPackage) tileEntity).fill(variant);
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
            VehicleMod.proxy.openLockpickUI((TileEntityMechanicPackage) worldIn.getTileEntity(pos));
        }
        return true;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.AIR;
    }

    public enum Variant {

        BRONZE   (55, 1, 4, 0.60F, 0.25F, 0.08F, 0.05F, 0.02F, 0.00F, 0.00F, 0.07F, 0.00F, 0.00F),
        SILVER   (30, 1, 5, 0.30F, 0.40F, 0.15F, 0.08F, 0.05F, 0.02F, 0.00F, 0.00F, 0.07F, 0.00F),
        GOLDEN   (10, 2, 6, 0.15F, 0.35F, 0.20F, 0.15F, 0.08F, 0.05F, 0.02F, 0.00F, 0.00F, 0.07F),
        PLATINUM ( 5, 2, 7, 0.00F, 0.15F, 0.33F, 0.27F, 0.13F, 0.08F, 0.04F, 0.15F, 0.15F, 0.15F);

        final int spawnChance;
        final int partCount;
        final int buttons;
        final float[] levelChances;
        BlockMechanicPackage aPackage;

        Variant(int spawnChance, int parts, int buttons, float... chances) {
            this.spawnChance = spawnChance;
            this.partCount = parts;
            this.buttons = buttons;
            this.levelChances = chances;
        }

        public BlockMechanicPackage getPackage() {
            return aPackage;
        }

        public int getSpawnChance() {
            return spawnChance;
        }

        public int getPartCount() {
            return partCount;
        }

        public int getButtons() {
            return buttons;
        }

        public float[] getLevelChances() {
            return levelChances;
        }
    }
}
