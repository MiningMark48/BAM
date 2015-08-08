package com.miningmark48.bam.block;

import com.miningmark48.bam.reference.GUIs;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFishItemMachine extends BlockBAM{

    public IIcon[] icons = new IIcon[6];

    public BlockFishItemMachine(){
        super();
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){
        for (int i = 0; i < 6; i++){
            if (i == 1 || i == 0){
                this.icons[i] = reg.registerIcon(this.textureName);
            }else{
                this.icons[i] = reg.registerIcon(this.textureName + "1");
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if (!player.isSneaking() && !world.isRemote){
            //player.addChatComponentMessage(new ChatComponentTranslation("Recipes: https://github.com/MiningMark48/BAM/wiki/Blocks#breeder (NEI Support Coming Soon)"));
            player.openGui(Reference.MOD_ID, GUIs.guiIDFishItemMachine, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

}
