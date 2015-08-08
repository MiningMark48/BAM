package com.miningmark48.bam.init;

import com.miningmark48.bam.StructureGen.StructureFishHut;
import com.miningmark48.bam.utility.LogHelper;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1: //Nether
                generateNether(world, random, chunkX, chunkZ);

                //LogHelper.info("Nether ores generated.");
                break;
            case 0: //Overworld
                generateSurface(world, random, chunkX, chunkZ);

                // LogHelper.info("Overworld ores generated.");
                break;
            case 1: //End
                generateEnd(world, random, chunkX, chunkZ);

                //LogHelper.info("End ores generated.");
                break;
        }

    }

    private void generateNether(World world, Random rand, int x, int z)
    {

    }

    private void generateSurface(World world, Random rand, int x, int z)
    {
        generateOre(ModBlocks.copperOre, world, rand, x, z, 5, 10, 50, 0, 40, Blocks.stone);
        generateOre(ModBlocks.tinOre, world, rand, x, z, 3, 5, 45, 20, 50, Blocks.stone);
        generateOre(ModBlocks.silverOre, world, rand, x, z, 2, 8, 40, 0, 20, Blocks.stone);
        generateOre(ModBlocks.tungstenOre, world, rand, x, z, 2, 5, 35, 0, 25, Blocks.stone);
        generateOre(ModBlocks.arsenicOre, world, rand, x, z, 2, 10, 30, 10, 20, Blocks.stone);

        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);

        if (biome == BiomeGenBase.plains || biome == BiomeGenBase.ocean){
            for (int a = 0; a < 1; a++){
                int i = x + rand.nextInt(512);
                int j = z + rand.nextInt(512);
                int k = world.getHeightValue(i, j);

                new StructureFishHut().generate(world, rand, i, k, j);

            }
        }

    }


    private void generateEnd(World world, Random rand, int x, int z)
    {

    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn)
    {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
        for (int i = 0; i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, xRand, yRand, zRand);
        }
    }

}
