package com.miningmark48.bam.renderer;

import com.miningmark48.bam.init.ModBlocks;
import com.miningmark48.bam.model.ModelFishWorkbench;
import com.miningmark48.bam.tileentity.TileEntityFishWorkbench;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderItemFishWorkbench implements IItemRenderer{

    private final ModelFishWorkbench model;

    public RenderItemFishWorkbench(){
        model = new ModelFishWorkbench();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        if(type != type.ENTITY && type != type.EQUIPPED){
            GL11.glPushMatrix();
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityFishWorkbench(), 0.0D, 0.0D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        }else if(type == type.ENTITY && !(item.getItem() instanceof ItemBlock)){
            GL11.glPushMatrix();
            GL11.glScalef(1.5f, 1.5f, 1.5f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityFishWorkbench(), 0.0D, -0.15D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        }else if(type == type.ENTITY && item.getItem() instanceof ItemBlock){
            GL11.glPushMatrix();
            GL11.glScalef(3.0f, 3.0f, 3.0f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityFishWorkbench(), 0.0D, 0.0D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        }else if(type == type.EQUIPPED){
            GL11.glPushMatrix();
            GL11.glScalef(2f, 2f, 2f);
            GL11.glRotatef(20, 1, 0, 0);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityFishWorkbench(), -0.30D, 0.1D, -0.30D, 0.0F);
            GL11.glRotatef(-20, 1, 0, 0);
            GL11.glPopMatrix();
        }


    }

}
