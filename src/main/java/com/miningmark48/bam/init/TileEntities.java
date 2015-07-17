package com.miningmark48.bam.init;

import com.miningmark48.bam.tileentity.TileEntityFishWorkbench;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {

    public static void init(){
        GameRegistry.registerTileEntity(TileEntityFishWorkbench.class, "tileEntityFishWorkbench");
    }

}
