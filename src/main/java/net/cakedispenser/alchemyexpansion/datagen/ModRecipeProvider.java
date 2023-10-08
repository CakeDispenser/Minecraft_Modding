package net.cakedispenser.alchemyexpansion.datagen;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.cakedispenser.alchemyexpansion.block.ModBlocks;
import net.cakedispenser.alchemyexpansion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(),
            ModBlocks.SILVER_ORE.get(),
            ModBlocks.DEEPSLATE_SILVER_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100,
                "silver");
        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200,
                "silver");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_QUARTZ.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.GOLD_NUGGET)
                .define('#', Items.QUARTZ)
                .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.MITHRIL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLITTERING_GLOWSTONE.get(), 1)
                .requires(Items.GLOWSTONE_DUST)
                .requires(Items.GLOWSTONE_DUST)
                .requires(Items.GLOWSTONE_DUST)
                .requires(Items.QUARTZ)
                .requires(Items.GOLD_NUGGET)
                .requires(Items.GOLD_NUGGET)
                .requires(Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POWERED_REDSTONE.get(), 1)
                .requires(Items.REDSTONE)
                .requires(Items.REDSTONE)
                .requires(Items.REDSTONE)
                .requires(Items.QUARTZ)
                .requires(Items.IRON_NUGGET)
                .requires(Items.IRON_NUGGET)
                .requires(Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POTENT_MIX.get(), 1)
                .requires(ModItems.GLITTERING_GLOWSTONE.get())
                .requires(ModItems.GLITTERING_GLOWSTONE.get())
                .requires(ModItems.POWERED_REDSTONE.get())
                .requires(ModItems.POWERED_REDSTONE.get())
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, AlchemyExpansion.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
