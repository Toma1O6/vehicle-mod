package dev.toma.vehiclemod;

import java.util.ArrayList;

import dev.toma.vehiclemod.common.blocks.BlockFuelTank;
import dev.toma.vehiclemod.common.blocks.BlockMusicPlayer;
import dev.toma.vehiclemod.common.blocks.BlockSecret;
import dev.toma.vehiclemod.common.blocks.BlockSpikes;
import dev.toma.vehiclemod.common.blocks.BlockStateCell;
import dev.toma.vehiclemod.common.items.ItemFuelCan;
import dev.toma.vehiclemod.common.items.ItemVehicleSpawner;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicleBeamerS120;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
		public static final ItemVehicleSpawner SPAWN_BEAMERS120 = null;
	}
	
	@ObjectHolder(VehicleMod.Constants.ID)
	public static final class VMBlocks {
		public static final BlockSecret SECRET = null;
		public static final BlockFuelTank FUEL_TANK = null;
		public static final BlockStateCell STATE_CELL = null;
		public static final BlockSpikes SPIKES = null;
		public static final BlockMusicPlayer MUSIC_PLAYER = null;
	}
	
	@ObjectHolder(VehicleMod.Constants.ID)
	public static final class VMSounds {
		public static final SoundEvent VEHICLE_IDLE = null;
		public static final SoundEvent BEAMER_ACC = null;
		public static final SoundEvent BEAMER_BRAKE = null;
		public static final SoundEvent BEAMER_GAS = null;
		public static final SoundEvent SECRET = null;
		public static final SoundEvent TRACER_ACC = null;
		public static final SoundEvent TRACER_BRAKE = null;
		public static final SoundEvent TRACER_GAS = null;
	}
	
	@EventBusSubscriber
	public static class Registry {
		
		static int id = -1;
		public static final ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
		
		@SubscribeEvent
		public static void onBlockRegister(RegistryEvent.Register<Block> e) {
			final Block[] blocks = {
				new BlockSecret("secret"),
				new BlockFuelTank("fuel_tank"),
				new BlockStateCell("state_cell"),
				new BlockSpikes("spikes"),
				new BlockMusicPlayer("music_player"),
			};
			e.getRegistry().registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void onItemRegister(RegistryEvent.Register<Item> e) {
			final Item[] items = {
				new ItemFuelCan("fuel_can"),
				new ItemVehicleSpawner("spawn_beamers120") {
					@Override
					public void handleAction(World world, BlockPos pos) {
						world.spawnEntity(new EntityVehicleBeamerS120(world, pos));
					}
				}
			};
			e.getRegistry().registerAll(items);
			e.getRegistry().registerAll(ITEM_BLOCKS.toArray(new ItemBlock[0]));
		}
		
		@SubscribeEvent
		public static void onEntityRegister(RegistryEvent.Register<EntityEntry> e) {
			final EntityEntry[] entries = {
				registerVehicle("beamer_s120", EntityVehicleBeamerS120.class)
			};
			e.getRegistry().registerAll(entries);
		}
		
		@SubscribeEvent
		public static void onSoundRegister(RegistryEvent.Register<SoundEvent> e) {
			final SoundEvent[] sounds = {
				registerSound("secret"),
				registerSound("vehicle_idle"),
				registerSound("beamer_acc"),
				registerSound("beamer_brake"),
				registerSound("beamer_gas"),
				registerSound("tracer_acc"),
				registerSound("tracer_brake"),
				registerSound("tracer_gas")
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
			DevUtil.creator().createAllFiles();
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
