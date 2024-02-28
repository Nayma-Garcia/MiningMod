package net.twinkletoes.miningtools;

import net.fabricmc.api.ModInitializer;

import net.twinkletoes.miningtools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Miningtools implements ModInitializer {
	public static final String MOD_ID = "miningtools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}