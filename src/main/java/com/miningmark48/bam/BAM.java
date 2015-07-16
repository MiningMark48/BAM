package com.miningmark48.bam;

import com.miningmark48.bam.gui.GuiHandler;
import com.miningmark48.bam.init.*;
import com.miningmark48.bam.proxy.ClientProxy;
import com.miningmark48.bam.proxy.IProxy;
import com.miningmark48.bam.reference.Reference;
import com.miningmark48.bam.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BAM {

    @Mod.Instance(Reference.MOD_ID)
    public static BAM instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    public static ClientProxy cProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();
        ModItems.init();

        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

        LogHelper.info("Pre-Init Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        Recipes.init();
        OreDict.init();
        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post-Init Complete!");
    }

}
