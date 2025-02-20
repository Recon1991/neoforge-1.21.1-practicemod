package net.reconhalcyon.practicemod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItem extends Item {
    public int burnTime = 0;

    public FuelItem(Properties properties) {
        super(properties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }
}
