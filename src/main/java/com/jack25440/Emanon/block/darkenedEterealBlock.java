package com.jack25440.Emanon.block;

/**
 * Created by jack2 on 20/01/2015.
 */
public class darkenedEterealBlock extends BlockEmanon
{
    public darkenedEterealBlock()
    {
        super();
        this.setBlockName("darkenedEterealBlock");
        this.setLightLevel(2);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
}
