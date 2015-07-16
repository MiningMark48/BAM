package com.miningmark48.bam.creativetab;

import com.miningmark48.bam.init.ModItems;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBAM {

    public static final CreativeTabs BAM_Tab = new CreativeTabs(Reference.MOD_ID){

        @Override
        public Item getTabIconItem(){
            return ModItems.whiteRod;
        }

    };

    public static final CreativeTabs BAM_Tab_Fish = new CreativeTabs(Reference.MOD_ID + ":fish") {
        @Override
        public Item getTabIconItem() {
            return ModItems.blFish;
        }
    };

}
