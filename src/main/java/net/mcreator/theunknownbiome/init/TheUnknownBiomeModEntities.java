
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknownbiome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.theunknownbiome.entity.MigEntity;
import net.mcreator.theunknownbiome.entity.CrazyEntity;
import net.mcreator.theunknownbiome.TheUnknownBiomeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheUnknownBiomeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheUnknownBiomeMod.MODID);
	public static final RegistryObject<EntityType<CrazyEntity>> CRAZY = register("crazy",
			EntityType.Builder.<CrazyEntity>of(CrazyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrazyEntity::new)

					.sized(1.5f, 3.5f));
	public static final RegistryObject<EntityType<MigEntity>> MIG = register("mig",
			EntityType.Builder.<MigEntity>of(MigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MigEntity::new)

					.sized(1f, 1.2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrazyEntity.init();
			MigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CRAZY.get(), CrazyEntity.createAttributes().build());
		event.put(MIG.get(), MigEntity.createAttributes().build());
	}
}
