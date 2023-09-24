package net.cakedispenser.alchemyexpansion.item;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, AlchemyExpansion.MOD_ID);
    public static final RegistryObject<Potion> SUPER_LONG_FIRE_RESISTANCE = POTIONS.register("super_long_fire_resistance", () -> new Potion("fire_resistance", new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_LONG_NIGHT_VISION = POTIONS.register("super_long_night_vision", () -> new Potion("night_vision", new MobEffectInstance(MobEffects.NIGHT_VISION, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_LONG_STRENGTH = POTIONS.register("super_long_strength", () -> new Potion("strength", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_STRONG_STRENGTH = POTIONS.register("super_strong_strength", () -> new Potion("strength", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 2)));
    public static final RegistryObject<Potion> STRONG_LONG_STRENGTH = POTIONS.register("strong_long_strength", () -> new Potion("strength", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 9600, 1)));
    public static final RegistryObject<Potion> SUPER_LONG_WEAKNESS = POTIONS.register("super_long_weakness", () -> new Potion("weakness", new MobEffectInstance(MobEffects.WEAKNESS, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_LONG_INVISIBILITY = POTIONS.register("super_long_invisibility", () -> new Potion("invisibility", new MobEffectInstance(MobEffects.INVISIBILITY, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_LONG_SLOW_FALLING = POTIONS.register("super_long_slow_falling", () -> new Potion("slow_falling", new MobEffectInstance(MobEffects.SLOW_FALLING, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_LONG_SWIFTNESS = POTIONS.register("super_long_swiftness", () -> new Potion("swiftness", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_STRONG_SWIFTNESS = POTIONS.register("super_strong_swiftness", () -> new Potion("swiftness", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 2)));
    public static final RegistryObject<Potion> STRONG_LONG_SWIFTNESS = POTIONS.register("strong_long_swiftness", () -> new Potion("swiftness", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600, 1)));
    public static final RegistryObject<Potion> SUPER_LONG_LEAPING = POTIONS.register("super_long_leaping", () -> new Potion("leaping", new MobEffectInstance(MobEffects.JUMP, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_STRONG_LEAPING = POTIONS.register("super_strong_leaping", () -> new Potion("leaping", new MobEffectInstance(MobEffects.JUMP, 900, 2)));
    public static final RegistryObject<Potion> STRONG_LONG_LEAPING = POTIONS.register("strong_long_leaping", () -> new Potion("leaping", new MobEffectInstance(MobEffects.JUMP, 9600, 1)));
    public static final RegistryObject<Potion> SUPER_STRONG_HEALING = POTIONS.register("super_strong_healing", () -> new Potion("healing", new MobEffectInstance(MobEffects.HEAL, 1, 2)));
    public static final RegistryObject<Potion> SUPER_STRONG_HARMING = POTIONS.register("super_strong_harming", () -> new Potion("harming", new MobEffectInstance(MobEffects.HARM, 1, 2)));
    public static final RegistryObject<Potion> SUPER_LONG_REGENERATION = POTIONS.register("super_long_regeneration", () -> new Potion("regeneration", new MobEffectInstance(MobEffects.JUMP, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_STRONG_REGENERATION = POTIONS.register("super_strong_regeneration", () -> new Potion("regeneration", new MobEffectInstance(MobEffects.JUMP, 900, 2)));
    public static final RegistryObject<Potion> STRONG_LONG_REGENERATION = POTIONS.register("strong_long_regeneration", () -> new Potion("regeneration", new MobEffectInstance(MobEffects.JUMP, 9600, 1)));
    public static final RegistryObject<Potion> SUPER_LONG_POISON = POTIONS.register("super_long_poison", () -> new Potion("poison", new MobEffectInstance(MobEffects.JUMP, 25600, 0)));
    public static final RegistryObject<Potion> SUPER_STRONG_POISON = POTIONS.register("super_strong_poison", () -> new Potion("poison", new MobEffectInstance(MobEffects.JUMP, 900, 2)));
    public static final RegistryObject<Potion> STRONG_LONG_POISON = POTIONS.register("strong_long_poison", () -> new Potion("poison", new MobEffectInstance(MobEffects.JUMP, 9600, 1)));
    public static final RegistryObject<Potion> SUPER_LONG_WATER_BREATHING = POTIONS.register("super_long_water_breathing", () -> new Potion("water_breathing", new MobEffectInstance(MobEffects.WATER_BREATHING, 25600, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
