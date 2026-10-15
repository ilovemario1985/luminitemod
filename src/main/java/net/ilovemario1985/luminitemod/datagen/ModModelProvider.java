package net.ilovemario1985.luminitemod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.ilovemario1985.luminitemod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.LUMINITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_LUMINITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.LUMINITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_LUMINITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.NETHER_LUMINITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.END_LUMINITE_ORE);

        //blockModelGenerators.createTrivialCube(ModBlocks.PINK_LUMINITE_BLOCK);
        //blockModelGenerators.createTrivialCube(ModBlocks.PINK_LUMINITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_PINK_LUMINITE_BRICKS);
        //blockModelGenerators.createTrivialCube(ModBlocks.SMOOTH_PINK_LUMINITE);
        //blockModelGenerators.createTrivialCube(ModBlocks.POLISHED_PINK_LUMINITE);
        //blockModelGenerators.createTrivialCube(ModBlocks.CUT_PINK_LUMINITE);
        blockModelGenerators.createTrivialCube(ModBlocks.PINK_LUMINITE_GRATE);

        //blockModelGenerators.createTrivialCube(ModBlocks.BLUE_LUMINITE_BLOCK);
        //blockModelGenerators.createTrivialCube(ModBlocks.BLUE_LUMINITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS);
        //blockModelGenerators.createTrivialCube(ModBlocks.SMOOTH_BLUE_LUMINITE);
        //blockModelGenerators.createTrivialCube(ModBlocks.POLISHED_BLUE_LUMINITE);
        //blockModelGenerators.createTrivialCube(ModBlocks.CUT_BLUE_LUMINITE);
        blockModelGenerators.createTrivialCube(ModBlocks.BLUE_LUMINITE_GRATE);

        blockModelGenerators.family(ModBlocks.PINK_LUMINITE_BLOCK)
                .stairs(ModBlocks.PINK_LUMINITE_STAIRS)
                .slab(ModBlocks.PINK_LUMINITE_SLAB);

        blockModelGenerators.family(ModBlocks.PINK_LUMINITE_BRICKS)
                .stairs(ModBlocks.PINK_LUMINITE_BRICK_STAIRS)
                .slab(ModBlocks.PINK_LUMINITE_BRICK_SLAB);

        blockModelGenerators.family(ModBlocks.SMOOTH_PINK_LUMINITE)
                .slab(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB)
                .stairs(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS);

        blockModelGenerators.family(ModBlocks.POLISHED_PINK_LUMINITE)
                .slab(ModBlocks.POLISHED_PINK_LUMINITE_SLAB)
                .stairs(ModBlocks.POLISHED_PINK_LUMINITE_STAIRS);

        blockModelGenerators.family(ModBlocks.CUT_PINK_LUMINITE)
                .slab(ModBlocks.CUT_PINK_LUMINITE_SLAB)
                .stairs(ModBlocks.CUT_PINK_LUMINITE_STAIRS);



        blockModelGenerators.family(ModBlocks.BLUE_LUMINITE_BLOCK)
                .stairs(ModBlocks.BLUE_LUMINITE_STAIRS)
                .slab(ModBlocks.BLUE_LUMINITE_SLAB);

        blockModelGenerators.family(ModBlocks.BLUE_LUMINITE_BRICKS)
                .stairs(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS)
                .slab(ModBlocks.BLUE_LUMINITE_BRICK_SLAB);

        blockModelGenerators.family(ModBlocks.SMOOTH_BLUE_LUMINITE)
                .slab(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB)
                .stairs(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS);

        blockModelGenerators.family(ModBlocks.POLISHED_BLUE_LUMINITE)
                .slab(ModBlocks.POLISHED_BLUE_LUMINITE_SLAB)
                .stairs(ModBlocks.POLISHED_BLUE_LUMINITE_STAIRS);

        blockModelGenerators.family(ModBlocks.CUT_BLUE_LUMINITE)
                .slab(ModBlocks.CUT_BLUE_LUMINITE_SLAB)
                .stairs(ModBlocks.CUT_BLUE_LUMINITE_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.LUMINITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLUE_LUMINITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINK_LUMINITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_LUMINITE, ModelTemplates.FLAT_ITEM);
    }
}