package com.miningmark48.bam.gui;

import com.miningmark48.bam.container.ContainerFishItemMachine;
import com.miningmark48.bam.container.ContainerFishWorkbench;
import com.miningmark48.bam.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiFishItemMachine extends GuiContainer{

    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/gui/fishItemMachine.png");

    public GuiFishItemMachine(InventoryPlayer player, World world, int x, int y, int z) {
        super(new ContainerFishItemMachine(player, world, x, y, z));

        this.xSize = 177;
        this.ySize = 168;
    }

    public void onGuiClosed() {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int i, int j) {
        this.fontRendererObj.drawString(StatCollector.translateToLocal("Specimen Catalyzer"), 10, 5, 0x404040);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

        GL11.glColor4f(1F, 1F, 1F, 1F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

    }
    
}
