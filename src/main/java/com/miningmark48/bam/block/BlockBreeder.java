package com.miningmark48.bam.block;

import com.miningmark48.bam.reference.GUIs;
import com.miningmark48.bam.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockBreeder extends BlockBAM{

    public IIcon[] icons = new IIcon[6];

    public BlockBreeder(){
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
            player.addChatComponentMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_RED + "This is not yet working!"));
            return true;
        }else{
            return false;
        }
    }

}

