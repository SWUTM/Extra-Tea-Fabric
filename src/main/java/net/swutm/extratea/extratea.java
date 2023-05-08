package net.swutm.extratea;

import net.fabricmc.api.ModInitializer;
import net.swutm.extratea.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class extratea implements ModInitializer {
	public static final String MOD_ID = "extratea";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
