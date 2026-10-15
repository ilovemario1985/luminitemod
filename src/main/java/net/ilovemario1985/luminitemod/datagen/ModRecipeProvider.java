package net.ilovemario1985.luminitemod.datagen;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.ilovemario1985.luminitemod.LuminiteMod;
import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.ilovemario1985.luminitemod.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.BlockFamily.Builder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static net.minecraft.data.BlockFamilies.familyBuilder;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {

        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                List<ItemLike> LUMINITE_SMELTABLE = List.of(ModItems.RAW_LUMINITE, ModBlocks.LUMINITE_ORE, ModBlocks.DEEPSLATE_LUMINITE_ORE, ModBlocks.NETHER_LUMINITE_ORE, ModBlocks.END_LUMINITE_ORE);
                List<ItemLike> LUMINITE_PINK_BLOCKS = List.of(ModBlocks.PINK_LUMINITE_BLOCK, ModBlocks.PINK_LUMINITE_BRICKS, ModBlocks.CHISELED_PINK_LUMINITE_BRICKS, ModBlocks.SMOOTH_PINK_LUMINITE, ModBlocks.POLISHED_PINK_LUMINITE, ModBlocks.CUT_PINK_LUMINITE, ModBlocks.PINK_LUMINITE_GRATE);
                List<ItemLike> LUMINITE_BLUE_BLOCKS = List.of(ModBlocks.BLUE_LUMINITE_BLOCK, ModBlocks.BLUE_LUMINITE_BRICKS,  ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS, ModBlocks.SMOOTH_BLUE_LUMINITE, ModBlocks.POLISHED_BLUE_LUMINITE, ModBlocks.CUT_BLUE_LUMINITE, ModBlocks.BLUE_LUMINITE_GRATE);

                oreSmelting(LUMINITE_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LUMINITE, 0.5f, 200, "luminite");
                oreBlasting(LUMINITE_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LUMINITE, 0.5f, 100, "luminite");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LUMINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUMINITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.PINK_LUMINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_LUMINITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.BLUE_LUMINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_LUMINITE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_LUMINITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_LUMINITE_BLOCK);

                smeltingResultFromBase(ModBlocks.SMOOTH_PINK_LUMINITE, ModBlocks.PINK_LUMINITE_BLOCK);
                smeltingResultFromBase(ModBlocks.SMOOTH_BLUE_LUMINITE, ModBlocks.BLUE_LUMINITE_BLOCK);

                shapeless(RecipeCategory.MISC, ModItems.PINK_LUMINITE)
                        .requires(ModItems.LUMINITE)
                        .requires(Items.DYE.pink())
                        .requires(Items.DYE.magenta())
                        .requires(Items.DYE.purple())
                        .unlockedBy(getHasName(ModItems.LUMINITE), has(ModItems.LUMINITE))
                        .save(output, "pink_luminite_from_dye");

                shapeless(RecipeCategory.MISC, ModItems.BLUE_LUMINITE)
                        .requires(ModItems.LUMINITE)
                        .requires(Items.DYE.lightBlue())
                        .requires(Items.DYE.blue())
                        .requires(Items.DYE.cyan())
                        .unlockedBy(getHasName(ModItems.LUMINITE), has(ModItems.LUMINITE))
                        .save(output, "blue_luminite_from_dye");


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PINK_LUMINITE)
                        .pattern("RR")
                        .pattern("RR")
                        .define('R', ModBlocks.SMOOTH_PINK_LUMINITE)
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_PINK_LUMINITE), has(ModBlocks.SMOOTH_PINK_LUMINITE))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLUE_LUMINITE)
                        .pattern("RR")
                        .pattern("RR")
                        .define('R', ModBlocks.SMOOTH_BLUE_LUMINITE)
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BLUE_LUMINITE), has(ModBlocks.SMOOTH_BLUE_LUMINITE))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_LUMINITE_SLAB, ModBlocks.PINK_LUMINITE_BLOCK);

                stairBuilder(ModBlocks.PINK_LUMINITE_STAIRS, Ingredient.of(ModBlocks.PINK_LUMINITE_BLOCK))
                        .unlockedBy(getHasName(ModBlocks.PINK_LUMINITE_BLOCK), has(ModBlocks.PINK_LUMINITE_BLOCK))
                        .group("pink_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_LUMINITE_BRICK_SLAB, ModBlocks.PINK_LUMINITE_BRICKS);

                stairBuilder(ModBlocks.PINK_LUMINITE_BRICK_STAIRS, Ingredient.of(ModBlocks.PINK_LUMINITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PINK_LUMINITE_BRICKS), has(ModBlocks.PINK_LUMINITE_BRICKS))
                        .group("pink_luminite_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_PINK_LUMINITE_SLAB, ModBlocks.SMOOTH_PINK_LUMINITE);

                stairBuilder(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS, Ingredient.of(ModBlocks.SMOOTH_PINK_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_PINK_LUMINITE), has(ModBlocks.SMOOTH_PINK_LUMINITE))
                        .group("smooth_pink_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PINK_LUMINITE_SLAB, ModBlocks.POLISHED_PINK_LUMINITE);

                stairBuilder(ModBlocks.POLISHED_PINK_LUMINITE_STAIRS, Ingredient.of(ModBlocks.POLISHED_PINK_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_PINK_LUMINITE), has(ModBlocks.POLISHED_PINK_LUMINITE))
                        .group("polished_pink_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_PINK_LUMINITE_SLAB, ModBlocks.CUT_PINK_LUMINITE);

                stairBuilder(ModBlocks.CUT_PINK_LUMINITE_STAIRS, Ingredient.of(ModBlocks.CUT_PINK_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.CUT_PINK_LUMINITE), has(ModBlocks.CUT_PINK_LUMINITE))
                        .group("cut_pink_luminite")
                        .save(output);



                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_LUMINITE_SLAB, ModBlocks.BLUE_LUMINITE_BLOCK);

                stairBuilder(ModBlocks.BLUE_LUMINITE_STAIRS, Ingredient.of(ModBlocks.BLUE_LUMINITE_BLOCK))
                        .unlockedBy(getHasName(ModBlocks.BLUE_LUMINITE_BLOCK), has(ModBlocks.BLUE_LUMINITE_BLOCK))
                        .group("blue_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_LUMINITE_BRICK_SLAB, ModBlocks.BLUE_LUMINITE_BRICKS);

                stairBuilder(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS, Ingredient.of(ModBlocks.BLUE_LUMINITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLUE_LUMINITE_BRICKS), has(ModBlocks.BLUE_LUMINITE_BRICKS))
                        .group("blue_luminite_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB, ModBlocks.SMOOTH_BLUE_LUMINITE);

                stairBuilder(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS, Ingredient.of(ModBlocks.SMOOTH_BLUE_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BLUE_LUMINITE), has(ModBlocks.SMOOTH_BLUE_LUMINITE))
                        .group("smooth_blue_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLUE_LUMINITE_SLAB, ModBlocks.POLISHED_BLUE_LUMINITE);

                stairBuilder(ModBlocks.POLISHED_BLUE_LUMINITE_STAIRS, Ingredient.of(ModBlocks.POLISHED_BLUE_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_BLUE_LUMINITE), has(ModBlocks.POLISHED_BLUE_LUMINITE))
                        .group("polished_blue_luminite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLUE_LUMINITE_SLAB, ModBlocks.CUT_BLUE_LUMINITE);

                stairBuilder(ModBlocks.CUT_BLUE_LUMINITE_STAIRS, Ingredient.of(ModBlocks.CUT_BLUE_LUMINITE))
                        .unlockedBy(getHasName(ModBlocks.CUT_BLUE_LUMINITE), has(ModBlocks.CUT_BLUE_LUMINITE))
                        .group("cut_blue_luminite")
                        .save(output);
            }
        };
    }

    @Override
    public String getName(){
        return "Luminite Mod Recipes";
    }
}
