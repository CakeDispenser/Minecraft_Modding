package net.cakedispenser.alchemyexpansion;

import com.mojang.logging.LogUtils;
import net.cakedispenser.alchemyexpansion.item.ModCreativeModTabs;
import net.cakedispenser.alchemyexpansion.item.ModItems;
import net.cakedispenser.alchemyexpansion.item.ModPotions;
import net.cakedispenser.alchemyexpansion.util.BBrewingRecipe;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AlchemyExpansion.MOD_ID)
public class AlchemyExpansion
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "alchemyexpansion";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AlchemyExpansion()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModPotions.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.FIRE_RESISTANCE, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_FIRE_RESISTANCE.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.STRENGTH, ModItems.POTENT_MIX.get(), ModPotions.STRONG_LONG_STRENGTH.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.NIGHT_VISION, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_NIGHT_VISION.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.WATER_BREATHING, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_WATER_BREATHING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.STRENGTH, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_STRENGTH.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.STRENGTH, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_STRENGTH.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.WEAKNESS, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_WEAKNESS.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.INVISIBILITY, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_INVISIBILITY.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.SLOW_FALLING, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_SLOW_FALLING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.SWIFTNESS, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_SWIFTNESS.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.SWIFTNESS, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_SWIFTNESS.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.SWIFTNESS, ModItems.POTENT_MIX.get(), ModPotions.STRONG_LONG_SWIFTNESS.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.REGENERATION, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_REGENERATION.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.REGENERATION, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_REGENERATION.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.REGENERATION, ModItems.POTENT_MIX.get(), ModPotions.STRONG_LONG_REGENERATION.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.LEAPING, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_LEAPING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.LEAPING, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_LEAPING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.LEAPING, ModItems.POTENT_MIX.get(), ModPotions.STRONG_LONG_LEAPING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.POISON, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_POISON.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.POISON, ModItems.POWERED_REDSTONE.get(), ModPotions.SUPER_LONG_POISON.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.POISON, ModItems.POTENT_MIX.get(), ModPotions.STRONG_LONG_POISON.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.HEALING, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_HEALING.get()));
        BrewingRecipeRegistry.addRecipe(new BBrewingRecipe(Potions.HARMING, ModItems.GLITTERING_GLOWSTONE.get(), ModPotions.SUPER_STRONG_HARMING.get()));


    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
