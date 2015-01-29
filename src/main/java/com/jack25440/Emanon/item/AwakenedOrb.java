package com.jack25440.Emanon.item;

import com.jack25440.Emanon.creativetab.CreativeTabEmanon;
import net.minecraft.item.ItemStack;

/**
 * Created by jack2 on 20/01/2015.
 */
public class AwakenedOrb extends ItemEmanon
{
    public String data ="mod"+ ":" + this.getClass().getName();
    public AwakenedOrb()
    {
        super();
        this.setUnlocalizedName("AwakenedOrb");
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabEmanon.EMANON_TAB);
    }
}
