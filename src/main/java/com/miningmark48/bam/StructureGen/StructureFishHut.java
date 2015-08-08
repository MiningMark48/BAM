package com.miningmark48.bam.StructureGen;

import com.miningmark48.bam.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class StructureFishHut extends WorldGenerator {

    protected Block[] GetValidSpawnBlocks()
    {
        return new Block[]
                {
                        Blocks.grass,
                        Blocks.stone,
                        Blocks.dirt,
                };
    }

    public boolean LocationIsValidSpawn(World world, int x, int y, int z)
    {

        Block checkBlock = world.getBlock(x, y - 1, z);
        Block blockAbove = world.getBlock(x, y , z);
        Block blockBelow = world.getBlock(x, y - 2, z);

        for (Block i : GetValidSpawnBlocks())
        {
            if (blockAbove != Blocks.air)
            {
                return false;
            }
            if (checkBlock == i)
            {
                return true;
            }
            else if (checkBlock == Blocks.snow_layer && blockBelow == i)
            {
                return true;
            }
            else if (checkBlock.getMaterial() == Material.plants && blockBelow == i)
            {
                return true;
            }
        }
        return false;
    }

    public boolean generate(World world, Random rand, int x, int y, int z)
    {
        int i = rand.nextInt(1);

        if(i == 0)
        {
            generate_r0(world, rand, x, y, z);
        }

        return true;

    }

    public boolean generate_r0(World world, Random rand, int x, int y, int z)
    {
        if(!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 11, y, z) || !LocationIsValidSpawn(world, x + 11, y, z + 5) || !LocationIsValidSpawn(world, x, y, z + 5))
        {
            return false;
        }

        world.setBlock(x + 0, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 0, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 0, z + 0, Blocks.oak_stairs, 6, 3);
        world.setBlock(x + 8, y + 0, z + 0, Blocks.oak_stairs, 6, 3);
        world.setBlock(x + 9, y + 0, z + 0, Blocks.oak_stairs, 6, 3);
        world.setBlock(x + 10, y + 0, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 0, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 0, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 5, y + 0, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 6, y + 0, z + 1, Blocks.oak_stairs, 4, 3);
        world.setBlock(x + 7, y + 0, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 0, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 0, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 0, z + 1, Blocks.oak_stairs, 5, 3);
        world.setBlock(x + 11, y + 0, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 0, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 5, y + 0, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 6, y + 0, z + 2, Blocks.oak_stairs, 4, 3);
        world.setBlock(x + 7, y + 0, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 0, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 0, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 0, z + 2, Blocks.oak_stairs, 5, 3);
        world.setBlock(x + 11, y + 0, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 0, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 5, y + 0, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 6, y + 0, z + 3, Blocks.oak_stairs, 4, 3);
        world.setBlock(x + 7, y + 0, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 0, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 0, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 0, z + 3, Blocks.oak_stairs, 5, 3);
        world.setBlock(x + 11, y + 0, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 0, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 0, z + 4, Blocks.oak_stairs, 7, 3);
        world.setBlock(x + 8, y + 0, z + 4, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 0, z + 4, Blocks.oak_stairs, 7, 3);
        world.setBlock(x + 10, y + 0, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 0, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 0, z + 5, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 9, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 0, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 1, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 1, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 1, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 1, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 1, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 1, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 1, Blocks.fence, 0, 3);
        world.setBlock(x + 5, y + 1, z + 1, Blocks.fence, 0, 3);
        world.setBlock(x + 6, y + 1, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 7, y + 1, z + 1, Blocks.chest, 3, 3);
        world.setBlock(x + 8, y + 1, z + 1, ModBlocks.breeder, 0, 3);
        world.setBlock(x + 9, y + 1, z + 1, ModBlocks.fishWorkbench, 0, 3);
        world.setBlock(x + 10, y + 1, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 1, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 1, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 1, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 3, Blocks.fence, 0, 3);
        world.setBlock(x + 5, y + 1, z + 3, Blocks.fence, 0, 3);
        world.setBlock(x + 6, y + 1, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 7, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 1, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 1, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 1, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 1, z + 4, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 1, z + 4, Blocks.wooden_door, 3, 3);
        world.setBlock(x + 9, y + 1, z + 4, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 1, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 1, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 1, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 2, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 2, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 2, z + 0, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 2, z + 0, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 2, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 7, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 2, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 2, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 2, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 2, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 2, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 11, y + 2, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 7, y + 2, z + 4, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 2, z + 4, Blocks.wooden_door, 8, 3);
        world.setBlock(x + 9, y + 2, z + 4, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 2, z + 4, Blocks.log, 0, 3);
        world.setBlock(x + 11, y + 2, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 2, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 0, Blocks.oak_stairs, 0, 3);
        world.setBlock(x + 7, y + 3, z + 0, Blocks.oak_stairs, 2, 3);
        world.setBlock(x + 8, y + 3, z + 0, Blocks.oak_stairs, 2, 3);
        world.setBlock(x + 9, y + 3, z + 0, Blocks.oak_stairs, 2, 3);
        world.setBlock(x + 10, y + 3, z + 0, Blocks.oak_stairs, 2, 3);
        world.setBlock(x + 11, y + 3, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 1, Blocks.oak_stairs, 0, 3);
        world.setBlock(x + 7, y + 3, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 3, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 3, z + 1, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 3, z + 1, Blocks.oak_stairs, 1, 3);
        world.setBlock(x + 11, y + 3, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 2, Blocks.oak_stairs, 0, 3);
        world.setBlock(x + 7, y + 3, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 3, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 3, z + 2, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 3, z + 2, Blocks.oak_stairs, 1, 3);
        world.setBlock(x + 11, y + 3, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 3, Blocks.oak_stairs, 0, 3);
        world.setBlock(x + 7, y + 3, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 8, y + 3, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 9, y + 3, z + 3, Blocks.planks, 0, 3);
        world.setBlock(x + 10, y + 3, z + 3, Blocks.oak_stairs, 1, 3);
        world.setBlock(x + 11, y + 3, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 4, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 7, y + 3, z + 4, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 8, y + 3, z + 4, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 9, y + 3, z + 4, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 10, y + 3, z + 4, Blocks.oak_stairs, 3, 3);
        world.setBlock(x + 11, y + 3, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 3, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 0, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 1, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 2, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 3, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 4, Blocks.air, 0, 3);
        world.setBlock(x + 0, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 1, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 2, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 3, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 4, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 5, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 6, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 7, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 8, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 9, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 10, y + 4, z + 5, Blocks.air, 0, 3);
        world.setBlock(x + 11, y + 4, z + 5, Blocks.air, 0, 3);

        generate_r02_last(world, rand, x, y, z);
        return true;

    }
    public boolean generate_r02_last(World world, Random rand, int x, int y, int z)
    {

        world.setBlock(x + 4, y + 2, z + 1, Blocks.torch, 5, 3);
        world.setBlock(x + 8, y + 2, z + 1, Blocks.torch, 3, 3);
        world.setBlock(x + 4, y + 2, z + 3, Blocks.torch, 5, 3);
        world.setBlock(x + 7, y + 2, z + 3, Blocks.torch, 4, 3);
        world.setBlock(x + 9, y + 2, z + 3, Blocks.torch, 4, 3);
        return true;

    }

}
