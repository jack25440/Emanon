package com.jack25440.Emanon.block;

import com.jack25440.Emanon.Emanon;
import com.jack25440.Emanon.creativetab.CreativeTabEmanon;
import com.jack25440.Emanon.item.ItemEterealEssence;
import net.minecraft.item.ItemStack;

/**
 * Created by jack2 on 18/01/2015.
 */
public class oreEtereal extends BlockEmanon
{
    public oreEtereal()
    {
        super();
        this.setBlockName("eterealOre");
        this.setLightLevel(2);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
}
