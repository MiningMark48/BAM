package com.miningmark48.bam.block;

import com.miningmark48.bam.reference.GUIs;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockBAM extends Block {


    public BlockBAM(Material material) {
        super(material);
    }

    public BlockBAM() {

        super(Material.rock);
        this.setHardness(2.0F);

    }
}