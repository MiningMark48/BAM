package com.miningmark48.bam.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.whiteRod), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.dye, 1, 15), 'y', new ItemStack(Items.fishing_rod));
        GameRegistry.addRecipe(new ItemStack(ModItems.greyRod), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.dye, 1, 8), 'y', new ItemStack(Items.fishing_rod));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightBlueRod), "xyx", "yzy", "xyx", 'x', new ItemStack(Items.diamond), 'y', new ItemStack(Items.emerald), 'z', new ItemStack(Items.fishing_rod));
    }
}
