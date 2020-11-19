package dev.toma.vehiclemod;

import dev.toma.vehiclemod.client.model.DummyBakedModel;
import dev.toma.vehiclemod.client.render.item.RenderItemSpawner;
import dev.toma.vehiclemod.common.blocks.BlockMechanicPackage;
import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.blocks.BlockSecret;
import dev.toma.vehiclemod.common.blocks.fuel.BlockFuelMaker;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EnumCarLockType;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerT1;
import dev.toma.vehiclemod.common.entity.vehicle.special.*;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiNightStalker;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP1Tunned;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleProtonP1;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import dev.toma.vehiclemod.common.items.*;
import dev.toma.vehiclemod.common.tunning.StatModifierType;
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

import java.util.ArrayList;
import java.util.Collection;

public class Registries {

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
    }

    @ObjectHolder(VehicleMod.MODID)
    public static final class VMBlocks {
        public static final BlockPetrolPump PETROL_PUMP = null;
        public static final BlockFuelMaker FUEL_MAKER = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_BRONZE = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_SILVER = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_GOLDEN = null;
        public static final BlockMechanicPackage MECHANIC_PACKAGE_PLATINUM = null;
        public static final BlockSecret SECRET = null;
    }

    @EventBusSubscriber
    public static class Registry {

        public static ArrayList<ItemBlock> ITEM_BLOCKS = new ArrayList<>();
        static int id = 0;

        @SubscribeEvent
        public static void onBlockRegister(RegistryEvent.Register<Block> e) {
            IForgeRegistry<Block> registry = e.getRegistry();
            registry.registerAll(
                    new BlockPetrolPump("petrol_pump"),
                    new BlockFuelMaker("fuel_maker"),
                    new BlockSecret("secret")
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
                    new ItemVehicleSpawner<>("spawn_protonp1tunned", VehicleProtonP1Tunned.class, VehicleProtonP1Tunned::new),
                    new ItemVehicleSpawner<>("spawn_sputnikambulance", VehicleSputnikAmbulance.class, VehicleSputnikAmbulance::new),
                    new ItemVehicleSpawner<>("spawn_sputnikfiretruck", VehicleSputnikFiretruck.class, VehicleSputnikFiretruck::new),
                    new VMItem("bucket_of_liquid_coal"),
                    new VMItem("bucket_of_activated_fuel_substance"),
                    new VMItem("bucket_of_fuel"),
                    new VMItem("fuel_filter"),
                    new ItemLockpick("lockpick"),
                    new ItemCarKey("car_key"),
                    new ItemCarLock("iron_car_lock", EnumCarLockType.IRON),
                    new ItemCarLock("gold_car_lock", EnumCarLockType.GOLD),
                    new ItemCarLock("diamond_car_lock", EnumCarLockType.DIAMOND),
                    new ItemPerk("bronze_acceleration_perk", StatModifierType.ACCELERATION, 0.02F),
                    new ItemPerk("silver_acceleration_perk", StatModifierType.ACCELERATION, 0.04F),
                    new ItemPerk("gold_acceleration_perk", StatModifierType.ACCELERATION, 0.06F),
                    new ItemPerk("bronze_brakes_perk", StatModifierType.BRAKING, 0.03F),
                    new ItemPerk("silver_brakes_perk", StatModifierType.BRAKING, 0.06F),
                    new ItemPerk("gold_brakes_perk", StatModifierType.BRAKING, 0.1F),
                    new ItemPerk("bronze_durability_perk", StatModifierType.DURABILITY, 0.03F),
                    new ItemPerk("silver_durability_perk", StatModifierType.DURABILITY, 0.06F),
                    new ItemPerk("gold_durability_perk", StatModifierType.DURABILITY, 0.1F),
                    new ItemPerk("bronze_handling_perk", StatModifierType.HANDLING, 0.02F),
                    new ItemPerk("silver_handling_perk", StatModifierType.HANDLING, 0.04F),
                    new ItemPerk("gold_handling_perk", StatModifierType.HANDLING, 0.06F),
                    new ItemPerk("bronze_speed_perk", StatModifierType.TOP_SPEED, 0.02F),
                    new ItemPerk("silver_speed_perk", StatModifierType.TOP_SPEED, 0.04F),
                    new ItemPerk("gold_speed_perk", StatModifierType.TOP_SPEED, 0.06F),
                    new ItemPerk("bronze_tank_perk", StatModifierType.FUEL_CAPACITY, 0.03F),
                    new ItemPerk("silver_tank_perk", StatModifierType.FUEL_CAPACITY, 0.06F),
                    new ItemPerk("gold_tank_perk", StatModifierType.FUEL_CAPACITY, 0.1F),
                    new VMItem("empty_spray_can")
            );
            for (int i = 0; i < VehicleTexture.values().length; i++) {
                VehicleTexture texture = VehicleTexture.values()[i];
                if(texture.isIgnored())
                    continue;
                registry.register(new ItemSprayCan(texture.name().toLowerCase() + "_spray_can", texture));
            }
            for (ItemRepairKit.Tier tier : ItemRepairKit.Tier.values()) {
                registry.register(new ItemRepairKit("repair_kit", tier));
            }
            for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
                for (int i = 1; i < 8; i++) {
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
                    registerVehicle("proton_p1_tunned", VehicleProtonP1Tunned.class),
                    registerVehicle("sputnik_ambulance", VehicleSputnikAmbulance.class),
                    registerVehicle("sputnik_firetruck", VehicleSputnikFiretruck.class)
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
                    registerSound("proton_p1_tunned_acc"),
                    registerSound("proton_p1_tunned_brake"),
                    registerSound("proton_p1_tunned_gas"),
                    registerSound("proton_p1_tunned_start"),
                    registerSound("secret"),
                    registerSound("lock_unlocked"),
                    registerSound("lockpick_success"),
                    registerSound("lockpick_failed"),
                    registerSound("lockpick_failed_af"),
                    registerSound("sputnik_ambulance_acc"),
                    registerSound("sputnik_ambulance_brake"),
                    registerSound("sputnik_ambulance_gas"),
                    registerSound("sputnik_ambulance_start"),
                    registerSound("sputnik_firetruck_acc"),
                    registerSound("sputnik_firetruck_brake"),
                    registerSound("sputnik_firetruck_gas"),
                    registerSound("sputnik_firetruck_start"),
                    registerSound("car_locked"),
                    registerSound("car_unlocked"),
                    registerSound("police_siren"),
                    registerSound("ambulance_siren"),
                    registerSound("firetruck_siren")
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
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    Item item = ITEMS.getValue(rl);
                    if(item instanceof ItemVehicleSpawner) {
                        item.setTileEntityItemStackRenderer(renderItemSpawner);
                    }
                    registerModel(item);
                }
            }
            for (ResourceLocation rl : BLOCKS.getKeys()) {
                if (rl.getResourceDomain().equalsIgnoreCase(VehicleMod.MODID)) {
                    registerModel(Item.getItemFromBlock(BLOCKS.getValue(rl)));
                }
            }

            //GENERATES TUNNING RECIPES
            /*Gson gson = new GsonBuilder().setPrettyPrinting().create();
            File dir = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/recipes");
            for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
                for (int i = 2; i < 8; i++) {
                    try {
                        int n = i - 1;
                        String outputName = type.name().toLowerCase() + "_" + i;
                        String ingredientName = outputName.replaceAll("_[0-9]+", "_" + n);
                        File file = new File(dir, outputName + ".json");
                        JsonObject recipeObject = new JsonObject();
                        recipeObject.addProperty("type", "minecraft:crafting_shaped");
                        JsonArray pattern = new JsonArray();
                        pattern.add("PPP");
                        recipeObject.add("pattern", pattern);
                        JsonObject key = new JsonObject();
                        JsonObject p = new JsonObject();
                        p.addProperty("item", "vehiclemod:" + ingredientName);
                        key.add("P", p);
                        recipeObject.add("key", key);
                        JsonObject result = new JsonObject();
                        result.addProperty("item", "vehiclemod:" + outputName);
                        result.addProperty("count", 1);
                        recipeObject.add("result", result);
                        FileWriter writer = new FileWriter(file);
                        writer.write(gson.toJson(recipeObject));
                        writer.close();
                        System.out.println("Created recipe for " + outputName);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }*/
        }

        @SubscribeEvent
        public static void bakeModels(ModelBakeEvent event) {
            IRegistry<ModelResourceLocation, IBakedModel> modelRegistry = event.getModelRegistry();
            DummyBakedModel bakedModelInstance = new DummyBakedModel();
            ForgeRegistries.ITEMS.getValuesCollection().stream()
                    .filter(it -> it.getRegistryName().getResourceDomain().equals(VehicleMod.MODID) && it instanceof ItemVehicleSpawner)
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
