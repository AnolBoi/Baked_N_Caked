package net.anoltongi.bakedncaked.datagen;

import net.anoltongi.bakedncaked.BakedNCakedMod;
import net.anoltongi.bakedncaked.block.ModBlocks;
import net.anoltongi.bakedncaked.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //private static final List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
            //ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
            //ModBlocks.END_STONE_ALEXANDRITE_ORE.get());


    private static final List<ItemLike> BREAD_SLICE_SMELTABLE = List.of(ModItems.BREAD_SLICE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                //.pattern("AAA")
                //.pattern("AAA")
                //.pattern("AAA")
                //.define('A', ModItems.ALEXANDRITE.get())
                //.unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        //of(ModItems.ALEXANDRITE.get()).build()))
                //.save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BREAD_SLICE.get(), 3)
        .requires(Items.BREAD)
        .unlockedBy("has_bread", inventoryTrigger(ItemPredicate.Builder.item().
        of(Items.BREAD).build()))
        .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHOCOLATE_PASTE.get(), 1)
                .requires(Items.COCOA_BEANS)
                .requires(Items.MILK_BUCKET)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.COCOA_BEANS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHOCOLATE_PASTE_BREAD_SLICE.get(), 1)
                .requires(ModItems.CHOCOLATE_PASTE.get())
                .requires(ModItems.BREAD_SLICE.get())
                .unlockedBy("has_bread_slice_and_cocoa", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.BREAD_SLICE.get(), Items.COCOA_BEANS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_BERRY_JAM.get(), 1)
                .requires(Items.SWEET_BERRIES)
                .requires(Items.SUGAR)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_sweet_berries", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.SWEET_BERRIES).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_BERRY_JAM_BREAD_SLICE.get(), 1)
                .requires(ModItems.BREAD_SLICE.get())
                .requires(ModItems.SWEET_BERRY_JAM.get())
                .unlockedBy("has_bread_slice_and_sweet", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.BREAD_SLICE.get(), Items.SWEET_BERRIES).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLOW_BERRY_JAM.get(), 1)
                .requires(Items.GLOW_BERRIES)
                .requires(Items.SUGAR)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_glow_berries", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.GLOW_BERRIES).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLOW_BERRY_JAM_BREAD_SLICE.get(), 1)
                .requires(ModItems.BREAD_SLICE.get())
                .requires(ModItems.GLOW_BERRY_JAM.get())
                .unlockedBy("has_bread_slice_and_glow", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.BREAD_SLICE.get(), Items.GLOW_BERRIES).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.APPLE_PIE_SLICE.get(), 6)
                .requires(ModBlocks.APPLE_PIE.get())
                .unlockedBy("has_apple_pie", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.APPLE_PIE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_BERRY_PIE_SLICE.get(), 6)
                .requires(ModBlocks.SWEET_BERRY_PIE.get())
                .unlockedBy("has_sweet_berry_pie", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.SWEET_BERRY_PIE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLOW_BERRY_PIE_SLICE.get(), 6)
                .requires(ModBlocks.GLOW_BERRY_PIE.get())
                .unlockedBy("has_glow_berry_pie", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.GLOW_BERRY_PIE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE_BERRY_PIE_SLICE.get(), 6)
                .requires(ModBlocks.BLUE_BERRY_PIE.get())
                .unlockedBy("has_blue_berry_pie", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BLUE_BERRY_PIE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHOCOLATE_CAKE_SLICE.get(), 6)
                .requires(ModBlocks.CHOCOLATE_CAKE.get())
                .unlockedBy("has_chocolate_cake", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.CHOCOLATE_CAKE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CARROT_CAKE_SLICE.get(), 6)
                .requires(ModBlocks.CARROT_CAKE.get())
                .unlockedBy("has_carrot_cake", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.CARROT_CAKE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KNIFE.get())
            .pattern("   ")
            .pattern(" I ")
            .pattern(" S ")
            .define('S', Items.STICK)
            .define('I', Items.IRON_INGOT)
            .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item().
            of(Items.IRON_INGOT).build()))
            .save(pWriter);

        //nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                //"mccourse:raw_alexandrite", "alexandrite","mccourse:raw_alexandrite_block", "alexandrite");

        oreSmelting(pWriter, BREAD_SLICE_SMELTABLE, RecipeCategory.MISC, ModItems.TOAST.get(), 0.1f, 200, "bread_slice");
        foodSmoking(pWriter, BREAD_SLICE_SMELTABLE, RecipeCategory.MISC, ModItems.TOAST.get(), 0.1f, 100, "bread_slice");
        foodCampfire(pWriter, BREAD_SLICE_SMELTABLE, RecipeCategory.MISC, ModItems.TOAST.get(), 0f, 600, "bread_slice");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, BakedNCakedMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void foodSmoking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMOKING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smoking");
    }

    protected static void foodCampfire(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_campfire");
    }


}
