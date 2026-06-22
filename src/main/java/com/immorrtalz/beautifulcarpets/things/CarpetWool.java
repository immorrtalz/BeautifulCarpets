package com.immorrtalz.beautifulcarpets.things;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CarpetWool extends Block
{
	public CarpetWool()
	{
		super(BlockBehaviour.Properties.ofFullCopy((BlockBehaviour)Blocks.WHITE_WOOL)
			.strength(0.8F)
			.explosionResistance(0.8F));
	}
}