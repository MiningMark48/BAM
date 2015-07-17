package com.miningmark48.bam.renderer;

import com.miningmark48.bam.model.ModelFishWorkbench;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class RenderFishWorkbench extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/model/ModelFishWorkbench.png");

    private ModelFishWorkbench model;

    public RenderFishWorkbench(){
        this.model = new ModelFishWorkbench();
    }

    @Override
    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);
            this.bindTexture(texture);
            GL11.glPushMatrix();
                this.model.renderModel(0.0625F);
            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    private void adjustLightFixture(World world, int i, int j, int k, Block block){
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightValue(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 35536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) modulousModifier, divModifier);
    }

}
