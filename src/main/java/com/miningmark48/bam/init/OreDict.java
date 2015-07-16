package com.miningmark48.bam.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

    public static void init(){
        OreDictionary.registerOre("oreCopper", ModBlocks.copperOre);
        OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
        OreDictionary.registerOre("oreSilver", ModBlocks.silverOre);
        OreDictionary.registerOre("oreTungsten", ModBlocks.tungstenOre);
        OreDictionary.registerOre("oreArsenic", ModBlocks.arsenicOre);
        OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
        OreDictionary.registerOre("ingotTin", ModItems.tinIngot);
        OreDictionary.registerOre("ingotSilver", ModItems.silverIngot);
        OreDictionary.registerOre("ingotTungsten", ModItems.tungstenIngot);
        OreDictionary.registerOre("ingotArsenic", ModItems.arsenicIngot);
        OreDictionary.registerOre("nuggetCopper", ModItems.copperNugget);
        OreDictionary.registerOre("nuggetTin", ModItems.tinNugget);
        OreDictionary.registerOre("nuggetSilver", ModItems.silverNugget);
        OreDictionary.registerOre("nuggetTungsten", ModItems.tungstenNugget);
        OreDictionary.registerOre("nuggetArsenic", ModItems.arsenicNugget);
    }

}
