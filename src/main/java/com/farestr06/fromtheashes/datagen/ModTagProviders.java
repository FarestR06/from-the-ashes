package com.farestr06.fromtheashes.datagen;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.fluid.ModFluid;
import com.farestr06.fromtheashes.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;

import java.util.concurrent.CompletableFuture;

public final class ModTagProviders {
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
                    ModBlocks.ASHENITE
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
