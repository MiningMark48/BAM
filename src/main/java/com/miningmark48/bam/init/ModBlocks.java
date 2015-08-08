package com.miningmark48.bam.init;

import com.miningmark48.bam.block.*;
import com.miningmark48.bam.creativetab.CreativeTabBAM;
import com.miningmark48.bam.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    //Functioning Blocks
    public static final Block fishWorkbench = new BlockFishWorkbench().setBlockName("fishWorkbench").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":fishWorkbench");
    public static final Block breeder = new BlockBreeder().setBlockName("breeder").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":breeder");
    public static final Block fishItemMachine = new BlockFishItemMachine().setBlockName("fishItemMachine").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":fishItemMachine");

    //Ores
    public static final Block arsenicOre = new BlockOres().setBlockName("arsenicOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":arsenicOre");
    public static final Block tungstenOre = new BlockOres().setBlockName("tungstenOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":tungstenOre");
    public static final Block copperOre = new BlockOres().setBlockName("copperOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":copperOre");
    public static final Block tinOre = new BlockOres().setBlockName("tinOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":tinOre");
    public static final Block silverOre = new BlockOres().setBlockName("silverOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":silverOre");

    //Misc
    public static final Block machineBlock = new BlockBAM().setBlockName("machineBlock").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":machineBlock");

    public static void init() {

        GameRegistry.registerBlock(fishWorkbench, "fishWorkbench");
        GameRegistry.registerBlock(breeder, "breeder");
        GameRegistry.registerBlock(fishItemMachine, "fishItemMachine");

        GameRegistry.registerBlock(arsenicOre, "arsenicOre");
        GameRegistry.registerBlock(tungstenOre, "tungstenOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(silverOre, "silverOre");

        GameRegistry.registerBlock(machineBlock, "machineBlock");
    }

}
