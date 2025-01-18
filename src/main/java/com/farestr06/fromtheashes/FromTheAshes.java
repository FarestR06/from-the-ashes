package com.farestr06.fromtheashes;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.fluid.ModFluid;
import com.farestr06.fromtheashes.item.ModItemGroups;
import com.farestr06.fromtheashes.item.ModItems;
import com.farestr06.fromtheashes.util.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FromTheAshes implements ModInitializer {
	public static final String MOD_ID = "from-the-ashes";
	public static Identifier makeId(String path) {
		return Identifier.of(MOD_ID, path);
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("penix");

		ModItems.init();
		ModBlocks.init();
		ModFluid.init();
		ModItemGroups.init();

		ModSounds.init();
	}
}