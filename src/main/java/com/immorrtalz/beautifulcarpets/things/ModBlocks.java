package com.immorrtalz.beautifulcarpets.things;

import com.immorrtalz.beautifulcarpets.BeautifulCarpets;

import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BeautifulCarpets.MODID);

	public static final DeferredBlock<Block> red_moquette = BLOCKS.register("red_moquette", () -> new CarpetWool());
	public static final DeferredBlock<Block> red_moquette_carpet = BLOCKS.register("red_moquette_carpet", () -> new Carpet());

	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}