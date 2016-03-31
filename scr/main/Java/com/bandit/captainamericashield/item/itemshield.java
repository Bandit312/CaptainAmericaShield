package com.bandit.captainamericashield.item;

import com.bandit.captainamericashield.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;

public class itemshield extends itemcas
{
    public itemshield() {
        super();
        this.setUnlocalizedName("Caps Shield");
        setTextureName(Reference.MOD_ID + ":" + "itemshield");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
