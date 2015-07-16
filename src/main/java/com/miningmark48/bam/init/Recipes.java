package com.miningmark48.bam.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init(){

        //Items
            //Smelting
        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.copperIngot, 1),  10f);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tinOre), new ItemStack(ModItems.tinIngot, 1),  10f);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.silverOre), new ItemStack(ModItems.silverIngot, 1),  10f);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tungstenOre), new ItemStack(ModItems.tungstenIngot, 1),  10f);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.arsenicOre), new ItemStack(ModItems.arsenicIngot, 1),  10f);
            //Tool Rods and Reels
        GameRegistry.addRecipe(new ItemStack(ModItems.whiteToolRod), " ab", "aba", "ba ", 'a', new ItemStack(Items.dye, 1, 15), 'b', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.greyToolRod), " ab", "aba", "ba ", 'a', new ItemStack(Items.dye, 1, 8), 'b', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightBlueToolRod), " ab", "aba", "ba ", 'a', new ItemStack(Items.diamond), 'b', new ItemStack(Items.emerald));

        GameRegistry.addRecipe(new ItemStack(ModItems.whiteReel), " ac", "aba", "ca ", 'a', new ItemStack(Items.iron_ingot), 'b', new ItemStack(Items.dye, 1, 15), 'c', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.greyReel), " ac", "aba", "ca ", 'a', new ItemStack(Items.iron_ingot), 'b', new ItemStack(Items.dye, 1, 8), 'c', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.lightBlueReel), " ac", "aba", "ca ", 'a', new ItemStack(Items.iron_ingot), 'b', new ItemStack(Items.nether_star), 'c', new ItemStack(Items.stick));
            //Ingot-Nugget
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperNugget, 9), new ItemStack(ModItems.copperIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinNugget, 9), new ItemStack(ModItems.tinIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverNugget, 9), new ItemStack(ModItems.silverIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenNugget, 9), new ItemStack(ModItems.tungstenIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.arsenicNugget, 9), new ItemStack(ModItems.arsenicIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.copperIngot), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.copperNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.tinIngot), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.tinNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.silverIngot), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.silverNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.tungstenIngot), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.tungstenNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.arsenicIngot), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.arsenicNugget));


        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.fishWorkbench), "ded", "bcb", "a a", 'a', new ItemStack(Items.stick), 'b', new ItemStack(ModItems.copperIngot), 'c', new ItemStack(Blocks.crafting_table), 'd', new ItemStack(Blocks.planks), 'e', new ItemStack(Items.fish));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.fishWorkbench), "ded", "bcb", "a a", 'a', new ItemStack(Items.stick), 'b', new ItemStack(ModItems.tinIngot), 'c', new ItemStack(Blocks.crafting_table), 'd', new ItemStack(Blocks.planks), 'e', new ItemStack(Items.fish));
    }
}
