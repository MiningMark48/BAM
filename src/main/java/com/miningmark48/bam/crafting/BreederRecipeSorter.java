package com.miningmark48.bam.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class BreederRecipeSorter implements Comparator {

    final BreederCraftingManager Breeder;

    public BreederRecipeSorter(BreederCraftingManager BreederCM){
        this.Breeder = BreederCM;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof BreederShapelessRecipes && irecipe2 instanceof BreederShapedRecipes ? 1: (irecipe2 instanceof BreederShapelessRecipes && irecipe1 instanceof BreederShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }

}
