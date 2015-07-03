package com.miningmark48.bam.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBAM extends Block{


    public BlockBAM(Material material) {
        super(material);
    }

    public BlockBAM(){

        super(Material.rock);
        this.setHardness(2.0F);

    }
}
