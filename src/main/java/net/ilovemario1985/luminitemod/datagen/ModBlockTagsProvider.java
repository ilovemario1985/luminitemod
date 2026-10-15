package net.ilovemario1985.luminitemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RAW_LUMINITE_BLOCK))

                .add(ModBlocks.getRK(ModBlocks.LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.NETHER_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.END_LUMINITE_ORE))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_GRATE))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_SLAB))

                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_PINK_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_GRATE))

                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_SLAB));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RAW_LUMINITE_BLOCK))

                .add(ModBlocks.getRK(ModBlocks.LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.NETHER_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.END_LUMINITE_ORE))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_GRATE))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_SLAB))

                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_PINK_LUMINITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_GRATE))

                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_SLAB));

        tag(BlockTags.ORES)
                .add(ModBlocks.getRK(ModBlocks.LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.NETHER_LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.END_LUMINITE_ORE));

        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_PINK_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_SLAB))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_BLUE_LUMINITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_SLAB));

        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.PINK_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_PINK_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_PINK_LUMINITE_STAIRS))

                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_BLUE_LUMINITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CUT_BLUE_LUMINITE_STAIRS));

    }
}