package com.miningmark48.bam.init;

import com.miningmark48.bam.block.BlockFishWorkbench;
import com.miningmark48.bam.block.BlockOres;
import com.miningmark48.bam.creativetab.CreativeTabBAM;
import com.miningmark48.bam.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block fishWorkbench = new BlockFishWorkbench().setBlockName("fishWorkbench").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":fishWorkbench");

    //Ores
    public static final Block arsenicOre = new BlockOres().setBlockName("arsenicOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":arsenicOre");
    public static final Block tungstenOre = new BlockOres().setBlockName("tungstenOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":tungstenOre");
    public static final Block copperOre = new BlockOres().setBlockName("copperOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":copperOre");
    public static final Block tinOre = new BlockOres().setBlockName("tinOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":tinOre");
    public static final Block silverOre = new BlockOres().setBlockName("silverOre").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":silverOre");

    public static void init() {

        GameRegistry.registerBlock(fishWorkbench, "fishWorkbench");
        GameRegistry.registerBlock(arsenicOre, "arsenicOre");
        GameRegistry.registerBlock(tungstenOre, "tungstenOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(silverOre, "silverOre");

    }

}
