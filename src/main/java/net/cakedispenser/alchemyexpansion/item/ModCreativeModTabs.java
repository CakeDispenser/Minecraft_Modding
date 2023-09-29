package net.cakedispenser.alchemyexpansion.item;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.cakedispenser.alchemyexpansion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlchemyExpansion.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLITTERING_GLOWSTONE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GLITTERING_GLOWSTONE.get());
                        pOutput.accept(ModItems.POWERED_REDSTONE.get());
                        pOutput.accept(ModItems.POTENT_MIX.get());
                        pOutput.accept(ModItems.GOLDEN_QUARTZ.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get().asItem());

                    })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
