package net.anoltongi.bakedncaked.item;

import net.anoltongi.bakedncaked.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;

public class ModFoodProperties extends Block {
    //public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            //.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();

    public static final FoodProperties CHOCOLATE_PASTE = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();

    public static final FoodProperties CHOCOLATE_PASTE_BREAD_SLICE = new FoodProperties.Builder().nutrition(6).saturationMod(0.25f).build();

    public static final FoodProperties GLOW_BERRY_JAM = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();

    public static final FoodProperties GLOW_BERRY_JAM_BREAD_SLICE = new FoodProperties.Builder().nutrition(6).saturationMod(0.25f).build();

    public static final FoodProperties SWEET_BERRY_JAM = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();

    public static final FoodProperties SWEET_BERRY_JAM_BREAD_SLICE = new FoodProperties.Builder().nutrition(6).saturationMod(0.25f).build();

    public static final FoodProperties TOAST = new FoodProperties.Builder().nutrition(4).saturationMod(0.25f).build();

    public static final FoodProperties CHOCOLATE_CAKE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties CHOCOLATE_CAKE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties CARROT_CAKE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties CARROT_CAKE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties APPLE_PIE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties SWEET_BERRY_PIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties SWEET_BERRY_PIE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties GLOW_BERRY_PIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200), 1f).build();

    public static final FoodProperties GLOW_BERRY_PIE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200), 1f).build();

    public static final FoodProperties BLUE_BERRY_PIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties BLUE_BERRY_PIE_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.25f).build();

    public static final FoodProperties BLUE_BERRY = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build();


    public ModFoodProperties(Properties pProperties) {
        super(pProperties);
    }
}
