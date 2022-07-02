package com.burningcactus.cactusaether.data;

import com.burningcactus.cactusaether.block.ModBlocks;
import com.gildedgames.aether.common.registry.AetherItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class ModRecipeData extends RecipeProvider {
    public ModRecipeData(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.AMBROSIUM_CAMPFIRE.get())
                .define('L', ItemTags.LOGS)
                .define('S', Items.STICK)
                .define('C', AetherItems.AMBROSIUM_SHARD.get())
                .pattern(" S ")
                .pattern("SCS")
                .pattern("LLL")
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_ambrosium", has(AetherItems.AMBROSIUM_SHARD.get())).save(pFinishedRecipeConsumer);
    }
}
