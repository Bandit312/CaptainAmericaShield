package com.bandit.captainamericashield.init;

import com.bandit.captainamericashield.item.itemcas;
import com.bandit.captainamericashield.item.itemshield;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final itemcas shield = new itemshield();

    public static void init()
    {
        GameRegistry.registerItem(shield,"Caps Shield");
    }
}
