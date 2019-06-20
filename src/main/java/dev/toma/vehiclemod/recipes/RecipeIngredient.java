package dev.toma.vehiclemod.recipes;

import net.minecraft.item.Item;

public class RecipeIngredient {
	
	public final Item item;
	public final int count;
	
	public RecipeIngredient(Item item, int c) {
		this.item = item;
		this.count = c;
	}
}
