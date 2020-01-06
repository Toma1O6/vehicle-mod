package dev.toma.vehiclemod;

import dev.toma.vehiclemod.common.blocks.*;
import dev.toma.vehiclemod.common.blocks.fuel.BlockFuelMaker;
import dev.toma.vehiclemod.common.items.*;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.util.MusicEntry;
import dev.toma.vehiclemod.vehicle.entity.VehicleBeamerS120;
import dev.toma.vehiclemod.vehicle.entity.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.vehicle.entity.VehicleSputnik2000L;
import dev.toma.vehiclemod.vehicle.entity.VehicleTracerT1;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumDyeColor;
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
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.ArrayList;
import java.util.Collection;

public class Registries {

    @ObjectHolder(VehicleMod.Constants.ID)
    public static final class VMItems {
        public static final Item FUEL_CAN = null;
        public static final ItemVehicleSpawner SPAWN_BEAMERS120 = null;
        public static final ItemVehicleSpawner SPAWN_FEDORATTIVULCAN = null;
        public static final ItemVehicleSpawner SPAWN_TRACERT1 = null;
        public static final VMItem EMPTY_SPRAY_CAN = null;
        public static final ItemSprayCan WHITE_SPRAY_CAN = null;
        public static final ItemSprayCan ORANGE_SPRAY_CAN = null;
        public static final ItemSprayCan MAGENTA_SPRAY_CAN = null;
        public static final ItemSprayCan LIGHT_BLUE_SPRAY_CAN = null;
        public static final ItemSprayCan YELLOW_SPRAY_CAN = null;
        public static final ItemSprayCan LIME_SPRAY_CAN = null;
        public static final ItemSprayCan PINK_SPRAY_CAN = null;
        public static final ItemSprayCan GRAY_SPRAY_CAN = null;
        public static final ItemSprayCan SILVER_SPRAY_CAN = null;
        public static final ItemSprayCan CYAN_SPRAY_CAN = null;
        public static final ItemSprayCan PURPLE_SPRAY_CAN = null;
        public static final ItemSprayCan BLUE_SPRAY_CAN = null;
        public static final ItemSprayCan BROWN_SPRAY_CAN = null;
        public static final ItemSprayCan GREEN_SPRAY_CAN = null;
        public static final ItemSprayCan RED_SPRAY_CAN = null;
        public static final ItemSprayCan BLACK_SPRAY_CAN = null;
        public static final ItemRepairKit REPAIR_KIT = null;
        public static final VMItem BUCKET_OF_LIQUID_COAL = null;
        public static final VMItem BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE = null;
        public static final VMItem BUCKET_OF_FUEL = null;
        public static final VMItem FUEL_FILTER = null;
    }

    @ObjectHolder(VehicleMod.Constants.ID)
    public static final class VMBlocks {
        public static final BlockSecret SECRET = null;
        public static final BlockPetrolPump PETROL_PUMP = null;
        public static final BlockStateCell STATE_CELL = null;
        public static final BlockSpikes SPIKES = null;
        public static final BlockMusicPlayer MUSIC_PLAYER = null;
        public static final BlockFuelMaker FUEL_MAKER = null;
    }

    @ObjectHolder(VehicleMod.Constants.ID)
    public static final class VMSounds {
        public static final SoundEvent VEHICLE_IDLE = null;
        public static final SoundEvent BEAMER_ACC = null;
        public static final SoundEvent BEAMER_BRAKE = null;
        public static final SoundEvent BEAMER_GAS = null;
        public static final SoundEvent BEAMER_START = null;
        public static final SoundEvent TRACER_ACC = null;
        public static final SoundEvent TRACER_BRAKE = null;
        public static final SoundEvent TRACER_GAS = null;
        public static final SoundEvent TRACER_START = null;
        public static final SoundEvent FEDORATTI_ACC = null;
        public static final SoundEvent FEDORATTI_BRAKE = null;
        public static final SoundEvent FEDORATTI_GAS = null;
        public static final SoundEvent FEDORATTI_START = null;
        public static final SoundEvent SPUTNIK_ACC = null;
        public static final SoundEvent SPUTNIK_BRAKE = null;
        public static final SoundEvent SPUTNIK_GAS = null;
        public static final SoundEvent SPUTNIK_START = null;
        public static final SoundEvent SECRET = null;

        // music entries
        public static final SoundEvent DANGER1 = null;
        public static final SoundEvent DANGER2 = null;
        public static final SoundEvent DANGER3 = null;
        public static final SoundEvent DANGER4 = null;
        public static final SoundEvent DANGER5 = null;
        public static final SoundEvent DANGER6 = null;
        public static final SoundEvent DANGER7 = null;
        public static final SoundEvent DANGER8 = null;
        public static final SoundEvent DANGER9 = null;
        public static final SoundEvent RELAXED1 = null;
        public static final SoundEvent RELAXED2 = null;
        public static final SoundEvent RHYTMIC1 = null;
        public static final SoundEvent RHYTMIC2 = null;
        public static final SoundEvent SURPRISE1 = null;
        public static final SoundEvent SURPRISE2 = null;
        public static final SoundEvent SURPRISE3 = null;
        public static final SoundEvent SURPRISE4 = null;
        public static final SoundEvent WONDER1 = null;
        public static final SoundEvent WONDER2 = null;
        public static final SoundEvent WONDER3 = null;
        public static final SoundEvent WONDER4 = null;
        public static final SoundEvent WONDER5 = null;
        public static final SoundEvent WONDER6 = null;
        public static final SoundEvent WONDER7 = null;
        public static final SoundEvent WONDER8 = null;
        public static final SoundEvent WONDER9 = null;
        public static final SoundEvent WONDER10 = null;
    }

    @EventBusSubscriber
    public static class Registry {

        public static final ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
        static int id = -1;

        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> e) {
            final Block[] blocks = {
                    new BlockSecret("secret"),
                    new BlockStateCell("state_cell"),
                    new BlockSpikes("spikes"),
                    new BlockMusicPlayer("music_player"),
                    new BlockPetrolPump("petrol_pump"),
                    new BlockFuelMaker("fuel_maker")
            };
            e.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> e) {
            final Item[] items = {
                    new ItemFuelCan("fuel_can"),
                    new ItemVehicleSpawner("spawn_beamers120",(w, p) -> w.spawnEntity(new VehicleBeamerS120(w, p))),
                    new ItemVehicleSpawner("spawn_fedorattivulcan", (w, p) -> w.spawnEntity(new VehicleFedorattiVulcan(w, p))),
                    new ItemVehicleSpawner("spawn_tracert1", (w, p) -> w.spawnEntity(new VehicleTracerT1(w, p))),
                    new ItemVehicleSpawner("spawn_sputnik2000l", (w, p) -> w.spawnEntity(new VehicleSputnik2000L(w, p))),
                    new VMItem("empty_spray_can"),
                    new ItemRepairKit("repair_kit"),
                    new VMItem("bucket_of_liquid_coal").setMaxStackSize(1),
                    new VMItem("bucket_of_activated_fuel_substance").setMaxStackSize(1),
                    new VMItem("bucket_of_fuel").setMaxStackSize(1),
                    new VMItem("fuel_filter").setMaxDamage(75).setMaxStackSize(1)
            };
            for (int i = 0; i < EnumDyeColor.values().length; i++) {
                EnumDyeColor color = EnumDyeColor.values()[i];
                e.getRegistry().register(new ItemSprayCan(color.getName() + "_spray_can", color));
            }
            e.getRegistry().registerAll(items);
            registerAll(e, ITEM_BLOCKS);
        }

        @SubscribeEvent
        public static void onEntityRegister(RegistryEvent.Register<EntityEntry> e) {
            final EntityEntry[] entries = {
                    registerVehicle("beamer_s120", VehicleBeamerS120.class),
                    registerVehicle("fedoratti_vulcan", VehicleFedorattiVulcan.class),
                    registerVehicle("tracer_t1", VehicleTracerT1.class),
                    registerVehicle("sputnik_2000l", VehicleSputnik2000L.class)
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
                    registerSound("beamer_start"),
                    registerSound("fedoratti_acc"),
                    registerSound("fedoratti_brake"),
                    registerSound("fedoratti_gas"),
                    registerSound("fedoratti_start"),
                    registerSound("tracer_acc"),
                    registerSound("tracer_brake"),
                    registerSound("tracer_gas"),
                    registerSound("tracer_start"),
                    registerSound("sputnik_acc"),
                    registerSound("sputnik_brake"),
                    registerSound("sputnik_gas"),
                    registerSound("sputnik_start"),
                    registerSound("danger1"),
                    registerSound("danger2"),
                    registerSound("danger3"),
                    registerSound("danger4"),
                    registerSound("danger5"),
                    registerSound("danger6"),
                    registerSound("danger7"),
                    registerSound("danger8"),
                    registerSound("danger9"),
                    registerSound("relaxed1"),
                    registerSound("relaxed2"),
                    registerSound("rhytmic1"),
                    registerSound("rhytmic2"),
                    registerSound("surprise1"),
                    registerSound("surprise2"),
                    registerSound("surprise3"),
                    registerSound("surprise4"),
                    registerSound("wonder1"),
                    registerSound("wonder2"),
                    registerSound("wonder3"),
                    registerSound("wonder4"),
                    registerSound("wonder5"),
                    registerSound("wonder6"),
                    registerSound("wonder7"),
                    registerSound("wonder8"),
                    registerSound("wonder9"),
                    registerSound("wonder10"),
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

        public static void registerMusicEntries() {
            registerMusicEntry(VMSounds.DANGER1, 15);
            registerMusicEntry(VMSounds.DANGER2, 79);
            registerMusicEntry(VMSounds.DANGER3, 12);
            registerMusicEntry(VMSounds.DANGER4, 17);
            registerMusicEntry(VMSounds.DANGER5, 22);
            registerMusicEntry(VMSounds.DANGER6, 67);
            registerMusicEntry(VMSounds.DANGER7, 37);
            registerMusicEntry(VMSounds.DANGER8, 6);
            registerMusicEntry(VMSounds.DANGER9, 13);
            registerMusicEntry(VMSounds.RELAXED1, 61);
            registerMusicEntry(VMSounds.RELAXED2, 19);
            registerMusicEntry(VMSounds.RHYTMIC1, 146);
            registerMusicEntry(VMSounds.RHYTMIC2, 99);
            registerMusicEntry(VMSounds.SURPRISE1, 22);
            registerMusicEntry(VMSounds.SURPRISE2, 6);
            registerMusicEntry(VMSounds.SURPRISE3, 11);
            registerMusicEntry(VMSounds.SURPRISE4, 11);
            registerMusicEntry(VMSounds.WONDER1, 18);
            registerMusicEntry(VMSounds.WONDER2, 139);
            registerMusicEntry(VMSounds.WONDER3, 31);
            registerMusicEntry(VMSounds.WONDER4, 31);
            registerMusicEntry(VMSounds.WONDER5, 25);
            registerMusicEntry(VMSounds.WONDER6, 18);
            registerMusicEntry(VMSounds.WONDER7, 11);
            registerMusicEntry(VMSounds.WONDER8, 39);
            registerMusicEntry(VMSounds.WONDER9, 15);
            registerMusicEntry(VMSounds.WONDER10, 11);
            VehicleMod.logger.info("Registered {} music entries", BlockMusicPlayer.SONGS.size());
        }

        private static void registerMusicEntry(SoundEvent e, int time) {
            MusicEntry.registerMusicEntry(e, time);
        }

        private static <E extends IForgeRegistryEntry<E>, T extends E> void registerAll(RegistryEvent.Register<E> event, Collection<T> collection) {
            for (T t : collection) {
                event.getRegistry().register(t);
            }
        }
    }

    @EventBusSubscriber(Side.CLIENT)
    public static class ModelRegistry {

        @SubscribeEvent
        public static void onModelRegister(ModelRegistryEvent e) {
            final IForgeRegistry<Item> ITEMS = ForgeRegistries.ITEMS;
            final IForgeRegistry<Block> BLOCKS = ForgeRegistries.BLOCKS;

            for (ResourceLocation rl : ITEMS.getKeys()) {
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.Constants.ID)) {
                    registerModel(ITEMS.getValue(rl));
                }
            }

            for (ResourceLocation rl : BLOCKS.getKeys()) {
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.Constants.ID)) {
                    registerModel(Item.getItemFromBlock(BLOCKS.getValue(rl)));
                }
            }
        }

        private static void registerModel(Item item) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
