package com.immorrtalz.beautifulcarpets.data;

import com.immorrtalz.beautifulcarpets.BeautifulCarpets;
import com.immorrtalz.beautifulcarpets.things.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ModBlockLootProvider extends BlockLootSubProvider
{
	public ModBlockLootProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) throws InterruptedException, ExecutionException
	{
		// The first parameter is a set of required table IDs – we can leave it empty.
		// The second is a list of sub‑providers (none needed).

		// (Set<Item> explosionResistant, FeatureFlagSet enabledFeatures, HolderLookup.Provider registries)
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider.get());
	}

	@Override
	protected void generate()
	{
		// Drop every moquette block and moquette carpet as itself.
		// Loop over all blocks registered in ModBlocks.
		for (DeferredHolder<Block, ? extends Block> deferred : ModBlocks.BLOCKS.getEntries())
		{
			Block block = deferred.get();
			dropSelf(block);
		}
	}

	@Override
	protected Iterable<Block> getKnownBlocks()
	{
		// This returns the set of blocks that we have defined loot tables for.
		// The dropSelf() method automatically adds blocks to this set,
		// so we can simply return the same set from the superclass.
		return super.getKnownBlocks();
	}
}