package net.cakedispenser.alchemyexpansion.datagen;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.cakedispenser.alchemyexpansion.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AlchemyExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ADAMANTIUM_INGOT);
        simpleItem(ModItems.GLITTERING_GLOWSTONE);
        simpleItem(ModItems.POTENT_MIX);
        simpleItem(ModItems.POWERED_REDSTONE);
        simpleItem(ModItems.GOLDEN_QUARTZ);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.MITHRIL_INGOT);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_HOE);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.ADAMANTIUM_AXE);
        handheldItem(ModItems.ADAMANTIUM_HOE);
        handheldItem(ModItems.ADAMANTIUM_PICKAXE);
        handheldItem(ModItems.ADAMANTIUM_SHOVEL);
        handheldItem(ModItems.ADAMANTIUM_SWORD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AlchemyExpansion.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(AlchemyExpansion.MOD_ID, "item/" + item.getId().getPath()));
    }
}
