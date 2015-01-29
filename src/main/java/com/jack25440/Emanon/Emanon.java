package com.jack25440.Emanon;

import com.jack25440.Emanon.block.BlockEmanon;
import com.jack25440.Emanon.init.ModBlocks;
import com.jack25440.Emanon.init.ModItems;
import com.jack25440.Emanon.init.Recipes;
import com.jack25440.Emanon.proxy.IProxy;
import com.jack25440.Emanon.handler.ConfigurationHandler;
import com.jack25440.Emanon.Reference.Reference;
import com.jack25440.Emanon.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Emanon
{
    @Mod.Instance(Reference.MOD_ID)
    public static Emanon instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInt(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        GameRegistry.registerWorldGenerator(new WorldGen(), 1);
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.debug(oreName);
        }

            LogHelper.info("Post Initialization Complete!");
    }
}
