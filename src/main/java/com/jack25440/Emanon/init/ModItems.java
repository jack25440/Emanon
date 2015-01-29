package com.jack25440.Emanon.init;

import com.jack25440.Emanon.Reference.Reference;
import com.jack25440.Emanon.item.*;
import com.jack25440.Emanon.Reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by jack2 on 17/01/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEmanon eterealEssence = new ItemEterealEssence();
    public static final ItemEmanon DarkenedEterealEssence = new DarkenedEterealEssence();
    public static final ItemEmanon orb = new Orb();
    public static final ItemEmanon EDE = new EnhancedDarkEssence();
    public static final ItemEmanon AwakenedOrb = new AwakenedOrb();

    public static void init()
    {
        GameRegistry.registerItem(eterealEssence, "eterealEssence");
        GameRegistry.registerItem(DarkenedEterealEssence, "darkenedEterealEssence");
        GameRegistry.registerItem(orb, "orb");
        GameRegistry.registerItem(EDE, "EDE");
        GameRegistry.registerItem(AwakenedOrb, "AwakenedOrb");
    }
}
