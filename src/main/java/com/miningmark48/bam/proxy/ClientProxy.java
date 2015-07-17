package com.miningmark48.bam.proxy;

import com.miningmark48.bam.renderer.RenderFishWorkbench;
import com.miningmark48.bam.init.ModBlocks;
import com.miningmark48.bam.renderer.RenderItemFishWorkbench;
import com.miningmark48.bam.tileentity.TileEntityFishWorkbench;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){
        //Blocks
            //Fish Workbench
        TileEntitySpecialRenderer render = new RenderFishWorkbench();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFishWorkbench.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.fishWorkbench), new RenderItemFishWorkbench());
    }

}
