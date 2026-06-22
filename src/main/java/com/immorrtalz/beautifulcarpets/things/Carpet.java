package com.immorrtalz.beautifulcarpets.things;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Carpet extends CarpetBlock
{
	public Carpet(DyeColor color)
	{
		super(BlockBehaviour.Properties.ofFullCopy((BlockBehaviour)Blocks.WHITE_CARPET).mapColor(color));
	}
}