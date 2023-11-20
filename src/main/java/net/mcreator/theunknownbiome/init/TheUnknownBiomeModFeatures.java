
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.theunknownbiome.world.features.plants.MobbyFeature;
import net.mcreator.theunknownbiome.world.features.plants.GrassplantFeature;
import net.mcreator.theunknownbiome.world.features.ores.TitamilkoreFeature;
import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

@Mod.EventBusSubscriber
public class TheUnknownBiomeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<Feature<?>> GRASSPLANT = REGISTRY.register("grassplant", GrassplantFeature::new);
	public static final RegistryObject<Feature<?>> TITAMILKORE = REGISTRY.register("titamilkore", TitamilkoreFeature::new);
	public static final RegistryObject<Feature<?>> MOBBY = REGISTRY.register("mobby", MobbyFeature::new);
}
