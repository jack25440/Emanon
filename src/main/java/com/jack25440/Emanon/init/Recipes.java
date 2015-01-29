package com.jack25440.Emanon.init;

import com.jack25440.Emanon.item.ItemEterealEssence;
import com.jack25440.Emanon.item.Orb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by jack2 on 20/01/2015.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.eterealBlock), new ItemStack(ModItems.eterealEssence), new ItemStack(ModItems.eterealEssence), new ItemStack(ModItems.eterealEssence), new ItemStack(ModItems.eterealEssence), new ItemStack(ModItems.eterealEssence), new ItemStack(ModItems.eterealEssence));
        GameRegistry.addSmelting(ModBlocks.eterealOre, new ItemStack(ModItems.eterealEssence, 5, 11), 5.0F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.eterealEssence, 9), new ItemStack(ModBlocks.eterealBlock));
        GameRegistry.addSmelting(ModItems.eterealEssence, new ItemStack(ModItems.DarkenedEterealEssence, 1, 11), 5.0F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.darkenedEterealBlock, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence), new ItemStack(ModItems.DarkenedEterealEssence));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DarkenedEterealEssence, 9), new ItemStack(ModBlocks.darkenedEterealBlock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.orb), "eee", "ese", "eee", 'e', new ItemStack(ModItems.eterealEssence, 1, 0), 's', new ItemStack(Blocks.stone));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.EDE, 4), "ddd", "dnd", "ddd", 'd', new ItemStack(ModBlocks.darkenedEterealBlock, 1, 0), 'n', new ItemStack(Blocks.nether_brick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.AwakenedOrb), "eee", "eoe", "eee", 'e', new ItemStack(ModItems.EDE), 'o', new ItemStack(ModItems.orb));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.EDE, 16), "eee", "eae", "eee", 'e', new ItemStack(ModItems.eterealEssence), 'a', new ItemStack(ModItems.AwakenedOrb));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.enhancedEterealBlock, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE), new ItemStack(ModItems.EDE));
    }
}