package com.miningmark48.bam.block;

import com.miningmark48.bam.reference.GUIs;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockFishWorkbench extends BlockBAM{

    public BlockFishWorkbench(){
        super(Material.wood);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if (!player.isSneaking()){
            player.openGui(Reference.MOD_ID, GUIs.guiIDFishWorkbench, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

}
