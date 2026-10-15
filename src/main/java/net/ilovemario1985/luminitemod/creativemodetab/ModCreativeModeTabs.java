package net.ilovemario1985.luminitemod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.ilovemario1985.luminitemod.LuminiteMod;
import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.ilovemario1985.luminitemod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab LUMINITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, "luminite_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.LUMINITE))
                    .title(Component.translatable("creativemodetab.luminitemod.luminite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.LUMINITE);
                        output.accept(ModItems.BLUE_LUMINITE);
                        output.accept(ModItems.PINK_LUMINITE);
                        output.accept(ModItems.RAW_LUMINITE);


                    }).build());

    public static final CreativeModeTab LUMINITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(LuminiteMod.MOD_ID, "luminite_blocks"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.LUMINITE_BLOCK))
                    .title(Component.translatable("creativemodetab.luminitemod.luminite_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.LUMINITE_BLOCK);
                        output.accept(ModBlocks.RAW_LUMINITE_BLOCK);
                        output.accept(ModBlocks.LUMINITE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_LUMINITE_ORE);
                        output.accept(ModBlocks.NETHER_LUMINITE_ORE);
                        output.accept(ModBlocks.END_LUMINITE_ORE);

                        output.accept(ModBlocks.PINK_LUMINITE_BLOCK);
                        output.accept(ModBlocks.PINK_LUMINITE_STAIRS);
                        output.accept(ModBlocks.PINK_LUMINITE_SLAB);

                        output.accept(ModBlocks.PINK_LUMINITE_BRICKS);
                        output.accept(ModBlocks.CHISELED_PINK_LUMINITE_BRICKS);
                        output.accept(ModBlocks.PINK_LUMINITE_BRICK_STAIRS);
                        output.accept(ModBlocks.PINK_LUMINITE_BRICK_SLAB);

                        output.accept(ModBlocks.SMOOTH_PINK_LUMINITE);
                        output.accept(ModBlocks.SMOOTH_PINK_LUMINITE_STAIRS);
                        output.accept(ModBlocks.SMOOTH_PINK_LUMINITE_SLAB);

                        output.accept(ModBlocks.POLISHED_PINK_LUMINITE);
                        output.accept(ModBlocks.POLISHED_PINK_LUMINITE_STAIRS);
                        output.accept(ModBlocks.POLISHED_PINK_LUMINITE_SLAB);

                        output.accept(ModBlocks.CUT_PINK_LUMINITE);
                        output.accept(ModBlocks.CUT_PINK_LUMINITE_STAIRS);
                        output.accept(ModBlocks.CUT_PINK_LUMINITE_SLAB);

                        output.accept(ModBlocks.PINK_LUMINITE_GRATE);

                        output.accept(ModBlocks.BLUE_LUMINITE_BLOCK);
                        output.accept(ModBlocks.BLUE_LUMINITE_STAIRS);
                        output.accept(ModBlocks.BLUE_LUMINITE_SLAB);

                        output.accept(ModBlocks.BLUE_LUMINITE_BRICKS);
                        output.accept(ModBlocks.CHISELED_BLUE_LUMINITE_BRICKS);
                        output.accept(ModBlocks.BLUE_LUMINITE_BRICK_STAIRS);
                        output.accept(ModBlocks.BLUE_LUMINITE_BRICK_SLAB);

                        output.accept(ModBlocks.SMOOTH_BLUE_LUMINITE);
                        output.accept(ModBlocks.SMOOTH_BLUE_LUMINITE_STAIRS);
                        output.accept(ModBlocks.SMOOTH_BLUE_LUMINITE_SLAB);

                        output.accept(ModBlocks.POLISHED_BLUE_LUMINITE);
                        output.accept(ModBlocks.POLISHED_BLUE_LUMINITE_STAIRS);
                        output.accept(ModBlocks.POLISHED_BLUE_LUMINITE_SLAB);

                        output.accept(ModBlocks.CUT_BLUE_LUMINITE);
                        output.accept(ModBlocks.CUT_BLUE_LUMINITE_STAIRS);
                        output.accept(ModBlocks.CUT_BLUE_LUMINITE_SLAB);

                        output.accept(ModBlocks.BLUE_LUMINITE_GRATE);

                    }).build());


    public static void registerModCreativeModeTabs() {
        LuminiteMod.LOGGER.info("Registering Creative Mode Tabs for " + LuminiteMod.MOD_ID);
    }
}
