package com.jack25440.Emanon.item;

import com.jack25440.Emanon.creativetab.CreativeTabEmanon;
import com.jack25440.Emanon.Reference.Reference;
import sun.rmi.rmic.Constants;

/**
 * Created by jack2 on 17/01/2015.
 */
public class ItemEterealEssence extends ItemEmanon
{
    public ItemEterealEssence()
    {
        super();
        setUnlocalizedName("eterealEssence");
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabEmanon.EMANON_TAB);
    }
}
