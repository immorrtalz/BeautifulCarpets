package com.immorrtalz.beautifulcarpets.things;

import com.immorrtalz.beautifulcarpets.BeautifulCarpets;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs
{
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeautifulCarpets.MOD_ID);

	@SuppressWarnings("unchecked")
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = TABS.register(
		BeautifulCarpets.MOD_ID,
		() -> CreativeModeTab.builder()
			.title((Component)Component.translatable("itemGroup." + BeautifulCarpets.MOD_ID))
			.withTabsBefore(new ResourceKey[] { CreativeModeTabs.COLORED_BLOCKS })
			.icon(ModItems.red_copper_moquette.get()::getDefaultInstance)
			.displayItems((params, output) ->
			{
				output.accept(ModItems.red_gold_moquette.get());
				output.accept(ModItems.red_iron_moquette.get());
				output.accept(ModItems.red_copper_moquette.get());

				output.accept(ModItems.orange_gold_moquette.get());
				output.accept(ModItems.orange_iron_moquette.get());
				output.accept(ModItems.orange_copper_moquette.get());

				output.accept(ModItems.yellow_gold_moquette.get());
				output.accept(ModItems.yellow_iron_moquette.get());
				output.accept(ModItems.yellow_copper_moquette.get());

				output.accept(ModItems.lime_gold_moquette.get());
				output.accept(ModItems.lime_iron_moquette.get());
				output.accept(ModItems.lime_copper_moquette.get());

				output.accept(ModItems.green_gold_moquette.get());
				output.accept(ModItems.green_iron_moquette.get());
				output.accept(ModItems.green_copper_moquette.get());

				output.accept(ModItems.cyan_gold_moquette.get());
				output.accept(ModItems.cyan_iron_moquette.get());
				output.accept(ModItems.cyan_copper_moquette.get());

				output.accept(ModItems.light_blue_gold_moquette.get());
				output.accept(ModItems.light_blue_iron_moquette.get());
				output.accept(ModItems.light_blue_copper_moquette.get());

				output.accept(ModItems.blue_gold_moquette.get());
				output.accept(ModItems.blue_iron_moquette.get());
				output.accept(ModItems.blue_copper_moquette.get());

				output.accept(ModItems.purple_gold_moquette.get());
				output.accept(ModItems.purple_iron_moquette.get());
				output.accept(ModItems.purple_copper_moquette.get());

				output.accept(ModItems.magenta_gold_moquette.get());
				output.accept(ModItems.magenta_iron_moquette.get());
				output.accept(ModItems.magenta_copper_moquette.get());

				output.accept(ModItems.pink_gold_moquette.get());
				output.accept(ModItems.pink_iron_moquette.get());
				output.accept(ModItems.pink_copper_moquette.get());

				output.accept(ModItems.brown_gold_moquette.get());
				output.accept(ModItems.brown_iron_moquette.get());
				output.accept(ModItems.brown_copper_moquette.get());

				output.accept(ModItems.black_gold_moquette.get());
				output.accept(ModItems.black_iron_moquette.get());
				output.accept(ModItems.black_copper_moquette.get());

				output.accept(ModItems.gray_gold_moquette.get());
				output.accept(ModItems.gray_iron_moquette.get());
				output.accept(ModItems.gray_copper_moquette.get());

				output.accept(ModItems.light_gray_gold_moquette.get());
				output.accept(ModItems.light_gray_iron_moquette.get());
				output.accept(ModItems.light_gray_copper_moquette.get());

				output.accept(ModItems.white_gold_moquette.get());
				output.accept(ModItems.white_iron_moquette.get());
				output.accept(ModItems.white_copper_moquette.get());


				output.accept(ModItems.red_gold_moquette_carpet.get());
				output.accept(ModItems.red_iron_moquette_carpet.get());
				output.accept(ModItems.red_copper_moquette_carpet.get());

				output.accept(ModItems.orange_gold_moquette_carpet.get());
				output.accept(ModItems.orange_iron_moquette_carpet.get());
				output.accept(ModItems.orange_copper_moquette_carpet.get());

				output.accept(ModItems.yellow_gold_moquette_carpet.get());
				output.accept(ModItems.yellow_iron_moquette_carpet.get());
				output.accept(ModItems.yellow_copper_moquette_carpet.get());

				output.accept(ModItems.lime_gold_moquette_carpet.get());
				output.accept(ModItems.lime_iron_moquette_carpet.get());
				output.accept(ModItems.lime_copper_moquette_carpet.get());

				output.accept(ModItems.green_gold_moquette_carpet.get());
				output.accept(ModItems.green_iron_moquette_carpet.get());
				output.accept(ModItems.green_copper_moquette_carpet.get());

				output.accept(ModItems.cyan_gold_moquette_carpet.get());
				output.accept(ModItems.cyan_iron_moquette_carpet.get());
				output.accept(ModItems.cyan_copper_moquette_carpet.get());

				output.accept(ModItems.light_blue_gold_moquette_carpet.get());
				output.accept(ModItems.light_blue_iron_moquette_carpet.get());
				output.accept(ModItems.light_blue_copper_moquette_carpet.get());

				output.accept(ModItems.blue_gold_moquette_carpet.get());
				output.accept(ModItems.blue_iron_moquette_carpet.get());
				output.accept(ModItems.blue_copper_moquette_carpet.get());

				output.accept(ModItems.purple_gold_moquette_carpet.get());
				output.accept(ModItems.purple_iron_moquette_carpet.get());
				output.accept(ModItems.purple_copper_moquette_carpet.get());

				output.accept(ModItems.magenta_gold_moquette_carpet.get());
				output.accept(ModItems.magenta_iron_moquette_carpet.get());
				output.accept(ModItems.magenta_copper_moquette_carpet.get());

				output.accept(ModItems.pink_gold_moquette_carpet.get());
				output.accept(ModItems.pink_iron_moquette_carpet.get());
				output.accept(ModItems.pink_copper_moquette_carpet.get());

				output.accept(ModItems.brown_gold_moquette_carpet.get());
				output.accept(ModItems.brown_iron_moquette_carpet.get());
				output.accept(ModItems.brown_copper_moquette_carpet.get());

				output.accept(ModItems.black_gold_moquette_carpet.get());
				output.accept(ModItems.black_iron_moquette_carpet.get());
				output.accept(ModItems.black_copper_moquette_carpet.get());

				output.accept(ModItems.gray_gold_moquette_carpet.get());
				output.accept(ModItems.gray_iron_moquette_carpet.get());
				output.accept(ModItems.gray_copper_moquette_carpet.get());

				output.accept(ModItems.light_gray_gold_moquette_carpet.get());
				output.accept(ModItems.light_gray_iron_moquette_carpet.get());
				output.accept(ModItems.light_gray_copper_moquette_carpet.get());

				output.accept(ModItems.white_gold_moquette_carpet.get());
				output.accept(ModItems.white_iron_moquette_carpet.get());
				output.accept(ModItems.white_copper_moquette_carpet.get());


				output.accept(ModItems.red_gold_moquette_faded.get());
				output.accept(ModItems.red_iron_moquette_faded.get());
				output.accept(ModItems.red_copper_moquette_faded.get());

				output.accept(ModItems.orange_gold_moquette_faded.get());
				output.accept(ModItems.orange_iron_moquette_faded.get());
				output.accept(ModItems.orange_copper_moquette_faded.get());

				output.accept(ModItems.yellow_gold_moquette_faded.get());
				output.accept(ModItems.yellow_iron_moquette_faded.get());
				output.accept(ModItems.yellow_copper_moquette_faded.get());

				output.accept(ModItems.lime_gold_moquette_faded.get());
				output.accept(ModItems.lime_iron_moquette_faded.get());
				output.accept(ModItems.lime_copper_moquette_faded.get());

				output.accept(ModItems.green_gold_moquette_faded.get());
				output.accept(ModItems.green_iron_moquette_faded.get());
				output.accept(ModItems.green_copper_moquette_faded.get());

				output.accept(ModItems.cyan_gold_moquette_faded.get());
				output.accept(ModItems.cyan_iron_moquette_faded.get());
				output.accept(ModItems.cyan_copper_moquette_faded.get());

				output.accept(ModItems.light_blue_gold_moquette_faded.get());
				output.accept(ModItems.light_blue_iron_moquette_faded.get());
				output.accept(ModItems.light_blue_copper_moquette_faded.get());

				output.accept(ModItems.blue_gold_moquette_faded.get());
				output.accept(ModItems.blue_iron_moquette_faded.get());
				output.accept(ModItems.blue_copper_moquette_faded.get());

				output.accept(ModItems.purple_gold_moquette_faded.get());
				output.accept(ModItems.purple_iron_moquette_faded.get());
				output.accept(ModItems.purple_copper_moquette_faded.get());

				output.accept(ModItems.magenta_gold_moquette_faded.get());
				output.accept(ModItems.magenta_iron_moquette_faded.get());
				output.accept(ModItems.magenta_copper_moquette_faded.get());

				output.accept(ModItems.pink_gold_moquette_faded.get());
				output.accept(ModItems.pink_iron_moquette_faded.get());
				output.accept(ModItems.pink_copper_moquette_faded.get());

				output.accept(ModItems.brown_gold_moquette_faded.get());
				output.accept(ModItems.brown_iron_moquette_faded.get());
				output.accept(ModItems.brown_copper_moquette_faded.get());

				output.accept(ModItems.black_gold_moquette_faded.get());
				output.accept(ModItems.black_iron_moquette_faded.get());
				output.accept(ModItems.black_copper_moquette_faded.get());

				output.accept(ModItems.gray_gold_moquette_faded.get());
				output.accept(ModItems.gray_iron_moquette_faded.get());
				output.accept(ModItems.gray_copper_moquette_faded.get());

				output.accept(ModItems.light_gray_gold_moquette_faded.get());
				output.accept(ModItems.light_gray_iron_moquette_faded.get());
				output.accept(ModItems.light_gray_copper_moquette_faded.get());

				output.accept(ModItems.white_gold_moquette_faded.get());
				output.accept(ModItems.white_iron_moquette_faded.get());
				output.accept(ModItems.white_copper_moquette_faded.get());


				output.accept(ModItems.red_gold_moquette_faded_carpet.get());
				output.accept(ModItems.red_iron_moquette_faded_carpet.get());
				output.accept(ModItems.red_copper_moquette_faded_carpet.get());

				output.accept(ModItems.orange_gold_moquette_faded_carpet.get());
				output.accept(ModItems.orange_iron_moquette_faded_carpet.get());
				output.accept(ModItems.orange_copper_moquette_faded_carpet.get());

				output.accept(ModItems.yellow_gold_moquette_faded_carpet.get());
				output.accept(ModItems.yellow_iron_moquette_faded_carpet.get());
				output.accept(ModItems.yellow_copper_moquette_faded_carpet.get());

				output.accept(ModItems.lime_gold_moquette_faded_carpet.get());
				output.accept(ModItems.lime_iron_moquette_faded_carpet.get());
				output.accept(ModItems.lime_copper_moquette_faded_carpet.get());

				output.accept(ModItems.green_gold_moquette_faded_carpet.get());
				output.accept(ModItems.green_iron_moquette_faded_carpet.get());
				output.accept(ModItems.green_copper_moquette_faded_carpet.get());

				output.accept(ModItems.cyan_gold_moquette_faded_carpet.get());
				output.accept(ModItems.cyan_iron_moquette_faded_carpet.get());
				output.accept(ModItems.cyan_copper_moquette_faded_carpet.get());

				output.accept(ModItems.light_blue_gold_moquette_faded_carpet.get());
				output.accept(ModItems.light_blue_iron_moquette_faded_carpet.get());
				output.accept(ModItems.light_blue_copper_moquette_faded_carpet.get());

				output.accept(ModItems.blue_gold_moquette_faded_carpet.get());
				output.accept(ModItems.blue_iron_moquette_faded_carpet.get());
				output.accept(ModItems.blue_copper_moquette_faded_carpet.get());

				output.accept(ModItems.purple_gold_moquette_faded_carpet.get());
				output.accept(ModItems.purple_iron_moquette_faded_carpet.get());
				output.accept(ModItems.purple_copper_moquette_faded_carpet.get());

				output.accept(ModItems.magenta_gold_moquette_faded_carpet.get());
				output.accept(ModItems.magenta_iron_moquette_faded_carpet.get());
				output.accept(ModItems.magenta_copper_moquette_faded_carpet.get());

				output.accept(ModItems.pink_gold_moquette_faded_carpet.get());
				output.accept(ModItems.pink_iron_moquette_faded_carpet.get());
				output.accept(ModItems.pink_copper_moquette_faded_carpet.get());

				output.accept(ModItems.brown_gold_moquette_faded_carpet.get());
				output.accept(ModItems.brown_iron_moquette_faded_carpet.get());
				output.accept(ModItems.brown_copper_moquette_faded_carpet.get());

				output.accept(ModItems.black_gold_moquette_faded_carpet.get());
				output.accept(ModItems.black_iron_moquette_faded_carpet.get());
				output.accept(ModItems.black_copper_moquette_faded_carpet.get());

				output.accept(ModItems.gray_gold_moquette_faded_carpet.get());
				output.accept(ModItems.gray_iron_moquette_faded_carpet.get());
				output.accept(ModItems.gray_copper_moquette_faded_carpet.get());

				output.accept(ModItems.light_gray_gold_moquette_faded_carpet.get());
				output.accept(ModItems.light_gray_iron_moquette_faded_carpet.get());
				output.accept(ModItems.light_gray_copper_moquette_faded_carpet.get());

				output.accept(ModItems.white_gold_moquette_faded_carpet.get());
				output.accept(ModItems.white_iron_moquette_faded_carpet.get());
				output.accept(ModItems.white_copper_moquette_faded_carpet.get());


				output.accept(ModItems.red_velvet.get());
				output.accept(ModItems.orange_velvet.get());
				output.accept(ModItems.yellow_velvet.get());
				output.accept(ModItems.lime_velvet.get());
				output.accept(ModItems.green_velvet.get());
				output.accept(ModItems.cyan_velvet.get());
				output.accept(ModItems.light_blue_velvet.get());
				output.accept(ModItems.blue_velvet.get());
				output.accept(ModItems.purple_velvet.get());
				output.accept(ModItems.magenta_velvet.get());
				output.accept(ModItems.pink_velvet.get());
				output.accept(ModItems.brown_velvet.get());
				output.accept(ModItems.black_velvet.get());
				output.accept(ModItems.gray_velvet.get());
				output.accept(ModItems.light_gray_velvet.get());
				output.accept(ModItems.white_velvet.get());


				output.accept(ModItems.red_velvet_carpet.get());
				output.accept(ModItems.orange_velvet_carpet.get());
				output.accept(ModItems.yellow_velvet_carpet.get());
				output.accept(ModItems.lime_velvet_carpet.get());
				output.accept(ModItems.green_velvet_carpet.get());
				output.accept(ModItems.cyan_velvet_carpet.get());
				output.accept(ModItems.light_blue_velvet_carpet.get());
				output.accept(ModItems.blue_velvet_carpet.get());
				output.accept(ModItems.purple_velvet_carpet.get());
				output.accept(ModItems.magenta_velvet_carpet.get());
				output.accept(ModItems.pink_velvet_carpet.get());
				output.accept(ModItems.brown_velvet_carpet.get());
				output.accept(ModItems.black_velvet_carpet.get());
				output.accept(ModItems.gray_velvet_carpet.get());
				output.accept(ModItems.light_gray_velvet_carpet.get());
				output.accept(ModItems.white_velvet_carpet.get());


				output.accept(ModItems.red_velvet_faded.get());
				output.accept(ModItems.orange_velvet_faded.get());
				output.accept(ModItems.yellow_velvet_faded.get());
				output.accept(ModItems.lime_velvet_faded.get());
				output.accept(ModItems.green_velvet_faded.get());
				output.accept(ModItems.cyan_velvet_faded.get());
				output.accept(ModItems.light_blue_velvet_faded.get());
				output.accept(ModItems.blue_velvet_faded.get());
				output.accept(ModItems.purple_velvet_faded.get());
				output.accept(ModItems.magenta_velvet_faded.get());
				output.accept(ModItems.pink_velvet_faded.get());
				output.accept(ModItems.brown_velvet_faded.get());
				output.accept(ModItems.black_velvet_faded.get());
				output.accept(ModItems.gray_velvet_faded.get());
				output.accept(ModItems.light_gray_velvet_faded.get());
				output.accept(ModItems.white_velvet_faded.get());


				output.accept(ModItems.red_velvet_faded_carpet.get());
				output.accept(ModItems.orange_velvet_faded_carpet.get());
				output.accept(ModItems.yellow_velvet_faded_carpet.get());
				output.accept(ModItems.lime_velvet_faded_carpet.get());
				output.accept(ModItems.green_velvet_faded_carpet.get());
				output.accept(ModItems.cyan_velvet_faded_carpet.get());
				output.accept(ModItems.light_blue_velvet_faded_carpet.get());
				output.accept(ModItems.blue_velvet_faded_carpet.get());
				output.accept(ModItems.purple_velvet_faded_carpet.get());
				output.accept(ModItems.magenta_velvet_faded_carpet.get());
				output.accept(ModItems.pink_velvet_faded_carpet.get());
				output.accept(ModItems.brown_velvet_faded_carpet.get());
				output.accept(ModItems.black_velvet_faded_carpet.get());
				output.accept(ModItems.gray_velvet_faded_carpet.get());
				output.accept(ModItems.light_gray_velvet_faded_carpet.get());
				output.accept(ModItems.white_velvet_faded_carpet.get());
			})
			.build());
}