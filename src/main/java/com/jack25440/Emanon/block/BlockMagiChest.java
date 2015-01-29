package com.jack25440.Emanon.block;

import com.jack25440.Emanon.Emanon;
import com.jack25440.Emanon.Reference.Names;
import com.jack25440.Emanon.Reference.Reference;
import com.sun.deploy.panel.ExceptionListDialog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;

import javax.swing.*;
import java.sql.Ref;
import java.util.Random;

public class BlockMagiChest extends BlockEmanon {

    private final Random random = new Random();
    @SideOnly(Side.CLIENT)
    private IIcon iconFront;
    @SideOnly(Side.CLIENT)
    private IIcon iconBlock;

    public BlockMagiChest() {
        super();
        this.setBlockName("magiChest");
        this.setLightLevel(2);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int intSide, int intMeta)
    {
        return intSide == 2 ? this.iconFront : (intSide != intMeta ? this.iconBlock : this.iconBlock);
    }

    @SideOnly(Side.CLIENT)
    public void registericonBlocks(IIconRegister iconRegister)
    {
        this.iconBlock = iconRegister.registerIcon(Names.Forms.magiChest);
        this.iconFront = iconRegister.registerIcon(Names.Forms.magiChest + Names.Directions.FRONT);
    }
}