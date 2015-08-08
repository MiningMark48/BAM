package com.miningmark48.bam.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class FishItemMachineRecipeSorter implements Comparator{

    final FishItemMachineCraftingManager FishItemMachine;

    public FishItemMachineRecipeSorter(FishItemMachineCraftingManager FishItemMachineCM){
        this.FishItemMachine = FishItemMachineCM;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof FishItemMachineShapelessRecipes && irecipe2 instanceof FishItemMachineShapedRecipes ? 1: (irecipe2 instanceof FishItemMachineShapelessRecipes && irecipe1 instanceof FishItemMachineShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }

}
