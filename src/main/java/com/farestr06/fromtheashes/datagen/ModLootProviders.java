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
        }
    }
}
