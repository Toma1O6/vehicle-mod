package dev.toma.vehiclemod.common.capability.chunks;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EnumVehicleType;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.util.DevUtil;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.util.WeightedRandom;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.*;
import java.util.stream.Collectors;

public class ChunkDataFactory implements ChunkData {

    private boolean marked;

    @Override
    public boolean isMarked() {
        return marked;
    }

    @Override
    public void mark() {
        marked = true;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setBoolean("marked", marked);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        marked = nbt.getBoolean("marked");
    }

    @Mod.EventBusSubscriber(modid = VehicleMod.MODID)
    public static class EventHandler {

        static final Random random = new Random();
        static final WeightedRandom<EnumVehicleType> TYPES = new WeightedRandom<>(EnumVehicleType::getSpawnChance, EnumVehicleType.values());
        static final Map<EnumVehicleType, List<EntityEntry>> TYPE_ENTRY_MAP = new HashMap<>();

        @SubscribeEvent
        public static void onCapabilityAttach(AttachCapabilitiesEvent<Chunk> event) {
            event.addCapability(VehicleMod.getResource("chunk_data"), new ChunkDataProvider());
        }

        @SubscribeEvent
        public static void loadChunk(ChunkEvent.Load event) {
            Chunk chunk = event.getChunk();
            World world = chunk.getWorld();
            ChunkData data = chunk.getCapability(ChunkDataProvider.CAPABILITY, null);
            if(data != null) {
                if (!data.isMarked() && !world.isRemote) {
                    data.mark();
                    chunk.markDirty();
                    if(random.nextFloat() <= 0.005F) {
                        ChunkPos pos = chunk.getPos();
                        int x = (pos.x << 4) + random.nextInt(16);
                        int z = (pos.z << 4) + random.nextInt(16);
                        int y = world.getHeight(x, z);
                        BlockPos pos1 = new BlockPos(x, y, z);
                        if(!DevUtil.MATERIAL_VALIDATOR.test(world.getBlockState(pos1.down()).getMaterial())) {
                            return;
                        }
                        if(TYPE_ENTRY_MAP.isEmpty()) {
                            for (EntityEntry entry : ForgeRegistries.ENTITIES.getValuesCollection()
                                    .stream()
                                    .filter(en -> EntityVehicle.class.isAssignableFrom(en.getEntityClass()))
                                    .collect(Collectors.toList())
                            ) {
                                EntityVehicle vehicle = (EntityVehicle) entry.newInstance(world);
                                TYPE_ENTRY_MAP.computeIfAbsent(vehicle.getVehicleType(), type -> new ArrayList<>()).add(entry);
                            }
                        }
                        List<EntityEntry> list = TYPE_ENTRY_MAP.get(TYPES.getRandom());
                        EntityEntry entry = list.get(random.nextInt(list.size()));
                        EntityVehicle vehicle = (EntityVehicle) entry.newInstance(world);
                        vehicle.setPosition(x + 0.5, y + 1.0, z + 0.5);
                        vehicle.fuel = 0.0F;
                        vehicle.health = vehicle.getActualStats().maxHealth * 0.03F;
                        vehicle.setTexture(VehicleTexture.RUST);
                        vehicle.rotationYaw = random.nextInt(180) - random.nextInt(180);
                        world.spawnEntity(vehicle);
                    }
                }
            }
        }
    }
}
