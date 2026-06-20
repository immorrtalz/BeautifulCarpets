package com.immorrtalz.beautifulcarpets.things;

import com.immorrtalz.beautifulcarpets.BeautifulCarpets;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BeautifulCarpets.MODID);

	public static final DeferredItem<Item> red_moquette = ITEMS.register("red_moquette", () -> new BlockItem((Block)ModBlocks.red_moquette.get(), new Item.Properties()));
	public static final DeferredItem<Item> red_moquette_carpet = ITEMS.register("red_moquette_carpet", () -> new BlockItem((CarpetBlock)ModBlocks.red_moquette_carpet.get(), new Item.Properties()));
}