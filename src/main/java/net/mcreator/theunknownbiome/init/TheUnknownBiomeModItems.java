
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theunknownbiome.item.TitaswordItem;
import net.mcreator.theunknownbiome.item.TitapickaxeItem;
import net.mcreator.theunknownbiome.item.TitamilkItem;
import net.mcreator.theunknownbiome.item.TitahoeItem;
import net.mcreator.theunknownbiome.item.TitaarmorItem;
import net.mcreator.theunknownbiome.item.TitaShovelItem;
import net.mcreator.theunknownbiome.item.TitaAxeItem;
import net.mcreator.theunknownbiome.item.MaokSaplingitemItem;
import net.mcreator.theunknownbiome.item.CrazybloodItem;
import net.mcreator.theunknownbiome.item.CookedcrazybloodItem;
import net.mcreator.theunknownbiome.item.BloodplateItem;
import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

public class TheUnknownBiomeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<Item> MILK_GRASS = block(TheUnknownBiomeModBlocks.MILK_GRASS);
	public static final RegistryObject<Item> MAOK_LOG = block(TheUnknownBiomeModBlocks.MAOK_LOG);
	public static final RegistryObject<Item> MILK_LEAVES = block(TheUnknownBiomeModBlocks.MILK_LEAVES);
	public static final RegistryObject<Item> GRASS = block(TheUnknownBiomeModBlocks.GRASS);
	public static final RegistryObject<Item> GRASSPLANT = block(TheUnknownBiomeModBlocks.GRASSPLANT);
	public static final RegistryObject<Item> TITAMILK = REGISTRY.register("titamilk", () -> new TitamilkItem());
	public static final RegistryObject<Item> TITAMILKORE = block(TheUnknownBiomeModBlocks.TITAMILKORE);
	public static final RegistryObject<Item> MAOKPLANK = block(TheUnknownBiomeModBlocks.MAOKPLANK);
	public static final RegistryObject<Item> TITASWORD = REGISTRY.register("titasword", () -> new TitaswordItem());
	public static final RegistryObject<Item> TITAPICKAXE = REGISTRY.register("titapickaxe", () -> new TitapickaxeItem());
	public static final RegistryObject<Item> TITA_AXE = REGISTRY.register("tita_axe", () -> new TitaAxeItem());
	public static final RegistryObject<Item> TITAHOE = REGISTRY.register("titahoe", () -> new TitahoeItem());
	public static final RegistryObject<Item> TITA_SHOVEL = REGISTRY.register("tita_shovel", () -> new TitaShovelItem());
	public static final RegistryObject<Item> CRAZY_SPAWN_EGG = REGISTRY.register("crazy_spawn_egg", () -> new ForgeSpawnEggItem(TheUnknownBiomeModEntities.CRAZY, -1, -65485, new Item.Properties()));
	public static final RegistryObject<Item> TITAARMOR_HELMET = REGISTRY.register("titaarmor_helmet", () -> new TitaarmorItem.Helmet());
	public static final RegistryObject<Item> TITAARMOR_CHESTPLATE = REGISTRY.register("titaarmor_chestplate", () -> new TitaarmorItem.Chestplate());
	public static final RegistryObject<Item> TITAARMOR_LEGGINGS = REGISTRY.register("titaarmor_leggings", () -> new TitaarmorItem.Leggings());
	public static final RegistryObject<Item> TITAARMOR_BOOTS = REGISTRY.register("titaarmor_boots", () -> new TitaarmorItem.Boots());
	public static final RegistryObject<Item> MOBBY = block(TheUnknownBiomeModBlocks.MOBBY);
	public static final RegistryObject<Item> CRAZYBLOOD = REGISTRY.register("crazyblood", () -> new CrazybloodItem());
	public static final RegistryObject<Item> BLOODPLATE = REGISTRY.register("bloodplate", () -> new BloodplateItem());
	public static final RegistryObject<Item> COOKEDCRAZYBLOOD = REGISTRY.register("cookedcrazyblood", () -> new CookedcrazybloodItem());
	public static final RegistryObject<Item> MIG_SPAWN_EGG = REGISTRY.register("mig_spawn_egg", () -> new ForgeSpawnEggItem(TheUnknownBiomeModEntities.MIG, -10066330, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> MAOK_SAPLING = block(TheUnknownBiomeModBlocks.MAOK_SAPLING);
	public static final RegistryObject<Item> MAOK_SAPLINGITEM = REGISTRY.register("maok_saplingitem", () -> new MaokSaplingitemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
