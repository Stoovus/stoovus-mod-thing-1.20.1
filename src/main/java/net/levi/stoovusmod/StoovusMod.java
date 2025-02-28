package net.levi.stoovusmod;

import net.fabricmc.api.ModInitializer;

import net.levi.stoovusmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoovusMod implements ModInitializer {
	public static final String MOD_ID = "stoovusmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}