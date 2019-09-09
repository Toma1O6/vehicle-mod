package dev.toma.vehiclemod.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.block.Block;
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

public class DevUtil {
	
private static final ModelCreator CREATOR = new ModelCreator();
	
	public static ModelCreator creator() {
		return CREATOR;
	}
	
	public static boolean isDev() {
		return (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
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
		
		public void createAllFiles() {
			ForgeRegistries.BLOCKS.getValuesCollection().stream()
					.filter(b -> b.getRegistryName().getResourceDomain().equals(VehicleMod.Constants.ID))
					.forEach(this::createBlockFiles);

			ForgeRegistries.ITEMS.getValuesCollection().stream()
					.filter(i -> i.getRegistryName().getResourceDomain().equals(VehicleMod.Constants.ID))
					.forEach(this::createItemModelFile);
		}
		
		public void createBlockFiles(Block block) {
			if(!block.getBlockState().getProperties().isEmpty()) {
				createPropertyBlockStateFile(block);
			}
			createBlockstateFileNormal(block);
		}
		
		public void createBlockstateFileNormal(Block block) {
			String name = block.getRegistryName().getResourcePath();
			File file = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/blockstates/" + name + ".json");
			if(!file.exists()) {
				try {
					file.createNewFile();
					FileWriter writer = new FileWriter(file);
					String json = 
					"{\n"+
					"\t\"variants\": {\n"+
					"\t\t\"normal\": {\n"+
					"\t\t\t\"model\": \""+block.getRegistryName().toString()+"\"\n"+
					"\t\t}\n"+
					"\t}\n"+
					"}";
					writer.write(json);
					writer.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		public void createPropertyBlockStateFile(Block block) {
			String name = block.getRegistryName().getResourcePath();
			File file = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/blockstates/" + name + ".json");
			if(!file.exists()) {
				try {
					file.createNewFile();
					StringBuilder sb = new StringBuilder();
					FileWriter writer = new FileWriter(file);
					sb.append("{\n");
					sb.append("\t\"variants\": {\n");
					Iterator<IBlockState> stateIterator = block.getBlockState().getValidStates().iterator();
					while(stateIterator.hasNext()) {
						IBlockState state = stateIterator.next();
						boolean flag0 = stateIterator.hasNext();
						sb.append("\t\t\"");
						Collection<IProperty<?>> properties = state.getPropertyKeys();
						boolean hasDirectionProp = contains(PropertyDirection.class, properties);
						boolean hasIntegerProp = contains(PropertyInteger.class, properties);
						int value = 0;
						EnumFacing facing = null;
						String[] names = new String[properties.size()];
						String[] values = new String[properties.size()];
						IProperty[] propArray = properties.toArray(new IProperty[0]);
						for(int i = 0; i < properties.size(); i++) {
							IProperty<?> p = propArray[i];
							names[i] = p.getName();
							values[i] = state.getProperties().get(p).toString();
							if(hasDirectionProp && p instanceof PropertyDirection) {
								facing = EnumFacing.valueOf(state.getProperties().get(p).toString().toUpperCase());
							}
							if(hasIntegerProp && p instanceof PropertyInteger) {
								value = (Integer)state.getProperties().get(p);
							}
						}
						for(int i = 0; i < properties.size(); i++) {
							boolean flag1 = i == properties.size()-1;
							sb.append(names[i]+"="+values[i]+(flag1?("\": {" + getModel(block, values[i], hasIntegerProp, value) +
									(hasDirectionProp&&facing!=null?",\"y\": "+facing.getOpposite().getHorizontalAngle()+"}"+(flag0?",":"")+"\n":"}"+(flag0?",":"")+"\n")):","));
						}
					}
					sb.append("\t}\n");
					sb.append("}");
					writer.write(sb.toString());
					writer.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		private String getModel(Block block, String additional, boolean integerProperty, int value) {
			String integerName = "_stage_";
			String boolName = "_on";
			if(block.getClass().isAnnotationPresent(JsonGenerator.class)) {
				JsonGenerator json = block.getClass().getAnnotation(JsonGenerator.class);
				integerName = json.intName();
				boolName = json.boolName();
			}
			Collection<IProperty<?>> props = block.getBlockState().getProperties();
			boolean bool = contains(PropertyBool.class, props);
			StringBuilder sb = new StringBuilder();
			sb.append("\"model\": \"" + block.getRegistryName().toString());
			if(integerProperty) {
				sb.append(integerName + value);
			}
			if(bool) {
				boolean flag = additional != null && additional.contains("true");
				sb.append(flag?boolName:"");
			}
			sb.append("\"");
			return sb.toString();
		}
		
		private static boolean contains(Class<? extends IProperty<?>> cls, Collection<IProperty<?>> collection) {
			for(IProperty<?> prop : collection) {
				if(prop.getClass().equals(cls)) {
					return true;
				}
			}
			return false;
		}
		
		private static <E extends IProperty<?>> E getProperty(Class<E> target, Collection<IProperty<?>> collection) {
			for(IProperty<?> p : collection) {
				if(p.getClass().equals(target)) {
					return (E)p;
				}
			}
			return null;
		}
		
		@Deprecated
		public static void createJson(Block block) {
			File json = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/blockstates/"+block.getRegistryName().getResourcePath()+".json");
			if (json.exists()) return;
				try {
					json.createNewFile();
					if (!json.canWrite()) json.setWritable(true);
					Gson gson = new GsonBuilder().disableHtmlEscaping().create();
					JsonObject obj = new JsonObject();
					JsonObject element = new JsonObject();
					Collection<IBlockState> collec = block.getBlockState().getValidStates();
					for (IBlockState state : collec) {
						Collection<IProperty<?>> properties = state.getPropertyKeys();
						String[] names = new String[properties.size()], values = new String[properties.size()];
						for (int i = 0; i < names.length; i++) {
							IProperty<?> prop = (IProperty<?>) properties.toArray()[i];
							names[i] = prop.getName();
							values[i] = state.getProperties().get(prop).toString();
						}
						StringBuilder tagBuilder = new StringBuilder();
						for (int i = 0; i < properties.size(); i++) {
							if (i == properties.size() - 1) {
								tagBuilder.append(names[i] + "=" + values[i]);
							} else tagBuilder.append(names[i] + "=" + values[i] + ",");
						}

						element.add(tagBuilder.toString(), new JsonObject());
					}
					obj.add("variants", element);
					String[] jsonText = gson.toJson(obj).split("[{]");
					for (int i = 0; i < jsonText.length; i++) {
						if (!jsonText[i].endsWith("}")) jsonText[i] = jsonText[i] += "{";
					}
					List<String[]> linesList = new ArrayList<String[]>();
					for (String line : jsonText) {
						String[] array = line.split("},");
						for (int i = 0; i < array.length; i++) {
							if (i != array.length - 1) array[i] = array[i] += "},";
						}
						linesList.add(array);
					}
					BufferedWriter writer = new BufferedWriter(new FileWriter(json));
					for (String[] lines : linesList) {
						for (String line : lines) {
							if (line.startsWith("}")) writer.newLine();
							writer.write(line);
							writer.newLine();
						}
					}
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private void addPropertyOption(StringBuilder sb) {
			
		}
		
		public void createItemBlockFile(Block block) {
			String name = block.getRegistryName().getResourcePath();
			File file = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/models/item/" + name + ".json");
			if(!file.exists()) {
				try {
					file.createNewFile();
					FileWriter writer = new FileWriter(file);
					String json =
					"{\n"+
					"\t\"parent\": \""+VehicleMod.Constants.ID+":block/"+name+"\"\n"+
					"}";
					writer.write(json);
					writer.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

		public void createItemModelFile(Item item) {
			String name = item.getRegistryName().getResourcePath();
			File file = new File("D:/mcmods/1.12.2/vehicle-mod/src/main/resources/assets/vehiclemod/models/item/" + name + ".json");
			if(file.exists()) {
				return;
			}
			try {
				file.createNewFile();
				StringBuilder sb = new StringBuilder();
				sb.append("{\n");
				sb.append("\t\"parent\": \"item/generated\",\n");
				sb.append("\t\"textures\": {\n");
				sb.append("\t\t\"layer0\": \"vehiclemod:items/" + name + "\"\n");
				sb.append("\t}\n");
				sb.append("}");
				FileWriter writer = new FileWriter(file);
				writer.write(sb.toString());
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
