package com.jack25440.Emanon.block;

/**
 * Created by jack2 on 26/01/2015.
 */
public class enhancedEterealBlock extends BlockEmanon
{
    public enhancedEterealBlock()
    {
        super();
        this.setBlockName("enhancedEterealBlock");
        this.setLightLevel(2);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
}
