package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;

public class ContainerPetrolPump extends ModContainer<TileEntityPetrolPump> {

    public ContainerPetrolPump(InventoryPlayer player, TileEntityPetrolPump tileEntityPetrolPump) {
        super(tileEntityPetrolPump);
        addSpecialSlot(tileEntityPetrolPump, 0, 8, 8, 1, stack -> stack.getItem() == Registries.VMItems.BUCKET_OF_FUEL);
        addSpecialSlot(tileEntityPetrolPump, 1, 8, 47, 16, stack -> stack.getItem() == Items.BUCKET);
        addDefaultInventory(player, 87);
    }
}
