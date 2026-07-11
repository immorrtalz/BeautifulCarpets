package com.immorrtalz.beautifulcarpets;

import com.immorrtalz.beautifulcarpets.data.ModLootTableProvider;
import com.immorrtalz.beautifulcarpets.things.ModBlocks;
import com.immorrtalz.beautifulcarpets.things.ModCreativeTabs;
import com.immorrtalz.beautifulcarpets.things.ModItems;
import com.mojang.logging.LogUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

@Mod(BeautifulCarpets.MOD_ID)
public class BeautifulCarpets
{
	public static final String MOD_ID = "beautifulcarpets";
	public static final Logger LOGGER = LogUtils.getLogger();

	public BeautifulCarpets(IEventBus modEventBus, Dist dist)
	{
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		modEventBus.addListener(ModCreativeTabs::addCreative);

		modEventBus.addListener(BeautifulCarpets::onGatherData);
		modEventBus.addListener(BeautifulCarpets::onCommonSetup); // this crashes the game

		LOGGER.info("BeautifulCarpets client initialized.");
	}

	public static void onGatherData(GatherDataEvent event)
	{
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		event.getGenerator().addProvider(
			event.includeServer(),
			new ModLootTableProvider(
				output,
				Set.of(),
				List.of(),
				lookupProvider));
	}

	public static void onCommonSetup(FMLCommonSetupEvent event)
	{
		// Run this on the main thread (FMLCommonSetupEvent is ParallelDispatchEvent)
		event.enqueueWork(() ->
		{
			FireBlock fireBlock = (FireBlock)Blocks.FIRE;

			for (DeferredHolder<Block, ? extends Block> deferred : ModBlocks.BLOCKS.getEntries())
				fireBlock.setFlammable(deferred.get(), 30, 60);
		});
	}
}