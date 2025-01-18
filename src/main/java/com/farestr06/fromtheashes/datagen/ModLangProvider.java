package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    protected ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
        addBlockAndItemTranslation(builder, ModBlocks.TEPHRA, "Tephra");
        addBlockAndItemTranslation(builder, ModBlocks.ASHENITE, "Ashenite");

        builder.add(ModBlocks.SLUDGE, "Sludge");
        builder.add(ModItems.SLUDGE_BUCKET, "Sludge Bucket");

        builder.add("subtitles.block.sludge.ambient", "Sludge plops");

        builder.add("itemGroup.ashen_building_blocks", "Building Blocks (From The Ashes)");
        builder.add("itemGroup.ashen_natural", "Natural Blocks (From The Ashes)");
        builder.add("itemGroup.ashen_tools_and_utilities", "Tools & Utilities (From The Ashes)");
    }

    private void addBlockAndItemTranslation(TranslationBuilder builder, Block block, String name) {
        builder.add(block, name);
        builder.add(block.asItem(), name);
    }
}
