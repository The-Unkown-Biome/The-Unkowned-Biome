
package net.mcreator.theunknownbiome.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.theunknownbiome.procedures.TitaswordLivingEntityIsHitWithToolProcedure;
import net.mcreator.theunknownbiome.init.TheUnknownBiomeModItems;

public class TitaswordItem extends SwordItem {
	public TitaswordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheUnknownBiomeModItems.TITAMILK.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TitaswordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
