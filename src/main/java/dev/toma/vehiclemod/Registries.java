package dev.toma.vehiclemod;

import java.util.ArrayList;

import dev.toma.vehiclemod.common.blocks.BlockSecret;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IForgeRegistry;

public class Registries {
	
	@ObjectHolder(VehicleMod.Constants.ID)
	public static final class VMItems {
		public static final Item FUEL_CAN = null;
	}
	
	@ObjectHolder(VehicleMod.Constants.ID)
	public static final class VMBlocks {
		public static final BlockSecret SECRET = null;
	}
	
	@ObjectHolder(VehicleMod.Constants.ID)
	public static final class VMSounds {
		
		public static final SoundEvent VEHICLE_IDLE = null;
	}
	
	@EventBusSubscriber
	public static class Registry {
		
		static int id = -1;
		public static final ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
		
		@SubscribeEvent
		public static void onBlockRegister(RegistryEvent.Register<Block> e) {
			final Block[] blocks = {
				new BlockSecret("secret")
			};
			e.getRegistry().registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void onItemRegister(RegistryEvent.Register<Item> e) {
			final Item[] items = {
			};
			e.getRegistry().registerAll(ITEM_BLOCKS.toArray(new ItemBlock[0]));
		}
		
		@SubscribeEvent
		public static void onEntityRegister(RegistryEvent.Register<EntityEntry> e) {
			final EntityEntry[] entries = {
					
			};
		}
		
		@SubscribeEvent
		public static void onSoundRegister(RegistryEvent.Register<SoundEvent> e) {
			final SoundEvent[] sounds = {
				registerSound("vehicle_idle")
			};
			e.getRegistry().registerAll(sounds);
		}
		
		private static SoundEvent registerSound(String name) {
			SoundEvent sound = new SoundEvent(new ResourceLocation(VehicleMod.Constants.ID, name));
			sound.setRegistryName(name);
			return sound;
		}
		
		private static EntityEntry registerVehicle(String name, Class<? extends Entity> cls) {
			return createBuilder(name).entity(cls).tracker(256, 1, true).build();
		}
		
		private static <E extends Entity> EntityEntryBuilder<E> createBuilder(String name) {
			EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
			ResourceLocation rl = new ResourceLocation(VehicleMod.Constants.ID, name);
			return builder.id(rl, id++).name(rl.toString());
		}
	}
	
	@EventBusSubscriber(Side.CLIENT)
	public static class ModelRegistry {
		
		@SubscribeEvent
		public static void onModelRegister(ModelRegistryEvent e) {
			final IForgeRegistry<Item> ITEMS = ForgeRegistries.ITEMS;
			final IForgeRegistry<Block> BLOCKS = ForgeRegistries.BLOCKS;
			
			for(ResourceLocation rl : ITEMS.getKeys()) {
				if(rl.getResourceDomain().equalsIgnoreCase(VehicleMod.Constants.ID)) {
					registerModel(ITEMS.getValue(rl));
				}
			}
			
			for(ResourceLocation rl : BLOCKS.getKeys()) {
				if(rl.getResourceDomain().equalsIgnoreCase(VehicleMod.Constants.ID)) {
					registerModel(Item.getItemFromBlock(BLOCKS.getValue(rl)));
				}
			}
		}
		
		private static void registerModel(Item item) {
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}
