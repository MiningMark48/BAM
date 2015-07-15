package com.miningmark48.bam.init;

import com.miningmark48.bam.block.BlockFishWorkbench;
import com.miningmark48.bam.creativetab.CreativeTabBAM;
import com.miningmark48.bam.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block fishWorkbench = new BlockFishWorkbench().setBlockName("fishWorkbench").setCreativeTab(CreativeTabBAM.BAM_Tab).setBlockTextureName(Reference.MOD_ID + ":fishWorkbench");

    public static void init() {

        GameRegistry.registerBlock(fishWorkbench, "fishWorkbench");

    }

}
