package net.ilovemario1985.luminitemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.ilovemario1985.luminitemod.item.ModItems;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.LUMINITE_BLOCK);
        dropSelf(ModBlocks.RAW_LUMINITE_BLOCK);

        dropSelf(ModBlocks.PINK_LUMINITE_BLOCK);
        dropSelf(ModBlocks.PINK_LUMINITE_BRICKS);
        dropSelf(ModBlocks.CHISELED_PINK_LUMINITE_BRICKS);
        dropSelf(ModBlocks.SMOOTH_PINK_LUMINITE);
        dropSelf(ModBlocks.POLISHED_PINK_LUMINITE);
        dropSelf(ModBlocks.CUT_PINK_LUMINITE);
        dropSelf(ModBlocks.PINK_LUMINITE_GRATE);

        dropSelf(ModBlocks.PINK_LUMINITE_STAIRS);
        add(ModBlocks.PINK_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_LUMINITE_BRICK_STAIRS);
        add(ModBlocks.PINK_LUMINITE_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS);
        add(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_PINK_LUMINITE_STAIRS);
        add(ModBlocks.POLISHED_PINK_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CUT_PINK_LUMINITE_STAIRS);
        add(ModBlocks.CUT_PINK_LUMINITE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BLUE_LUMINITE_BLOCK);
        dropSelf(ModBlocks.BLUE_LUMINITE_BRICKS);
        dropSelf(ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS);
        dropSelf(ModBlocks.SMOOTH_BLUE_LUMINITE);
        dropSelf(ModBlocks.POLISHED_BLUE_LUMINITE);
        dropSelf(ModBlocks.CUT_BLUE_LUMINITE);
        dropSelf(ModBlocks.BLUE_LUMINITE_GRATE);

        dropSelf(ModBlocks.BLUE_LUMINITE_STAIRS);
        add(ModBlocks.BLUE_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS);
        add(ModBlocks.BLUE_LUMINITE_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS);
        add(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_BLUE_LUMINITE_STAIRS);
        add(ModBlocks.POLISHED_BLUE_LUMINITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CUT_BLUE_LUMINITE_STAIRS);
        add(ModBlocks.CUT_BLUE_LUMINITE_SLAB, this::createSlabItemTable);

        add(ModBlocks.LUMINITE_ORE, block -> createOreDrop(block, ModItems.RAW_LUMINITE));
        add(ModBlocks.DEEPSLATE_LUMINITE_ORE, block -> createOreDrop(block, ModItems.RAW_LUMINITE));
        add(ModBlocks.NETHER_LUMINITE_ORE, block -> createOreDrop(block, ModItems.RAW_LUMINITE));
        add(ModBlocks.END_LUMINITE_ORE, block -> createOreDrop(block, ModItems.RAW_LUMINITE));

    }

}
