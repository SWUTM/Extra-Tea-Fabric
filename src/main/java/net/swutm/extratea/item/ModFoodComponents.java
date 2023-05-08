package net.swutm.extratea.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BLACK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000, 1), 1.0F).build();
    public static final FoodComponent GREEN_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 200, 4), 1.0F).build();
    public static final FoodComponent KARKADE_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).build();
    public static final FoodComponent MINT_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 5000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 5000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 5000, 1), 1.0F).build();
    public static final FoodComponent CHAMOMILE_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5000, 1), 1.0F).build();

}
