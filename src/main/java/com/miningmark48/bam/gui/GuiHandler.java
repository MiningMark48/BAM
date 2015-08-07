package com.miningmark48.bam.gui;

import com.miningmark48.bam.container.ContainerBreeder;
import com.miningmark48.bam.container.ContainerFishWorkbench;
import com.miningmark48.bam.init.ModBlocks;
import com.miningmark48.bam.reference.GUIs;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiIDFishWorkbench){
            return ID == GUIs.guiIDFishWorkbench && world.getBlock(x, y, z) == ModBlocks.fishWorkbench ? new ContainerFishWorkbench(player.inventory, world, x, y, z) : null;
        }else if (ID == GUIs.guiIDBreeder){
            return ID == GUIs.guiIDBreeder && world.getBlock(x, y, z) == ModBlocks.breeder ? new ContainerBreeder(player.inventory, world, x, y, z) : null;
        }
        return null;
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiIDFishWorkbench){
            return ID == GUIs.guiIDFishWorkbench && world.getBlock(x, y, z) == ModBlocks.fishWorkbench ? new GuiFishWorkbench(player.inventory, world, x, y, z) : null;
        }else if (ID == GUIs.guiIDBreeder){
            return ID == GUIs.guiIDBreeder && world.getBlock(x, y, z) == ModBlocks.breeder ? new GuiBreeder(player.inventory, world, x, y, z) : null;
        }
        return null;
    }

}
