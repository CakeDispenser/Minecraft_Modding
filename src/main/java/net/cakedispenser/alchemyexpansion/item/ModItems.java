package net.cakedispenser.alchemyexpansion.item;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_INGOT = ITEMS.register("adamantium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTier.MITHRIL, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTier.MITHRIL, 5, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTier.MITHRIL, 1.5f, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTier.MITHRIL, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTier.MITHRIL, -3, 0.0f, new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_PICKAXE = ITEMS.register("adamantium_pickaxe",
            () -> new PickaxeItem(ModToolTier.ADAMANTIUM, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_AXE = ITEMS.register("adamantium_axe",
            () -> new AxeItem(ModToolTier.ADAMANTIUM, 5, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_SHOVEL = ITEMS.register("adamantium_shovel",
            () -> new ShovelItem(ModToolTier.ADAMANTIUM, 1.5f, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_SWORD = ITEMS.register("adamantium_sword",
            () -> new SwordItem(ModToolTier.ADAMANTIUM, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTIUM_HOE = ITEMS.register("adamantium_hoe",
            () -> new HoeItem(ModToolTier.ADAMANTIUM, -5, 0.0f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
