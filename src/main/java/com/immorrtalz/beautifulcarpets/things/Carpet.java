package com.immorrtalz.beautifulcarpets.things;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Carpet extends CarpetBlock
{
	public Carpet()
	{
		super(BlockBehaviour.Properties.ofFullCopy((BlockBehaviour)Blocks.WHITE_CARPET));
	}
}