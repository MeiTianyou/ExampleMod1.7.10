package com.myname.mymodid;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModItems {
    public static Item tut;
    public static final void init(){
        tut = new Item().setUnlocalizedName("awawawaaaaa").setTextureName(MyMod.MODID + ":tut");
        GameRegistry.registerItem(tut, "awaawawawwa");

    }

}
