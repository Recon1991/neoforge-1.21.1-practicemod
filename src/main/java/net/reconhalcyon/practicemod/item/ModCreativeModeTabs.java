package net.reconhalcyon.practicemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reconhalcyon.practicemod.PracticeMod;
import net.reconhalcyon.practicemod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final Supplier<CreativeModeTab> PREVIEW_ITEMS_TAB = CREATIVE_MODE_TAB.register("preview_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MORPHITEINGOT.get()))
                    .title(Component.translatable("creativetab.recontutmod.preview_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MORPHITEINGOT);
                        output.accept(ModItems.RAW_MORPHITE);
                    }).build());

    public static final Supplier<CreativeModeTab> PREVIEW_BLOCK_TAB = CREATIVE_MODE_TAB.register("preview_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MORPHITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(PracticeMod.MOD_ID, "preview_items_tab"))
                    .title(Component.translatable("creativetab.recontutmod.preview_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MORPHITE_BLOCK);
                        output.accept(ModBlocks.MORPHITE_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
