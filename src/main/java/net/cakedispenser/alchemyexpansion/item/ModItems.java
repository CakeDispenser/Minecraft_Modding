package net.cakedispenser.alchemyexpansion.item;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemyExpansion.MOD_ID);

    public static final RegistryObject<Item> GLITTERING_GLOWSTONE = ITEMS.register("glittering_glowstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWERED_REDSTONE = ITEMS.register("powered_redstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POTENT_MIX = ITEMS.register("potent_mix",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_QUARTZ = ITEMS.register("golden_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
