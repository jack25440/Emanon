package com.jack25440.Emanon.creativetab;

import com.jack25440.Emanon.Reference.Reference;
import com.jack25440.Emanon.init.ModBlocks;
import com.jack25440.Emanon.init.ModItems;
import com.jack25440.Emanon.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by jack2 on 19/01/2015.
 */
public class CreativeTabEmanon
{
    public static final CreativeTabs EMANON_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.eterealEssence;
        }
    };
}
