package dev.toma.vehiclemod;

import dev.toma.vehiclemod.client.model.DummyBakedModel;
import dev.toma.vehiclemod.client.render.item.RenderItemSpawner;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.blocks.BlockSecret;
import dev.toma.vehiclemod.common.blocks.BlockTunerPackage;
import dev.toma.vehiclemod.common.blocks.fuel.BlockFuelMaker;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.EnumCarLockType;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerJester;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerT1;
import dev.toma.vehiclemod.common.entity.vehicle.special.*;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP3;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP9X;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleProtonP1;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiNightStalker;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleTracerOutlander;
import dev.toma.vehiclemod.common.fluids.FluidItemBehavior;
import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.common.items.*;
import dev.toma.vehiclemod.common.tunning.StatModifierType;
import dev.toma.vehiclemod.init.FluidTypes;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.IRegistry;
import net.minecraftforge.client.event.ModelBakeEvent;
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
import net.minecraftforge.registries.RegistryBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class Registries {

    public static IForgeRegistry<FluidType> FLUID_TYPES;

    @ObjectHolder(VehicleMod.MODID)
    public static final class VMItems {
        public static final Item FUEL_CAN = null;
        public static final VMItem EMPTY_SPRAY_CAN = null;
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
        public static final ItemLockpick LOCKPICK = null;
        public static final ItemCarKey CAR_KEY = null;
        public static final ItemCarLock IRON_CAR_LOCK = null;
        public static final ItemCarLock GOLD_CAR_LOCK = null;
        public static final ItemCarLock DIAMOND_CAR_LOCK = null;
        public static final ItemVehicleUpgrade ENGINE_7 = null;
        public static final ItemNeon NEON_TUBE_RED = null;
        public static final ItemNitroCan NITRO_BOTTLE_100 = null;
        public static final ItemNitroCloudLED NITRO_LED = null;
    }

    @ObjectHolder(VehicleMod.MODID)
    public static final class VMBlocks {
        public static final BlockPetrolPump PETROL_PUMP = null;
        public static final BlockFuelMaker FUEL_MAKER = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_BRONZE = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_SILVER = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_GOLDEN = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_PLATINUM = null;
        public static final BlockSecret SECRET_1 = null;
        public static final BlockSecret SECRET_2 = null;
        public static final BlockSecret SECRET_3 = null;
        public static final BlockSecret SECRET_4 = null;
        public static final BlockSecret SECRET_5 = null;
        public static final BlockSecret SECRET_6 = null;
        public static final BlockTunerPackage BRONZE_TUNER_PACKAGE = null;
        public static final BlockTunerPackage SILVER_TUNER_PACKAGE = null;
        public static final BlockTunerPackage GOLDEN_TUNER_PACKAGE = null;
        public static final BlockTunerPackage PLATINUM_TUNER_PACKAGE = null;
    }

    @EventBusSubscriber
    public static class Registry {

        public static ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
        static int id = 0;

        @SubscribeEvent
        public static void makeRegistries(RegistryEvent.NewRegistry event) {
            FLUID_TYPES = new RegistryBuilder<FluidType>().setName(VehicleMod.getResource("fluid_types")).setType(FluidType.class).setMaxID(Integer.MAX_VALUE - 1).create();
        }

        @SubscribeEvent
        public static void onFluidTypeRegister(RegistryEvent.Register<FluidType> event) {
            event.getRegistry().registerAll(
                    new FluidType.Builder().behavior(new FluidItemBehavior.Bucket(VMItems.BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE)).processInto(() -> FluidTypes.FUEL, 10000, 20000, 600).fluidColor(0xA53344).build().setRegistryName("activated_fuel_substance"),
                    new FluidType.Builder().behavior(new FluidItemBehavior.Bucket(VMItems.BUCKET_OF_FUEL)).processInto(() -> FluidTypes.NITRO, 2500, 10000, 1200).fluidColor(0xFFFF00).build().setRegistryName("fuel"),
                    new FluidType.Builder().behavior(new FluidItemBehavior.Nitro()).fluidColor(0x00FFFF).build().setRegistryName("nitro")
            );
        }

        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> e) {
            IForgeRegistry<Block> registry = e.getRegistry();
            registry.registerAll(
                    new BlockPetrolPump("petrol_pump"),
                    new BlockFuelMaker("fuel_maker"),
                    new BlockSecret("secret_1"),
                    new BlockSecret("secret_2"),
                    new BlockSecret("secret_3"),
                    new BlockSecret("secret_4"),
                    new BlockSecret("secret_5"),
                    new BlockSecret("secret_6"),
                    new BlockTunerPackage("bronze_tuner_package", 0),
                    new BlockTunerPackage("silver_tuner_package", 1),
                    new BlockTunerPackage("golden_tuner_package", 2),
                    new BlockTunerPackage("platinum_tuner_package", 3)
            );
            for (BlockMechanicPackage.Variant variant : BlockMechanicPackage.Variant.values()) {
                registry.register(new BlockMechanicPackage(variant));
            }
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> e) {
            IForgeRegistry<Item> registry = e.getRegistry();
            registry.registerAll(
                    new ItemFuelCan("fuel_can"),
                    new ItemVehicleSpawner<>("spawn_beamers120", VehicleBeamerS120.class, VehicleBeamerS120::new),
                    new ItemVehicleSpawner<>("spawn_fedorattivulcan", VehicleFedorattiVulcan.class, VehicleFedorattiVulcan::new),
                    new ItemVehicleSpawner<>("spawn_tracert1", VehicleTracerT1.class, VehicleTracerT1::new),
                    new ItemVehicleSpawner<>("spawn_sputnik2000l", VehicleSputnik2000L.class, VehicleSputnik2000L::new),
                    new ItemVehicleSpawner<>("spawn_beamers320rs", VehicleBeamerS320RS.class, VehicleBeamerS320RS::new),
                    new ItemVehicleSpawner<>("spawn_mcgmultivan", VehicleMCGMultiVan.class, VehicleMCGMultiVan::new),
                    new ItemVehicleSpawner<>("spawn_beamerpickup", VehicleBeamerPickup.class, VehicleBeamerPickup::new),
                    new ItemVehicleSpawner<>("spawn_sputnik3000l", VehicleSputnik3000L.class, VehicleSputnik3000L::new),
                    new ItemVehicleSpawner<>("spawn_sputnik3000lenf", VehicleSputnik3000LEnforcer.class, VehicleSputnik3000LEnforcer::new),
                    new ItemVehicleSpawner<>("spawn_sputnikduster", VehicleSputnikDuster.class, VehicleSputnikDuster::new),
                    new ItemVehicleSpawner<>("spawn_fedorattinightstalker", VehicleFedorattiNightStalker.class, VehicleFedorattiNightStalker::new),
                    new ItemVehicleSpawner<>("spawn_protonp1", VehicleProtonP1.class, VehicleProtonP1::new),
                    new ItemVehicleSpawner<>("spawn_protonp3", VehicleProtonP3.class, VehicleProtonP3::new),
                    new ItemVehicleSpawner<>("spawn_mcgambulance", VehicleMcgAmbulance.class, VehicleMcgAmbulance::new),
                    new ItemVehicleSpawner<>("spawn_mcgfiretruck", VehicleMcgFiretruck.class, VehicleMcgFiretruck::new),
                    new ItemVehicleSpawner<>("spawn_traceroutlander", VehicleTracerOutlander.class, VehicleTracerOutlander::new),
                    new ItemVehicleSpawner<>("spawn_tracerjester", VehicleTracerJester.class, VehicleTracerJester::new),
                    new ItemVehicleSpawner<>("spawn_protonp9x", VehicleProtonP9X.class, VehicleProtonP9X::new),
                    new VMItem("bucket_of_liquid_coal"),
                    new ItemFluidBucket("bucket_of_activated_fuel_substance", () -> FluidTypes.ACTIVATED_FUEL_SUBSTANCE),
                    new ItemFluidBucket("bucket_of_fuel", () -> FluidTypes.FUEL),
                    new ItemFuelFilter("fuel_filter"),
                    new ItemLockpick("lockpick"),
                    new ItemCarKey("car_key"),
                    new ItemCarLock("iron_car_lock", EnumCarLockType.IRON),
                    new ItemCarLock("gold_car_lock", EnumCarLockType.GOLD),
                    new ItemCarLock("diamond_car_lock", EnumCarLockType.DIAMOND),
                    new ItemPerk("bronze_acceleration_perk", StatModifierType.ACCELERATION, 0.02F),
                    new ItemPerk("silver_acceleration_perk", StatModifierType.ACCELERATION, 0.04F),
                    new ItemPerk("gold_acceleration_perk", StatModifierType.ACCELERATION, 0.06F),
                    new ItemPerk("bronze_brakes_perk", StatModifierType.BRAKING, 0.02F),
                    new ItemPerk("silver_brakes_perk", StatModifierType.BRAKING, 0.04F),
                    new ItemPerk("gold_brakes_perk", StatModifierType.BRAKING, 0.06F),
                    new ItemPerk("bronze_durability_perk", StatModifierType.DURABILITY, 0.03F),
                    new ItemPerk("silver_durability_perk", StatModifierType.DURABILITY, 0.06F),
                    new ItemPerk("gold_durability_perk", StatModifierType.DURABILITY, 0.1F),
                    new ItemPerk("bronze_handling_perk", StatModifierType.HANDLING, 0.02F),
                    new ItemPerk("silver_handling_perk", StatModifierType.HANDLING, 0.04F),
                    new ItemPerk("gold_handling_perk", StatModifierType.HANDLING, 0.06F),
                    new ItemPerk("bronze_speed_perk", StatModifierType.TOP_SPEED, 0.01F),
                    new ItemPerk("silver_speed_perk", StatModifierType.TOP_SPEED, 0.03F),
                    new ItemPerk("gold_speed_perk", StatModifierType.TOP_SPEED, 0.05F),
                    new ItemPerk("bronze_tank_perk", StatModifierType.FUEL_CAPACITY, 0.03F),
                    new ItemPerk("silver_tank_perk", StatModifierType.FUEL_CAPACITY, 0.06F),
                    new ItemPerk("gold_tank_perk", StatModifierType.FUEL_CAPACITY, 0.1F),
                    new ItemPerk("bronze_nitro_perk", StatModifierType.NITRO_POWER, 0.04F),
                    new ItemPerk("silver_nitro_perk", StatModifierType.NITRO_POWER, 0.07F),
                    new ItemPerk("gold_nitro_perk", StatModifierType.NITRO_POWER, 0.10F),
                    new ItemNitroCan("nitro_bottle_25", 0, 2500, 40, () -> VMSounds.NITRO_A),
                    new ItemNitroCan("nitro_bottle_50", 1, 5000, 60, () -> VMSounds.NITRO_A),
                    new ItemNitroCan("nitro_bottle_75", 2, 7500, 80, () -> VMSounds.NITRO_B),
                    new ItemNitroCan("nitro_bottle_100", 3, 10000, 100, () -> VMSounds.NITRO_B),
                    new ItemNeon("neon_tube_blue", 0, 0x0000ff),
                    new ItemNeon("neon_tube_green", 0, 0x00ff2e),
                    new ItemNeon("neon_tube_red", 0, 0xff0000),
                    new ItemNeon("neon_tube_yellow", 0, 0xffff0c),
                    new ItemNitroCloud("nitro_cloud_spray_blue", 0, 0x0000cc),
                    new ItemNitroCloud("nitro_cloud_spray_green", 0, 0x0a7f1e),
                    new ItemNitroCloud("nitro_cloud_spray_red", 0, 0xcc0000),
                    new ItemNitroCloud("nitro_cloud_spray_yellow", 0, 0xffff44),
                    new ItemNeon("neon_tube_brown", 1, 0x895000),
                    new ItemNeon("neon_tube_ice", 1, 0x93ceff),
                    new ItemNeon("neon_tube_lime", 1, 0x7fff00),
                    new ItemNeon("neon_tube_pink", 1, 0xffaadd),
                    new ItemNitroCloud("nitro_cloud_spray_brown", 1, 0x442b0b),
                    new ItemNitroCloud("nitro_cloud_spray_light_blue", 1, 0x70beff),
                    new ItemNitroCloud("nitro_cloud_spray_silver", 1, 0xa5a5a5),
                    new ItemNitroCloud("nitro_cloud_spray_pink", 1, 0xff8ceb),
                    new ItemNeonPulser("neon_pulser_slow", 1, 100),
                    new ItemNeon("neon_tube_magenta", 2, 0xff00e9),
                    new ItemNeon("neon_tube_orange", 2, 0xff6e00),
                    new ItemNeon("neon_tube_teal", 2, 0x00ffae),
                    new ItemNeon("neon_tube_white", 2, 0xffffff),
                    new ItemNitroCloud("nitro_cloud_spray_black", 2, 0x202020),
                    new ItemNitroCloud("nitro_cloud_spray_lime", 2, 0x66ff44),
                    new ItemNitroCloud("nitro_cloud_spray_orange", 2, 0xe56e00),
                    new ItemNitroCloud("nitro_cloud_spray_white", 2, 0xe5e5e5),
                    new ItemNeonPulser("neon_pulser_fast", 3, 30),
                    new ItemNeon("neon_tube_cyan", 3, 0x46c6e2),
                    new ItemNeon("neon_tube_gold", 3, 0xffbb00),
                    new ItemNeon("neon_tube_purple", 3, 0x8c00ff),
                    new ItemNeon("neon_tube_ruby", 3, 0xff0046),
                    new ItemNitroCloud("nitro_cloud_spray_cyan", 3, 0x39bfb1),
                    new ItemNitroCloud("nitro_cloud_spray_gold", 3, 0xd1ab21),
                    new ItemNitroCloud("nitro_cloud_spray_purple", 3, 0x5200a5),
                    new ItemNitroCloud("nitro_cloud_spray_ruby", 3, 0xbf0046),
                    new ItemNitroCloudLED("nitro_led"),
                    new ItemWrench("wrench"),
                    new ItemTrackManager<>("track_radius_add", new ItemTrackManager.RadiusChangeAction(1)),
                    new ItemTrackManager<>("track_radius_subtract", new ItemTrackManager.RadiusChangeAction(-1)),
                    new ItemTrackManager<>("track_rotate_startpoint", new ItemTrackManager.RotatePoint()),
                    new ItemTrackManager<>("track_remove_startpoint", new ItemTrackManager.DeleteStartingPoint()),
                    new ItemTrackManager<>("track_remove_checkpoint", new ItemTrackManager.DeleteCheckpoint()),
                    new ItemTrackManager<>("track_toggle_loop", new ItemTrackManager.ToggleLoop()),
                    new ItemTrackManager<>("track_change_style", new ItemTrackManager.ChangeCheckpointStyle()),
                    new ItemTrackDebug("toggle_track_render"),
                    new VMItem("empty_spray_can")
            );
            for (int i = 0; i < VehicleStyle.Texture.values().length; i++) {
                VehicleStyle.Texture texture = VehicleStyle.Texture.values()[i];
                if(texture.isIgnored())
                    continue;
                registry.register(new ItemSprayCan(texture.name().toLowerCase() + "_spray_can", texture));
            }
            for (ItemRepairKit.Tier tier : ItemRepairKit.Tier.values()) {
                registry.register(new ItemRepairKit("repair_kit", tier));
            }
            for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
                for (int i = 0; i < 8; i++) {
                    registry.register(new ItemVehicleUpgrade(type, i));
                }
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
                    registerVehicle("sputnik_3000lenf", VehicleSputnik3000LEnforcer.class),
                    registerVehicle("sputnik_duster", VehicleSputnikDuster.class),
                    registerVehicle("fedoratti_nighstalker", VehicleFedorattiNightStalker.class),
                    registerVehicle("proton_p1", VehicleProtonP1.class),
                    registerVehicle("proton_p3", VehicleProtonP3.class),
                    registerVehicle("mcg_ambulance", VehicleMcgAmbulance.class),
                    registerVehicle("mcg_firetruck", VehicleMcgFiretruck.class),
                    registerVehicle("tracer_outlander", VehicleTracerOutlander.class),
                    registerVehicle("tracer_jester", VehicleTracerJester.class),
                    registerVehicle("proton_p9x", VehicleProtonP9X.class)
            );
        }

        @SubscribeEvent
        public static void onSoundRegister(RegistryEvent.Register<SoundEvent> e) {
            e.getRegistry().registerAll(
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
                    registerSound("sputnik3_start"),
                    registerSound("sputnik_duster_acc"),
                    registerSound("sputnik_duster_brake"),
                    registerSound("sputnik_duster_gas"),
                    registerSound("sputnik_duster_start"),
                    registerSound("fedoratti_nightstalker_acc"),
                    registerSound("fedoratti_nightstalker_brake"),
                    registerSound("fedoratti_nightstalker_gas"),
                    registerSound("fedoratti_nightstalker_start"),
                    registerSound("proton_p1_acc"),
                    registerSound("proton_p1_brake"),
                    registerSound("proton_p1_gas"),
                    registerSound("proton_p1_start"),
                    registerSound("proton_p3_acc"),
                    registerSound("proton_p3_brake"),
                    registerSound("proton_p3_gas"),
                    registerSound("proton_p3_start"),
                    registerSound("secret"),
                    registerSound("lock_unlocked"),
                    registerSound("lockpick_success"),
                    registerSound("lockpick_failed"),
                    registerSound("lockpick_failed_af"),
                    registerSound("mcg_ambulance_acc"),
                    registerSound("mcg_ambulance_brake"),
                    registerSound("mcg_ambulance_gas"),
                    registerSound("mcg_ambulance_start"),
                    registerSound("mcg_firetruck_acc"),
                    registerSound("mcg_firetruck_brake"),
                    registerSound("mcg_firetruck_gas"),
                    registerSound("mcg_firetruck_start"),
                    registerSound("tracer_outlander_acc"),
                    registerSound("tracer_outlander_brake"),
                    registerSound("tracer_outlander_gas"),
                    registerSound("tracer_outlander_start"),
                    registerSound("tracer_jester_acc"),
                    registerSound("tracer_jester_brake"),
                    registerSound("tracer_jester_gas"),
                    registerSound("tracer_jester_start"),
                    registerSound("proton_p9x_acc"),
                    registerSound("proton_p9x_brake"),
                    registerSound("proton_p9x_gas"),
                    registerSound("proton_p9x_start"),
                    registerSound("car_locked"),
                    registerSound("car_unlocked"),
                    registerSound("police_siren"),
                    registerSound("ambulance_siren"),
                    registerSound("firetruck_siren"),
                    registerSound("horn_1"),
                    registerSound("horn_2"),
                    registerSound("horn_3"),
                    registerSound("horn_4"),
                    registerSound("horn_5"),
                    registerSound("horn_6"),
                    registerSound("horn_7"),
                    registerSound("horn_8"),
                    registerSound("horn_9"),
                    registerSound("horn_10"),
                    registerSound("horn_11"),
                    registerSound("horn_12"),
                    registerSound("horn_13"),
                    registerSound("horn_14"),
                    registerSound("horn_15"),
                    registerSound("horn_16s"),
                    registerSound("horn_17s"),
                    registerSound("horn_18s"),
                    registerSound("horn_19s"),
                    registerSound("horn_20s"),
                    registerSound("horn_21s"),
                    registerSound("horn_22s"),
                    registerSound("horn_23s"),
                    registerSound("horn_24s"),
                    registerSound("horn_25s"),
                    registerSound("horn_26s"),
                    registerSound("horn_27s"),
                    registerSound("horn_28s"),
                    registerSound("horn_29s"),
                    registerSound("car_start_a"),
                    registerSound("car_start_b"),
                    registerSound("car_start_c"),
                    registerSound("car_start_d"),
                    registerSound("car_start_e"),
                    registerSound("car_start_f"),
                    registerSound("car_start_g"),
                    registerSound("indicator_on"),
                    registerSound("indicator_off"),
                    registerSound("nitro_start"),
                    registerSound("nitro_end"),
                    registerSound("nitro_a"),
                    registerSound("nitro_b"),
                    registerSound("nitro_cloud")
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
            RenderItemSpawner renderItemSpawner = new RenderItemSpawner();
            for (ResourceLocation rl : ITEMS.getKeys()) {
                Item item = ITEMS.getValue(rl);
                if(item instanceof ItemVehicleSpawner) {
                    item.setTileEntityItemStackRenderer(renderItemSpawner);
                }
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    registerModel(item);
                }
            }
            for (ResourceLocation rl : BLOCKS.getKeys()) {
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    registerModel(Item.getItemFromBlock(BLOCKS.getValue(rl)));
                }
            }
        }

        @SubscribeEvent
        public static void bakeModels(ModelBakeEvent event) {
            IRegistry<ModelResourceLocation, IBakedModel> modelRegistry = event.getModelRegistry();
            DummyBakedModel bakedModelInstance = new DummyBakedModel();
            ForgeRegistries.ITEMS.getValuesCollection().stream()
                    .filter(it -> it instanceof ItemVehicleSpawner)
                    .forEach(it -> modelRegistry.putObject(getModelResourceLocation(it), bakedModelInstance));
        }

        private static ModelResourceLocation getModelResourceLocation(Item item) {
            return new ModelResourceLocation(item.getRegistryName(), "inventory");
        }

        private static void registerModel(Item item) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
