package com.miningmark48.bam.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class FishWorkbenchRecipeSorter implements Comparator {

    final FishWorkbenchCraftingManager FishWorkbench;

    public FishWorkbenchRecipeSorter(FishWorkbenchCraftingManager FishWorkbenchCM){
        this.FishWorkbench = FishWorkbenchCM;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof FishWorkbenchShapelessRecipes && irecipe2 instanceof FishWorkbenchShapedRecipes ? 1: (irecipe2 instanceof FishWorkbenchShapelessRecipes && irecipe1 instanceof FishWorkbenchShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }

}
