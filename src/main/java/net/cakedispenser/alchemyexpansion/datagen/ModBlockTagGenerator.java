package net.cakedispenser.alchemyexpansion.datagen;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.cakedispenser.alchemyexpansion.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AlchemyExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        /*
        this.tag(ModTags.Blocks.NEEDS_ADAMANTIUM_TOOL)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get()).addTag(Tags.Blocks.ORES);
        */

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.SILVER_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.SILVER_BLOCK.get());
        /*
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.SILVER_BLOCK.get());
         */
    }
}
