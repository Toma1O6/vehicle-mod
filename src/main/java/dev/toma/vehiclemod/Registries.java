package dev.toma.vehiclemod;

import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.blocks.fuel.BlockFuelMaker;
import dev.toma.vehiclemod.common.items.*;
import dev.toma.vehiclemod.vehicle.entity.*;
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

    @ObjectHolder(VehicleMod.MODID)
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
        public static final ItemSpecialSprayCan SPECIAL_SPRAY_CAN = null;
        public static final ItemRepairKit IRON_REPAIR_KIT = null;
        public static final ItemRepairKit GOLD_REPAIR_KIT = null;
        public static final ItemRepairKit DIAMOND_REPAIR_KIT = null;
        public static final ItemRepairKit EMERALD_REPAIR_KIT = null;
        public static final ItemRepairKit REDSTONE_REPAIR_KIT = null;
        public static final ItemRepairKit OBSIDIAN_REPAIR_KIT = null;
        public static final VMItem BUCKET_OF_LIQUID_COAL = null;
        public static final VMItem BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE = null;
        public static final VMItem BUCKET_OF_FUEL = null;
        public static final VMItem FUEL_FILTER = null;
    }

    @ObjectHolder(VehicleMod.MODID)
    public static final class VMBlocks {
        public static final BlockPetrolPump PETROL_PUMP = null;
        public static final BlockFuelMaker FUEL_MAKER = null;
    }

    @ObjectHolder(VehicleMod.MODID)
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
        public static final SoundEvent BEAMERB1_ACC = null;
        public static final SoundEvent BEAMERB1_BRAKE = null;
        public static final SoundEvent BEAMERB1_GAS = null;
        public static final SoundEvent BEAMERB1_START = null;
        public static final SoundEvent MCGMV_ACC = null;
        public static final SoundEvent MCGMV_BRAKE = null;
        public static final SoundEvent MCGMV_GAS = null;
        public static final SoundEvent MCGMV_START = null;
        public static final SoundEvent BEAMERPICKUP_ACC = null;
        public static final SoundEvent BEAMERPICKUP_BRAKE = null;
        public static final SoundEvent BEAMERPICKUP_GAS = null;
        public static final SoundEvent BEAMERPICKUP_START = null;
        public static final SoundEvent SPUTNIK3_ACC = null;
        public static final SoundEvent SPUTNIK3_BRAKE = null;
        public static final SoundEvent SPUTNIK3_GAS = null;
        public static final SoundEvent SPUTNIK3_START = null;
    }

    @EventBusSubscriber
    public static class Registry {

        public static ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
        static int id = -1;

        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> e) {
            e.getRegistry().registerAll(
                    new BlockPetrolPump("petrol_pump"),
                    new BlockFuelMaker("fuel_maker")
            );
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> e) {
            IForgeRegistry<Item> registry = e.getRegistry();
            registry.registerAll(
                    new ItemFuelCan("fuel_can"),
                    new ItemVehicleSpawner("spawn_beamers120", (w, p) -> w.spawnEntity(new VehicleBeamerS120(w, p))),
                    new ItemVehicleSpawner("spawn_fedorattivulcan", (w, p) -> w.spawnEntity(new VehicleFedorattiVulcan(w, p))),
                    new ItemVehicleSpawner("spawn_tracert1", (w, p) -> w.spawnEntity(new VehicleTracerT1(w, p))),
                    new ItemVehicleSpawner("spawn_sputnik2000l", (w, p) -> w.spawnEntity(new VehicleSputnik2000L(w, p))),
                    new ItemVehicleSpawner("spawn_beamers320rs", (w, p) -> w.spawnEntity(new VehicleBeamerS320RS(w, p))),
                    new ItemVehicleSpawner("spawn_mcgmultivan", (w, p) -> w.spawnEntity(new VehicleMCGMultiVan(w, p))),
                    new ItemVehicleSpawner("spawn_beamerpickup", (w, p) -> w.spawnEntity(new VehicleBeamerPickup(w, p))),
                    new ItemVehicleSpawner("spawn_sputnik3000l", (world, pos) -> world.spawnEntity(new VehicleSputnik3000L(world, pos))),
                    new ItemVehicleSpawner("spawn_sputnik3000lenf", (world, pos) -> world.spawnEntity(new VehicleSputnik3000LEnforcer(world, pos))),
                    new VMItem("empty_spray_can"),
                    new VMItem("bucket_of_liquid_coal"),
                    new VMItem("bucket_of_activated_fuel_substance"),
                    new VMItem("bucket_of_fuel"),
                    new VMItem("fuel_filter"),
                    new ItemSpecialSprayCan("birch"),
                    new ItemSpecialSprayCan("brick"),
                    new ItemSpecialSprayCan("diorite"),
                    new ItemSpecialSprayCan("hell"),
                    new ItemSpecialSprayCan("iron"),
                    new ItemSpecialSprayCan("lapis"),
                    new ItemSpecialSprayCan("prismarine"),
                    new ItemSpecialSprayCan("rust"),
                    new ItemSpecialSprayCan("wood_dark"),
                    new ItemSpecialSprayCan("wood_light"),
                    new ItemSpecialSprayCan("wood")
            );
            for (int i = 0; i < EnumDyeColor.values().length; i++) {
                EnumDyeColor color = EnumDyeColor.values()[i];
                registry.register(new ItemSprayCan(color.getName() + "_spray_can", color));
            }
            for (ItemRepairKit.Tier tier : ItemRepairKit.Tier.values()) {
                registry.register(new ItemRepairKit("repair_kit", tier));
            }
            ITEM_BLOCKS.forEach(registry::register);
            ITEM_BLOCKS = null;
        }

        @SubscribeEvent
        public static void onEntityRegister(RegistryEvent.Register<EntityEntry> e) {
            e.getRegistry().registerAll(
                    registerVehicle("beamer_s120", VehicleBeamerS120.class),
                    registerVehicle("fedoratti_vulcan", VehicleFedorattiVulcan.class),
                    registerVehicle("tracer_t1", VehicleTracerT1.class),
                    registerVehicle("sputnik_2000l", VehicleSputnik2000L.class),
                    registerVehicle("beamer_s320rs", VehicleBeamerS320RS.class),
                    registerVehicle("mcg_multivan", VehicleMCGMultiVan.class),
                    registerVehicle("beamer_pickup", VehicleBeamerPickup.class),
                    registerVehicle("sputnik_3000l", VehicleSputnik3000L.class),
                    registerVehicle("sputnik_3000lenf", VehicleSputnik3000LEnforcer.class)
            );
        }

        @SubscribeEvent
        public static void onSoundRegister(RegistryEvent.Register<SoundEvent> e) {
            e.getRegistry().registerAll(
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
                    registerSound("beamerb1_acc"),
                    registerSound("beamerb1_brake"),
                    registerSound("beamerb1_gas"),
                    registerSound("beamerb1_start"),
                    registerSound("mcgmv_acc"),
                    registerSound("mcgmv_brake"),
                    registerSound("mcgmv_gas"),
                    registerSound("mcgmv_start"),
                    registerSound("beamerpickup_acc"),
                    registerSound("beamerpickup_brake"),
                    registerSound("beamerpickup_gas"),
                    registerSound("beamerpickup_start"),
                    registerSound("sputnik3_acc"),
                    registerSound("sputnik3_brake"),
                    registerSound("sputnik3_gas"),
                    registerSound("sputnik3_start")
            );
        }

        private static SoundEvent registerSound(String name) {
            SoundEvent sound = new SoundEvent(new ResourceLocation(VehicleMod.MODID, name));
            sound.setRegistryName(name);
            return sound;
        }

        private static EntityEntry registerVehicle(String name, Class<? extends EntityVehicle> cls) {
            return createBuilder(name).entity(cls).tracker(256, 1, true).build();
        }

        private static <E extends Entity> EntityEntryBuilder<E> createBuilder(String name) {
            EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
            ResourceLocation rl = new ResourceLocation(VehicleMod.MODID, name);
            return builder.id(rl, id++).name(rl.toString());
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
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    registerModel(ITEMS.getValue(rl));
                }
            }

            for (ResourceLocation rl : BLOCKS.getKeys()) {
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    registerModel(Item.getItemFromBlock(BLOCKS.getValue(rl)));
                }
            }
        }

        private static void registerModel(Item item) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
