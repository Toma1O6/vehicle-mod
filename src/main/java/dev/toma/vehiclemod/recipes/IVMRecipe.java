package dev.toma.vehiclemod.recipes;

import net.minecraft.item.ItemStack;

public interface IVMRecipe {
	
	RecipeType type();
	
	ItemStack getResult();
	
	RecipeIngredient[] getIngredients();
	
	public enum RecipeType {
		VEHICLE,
		COLOR;
	}
}
