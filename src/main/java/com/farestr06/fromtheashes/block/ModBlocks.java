package com.farestr06.fromtheashes.block;

import com.farestr06.fromtheashes.FromTheAshes;
import com.farestr06.fromtheashes.fluid.ModFluid;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.farestr06.api.block.BlockHelper.*;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModBlocks {

    public static final Block TEPHRA = makeBlockAndItem(
            makeId("tephra"), AbstractBlock.Settings.copy(Blocks.DIRT).strength(1f).sounds(BlockSoundGroup.SAND));

    public static final Block ASHENITE = makeBlockAndItem(
            makeId("ashenite"), AbstractBlock.Settings.copy(Blocks.TUFF).strength(3f, 6f));

    public static final Block SLUDGE = makeAdvancedBlock(
            makeId("sludge"),
            new FluidBlock(ModFluid.STILL_SLUDGE, AbstractBlock.Settings.copy(Blocks.WATER).registryKey(
                    RegistryKey.of(RegistryKeys.BLOCK, makeId("sludge"))
            )) {
                @Override
                protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
                    if (entity instanceof LivingEntity livingEntity) {
                        livingEntity.setInPowderSnow(true);
                    }
                    super.onEntityCollision(state, world, pos, entity);
                }
            }
    );

    public static void init() {
        FromTheAshes.LOGGER.info("Registering blocks for From The Ashes...");
    }
}
