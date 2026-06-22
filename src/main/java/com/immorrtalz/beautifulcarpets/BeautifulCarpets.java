package com.immorrtalz.beautifulcarpets;

import com.immorrtalz.beautifulcarpets.data.ModBlockLootProvider;
import com.immorrtalz.beautifulcarpets.things.ModBlocks;
import com.immorrtalz.beautifulcarpets.things.ModCreativeTabs;
import com.immorrtalz.beautifulcarpets.things.ModItems;
import com.mojang.logging.LogUtils;

import java.util.Set;

import org.slf4j.Logger;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

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

		modEventBus.addListener(BeautifulCarpets::onGatherData);

		LOGGER.info("BeautifulCarpets client initialized.");
	}

	public static void onGatherData(GatherDataEvent event)
	{
		// Add the loot table provider
		event.getGenerator().addProvider(
			event.includeServer(),
			(output, lookup) -> new ModBlockLootProvider(output, lookup));
	}
}