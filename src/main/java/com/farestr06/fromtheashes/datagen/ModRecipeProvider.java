package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.item.ModItems;
import com.farestr06.fromtheashes.util.ModTags;
import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            private static final ImmutableList<ItemConvertible> GERUNDITE_ORES = ImmutableList.of(ModItems.RAW_GERUNDITE);
            private static final ImmutableList<ItemConvertible> AMOGIUM_ORES = ImmutableList.of(ModItems.RAW_AMOGIUM);

            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                gerundite();
                offerSmelting(AMOGIUM_ORES, RecipeCategory.MISC, ModItems.AMOGIUM_INGOT, 0.8f,
                        200, "amogium_ingot");
                offerBlasting(AMOGIUM_ORES, RecipeCategory.MISC, ModItems.AMOGIUM_INGOT, 0.8f,
                        100, "amogium_ingot");
            }

            private void gerundite() {
                offerSmelting(GERUNDITE_ORES, RecipeCategory.MISC, ModItems.GERUNDITE_INGOT, 0.8f,
                        200, "gerundite_ingot");
                offerBlasting(GERUNDITE_ORES, RecipeCategory.MISC, ModItems.GERUNDITE_INGOT, 0.8f,
                        100, "gerundite_ingot");
                // region Ore
                offerReversibleCompactingRecipesWithReverseRecipeGroup(
                        RecipeCategory.MISC, ModItems.GERUNDITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GERUNDITE_BLOCK, "gerundite_ingot_from_gerundite_block", "gerundite_ingot"
                );
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(
                        RecipeCategory.MISC, ModItems.GERUNDITE_NUGGET, RecipeCategory.MISC, ModItems.GERUNDITE_INGOT, "gerundite_ingot_from_nuggets", "gerundite_ingot"
                );
                // endregion
                // region Tools
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_SWORD)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .input('N', ModItems.GERUNDITE_NUGGET)
                        .pattern("G")
                        .pattern("G")
                        .pattern("N")
                        .criterion("has_gerundite", conditionsFromTag(ModTags.Items.GERUNDITE_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_SHOVEL)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .input('N', ModItems.GERUNDITE_NUGGET)
                        .pattern("G")
                        .pattern("N")
                        .pattern("N")
                        .criterion("has_gerundite", conditionsFromTag(ModTags.Items.GERUNDITE_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_PICKAXE)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .input('N', ModItems.GERUNDITE_NUGGET)
                        .pattern("GGG")
                        .pattern(" N ")
                        .pattern(" N ")
                        .criterion("has_gerundite", conditionsFromTag(ModTags.Items.GERUNDITE_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_AXE)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .input('N', ModItems.GERUNDITE_NUGGET)
                        .pattern("GG")
                        .pattern("GN")
                        .pattern(" N")
                        .criterion("has_gerundite", conditionsFromTag(ModTags.Items.GERUNDITE_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_HOE)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .input('N', ModItems.GERUNDITE_NUGGET)
                        .pattern("GG")
                        .pattern(" N")
                        .pattern(" N")
                        .criterion("has_gerundite", conditionsFromTag(ModTags.Items.GERUNDITE_TOOL_MATERIALS))
                        .offerTo(exporter);
                // endregion
                // region Armor
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_HELMET)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .pattern("GGG")
                        .pattern("G G")
                        .criterion(hasItem(ModItems.GERUNDITE_INGOT), conditionsFromItem(ModItems.GERUNDITE_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_CHESTPLATE)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .pattern("G G")
                        .pattern("GGG")
                        .pattern("GGG")
                        .criterion(hasItem(ModItems.GERUNDITE_INGOT), conditionsFromItem(ModItems.GERUNDITE_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_LEGGINGS)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .pattern("GGG")
                        .pattern("G G")
                        .pattern("G G")
                        .criterion(hasItem(ModItems.GERUNDITE_INGOT), conditionsFromItem(ModItems.GERUNDITE_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.GERUNDITE_BOOTS)
                        .input('G', ModItems.GERUNDITE_INGOT)
                        .pattern("G G")
                        .pattern("G G")
                        .criterion(hasItem(ModItems.GERUNDITE_INGOT), conditionsFromItem(ModItems.GERUNDITE_INGOT))
                        .offerTo(exporter);
                // endregion
            }
        };
    }

    @Override
    public String getName() {
        return "Recipes";
    }
}
