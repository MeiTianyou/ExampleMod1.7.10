package com.myname.mymodid;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public final class ModBlocks {
    public static BlockContainer ass;

    public static final void init(){
        GameRegistry.registerBlock(ass = new assblock( Material.iron), "shitbird");
    }
}
