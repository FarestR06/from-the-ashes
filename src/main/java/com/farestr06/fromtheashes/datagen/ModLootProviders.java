package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public final class ModLootProviders {
    public static class Block extends FabricBlockLootTableProvider {
        protected Block(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
            super(dataOutput, registryLookup);
        }

        @Override
        public void generate() {
            addDrop(ModBlocks.TEPHRA);

            addDrop(ModBlocks.ASHENITE);
            addDrop(ModBlocks.ASHENITE_SLAB, slabDrops(ModBlocks.ASHENITE_SLAB));
            addDrop(ModBlocks.ASHENITE_STAIRS);
            addDrop(ModBlocks.ASHENITE_WALL);

            addDrop(ModBlocks.POLISHED_ASHENITE);
            addDrop(ModBlocks.POLISHED_ASHENITE_SLAB, slabDrops(ModBlocks.POLISHED_ASHENITE_SLAB));
            addDrop(ModBlocks.POLISHED_ASHENITE_STAIRS);
            addDrop(ModBlocks.POLISHED_ASHENITE_WALL);

            addDrop(ModBlocks.POLISHED_ASHENITE_BRICKS);
            addDrop(ModBlocks.POLISHED_ASHENITE_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_ASHENITE_BRICK_SLAB));
            addDrop(ModBlocks.POLISHED_ASHENITE_BRICK_STAIRS);
            addDrop(ModBlocks.POLISHED_ASHENITE_BRICK_WALL);

            addDrop(ModBlocks.GERUNDITE_BLOCK);
        }
    }
}
