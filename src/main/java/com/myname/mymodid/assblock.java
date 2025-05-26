package com.myname.mymodid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class assblock extends BlockContainer {
    assblock(Material x){
        super(x);
        setBlockName("shitbird");
        setBlockTextureName(MyMod.MODID +":assblock");
        setLightLevel(1.0F);
    }
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        System.out.println("waaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return new shitTE();
    }
}
