package net.cakedispenser.tutorialmod.item;

import net.cakedispenser.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> GLITTERING_GLOWSTONE = ITEMS.register("glittering_glowstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWERED_REDSTONE = ITEMS.register("powered_redstone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
