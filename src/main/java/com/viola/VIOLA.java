package com.viola;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VIOLA implements ModInitializer {
	public static final String MOD_ID = "viola";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	

	@Override
	public void onInitialize() {

		ModItems.initialize();
		ModBlocks.initialize();

	}
}

