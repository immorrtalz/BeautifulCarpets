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
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeautifulCarpets.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = TABS.register(
		BeautifulCarpets.MODID,
		() -> CreativeModeTab.builder()
			.title((Component)Component.translatable("itemGroup." + BeautifulCarpets.MODID))
			.withTabsBefore(new ResourceKey[] { CreativeModeTabs.COLORED_BLOCKS })
			.icon(ModItems.red_copper_moquette.get()::getDefaultInstance)
			.displayItems((params, output) ->
			{
				output.accept(ModItems.red_gold_moquette.get());
				output.accept(ModItems.red_silver_moquette.get());
				output.accept(ModItems.red_copper_moquette.get());

				output.accept(ModItems.orange_gold_moquette.get());
				output.accept(ModItems.orange_silver_moquette.get());
				output.accept(ModItems.orange_copper_moquette.get());

				output.accept(ModItems.yellow_gold_moquette.get());
				output.accept(ModItems.yellow_silver_moquette.get());
				output.accept(ModItems.yellow_copper_moquette.get());

				output.accept(ModItems.olive_gold_moquette.get());
				output.accept(ModItems.olive_silver_moquette.get());
				output.accept(ModItems.olive_copper_moquette.get());

				output.accept(ModItems.green_gold_moquette.get());
				output.accept(ModItems.green_silver_moquette.get());
				output.accept(ModItems.green_copper_moquette.get());

				output.accept(ModItems.seagreen_gold_moquette.get());
				output.accept(ModItems.seagreen_silver_moquette.get());
				output.accept(ModItems.seagreen_copper_moquette.get());

				output.accept(ModItems.emerald_gold_moquette.get());
				output.accept(ModItems.emerald_silver_moquette.get());
				output.accept(ModItems.emerald_copper_moquette.get());

				output.accept(ModItems.aquamarine_gold_moquette.get());
				output.accept(ModItems.aquamarine_silver_moquette.get());
				output.accept(ModItems.aquamarine_copper_moquette.get());

				output.accept(ModItems.blue_gold_moquette.get());
				output.accept(ModItems.blue_silver_moquette.get());
				output.accept(ModItems.blue_copper_moquette.get());

				output.accept(ModItems.cobaltblue_gold_moquette.get());
				output.accept(ModItems.cobaltblue_silver_moquette.get());
				output.accept(ModItems.cobaltblue_copper_moquette.get());

				output.accept(ModItems.midnight_gold_moquette.get());
				output.accept(ModItems.midnight_silver_moquette.get());
				output.accept(ModItems.midnight_copper_moquette.get());

				output.accept(ModItems.violet_gold_moquette.get());
				output.accept(ModItems.violet_silver_moquette.get());
				output.accept(ModItems.violet_copper_moquette.get());

				output.accept(ModItems.purple_gold_moquette.get());
				output.accept(ModItems.purple_silver_moquette.get());
				output.accept(ModItems.purple_copper_moquette.get());

				output.accept(ModItems.orchid_gold_moquette.get());
				output.accept(ModItems.orchid_silver_moquette.get());
				output.accept(ModItems.orchid_copper_moquette.get());

				output.accept(ModItems.black_gold_moquette.get());
				output.accept(ModItems.black_silver_moquette.get());
				output.accept(ModItems.black_copper_moquette.get());

				output.accept(ModItems.gray_gold_moquette.get());
				output.accept(ModItems.gray_silver_moquette.get());
				output.accept(ModItems.gray_copper_moquette.get());


				output.accept(ModItems.red_gold_moquette_carpet.get());
				output.accept(ModItems.red_silver_moquette_carpet.get());
				output.accept(ModItems.red_copper_moquette_carpet.get());

				output.accept(ModItems.orange_gold_moquette_carpet.get());
				output.accept(ModItems.orange_silver_moquette_carpet.get());
				output.accept(ModItems.orange_copper_moquette_carpet.get());

				output.accept(ModItems.yellow_gold_moquette_carpet.get());
				output.accept(ModItems.yellow_silver_moquette_carpet.get());
				output.accept(ModItems.yellow_copper_moquette_carpet.get());

				output.accept(ModItems.olive_gold_moquette_carpet.get());
				output.accept(ModItems.olive_silver_moquette_carpet.get());
				output.accept(ModItems.olive_copper_moquette_carpet.get());

				output.accept(ModItems.green_gold_moquette_carpet.get());
				output.accept(ModItems.green_silver_moquette_carpet.get());
				output.accept(ModItems.green_copper_moquette_carpet.get());

				output.accept(ModItems.seagreen_gold_moquette_carpet.get());
				output.accept(ModItems.seagreen_silver_moquette_carpet.get());
				output.accept(ModItems.seagreen_copper_moquette_carpet.get());

				output.accept(ModItems.emerald_gold_moquette_carpet.get());
				output.accept(ModItems.emerald_silver_moquette_carpet.get());
				output.accept(ModItems.emerald_copper_moquette_carpet.get());

				output.accept(ModItems.aquamarine_gold_moquette_carpet.get());
				output.accept(ModItems.aquamarine_silver_moquette_carpet.get());
				output.accept(ModItems.aquamarine_copper_moquette_carpet.get());

				output.accept(ModItems.blue_gold_moquette_carpet.get());
				output.accept(ModItems.blue_silver_moquette_carpet.get());
				output.accept(ModItems.blue_copper_moquette_carpet.get());

				output.accept(ModItems.cobaltblue_gold_moquette_carpet.get());
				output.accept(ModItems.cobaltblue_silver_moquette_carpet.get());
				output.accept(ModItems.cobaltblue_copper_moquette_carpet.get());

				output.accept(ModItems.midnight_gold_moquette_carpet.get());
				output.accept(ModItems.midnight_silver_moquette_carpet.get());
				output.accept(ModItems.midnight_copper_moquette_carpet.get());

				output.accept(ModItems.violet_gold_moquette_carpet.get());
				output.accept(ModItems.violet_silver_moquette_carpet.get());
				output.accept(ModItems.violet_copper_moquette_carpet.get());

				output.accept(ModItems.purple_gold_moquette_carpet.get());
				output.accept(ModItems.purple_silver_moquette_carpet.get());
				output.accept(ModItems.purple_copper_moquette_carpet.get());

				output.accept(ModItems.orchid_gold_moquette_carpet.get());
				output.accept(ModItems.orchid_silver_moquette_carpet.get());
				output.accept(ModItems.orchid_copper_moquette_carpet.get());

				output.accept(ModItems.black_gold_moquette_carpet.get());
				output.accept(ModItems.black_silver_moquette_carpet.get());
				output.accept(ModItems.black_copper_moquette_carpet.get());

				output.accept(ModItems.gray_gold_moquette_carpet.get());
				output.accept(ModItems.gray_silver_moquette_carpet.get());
				output.accept(ModItems.gray_copper_moquette_carpet.get());
			})
			.build());
}