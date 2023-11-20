package net.mcreator.theunknownbiome.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.theunknownbiome.entity.CrazyEntity;

public class CrazyModel extends GeoModel<CrazyEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrazyEntity entity) {
		return new ResourceLocation("the_unknown_biome", "animations/crazyrework.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrazyEntity entity) {
		return new ResourceLocation("the_unknown_biome", "geo/crazyrework.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrazyEntity entity) {
		return new ResourceLocation("the_unknown_biome", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CrazyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
