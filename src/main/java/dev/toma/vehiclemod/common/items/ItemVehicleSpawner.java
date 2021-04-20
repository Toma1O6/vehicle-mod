package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemVehicleSpawner<V extends EntityVehicle> extends VMItem {

    final IFactory<V> vehicleFactory;
    final Class<V> vClass;

    public ItemVehicleSpawner(String name, Class<V> vClass, IFactory<V> factory) {
        super(name);
        this.vClass = vClass;
        this.vehicleFactory = factory;
    }

    public Class<V> getVehicleClass() {
        return vClass;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if(!worldIn.isRemote) {
            V v = vehicleFactory.createVehicle(worldIn, pos);
            v.getLockManager().setUnlocked(true);
            worldIn.spawnEntity(v);
        }
        if(!player.isCreative()) {
            stack.shrink(1);
        }
        return EnumActionResult.PASS;
    }

    public interface IFactory<V extends EntityVehicle> {
        V createVehicle(World world, BlockPos pos);
    }
}
