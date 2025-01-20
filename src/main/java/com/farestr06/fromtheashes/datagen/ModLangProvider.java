package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    protected ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
        blockTranslations(builder);
        itemTranslations(builder);
        itemGroupTranslations(builder);
        soundTranslations(builder);
    }

    private static void itemTranslations(TranslationBuilder builder) {
        gerunditeTranslations(builder);
        builder.add(ModItems.RAW_AMOGIUM, "Raw Amogium");
        builder.add(ModItems.AMOGIUM_INGOT, "Amogium Ingot");
    }

    private static void gerunditeTranslations(TranslationBuilder builder) {
        builder.add(ModItems.RAW_GERUNDITE, "Raw Gerundite");
        builder.add(ModItems.GERUNDITE_NUGGET, "Gerundite Nugget");
        builder.add(ModItems.GERUNDITE_INGOT, "Gerundite Ingot");
        builder.add(ModBlocks.GERUNDITE_BLOCK, "Block of Gerundite");

        builder.add(ModItems.GERUNDITE_AXE, "Gerundite Axe");
        builder.add(ModItems.GERUNDITE_HOE, "Gerundite Hoe");
        builder.add(ModItems.GERUNDITE_PICKAXE, "Gerundite Pickaxe");
        builder.add(ModItems.GERUNDITE_SHOVEL, "Gerundite Shovel");
        builder.add(ModItems.GERUNDITE_SWORD, "Gerundite Sword");

        builder.add(ModItems.GERUNDITE_HELMET, "Gerundite Helmet");
        builder.add(ModItems.GERUNDITE_CHESTPLATE, "Gerundite Chestplate");
        builder.add(ModItems.GERUNDITE_LEGGINGS, "Gerundite Leggings");
        builder.add(ModItems.GERUNDITE_BOOTS, "Gerundite Boots");
    }

    private static void blockTranslations(TranslationBuilder builder) {
        builder.add(ModBlocks.TEPHRA, "Tephra");
        asheniteTranslations(builder);

        builder.add(ModBlocks.SLUDGE, "Sludge");
        builder.add(ModItems.SLUDGE_BUCKET, "Sludge Bucket");
    }


    private static void itemGroupTranslations(TranslationBuilder builder) {
        builder.add("itemGroup.ashen_building_blocks", "Building Blocks (From The Ashes)");
        builder.add("itemGroup.ashen_natural", "Natural Blocks (From The Ashes)");
        builder.add("itemGroup.ashen_tools_and_utilities", "Tools & Utilities (From The Ashes)");
        builder.add("itemGroup.ashen_combat", "Combat (From The Ashes)");
        builder.add("itemGroup.ashen_ingredients", "Ingredients (From The Ashes)");
    }

    private static void asheniteTranslations(TranslationBuilder builder) {
        builder.add(ModBlocks.ASHENITE, "Ashenite");
        builder.add(ModBlocks.ASHENITE_SLAB, "Ashenite Slab");
        builder.add(ModBlocks.ASHENITE_STAIRS, "Ashenite Stairs");
        builder.add(ModBlocks.ASHENITE_WALL, "Ashenite Wall");

        builder.add(ModBlocks.POLISHED_ASHENITE, "Polished Ashenite");
        builder.add(ModBlocks.POLISHED_ASHENITE_SLAB, "Polished Ashenite Slab");
        builder.add(ModBlocks.POLISHED_ASHENITE_STAIRS, "Polished Ashenite Stairs");
        builder.add(ModBlocks.POLISHED_ASHENITE_WALL, "Polished Ashenite Wall");

        builder.add(ModBlocks.POLISHED_ASHENITE_BRICKS, "Polished Ashenite Bricks");
        builder.add(ModBlocks.POLISHED_ASHENITE_BRICK_SLAB, "Polished Ashenite Brick Slab");
        builder.add(ModBlocks.POLISHED_ASHENITE_BRICK_STAIRS, "Polished Ashenite Brick Stairs");
        builder.add(ModBlocks.POLISHED_ASHENITE_BRICK_WALL, "Polished Ashenite Brick Wall");
    }

    private static void soundTranslations(TranslationBuilder builder) {
        builder.add("subtitles.block.sludge.ambient", "Sludge plops");
        builder.add("subtitles.item.armor.equip_gerundite", "Gerundite armor clinks");
    }
}
