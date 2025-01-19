package com.farestr06.fromtheashes.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FromTheAshesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLangProvider::new);
		pack.addProvider(ModLootProviders.Block::new);
		pack.addProvider(ModTagProviders.Item::new);
		pack.addProvider(ModTagProviders.Block::new);
		pack.addProvider(ModTagProviders.Fluid::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
