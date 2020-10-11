package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemVehicleSpawner extends VMItem {

    final IFactory<?> vehicleFactory;
    final Class<? extends EntityVehicle> vClass;

    public <V extends EntityVehicle> ItemVehicleSpawner(String name, Class<V> vClass, IFactory<V> factory) {
        super(name);
        this.vClass = vClass;
        this.vehicleFactory = factory;
    }

    public Class<? extends EntityVehicle> getVehicleClass() {
        return vClass;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if(!worldIn.isRemote) {
            worldIn.spawnEntity(vehicleFactory.createVehicle(worldIn, pos));
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
