package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.fluid.ModFluid;
import com.farestr06.fromtheashes.item.ModItems;
import com.farestr06.fromtheashes.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public final class ModTagProviders {
    public static class Item extends FabricTagProvider.ItemTagProvider {

        public Item(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS).add(
                    ModBlocks.ASHENITE.asItem()
            );
            getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).add(
                    ModBlocks.ASHENITE.asItem()
            );

            getOrCreateTagBuilder(ConventionalItemTags.RAW_MATERIALS).add(
                    ModItems.RAW_AMOGIUM,
                    ModItems.RAW_GERUNDITE
            );
            getOrCreateTagBuilder(ConventionalItemTags.NUGGETS).add(
                    ModItems.GERUNDITE_NUGGET
            );
            getOrCreateTagBuilder(ConventionalItemTags.INGOTS).add(
                    ModItems.AMOGIUM_INGOT,
                    ModItems.GERUNDITE_INGOT
            );

            getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.GERUNDITE_SWORD);
            getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.GERUNDITE_SHOVEL);
            getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.GERUNDITE_PICKAXE);
            getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.GERUNDITE_AXE);
            getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.GERUNDITE_HOE);

            getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.GERUNDITE_HELMET);
            getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.GERUNDITE_CHESTPLATE);
            getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.GERUNDITE_LEGGINGS);
            getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.GERUNDITE_BOOTS);

            getOrCreateTagBuilder(ModTags.Items.REPAIRS_GERUNDITE_ARMOR).add(ModItems.GERUNDITE_INGOT);
            getOrCreateTagBuilder(ModTags.Items.GERUNDITE_TOOL_MATERIALS).add(ModItems.GERUNDITE_INGOT);

            getOrCreateTagBuilder(ConventionalItemTags.BUCKETS).add(
                    ModItems.SLUDGE_BUCKET
            );
        }
    }
    public static class Block extends FabricTagProvider.BlockTagProvider {
        public Block(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(
                    ModBlocks.TEPHRA
            );
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                    ModBlocks.ASHENITE,
                    ModBlocks.ASHENITE_SLAB,
                    ModBlocks.ASHENITE_STAIRS,
                    ModBlocks.ASHENITE_WALL,
                    ModBlocks.POLISHED_ASHENITE,
                    ModBlocks.POLISHED_ASHENITE_SLAB,
                    ModBlocks.POLISHED_ASHENITE_STAIRS,
                    ModBlocks.POLISHED_ASHENITE_WALL,
                    ModBlocks.GERUNDITE_BLOCK
            );
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(
                    ModBlocks.GERUNDITE_BLOCK
            );
            getOrCreateTagBuilder(BlockTags.SLABS).add(
                    ModBlocks.ASHENITE_SLAB,
                    ModBlocks.POLISHED_ASHENITE_SLAB,
                    ModBlocks.POLISHED_ASHENITE_BRICK_SLAB
            );
            getOrCreateTagBuilder(BlockTags.STAIRS).add(
                    ModBlocks.ASHENITE_STAIRS,
                    ModBlocks.POLISHED_ASHENITE_STAIRS,
                    ModBlocks.POLISHED_ASHENITE_BRICK_STAIRS
            );
            getOrCreateTagBuilder(BlockTags.WALLS).add(
                    ModBlocks.ASHENITE_WALL,
                    ModBlocks.POLISHED_ASHENITE_WALL,
                    ModBlocks.POLISHED_ASHENITE_BRICK_WALL
            );
        }
    }

    public static class Fluid extends FabricTagProvider.FluidTagProvider {

        public Fluid(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(ModTags.Fluids.SLUDGE).add(
                    ModFluid.STILL_SLUDGE,
                    ModFluid.FLOWING_SLUDGE
            );
            getOrCreateTagBuilder(FluidTags.WATER).forceAddTag(ModTags.Fluids.SLUDGE);
        }
    }
}
