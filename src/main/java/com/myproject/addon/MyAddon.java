package com.myproject.addon;

import com.myproject.addon.modules.esp.ChunkFinder;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;

public class MyAddon extends MeteorAddon {

    public static final Category ESP = new Category("MyAddon-ESP", Items.ENDER_EYE.getDefaultStack());

    @Override
    public void onInitialize() {
        Modules.get().add(new ChunkFinder());
    }

    @Override
    public String getPackage() {
        return "com.myproject.addon";
    }
}
