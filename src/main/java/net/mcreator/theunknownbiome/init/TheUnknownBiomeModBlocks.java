
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theunknownbiome.block.TitamilkoreBlock;
import net.mcreator.theunknownbiome.block.MobbyBlock;
import net.mcreator.theunknownbiome.block.MilkLeavesBlock;
import net.mcreator.theunknownbiome.block.MilkGrassBlock;
import net.mcreator.theunknownbiome.block.MaokplankBlock;
import net.mcreator.theunknownbiome.block.MaokLogBlock;
import net.mcreator.theunknownbiome.block.GrassplantBlock;
import net.mcreator.theunknownbiome.block.GrassBlock;
import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

public class TheUnknownBiomeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<Block> MILK_GRASS = REGISTRY.register("milk_grass", () -> new MilkGrassBlock());
	public static final RegistryObject<Block> MAOK_LOG = REGISTRY.register("maok_log", () -> new MaokLogBlock());
	public static final RegistryObject<Block> MILK_LEAVES = REGISTRY.register("milk_leaves", () -> new MilkLeavesBlock());
	public static final RegistryObject<Block> GRASS = REGISTRY.register("grass", () -> new GrassBlock());
	public static final RegistryObject<Block> GRASSPLANT = REGISTRY.register("grassplant", () -> new GrassplantBlock());
	public static final RegistryObject<Block> TITAMILKORE = REGISTRY.register("titamilkore", () -> new TitamilkoreBlock());
	public static final RegistryObject<Block> MAOKPLANK = REGISTRY.register("maokplank", () -> new MaokplankBlock());
	public static final RegistryObject<Block> MOBBY = REGISTRY.register("mobby", () -> new MobbyBlock());
}
