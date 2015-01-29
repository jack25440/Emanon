package com.jack25440.Emanon.block;

import com.jack25440.Emanon.Reference.Reference;
import com.jack25440.Emanon.creativetab.CreativeTabEmanon;
import com.jack25440.Emanon.Reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by jack2 on 18/01/2015.
 */
public class BlockEmanon extends Block
{
    public BlockEmanon(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabEmanon.EMANON_TAB);
    }

    public BlockEmanon()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
