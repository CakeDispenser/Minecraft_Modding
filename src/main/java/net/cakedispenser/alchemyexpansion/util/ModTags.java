package net.cakedispenser.alchemyexpansion.util;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> VALUABLES = tag("valuables");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AlchemyExpansion.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
