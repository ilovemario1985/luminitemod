package net.ilovemario1985.luminitemod.block;

import net.ilovemario1985.luminitemod.LuminiteMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block LUMINITE_BLOCK = registerBlock("luminite_block",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).lightLevel(state -> 15)
                    .requiresCorrectToolForDrops().sound(SoundType.VAULT)));
    public static final Block RAW_LUMINITE_BLOCK = registerBlock("raw_luminite_block",
            properties -> new Block(properties.strength(5.0f, 6.0F).lightLevel(state -> 10)
                    .requiresCorrectToolForDrops().sound(SoundType.SPAWNER)));

    public static final Block LUMINITE_ORE = registerBlock("luminite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2.0f, 6.0f).lightLevel(state -> 5)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_LUMINITE_ORE = registerBlock("deepslate_luminite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(5, 8), properties.strength(3.0f, 6.0F).lightLevel(state -> 7)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block NETHER_LUMINITE_ORE = registerBlock("nether_luminite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(8, 11), properties.strength(3.4f).lightLevel(state -> 7)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final Block END_LUMINITE_ORE = registerBlock("end_luminite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(11, 14), properties.strength(3.6f, 9.0F).lightLevel(state -> 7)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block PINK_LUMINITE_BLOCK = registerBlock("pink_luminite_block",
    properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block PINK_LUMINITE_BRICKS = registerBlock("pink_luminite_bricks",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CHISELED_PINK_LUMINITE_BRICKS = registerBlock("chiseled_pink_luminite_bricks",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_PINK_LUMINITE = registerBlock("smooth_pink_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PINK_LUMINITE = registerBlock("polished_pink_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_PINK_LUMINITE = registerBlock("cut_pink_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block PINK_LUMINITE_GRATE = registerBlock("pink_luminite_grate",
            properties -> new WaterloggedTransparentBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops().noOcclusion()));

    public static final Block PINK_LUMINITE_STAIRS = registerBlock("pink_luminite_stairs",
            properties -> new StairBlock(ModBlocks.PINK_LUMINITE_BLOCK.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block PINK_LUMINITE_SLAB = registerBlock("pink_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block PINK_LUMINITE_BRICK_STAIRS = registerBlock("pink_luminite_brick_stairs",
            properties -> new StairBlock(ModBlocks.PINK_LUMINITE_BRICKS.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block PINK_LUMINITE_BRICK_SLAB = registerBlock("pink_luminite_brick_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_PINK_LUMINITE_STAIRS = registerBlock("smooth_pink_luminite_stairs",
            properties -> new StairBlock(ModBlocks.SMOOTH_PINK_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_PINK_LUMINITE_SLAB = registerBlock("smooth_pink_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PINK_LUMINITE_STAIRS = registerBlock("polished_pink_luminite_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_PINK_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PINK_LUMINITE_SLAB = registerBlock("polished_pink_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_PINK_LUMINITE_STAIRS = registerBlock("cut_pink_luminite_stairs",
            properties -> new StairBlock(ModBlocks.CUT_PINK_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_PINK_LUMINITE_SLAB = registerBlock("cut_pink_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));



    public static final Block BLUE_LUMINITE_BLOCK = registerBlock("blue_luminite_block",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block BLUE_LUMINITE_BRICKS = registerBlock("blue_luminite_bricks",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CHISELED_BLUE_LUMINITE_BRICKS = registerBlock("chiseled_blue_luminite_bricks",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BLUE_LUMINITE = registerBlock("smooth_blue_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_BLUE_LUMINITE = registerBlock("polished_blue_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_BLUE_LUMINITE = registerBlock("cut_blue_luminite",
            properties -> new Block(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block BLUE_LUMINITE_GRATE = registerBlock("blue_luminite_grate",
            properties -> new WaterloggedTransparentBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops().noOcclusion()));

    public static final Block BLUE_LUMINITE_STAIRS = registerBlock("blue_luminite_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_LUMINITE_BLOCK.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block BLUE_LUMINITE_SLAB = registerBlock("blue_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block BLUE_LUMINITE_BRICK_STAIRS = registerBlock("blue_luminite_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_LUMINITE_BRICKS.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block BLUE_LUMINITE_BRICK_SLAB = registerBlock("blue_luminite_brick_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BLUE_LUMINITE_STAIRS = registerBlock("smooth_blue_luminite_stairs",
            properties -> new StairBlock(ModBlocks.SMOOTH_BLUE_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block SMOOTH_BLUE_LUMINITE_SLAB = registerBlock("smooth_blue_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_BLUE_LUMINITE_STAIRS = registerBlock("polished_blue_luminite_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_BLUE_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block POLISHED_BLUE_LUMINITE_SLAB = registerBlock("polished_blue_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_BLUE_LUMINITE_STAIRS = registerBlock("cut_blue_luminite_stairs",
            properties -> new StairBlock(ModBlocks.CUT_BLUE_LUMINITE.defaultBlockState(),
                    properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));
    public static final Block CUT_BLUE_LUMINITE_SLAB = registerBlock("cut_blue_luminite_slab",
            properties -> new SlabBlock(properties.strength(7.5f, 3600000.0F).requiresCorrectToolForDrops()));






    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, name)))));
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        LuminiteMod.LOGGER.info("Registering Mod Blocks for " + LuminiteMod.MOD_ID);
    }
}
