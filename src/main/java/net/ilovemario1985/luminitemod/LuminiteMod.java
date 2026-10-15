package net.ilovemario1985.luminitemod;

import net.fabricmc.api.ModInitializer;

import net.ilovemario1985.luminitemod.block.ModBlocks;
import net.ilovemario1985.luminitemod.creativemodetab.ModCreativeModeTabs;
import net.ilovemario1985.luminitemod.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuminiteMod implements ModInitializer {
	public static final String MOD_ID = "luminitemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}
