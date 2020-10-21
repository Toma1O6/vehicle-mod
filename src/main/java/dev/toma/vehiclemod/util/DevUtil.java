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
import net.minecraft.item.Item;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DevUtil {

    private static final ModelCreator CREATOR = new ModelCreator();
    public static final Predicate<Material> MATERIAL_VALIDATOR = mat -> mat == Material.GROUND || mat == Material.GRASS || mat == Material.SAND || mat == Material.ROCK;

    public static ModelCreator creator() {
        return CREATOR;
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

    public static boolean isDev() {
        return (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
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
