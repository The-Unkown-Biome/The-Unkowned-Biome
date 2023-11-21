
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.theunknownbiome.block.entity.MaokSaplingBlockEntity;
import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

public class TheUnknownBiomeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MAOK_SAPLING = register("maok_sapling", TheUnknownBiomeModBlocks.MAOK_SAPLING, MaokSaplingBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
