package com.bandit.captainamericashield;

import com.bandit.captainamericashield.handler.ConfigurationHandler;
import com.bandit.captainamericashield.init.ModItems;
import com.bandit.captainamericashield.proxy.IProxy;
import com.bandit.captainamericashield.reference.Reference;
import com.bandit.captainamericashield.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME,version= Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)

public class CaptainAmericaShield
{
    @Mod.Instance( Reference.MOD_ID)
    public static CaptainAmericaShield instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}

