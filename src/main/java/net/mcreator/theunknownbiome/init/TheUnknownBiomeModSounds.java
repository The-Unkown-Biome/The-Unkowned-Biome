
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

public class TheUnknownBiomeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<SoundEvent> LIVINGCRAZY = REGISTRY.register("livingcrazy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_unknown_biome", "livingcrazy")));
	public static final RegistryObject<SoundEvent> HURTCRAZY = REGISTRY.register("hurtcrazy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_unknown_biome", "hurtcrazy")));
	public static final RegistryObject<SoundEvent> CRAZYDIE = REGISTRY.register("crazydie", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_unknown_biome", "crazydie")));
	public static final RegistryObject<SoundEvent> EQUIPARMOR = REGISTRY.register("equiparmor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_unknown_biome", "equiparmor")));
	public static final RegistryObject<SoundEvent> ARMORREWORK = REGISTRY.register("armorrework", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_unknown_biome", "armorrework")));
}
