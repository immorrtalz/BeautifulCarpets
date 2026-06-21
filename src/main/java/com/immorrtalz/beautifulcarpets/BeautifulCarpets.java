package com.immorrtalz.beautifulcarpets;

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
		event.getGenerator().addProvider(
			event.includeServer(),
			output -> new ModBlockLootProvider(
				output,
				// A set of required table resource locations. These are later verified to be present.
				// It is generally not recommended for mods to validate existence,
				// therefore we pass in an empty set.
				Set.of(),
				// A list of sub provider entries. See below for what values to use here.
				List.of(new SubProviderEntry(
					// A reference to the sub provider's constructor.
					// This is a Function<HolderLookup.Provider, ? extends LootTableSubProvider>.
					MyLootTableSubProvider::new,
					// An associated loot context set. If you're unsure what to use, use empty.
					LootContextParamSets.EMPTY))));
	}
}