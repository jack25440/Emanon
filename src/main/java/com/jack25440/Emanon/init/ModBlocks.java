package com.jack25440.Emanon.init;

import com.jack25440.Emanon.Reference.Reference;
import com.jack25440.Emanon.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

/**
 * Created by jack2 on 19/01/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEmanon eterealOre = new oreEtereal();
    public static final BlockEmanon eterealBlock = new EterealBlock();
    public static final BlockEmanon darkenedEterealBlock = new darkenedEterealBlock();
    public static final BlockEmanon enhancedEterealBlock = new enhancedEterealBlock();
    public static final BlockEmanon MagiChest = new BlockMagiChest();

    public static void init()
    {
        GameRegistry.registerBlock(eterealOre, "eterealOre");
        GameRegistry.registerBlock(eterealBlock, "eterealBlock");
        GameRegistry.registerBlock(darkenedEterealBlock, "darkenedEterealBlock");
        GameRegistry.registerBlock(enhancedEterealBlock, "enhancedEterealBlock");
        GameRegistry.registerBlock(MagiChest, "magiChest");
    }
}