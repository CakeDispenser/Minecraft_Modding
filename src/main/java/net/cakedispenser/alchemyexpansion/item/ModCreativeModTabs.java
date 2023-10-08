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
                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get().asItem());
                        pOutput.accept(ModBlocks.SILVER_ORE.get().asItem());
                        pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.ADAMANTIUM_INGOT.get());
                        pOutput.accept(ModItems.MITHRIL_SWORD.get());
                        pOutput.accept(ModItems.MITHRIL_AXE.get());
                        pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MITHRIL_HOE.get());

                    })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
