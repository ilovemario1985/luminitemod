package net.ilovemario1985.luminitemod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.ilovemario1985.luminitemod.datagen.ModBlockLootTableProvider;
import net.ilovemario1985.luminitemod.datagen.ModBlockTagsProvider;
import net.ilovemario1985.luminitemod.datagen.ModModelProvider;
import net.ilovemario1985.luminitemod.datagen.ModRecipeProvider;

public class LuminiteModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
