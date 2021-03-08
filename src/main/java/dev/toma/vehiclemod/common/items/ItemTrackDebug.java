package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.racing.renderer.RacingRenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTrackDebug extends VMItem {

    public ItemTrackDebug(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(worldIn.isRemote) {
            boolean f = toggle();
            playerIn.sendStatusMessage(new TextComponentString(f ? "Activated track render" : "Deactivated track render"), true);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @SideOnly(Side.CLIENT)
    boolean toggle() {
        RacingRenderManager.toggleDebugRender();
        return RacingRenderManager.isDebugActive();
    }
}
