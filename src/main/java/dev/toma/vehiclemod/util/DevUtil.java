package dev.toma.vehiclemod.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.util.function.ComparableFunction;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DevUtil {

    private static final ModelCreator CREATOR = new ModelCreator();
    public static final Predicate<Material> MATERIAL_VALIDATOR = mat -> mat == Material.GROUND || mat == Material.GRASS || mat == Material.SAND || mat == Material.ROCK;

    public static ModelCreator creator() {
        return CREATOR;
    }

    public static <E extends Enum<E>> E getEnumFromNBT(String key, NBTTagCompound nbt, Class<E> eClass) {
        E[] es = eClass.getEnumConstants();
        return nbt.hasKey(key, Constants.NBT.TAG_INT) ? es[MathHelper.clamp(nbt.getInteger(key), 0, es.length - 1)] : es[0];
    }

    public static float[] getRGB(int color) {
        float r = ((color >> 16) & 255) / 255.0F;
        float g = ((color >>  8) & 255) / 255.0F;
        float b =  (color        & 255) / 255.0F;
        return new float[] {r, g, b};
    }

    public static float[] getRGBA(int color) {
        float a = ((color >> 24) & 255) / 255.0F;
        float r = ((color >> 16) & 255) / 255.0F;
        float g = ((color >>  8) & 255) / 255.0F;
        float b =  (color        & 255) / 255.0F;
        return new float[] { r, g, b, a };
    }

    public static <K, V> V getSafe(Map<K, V> map, K key, V fallback) {
        V v = map.get(key);
        return v != null ? v : fallback;
    }

    public static <T> T make(T t, Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }

    public static <T> boolean contains(T t, T[] array, ComparableFunction<T> function) {
        for (T entry : array) {
            if (function.compare(t, entry)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contains(T t, Collection<T> collection, ComparableFunction<T> function) {
        for (T entry : collection) {
            if (function.compare(t, entry)) {
                return true;
            }
        }
        return false;
    }

    public static NBTTagList inventoryToNBT(IInventory inventory) {
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if(stack.isEmpty())
                continue;
            NBTTagCompound compound = new NBTTagCompound();
            compound.setInteger("index", i);
            compound.setTag("item", stack.serializeNBT());
            list.appendTag(compound);
        }
        return list;
    }

    public static NBTTagCompound inventoryToNBTCompound(IInventory inventory) {
        NBTTagCompound compound = new NBTTagCompound();
        compound.setTag("inventory", inventoryToNBT(inventory));
        return compound;
    }

    public static void loadInventoryFromNBT(IInventory inventory, NBTTagList list) {
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound nbt = list.getCompoundTagAt(i);
            int index = nbt.getInteger("index");
            ItemStack stack = new ItemStack(nbt.getCompoundTag("item"));
            inventory.setInventorySlotContents(index, stack);
        }
    }

    public static void loadInventoryFromNBTCompound(IInventory inventory, NBTTagCompound compound) {
        if(compound.hasKey("inventory", Constants.NBT.TAG_LIST)) {
            loadInventoryFromNBT(inventory, compound.getTagList("inventory", Constants.NBT.TAG_COMPOUND));
        }
    }

    public static boolean isDev() {
        return (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
    }

    public static void drawImage2D(Minecraft mc, ResourceLocation location, int x, int y, int width, int height, double uStart, double vStart, double uEnd, double vEnd) {
        mc.getTextureManager().bindTexture(location);
        GlStateManager.color(1f, 1f, 1f);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos(x, y + height, 0).tex(uStart, vEnd).endVertex();
        bufferBuilder.pos(x + width, y + height, 0).tex(uEnd, vEnd).endVertex();
        bufferBuilder.pos(x + width, y, 0).tex(uEnd, vStart).endVertex();
        bufferBuilder.pos(x, y, 0).tex(uStart, vStart).endVertex();
        tessellator.draw();
    }

    public static void drawImage2D(Minecraft mc, ResourceLocation location, int x, int y, int width, int height) {
        drawImage2D(mc, location, x, y, width, height, 0, 0, 1, 1);
    }

    public static void drawImage2D(Minecraft mc, ResourceLocation location) {
        ScaledResolution resolution = new ScaledResolution(mc);
        drawImage2D(mc, location, 0, 0, resolution.getScaledWidth(), resolution.getScaledHeight());
    }

    public static void drawColor(int x1, int y1, int x2, int y2, float r, float g, float b, float a) {
        drawColor(x1, y1, x2, y2, 0.0D, r, g, b, a);
    }

    public static void drawColor(int x1, int y1, int x2, int y2, double z, float r, float g, float b, float a) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.getBuffer();
        builder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        builder.pos(x1, y2, z).color(r, g, b, a).endVertex();
        builder.pos(x2, y2, z).color(r, g, b, a).endVertex();
        builder.pos(x2, y1, z).color(r, g, b, a).endVertex();
        builder.pos(x1, y1, z).color(r, g, b, a).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static final class ModelCreator {

    	final File itemModelFolder = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/models/item");
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();

        public void createPartFiles() {
            ForgeRegistries.ITEMS.getValuesCollection()
                    .stream()
                    .filter(i -> i instanceof ItemVehicleUpgrade)
                    .map(i -> (ItemVehicleUpgrade) i)
                    .forEach(this::create);
        }

        void create(ItemVehicleUpgrade upgrade) {
            try {
                ResourceLocation name = upgrade.getRegistryName();
                File file = new File(itemModelFolder, name.getResourcePath() + ".json");
                if (!file.exists() && file.createNewFile()) {
                    JsonObject main = new JsonObject();
                    main.addProperty("parent", "item/generated");
                    JsonObject texture = new JsonObject();
                    texture.addProperty("layer0", "vehiclemod:items/" + name.getResourcePath());
                    main.add("textures", texture);
                    FileWriter writer = new FileWriter(file);
                    writer.write(gson.toJson(main));
                    writer.close();
                    VehicleMod.logger.info("Created item model file for {}", name);
                }
            } catch (Exception e) {
                VehicleMod.logger.fatal("Error creating item model file for {}", upgrade.getRegistryName());
            }
        }
    }
}
