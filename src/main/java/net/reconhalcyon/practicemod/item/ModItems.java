package net.reconhalcyon.practicemod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reconhalcyon.practicemod.PracticeMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PracticeMod.MOD_ID);

    public static final DeferredItem<Item> MORPHITEINGOT = ITEMS.register("morphiteingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MORPHITE = ITEMS.register("raw_morphite",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
