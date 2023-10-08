package net.cakedispenser.alchemyexpansion.item;

import net.cakedispenser.alchemyexpansion.AlchemyExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTier {
    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1561, 10f, 3f, 18,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(AlchemyExpansion.MOD_ID, "mithril"), List.of(Tiers.DIAMOND), List.of()
    );
}
