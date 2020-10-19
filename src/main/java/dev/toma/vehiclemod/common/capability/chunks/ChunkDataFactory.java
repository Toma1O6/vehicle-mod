package dev.toma.vehiclemod.common.capability.chunks;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.util.VehicleTexture;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        static final LazyLoad<List<EntityEntry>> vehicleList = new LazyLoad<>(() -> {
            List<EntityEntry> list = new ArrayList<>();
            for (EntityEntry entry : ForgeRegistries.ENTITIES) {
                if(EntityVehicle.class.isAssignableFrom(entry.getEntityClass())) {
                    list.add(entry);
                }
            }
            return list;
        });

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
                        int chunkX = pos.x << 4;
                        int chunkZ = pos.z << 4;
                        int x = chunkX + random.nextInt(16);
                        int z = chunkZ + random.nextInt(16);
                        int y = world.getHeight(x, z);
                        List<EntityEntry> list = vehicleList.get();
                        EntityEntry entry = list.get(random.nextInt(list.size()));
                        EntityVehicle vehicle = (EntityVehicle) entry.newInstance(world);
                        vehicle.setPosition(x + 0.5, y + 1.0, z + 0.5);
                        vehicle.fuel = 0.0F;
                        vehicle.health = 0.0F;
                        vehicle.setTexture(VehicleTexture.RUST);
                        vehicle.rotationYaw = random.nextInt(180) - random.nextInt(180);
                        world.spawnEntity(vehicle);
                    }
                }
            }
        }
    }
}
