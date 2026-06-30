package com.immorrtalz.beautifulcarpets.things;

import com.immorrtalz.beautifulcarpets.BeautifulCarpets;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BeautifulCarpets.MOD_ID);

	public static final DeferredBlock<Block> red_gold_moquette = BLOCKS.register("red_gold_moquette", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> red_iron_moquette = BLOCKS.register("red_iron_moquette", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> red_copper_moquette = BLOCKS.register("red_copper_moquette", () -> new CarpetWool(DyeColor.RED));

	public static final DeferredBlock<Block> orange_gold_moquette = BLOCKS.register("orange_gold_moquette", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_iron_moquette = BLOCKS.register("orange_iron_moquette", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_copper_moquette = BLOCKS.register("orange_copper_moquette", () -> new CarpetWool(DyeColor.ORANGE));

	public static final DeferredBlock<Block> yellow_gold_moquette = BLOCKS.register("yellow_gold_moquette", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_iron_moquette = BLOCKS.register("yellow_iron_moquette", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_copper_moquette = BLOCKS.register("yellow_copper_moquette", () -> new CarpetWool(DyeColor.YELLOW));

	public static final DeferredBlock<Block> lime_gold_moquette = BLOCKS.register("lime_gold_moquette", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_iron_moquette = BLOCKS.register("lime_iron_moquette", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_copper_moquette = BLOCKS.register("lime_copper_moquette", () -> new CarpetWool(DyeColor.LIME));

	public static final DeferredBlock<Block> green_gold_moquette = BLOCKS.register("green_gold_moquette", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_iron_moquette = BLOCKS.register("green_iron_moquette", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_copper_moquette = BLOCKS.register("green_copper_moquette", () -> new CarpetWool(DyeColor.GREEN));

	public static final DeferredBlock<Block> cyan_gold_moquette = BLOCKS.register("cyan_gold_moquette", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_iron_moquette = BLOCKS.register("cyan_iron_moquette", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_copper_moquette = BLOCKS.register("cyan_copper_moquette", () -> new CarpetWool(DyeColor.CYAN));

	public static final DeferredBlock<Block> light_blue_gold_moquette = BLOCKS.register("light_blue_gold_moquette", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_iron_moquette = BLOCKS.register("light_blue_iron_moquette", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_copper_moquette = BLOCKS.register("light_blue_copper_moquette", () -> new CarpetWool(DyeColor.LIGHT_BLUE));

	public static final DeferredBlock<Block> blue_gold_moquette = BLOCKS.register("blue_gold_moquette", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_iron_moquette = BLOCKS.register("blue_iron_moquette", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_copper_moquette = BLOCKS.register("blue_copper_moquette", () -> new CarpetWool(DyeColor.BLUE));

	public static final DeferredBlock<Block> purple_gold_moquette = BLOCKS.register("purple_gold_moquette", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_iron_moquette = BLOCKS.register("purple_iron_moquette", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_copper_moquette = BLOCKS.register("purple_copper_moquette", () -> new CarpetWool(DyeColor.PURPLE));

	public static final DeferredBlock<Block> magenta_gold_moquette = BLOCKS.register("magenta_gold_moquette", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_iron_moquette = BLOCKS.register("magenta_iron_moquette", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_copper_moquette = BLOCKS.register("magenta_copper_moquette", () -> new CarpetWool(DyeColor.MAGENTA));

	public static final DeferredBlock<Block> pink_gold_moquette = BLOCKS.register("pink_gold_moquette", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_iron_moquette = BLOCKS.register("pink_iron_moquette", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_copper_moquette = BLOCKS.register("pink_copper_moquette", () -> new CarpetWool(DyeColor.PINK));

	public static final DeferredBlock<Block> brown_gold_moquette = BLOCKS.register("brown_gold_moquette", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_iron_moquette = BLOCKS.register("brown_iron_moquette", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_copper_moquette = BLOCKS.register("brown_copper_moquette", () -> new CarpetWool(DyeColor.BROWN));

	public static final DeferredBlock<Block> black_gold_moquette = BLOCKS.register("black_gold_moquette", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_iron_moquette = BLOCKS.register("black_iron_moquette", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_copper_moquette = BLOCKS.register("black_copper_moquette", () -> new CarpetWool(DyeColor.BLACK));

	public static final DeferredBlock<Block> gray_gold_moquette = BLOCKS.register("gray_gold_moquette", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_iron_moquette = BLOCKS.register("gray_iron_moquette", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_copper_moquette = BLOCKS.register("gray_copper_moquette", () -> new CarpetWool(DyeColor.GRAY));

	public static final DeferredBlock<Block> light_gray_gold_moquette = BLOCKS.register("light_gray_gold_moquette", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_iron_moquette = BLOCKS.register("light_gray_iron_moquette", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_copper_moquette = BLOCKS.register("light_gray_copper_moquette", () -> new CarpetWool(DyeColor.LIGHT_GRAY));

	public static final DeferredBlock<Block> white_gold_moquette = BLOCKS.register("white_gold_moquette", () -> new CarpetWool(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_iron_moquette = BLOCKS.register("white_iron_moquette", () -> new CarpetWool(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_copper_moquette = BLOCKS.register("white_copper_moquette", () -> new CarpetWool(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_gold_moquette_carpet = BLOCKS.register("red_gold_moquette_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> red_iron_moquette_carpet = BLOCKS.register("red_iron_moquette_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> red_copper_moquette_carpet = BLOCKS.register("red_copper_moquette_carpet", () -> new Carpet(DyeColor.RED));

	public static final DeferredBlock<Block> orange_gold_moquette_carpet = BLOCKS.register("orange_gold_moquette_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_iron_moquette_carpet = BLOCKS.register("orange_iron_moquette_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_copper_moquette_carpet = BLOCKS.register("orange_copper_moquette_carpet", () -> new Carpet(DyeColor.ORANGE));

	public static final DeferredBlock<Block> yellow_gold_moquette_carpet = BLOCKS.register("yellow_gold_moquette_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_iron_moquette_carpet = BLOCKS.register("yellow_iron_moquette_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_copper_moquette_carpet = BLOCKS.register("yellow_copper_moquette_carpet", () -> new Carpet(DyeColor.YELLOW));

	public static final DeferredBlock<Block> lime_gold_moquette_carpet = BLOCKS.register("lime_gold_moquette_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_iron_moquette_carpet = BLOCKS.register("lime_iron_moquette_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_copper_moquette_carpet = BLOCKS.register("lime_copper_moquette_carpet", () -> new Carpet(DyeColor.LIME));

	public static final DeferredBlock<Block> green_gold_moquette_carpet = BLOCKS.register("green_gold_moquette_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_iron_moquette_carpet = BLOCKS.register("green_iron_moquette_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_copper_moquette_carpet = BLOCKS.register("green_copper_moquette_carpet", () -> new Carpet(DyeColor.GREEN));

	public static final DeferredBlock<Block> cyan_gold_moquette_carpet = BLOCKS.register("cyan_gold_moquette_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_iron_moquette_carpet = BLOCKS.register("cyan_iron_moquette_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_copper_moquette_carpet = BLOCKS.register("cyan_copper_moquette_carpet", () -> new Carpet(DyeColor.CYAN));

	public static final DeferredBlock<Block> light_blue_gold_moquette_carpet = BLOCKS.register("light_blue_gold_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_iron_moquette_carpet = BLOCKS.register("light_blue_iron_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_copper_moquette_carpet = BLOCKS.register("light_blue_copper_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));

	public static final DeferredBlock<Block> blue_gold_moquette_carpet = BLOCKS.register("blue_gold_moquette_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_iron_moquette_carpet = BLOCKS.register("blue_iron_moquette_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_copper_moquette_carpet = BLOCKS.register("blue_copper_moquette_carpet", () -> new Carpet(DyeColor.BLUE));

	public static final DeferredBlock<Block> purple_gold_moquette_carpet = BLOCKS.register("purple_gold_moquette_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_iron_moquette_carpet = BLOCKS.register("purple_iron_moquette_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_copper_moquette_carpet = BLOCKS.register("purple_copper_moquette_carpet", () -> new Carpet(DyeColor.PURPLE));

	public static final DeferredBlock<Block> magenta_gold_moquette_carpet = BLOCKS.register("magenta_gold_moquette_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_iron_moquette_carpet = BLOCKS.register("magenta_iron_moquette_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_copper_moquette_carpet = BLOCKS.register("magenta_copper_moquette_carpet", () -> new Carpet(DyeColor.MAGENTA));

	public static final DeferredBlock<Block> pink_gold_moquette_carpet = BLOCKS.register("pink_gold_moquette_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_iron_moquette_carpet = BLOCKS.register("pink_iron_moquette_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_copper_moquette_carpet = BLOCKS.register("pink_copper_moquette_carpet", () -> new Carpet(DyeColor.PINK));

	public static final DeferredBlock<Block> brown_gold_moquette_carpet = BLOCKS.register("brown_gold_moquette_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_iron_moquette_carpet = BLOCKS.register("brown_iron_moquette_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_copper_moquette_carpet = BLOCKS.register("brown_copper_moquette_carpet", () -> new Carpet(DyeColor.BROWN));

	public static final DeferredBlock<Block> black_gold_moquette_carpet = BLOCKS.register("black_gold_moquette_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_iron_moquette_carpet = BLOCKS.register("black_iron_moquette_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_copper_moquette_carpet = BLOCKS.register("black_copper_moquette_carpet", () -> new Carpet(DyeColor.BLACK));

	public static final DeferredBlock<Block> gray_gold_moquette_carpet = BLOCKS.register("gray_gold_moquette_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_iron_moquette_carpet = BLOCKS.register("gray_iron_moquette_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_copper_moquette_carpet = BLOCKS.register("gray_copper_moquette_carpet", () -> new Carpet(DyeColor.GRAY));

	public static final DeferredBlock<Block> light_gray_gold_moquette_carpet = BLOCKS.register("light_gray_gold_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_iron_moquette_carpet = BLOCKS.register("light_gray_iron_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_copper_moquette_carpet = BLOCKS.register("light_gray_copper_moquette_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));

	public static final DeferredBlock<Block> white_gold_moquette_carpet = BLOCKS.register("white_gold_moquette_carpet", () -> new Carpet(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_iron_moquette_carpet = BLOCKS.register("white_iron_moquette_carpet", () -> new Carpet(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_copper_moquette_carpet = BLOCKS.register("white_copper_moquette_carpet", () -> new Carpet(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_gold_moquette_faded = BLOCKS.register("red_gold_moquette_faded", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> red_iron_moquette_faded = BLOCKS.register("red_iron_moquette_faded", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> red_copper_moquette_faded = BLOCKS.register("red_copper_moquette_faded", () -> new CarpetWool(DyeColor.RED));

	public static final DeferredBlock<Block> orange_gold_moquette_faded = BLOCKS.register("orange_gold_moquette_faded", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_iron_moquette_faded = BLOCKS.register("orange_iron_moquette_faded", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_copper_moquette_faded = BLOCKS.register("orange_copper_moquette_faded", () -> new CarpetWool(DyeColor.ORANGE));

	public static final DeferredBlock<Block> yellow_gold_moquette_faded = BLOCKS.register("yellow_gold_moquette_faded", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_iron_moquette_faded = BLOCKS.register("yellow_iron_moquette_faded", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_copper_moquette_faded = BLOCKS.register("yellow_copper_moquette_faded", () -> new CarpetWool(DyeColor.YELLOW));

	public static final DeferredBlock<Block> lime_gold_moquette_faded = BLOCKS.register("lime_gold_moquette_faded", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_iron_moquette_faded = BLOCKS.register("lime_iron_moquette_faded", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_copper_moquette_faded = BLOCKS.register("lime_copper_moquette_faded", () -> new CarpetWool(DyeColor.LIME));

	public static final DeferredBlock<Block> green_gold_moquette_faded = BLOCKS.register("green_gold_moquette_faded", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_iron_moquette_faded = BLOCKS.register("green_iron_moquette_faded", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_copper_moquette_faded = BLOCKS.register("green_copper_moquette_faded", () -> new CarpetWool(DyeColor.GREEN));

	public static final DeferredBlock<Block> cyan_gold_moquette_faded = BLOCKS.register("cyan_gold_moquette_faded", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_iron_moquette_faded = BLOCKS.register("cyan_iron_moquette_faded", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_copper_moquette_faded = BLOCKS.register("cyan_copper_moquette_faded", () -> new CarpetWool(DyeColor.CYAN));

	public static final DeferredBlock<Block> light_blue_gold_moquette_faded = BLOCKS.register("light_blue_gold_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_iron_moquette_faded = BLOCKS.register("light_blue_iron_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_copper_moquette_faded = BLOCKS.register("light_blue_copper_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_BLUE));

	public static final DeferredBlock<Block> blue_gold_moquette_faded = BLOCKS.register("blue_gold_moquette_faded", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_iron_moquette_faded = BLOCKS.register("blue_iron_moquette_faded", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_copper_moquette_faded = BLOCKS.register("blue_copper_moquette_faded", () -> new CarpetWool(DyeColor.BLUE));

	public static final DeferredBlock<Block> purple_gold_moquette_faded = BLOCKS.register("purple_gold_moquette_faded", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_iron_moquette_faded = BLOCKS.register("purple_iron_moquette_faded", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_copper_moquette_faded = BLOCKS.register("purple_copper_moquette_faded", () -> new CarpetWool(DyeColor.PURPLE));

	public static final DeferredBlock<Block> magenta_gold_moquette_faded = BLOCKS.register("magenta_gold_moquette_faded", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_iron_moquette_faded = BLOCKS.register("magenta_iron_moquette_faded", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_copper_moquette_faded = BLOCKS.register("magenta_copper_moquette_faded", () -> new CarpetWool(DyeColor.MAGENTA));

	public static final DeferredBlock<Block> pink_gold_moquette_faded = BLOCKS.register("pink_gold_moquette_faded", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_iron_moquette_faded = BLOCKS.register("pink_iron_moquette_faded", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_copper_moquette_faded = BLOCKS.register("pink_copper_moquette_faded", () -> new CarpetWool(DyeColor.PINK));

	public static final DeferredBlock<Block> brown_gold_moquette_faded = BLOCKS.register("brown_gold_moquette_faded", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_iron_moquette_faded = BLOCKS.register("brown_iron_moquette_faded", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_copper_moquette_faded = BLOCKS.register("brown_copper_moquette_faded", () -> new CarpetWool(DyeColor.BROWN));

	public static final DeferredBlock<Block> black_gold_moquette_faded = BLOCKS.register("black_gold_moquette_faded", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_iron_moquette_faded = BLOCKS.register("black_iron_moquette_faded", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_copper_moquette_faded = BLOCKS.register("black_copper_moquette_faded", () -> new CarpetWool(DyeColor.BLACK));

	public static final DeferredBlock<Block> gray_gold_moquette_faded = BLOCKS.register("gray_gold_moquette_faded", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_iron_moquette_faded = BLOCKS.register("gray_iron_moquette_faded", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_copper_moquette_faded = BLOCKS.register("gray_copper_moquette_faded", () -> new CarpetWool(DyeColor.GRAY));

	public static final DeferredBlock<Block> light_gray_gold_moquette_faded = BLOCKS.register("light_gray_gold_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_iron_moquette_faded = BLOCKS.register("light_gray_iron_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_copper_moquette_faded = BLOCKS.register("light_gray_copper_moquette_faded", () -> new CarpetWool(DyeColor.LIGHT_GRAY));

	public static final DeferredBlock<Block> white_gold_moquette_faded = BLOCKS.register("white_gold_moquette_faded", () -> new CarpetWool(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_iron_moquette_faded = BLOCKS.register("white_iron_moquette_faded", () -> new CarpetWool(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_copper_moquette_faded = BLOCKS.register("white_copper_moquette_faded", () -> new CarpetWool(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_gold_moquette_faded_carpet = BLOCKS.register("red_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> red_iron_moquette_faded_carpet = BLOCKS.register("red_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> red_copper_moquette_faded_carpet = BLOCKS.register("red_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.RED));

	public static final DeferredBlock<Block> orange_gold_moquette_faded_carpet = BLOCKS.register("orange_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_iron_moquette_faded_carpet = BLOCKS.register("orange_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> orange_copper_moquette_faded_carpet = BLOCKS.register("orange_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.ORANGE));

	public static final DeferredBlock<Block> yellow_gold_moquette_faded_carpet = BLOCKS.register("yellow_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_iron_moquette_faded_carpet = BLOCKS.register("yellow_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> yellow_copper_moquette_faded_carpet = BLOCKS.register("yellow_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.YELLOW));

	public static final DeferredBlock<Block> lime_gold_moquette_faded_carpet = BLOCKS.register("lime_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_iron_moquette_faded_carpet = BLOCKS.register("lime_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> lime_copper_moquette_faded_carpet = BLOCKS.register("lime_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.LIME));

	public static final DeferredBlock<Block> green_gold_moquette_faded_carpet = BLOCKS.register("green_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_iron_moquette_faded_carpet = BLOCKS.register("green_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> green_copper_moquette_faded_carpet = BLOCKS.register("green_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.GREEN));

	public static final DeferredBlock<Block> cyan_gold_moquette_faded_carpet = BLOCKS.register("cyan_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_iron_moquette_faded_carpet = BLOCKS.register("cyan_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> cyan_copper_moquette_faded_carpet = BLOCKS.register("cyan_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.CYAN));

	public static final DeferredBlock<Block> light_blue_gold_moquette_faded_carpet = BLOCKS.register("light_blue_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_iron_moquette_faded_carpet = BLOCKS.register("light_blue_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> light_blue_copper_moquette_faded_carpet = BLOCKS.register("light_blue_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));

	public static final DeferredBlock<Block> blue_gold_moquette_faded_carpet = BLOCKS.register("blue_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_iron_moquette_faded_carpet = BLOCKS.register("blue_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> blue_copper_moquette_faded_carpet = BLOCKS.register("blue_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.BLUE));

	public static final DeferredBlock<Block> purple_gold_moquette_faded_carpet = BLOCKS.register("purple_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_iron_moquette_faded_carpet = BLOCKS.register("purple_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> purple_copper_moquette_faded_carpet = BLOCKS.register("purple_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.PURPLE));

	public static final DeferredBlock<Block> magenta_gold_moquette_faded_carpet = BLOCKS.register("magenta_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_iron_moquette_faded_carpet = BLOCKS.register("magenta_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> magenta_copper_moquette_faded_carpet = BLOCKS.register("magenta_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.MAGENTA));

	public static final DeferredBlock<Block> pink_gold_moquette_faded_carpet = BLOCKS.register("pink_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_iron_moquette_faded_carpet = BLOCKS.register("pink_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> pink_copper_moquette_faded_carpet = BLOCKS.register("pink_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.PINK));

	public static final DeferredBlock<Block> brown_gold_moquette_faded_carpet = BLOCKS.register("brown_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_iron_moquette_faded_carpet = BLOCKS.register("brown_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> brown_copper_moquette_faded_carpet = BLOCKS.register("brown_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.BROWN));

	public static final DeferredBlock<Block> black_gold_moquette_faded_carpet = BLOCKS.register("black_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_iron_moquette_faded_carpet = BLOCKS.register("black_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> black_copper_moquette_faded_carpet = BLOCKS.register("black_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.BLACK));

	public static final DeferredBlock<Block> gray_gold_moquette_faded_carpet = BLOCKS.register("gray_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_iron_moquette_faded_carpet = BLOCKS.register("gray_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> gray_copper_moquette_faded_carpet = BLOCKS.register("gray_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.GRAY));

	public static final DeferredBlock<Block> light_gray_gold_moquette_faded_carpet = BLOCKS.register("light_gray_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_iron_moquette_faded_carpet = BLOCKS.register("light_gray_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> light_gray_copper_moquette_faded_carpet = BLOCKS.register("light_gray_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));

	public static final DeferredBlock<Block> white_gold_moquette_faded_carpet = BLOCKS.register("white_gold_moquette_faded_carpet", () -> new Carpet(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_iron_moquette_faded_carpet = BLOCKS.register("white_iron_moquette_faded_carpet", () -> new Carpet(DyeColor.WHITE));
	public static final DeferredBlock<Block> white_copper_moquette_faded_carpet = BLOCKS.register("white_copper_moquette_faded_carpet", () -> new Carpet(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_velvet = BLOCKS.register("red_velvet", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> orange_velvet = BLOCKS.register("orange_velvet", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> yellow_velvet = BLOCKS.register("yellow_velvet", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> lime_velvet = BLOCKS.register("lime_velvet", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> green_velvet = BLOCKS.register("green_velvet", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> cyan_velvet = BLOCKS.register("cyan_velvet", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> light_blue_velvet = BLOCKS.register("light_blue_velvet", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> blue_velvet = BLOCKS.register("blue_velvet", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> purple_velvet = BLOCKS.register("purple_velvet", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> magenta_velvet = BLOCKS.register("magenta_velvet", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> pink_velvet = BLOCKS.register("pink_velvet", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> brown_velvet = BLOCKS.register("brown_velvet", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> black_velvet = BLOCKS.register("black_velvet", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> gray_velvet = BLOCKS.register("gray_velvet", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> light_gray_velvet = BLOCKS.register("light_gray_velvet", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> white_velvet = BLOCKS.register("white_velvet", () -> new CarpetWool(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_velvet_carpet = BLOCKS.register("red_velvet_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> orange_velvet_carpet = BLOCKS.register("orange_velvet_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> yellow_velvet_carpet = BLOCKS.register("yellow_velvet_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> lime_velvet_carpet = BLOCKS.register("lime_velvet_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> green_velvet_carpet = BLOCKS.register("green_velvet_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> cyan_velvet_carpet = BLOCKS.register("cyan_velvet_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> light_blue_velvet_carpet = BLOCKS.register("light_blue_velvet_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> blue_velvet_carpet = BLOCKS.register("blue_velvet_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> purple_velvet_carpet = BLOCKS.register("purple_velvet_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> magenta_velvet_carpet = BLOCKS.register("magenta_velvet_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> pink_velvet_carpet = BLOCKS.register("pink_velvet_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> brown_velvet_carpet = BLOCKS.register("brown_velvet_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> black_velvet_carpet = BLOCKS.register("black_velvet_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> gray_velvet_carpet = BLOCKS.register("gray_velvet_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> light_gray_velvet_carpet = BLOCKS.register("light_gray_velvet_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> white_velvet_carpet = BLOCKS.register("white_velvet_carpet", () -> new Carpet(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_velvet_faded = BLOCKS.register("red_velvet_faded", () -> new CarpetWool(DyeColor.RED));
	public static final DeferredBlock<Block> orange_velvet_faded = BLOCKS.register("orange_velvet_faded", () -> new CarpetWool(DyeColor.ORANGE));
	public static final DeferredBlock<Block> yellow_velvet_faded = BLOCKS.register("yellow_velvet_faded", () -> new CarpetWool(DyeColor.YELLOW));
	public static final DeferredBlock<Block> lime_velvet_faded = BLOCKS.register("lime_velvet_faded", () -> new CarpetWool(DyeColor.LIME));
	public static final DeferredBlock<Block> green_velvet_faded = BLOCKS.register("green_velvet_faded", () -> new CarpetWool(DyeColor.GREEN));
	public static final DeferredBlock<Block> cyan_velvet_faded = BLOCKS.register("cyan_velvet_faded", () -> new CarpetWool(DyeColor.CYAN));
	public static final DeferredBlock<Block> light_blue_velvet_faded = BLOCKS.register("light_blue_velvet_faded", () -> new CarpetWool(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> blue_velvet_faded = BLOCKS.register("blue_velvet_faded", () -> new CarpetWool(DyeColor.BLUE));
	public static final DeferredBlock<Block> purple_velvet_faded = BLOCKS.register("purple_velvet_faded", () -> new CarpetWool(DyeColor.PURPLE));
	public static final DeferredBlock<Block> magenta_velvet_faded = BLOCKS.register("magenta_velvet_faded", () -> new CarpetWool(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> pink_velvet_faded = BLOCKS.register("pink_velvet_faded", () -> new CarpetWool(DyeColor.PINK));
	public static final DeferredBlock<Block> brown_velvet_faded = BLOCKS.register("brown_velvet_faded", () -> new CarpetWool(DyeColor.BROWN));
	public static final DeferredBlock<Block> black_velvet_faded = BLOCKS.register("black_velvet_faded", () -> new CarpetWool(DyeColor.BLACK));
	public static final DeferredBlock<Block> gray_velvet_faded = BLOCKS.register("gray_velvet_faded", () -> new CarpetWool(DyeColor.GRAY));
	public static final DeferredBlock<Block> light_gray_velvet_faded = BLOCKS.register("light_gray_velvet_faded", () -> new CarpetWool(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> white_velvet_faded = BLOCKS.register("white_velvet_faded", () -> new CarpetWool(DyeColor.WHITE));


	public static final DeferredBlock<Block> red_velvet_faded_carpet = BLOCKS.register("red_velvet_faded_carpet", () -> new Carpet(DyeColor.RED));
	public static final DeferredBlock<Block> orange_velvet_faded_carpet = BLOCKS.register("orange_velvet_faded_carpet", () -> new Carpet(DyeColor.ORANGE));
	public static final DeferredBlock<Block> yellow_velvet_faded_carpet = BLOCKS.register("yellow_velvet_faded_carpet", () -> new Carpet(DyeColor.YELLOW));
	public static final DeferredBlock<Block> lime_velvet_faded_carpet = BLOCKS.register("lime_velvet_faded_carpet", () -> new Carpet(DyeColor.LIME));
	public static final DeferredBlock<Block> green_velvet_faded_carpet = BLOCKS.register("green_velvet_faded_carpet", () -> new Carpet(DyeColor.GREEN));
	public static final DeferredBlock<Block> cyan_velvet_faded_carpet = BLOCKS.register("cyan_velvet_faded_carpet", () -> new Carpet(DyeColor.CYAN));
	public static final DeferredBlock<Block> light_blue_velvet_faded_carpet = BLOCKS.register("light_blue_velvet_faded_carpet", () -> new Carpet(DyeColor.LIGHT_BLUE));
	public static final DeferredBlock<Block> blue_velvet_faded_carpet = BLOCKS.register("blue_velvet_faded_carpet", () -> new Carpet(DyeColor.BLUE));
	public static final DeferredBlock<Block> purple_velvet_faded_carpet = BLOCKS.register("purple_velvet_faded_carpet", () -> new Carpet(DyeColor.PURPLE));
	public static final DeferredBlock<Block> magenta_velvet_faded_carpet = BLOCKS.register("magenta_velvet_faded_carpet", () -> new Carpet(DyeColor.MAGENTA));
	public static final DeferredBlock<Block> pink_velvet_faded_carpet = BLOCKS.register("pink_velvet_faded_carpet", () -> new Carpet(DyeColor.PINK));
	public static final DeferredBlock<Block> brown_velvet_faded_carpet = BLOCKS.register("brown_velvet_faded_carpet", () -> new Carpet(DyeColor.BROWN));
	public static final DeferredBlock<Block> black_velvet_faded_carpet = BLOCKS.register("black_velvet_faded_carpet", () -> new Carpet(DyeColor.BLACK));
	public static final DeferredBlock<Block> gray_velvet_faded_carpet = BLOCKS.register("gray_velvet_faded_carpet", () -> new Carpet(DyeColor.GRAY));
	public static final DeferredBlock<Block> light_gray_velvet_faded_carpet = BLOCKS.register("light_gray_velvet_faded_carpet", () -> new Carpet(DyeColor.LIGHT_GRAY));
	public static final DeferredBlock<Block> white_velvet_faded_carpet = BLOCKS.register("white_velvet_faded_carpet", () -> new Carpet(DyeColor.WHITE));

	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}