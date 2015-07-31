package com.miningmark48.bam.item;

import com.miningmark48.bam.entity.EntityLightBlueHook;
import com.miningmark48.bam.entity.EntityWhiteHook;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class ItemLightBlueRod extends ItemFishingRod{

    private IIcon theIcon;

    public ItemLightBlueRod(){
        super();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
        list.add("Catches Metals and Gems!");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

        stack.damageItem(1, player);

        if (player.fishEntity != null) {
            int i = player.fishEntity.func_146034_e();
        } else {
            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!world.isRemote) {
                world.spawnEntityInWorld(new EntityLightBlueHook(world, player));

            }
        }
        player.swingItem();
        return stack;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon(this.getIconString() + "_uncast");
        this.theIcon = icon.registerIcon(this.getIconString() + "_cast");
    }

    @SideOnly(Side.CLIENT)
    public IIcon func_94597_g()
    {
        return this.theIcon;
    }

}
