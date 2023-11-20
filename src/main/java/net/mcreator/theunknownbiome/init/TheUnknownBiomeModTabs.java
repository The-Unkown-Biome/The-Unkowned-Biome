
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheUnknownBiomeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheUnknownBiomeMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TheUnknownBiomeModBlocks.MAOKPLANK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheUnknownBiomeModItems.TITASWORD.get());
			tabData.accept(TheUnknownBiomeModItems.TITAARMOR_HELMET.get());
			tabData.accept(TheUnknownBiomeModItems.TITAARMOR_CHESTPLATE.get());
			tabData.accept(TheUnknownBiomeModItems.TITAARMOR_LEGGINGS.get());
			tabData.accept(TheUnknownBiomeModItems.TITAARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TheUnknownBiomeModItems.CRAZY_SPAWN_EGG.get());
			tabData.accept(TheUnknownBiomeModItems.MIG_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TheUnknownBiomeModItems.TITAMILK.get());
			tabData.accept(TheUnknownBiomeModBlocks.MOBBY.get().asItem());
			tabData.accept(TheUnknownBiomeModItems.CRAZYBLOOD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheUnknownBiomeModBlocks.MILK_GRASS.get().asItem());
			tabData.accept(TheUnknownBiomeModBlocks.MAOK_LOG.get().asItem());
			tabData.accept(TheUnknownBiomeModBlocks.GRASS.get().asItem());
			tabData.accept(TheUnknownBiomeModBlocks.GRASSPLANT.get().asItem());
			tabData.accept(TheUnknownBiomeModBlocks.TITAMILKORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheUnknownBiomeModItems.TITAPICKAXE.get());
			tabData.accept(TheUnknownBiomeModItems.TITA_AXE.get());
			tabData.accept(TheUnknownBiomeModItems.TITAHOE.get());
			tabData.accept(TheUnknownBiomeModItems.TITA_SHOVEL.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TheUnknownBiomeModItems.BLOODPLATE.get());
			tabData.accept(TheUnknownBiomeModItems.COOKEDCRAZYBLOOD.get());
		}
	}
}
