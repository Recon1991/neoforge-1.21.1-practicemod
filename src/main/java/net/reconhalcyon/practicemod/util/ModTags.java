package net.reconhalcyon.practicemod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.reconhalcyon.practicemod.PracticeMod;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlocksTags.create(ResourceLocation.fromNamespaceAndPath(PracticeMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PracticeMod.MOD_ID, name));
        }
    }

}
