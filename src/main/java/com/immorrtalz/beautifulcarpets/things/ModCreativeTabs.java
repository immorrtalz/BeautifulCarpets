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
			.icon(ModItems.red_moquette.get()::getDefaultInstance)
			.displayItems((params, output) ->
			{
				output.accept(ModItems.red_moquette.get());
				output.accept(ModItems.red_moquette_carpet.get());
			})
			.build());
}