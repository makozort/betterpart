package com.example.betterparticles.Item;

import com.example.betterparticles.BetterParticles;
import com.example.betterparticles.Item.Custom.TestItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AllItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterParticles.MODID);

    public static final DeferredItem<TestItem> TEST_ITEM = ITEMS.register("test_item",
            () -> new TestItem(new Item.Properties()));



    public static void reg(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
