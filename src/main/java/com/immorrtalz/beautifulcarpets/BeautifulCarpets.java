package com.immorrtalz.beautifulcarpets;

import com.immorrtalz.beautifulcarpets.things.ModBlocks;
import com.immorrtalz.beautifulcarpets.things.ModCreativeTabs;
import com.immorrtalz.beautifulcarpets.things.ModItems;
import com.mojang.logging.LogUtils;

import org.slf4j.Logger;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(BeautifulCarpets.MODID)
public class BeautifulCarpets
{
	public static final String MODID = "beautifulcarpets";
	public static final Logger LOGGER = LogUtils.getLogger();

	public BeautifulCarpets(IEventBus modEventBus, Dist dist)
	{
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModCreativeTabs.TABS.register(modEventBus);

		LOGGER.info("BeautifulCarpets client initialized.");
	}
}