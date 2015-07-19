package com.miningmark48.bam.block;

import com.miningmark48.bam.reference.GUIs;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBreeder extends BlockBAM{

    public IIcon[] icons = new IIcon[6];

    public BlockBreeder(){
        super();
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){
        for (int i = 0; i < 6; i++){
            if (i == 3 || i == 2){
                this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
            }else{
                this.icons[i] = reg.registerIcon(this.textureName);
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if (!player.isSneaking()){
            player.addChatComponentMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_RED + "This is not yet working in v" + Reference.VERSION + "."));
            return true;
        }else{
            return false;
        }
    }

}

