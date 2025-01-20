package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.item.ModItems;
import com.farestr06.fromtheashes.item.equipment.GerunditeEquipment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(ModBlocks.TEPHRA);

        BlockStateModelGenerator.BlockTexturePool ashenitePool =
                generator.registerCubeAllModelTexturePool(ModBlocks.ASHENITE);
        ashenitePool.family(ModBlocks.ASHENITE_FAMILY);

        BlockStateModelGenerator.BlockTexturePool polishedAshenitePool =
                generator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ASHENITE);
        polishedAshenitePool.family(ModBlocks.POLISHED_ASHENITE_FAMILY);

        BlockStateModelGenerator.BlockTexturePool polishedAsheniteBrickPool =
                generator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ASHENITE_BRICKS);
        polishedAsheniteBrickPool.family(ModBlocks.POLISHED_ASHENITE_BRICK_FAMILY);



        generator.registerSimpleCubeAll(ModBlocks.GERUNDITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(ModItems.SLUDGE_BUCKET, Models.GENERATED);

        generator.register(ModItems.RAW_AMOGIUM, Models.GENERATED);
        generator.register(ModItems.AMOGIUM_INGOT, Models.GENERATED);

        generator.register(ModItems.RAW_GERUNDITE, Models.GENERATED);
        generator.register(ModItems.GERUNDITE_INGOT, Models.GENERATED);
        generator.register(ModItems.GERUNDITE_NUGGET, Models.GENERATED);

        generator.register(ModItems.GERUNDITE_AXE, Models.HANDHELD);
        generator.register(ModItems.GERUNDITE_HOE, Models.HANDHELD);
        generator.register(ModItems.GERUNDITE_PICKAXE, Models.HANDHELD);
        generator.register(ModItems.GERUNDITE_SHOVEL, Models.HANDHELD);
        generator.register(ModItems.GERUNDITE_SWORD, Models.HANDHELD);

        generator.registerArmor(ModItems.GERUNDITE_HELMET, GerunditeEquipment.EQUIPMENT_ASSET_KEY,
                "helmet", false);
        generator.registerArmor(ModItems.GERUNDITE_CHESTPLATE, GerunditeEquipment.EQUIPMENT_ASSET_KEY,
                "chestplate", false);
        generator.registerArmor(ModItems.GERUNDITE_LEGGINGS, GerunditeEquipment.EQUIPMENT_ASSET_KEY,
                "leggings", false);
        generator.registerArmor(ModItems.GERUNDITE_BOOTS, GerunditeEquipment.EQUIPMENT_ASSET_KEY,
                "boots", false);
    }
}
