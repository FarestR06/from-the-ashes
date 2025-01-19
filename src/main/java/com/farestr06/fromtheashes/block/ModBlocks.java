package com.farestr06.fromtheashes.block;

import com.farestr06.fromtheashes.FromTheAshes;
import com.farestr06.fromtheashes.fluid.ModFluid;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.farestr06.api.block.BlockHelper.*;
import static com.farestr06.api.block.BlockHelper.makeSimpleBlockAndSimpleItem;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModBlocks {

    public static final Block TEPHRA = makeSimpleBlockAndSimpleItem(
            makeId("tephra"), AbstractBlock.Settings.copy(Blocks.DIRT).strength(1f).sounds(BlockSoundGroup.SAND));

    // region Ashenite
    public static final Block ASHENITE = makeSimpleBlockAndSimpleItem(
            makeId("ashenite"), AbstractBlock.Settings.copy(Blocks.TUFF).strength(3f, 12f));
    public static final Block ASHENITE_STAIRS = makeBlockAndSimpleItem(
            makeId("ashenite_stairs"), settings -> new StairsBlock(ASHENITE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.TUFF_STAIRS)
                    .strength(3f, 12f)
    );
    public static final Block ASHENITE_SLAB = makeBlockAndSimpleItem(
            makeId("ashenite_slab"), SlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_SLAB)
                    .strength(3f, 12f));
    public static final Block ASHENITE_WALL = makeBlockAndSimpleItem(
            makeId("ashenite_wall"), WallBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_WALL)
                    .strength(3f, 12f)
    );

    public static final BlockFamily ASHENITE_FAMILY = new BlockFamily.Builder(ASHENITE)
            .wall(ASHENITE_WALL).stairs(ASHENITE_STAIRS).slab(ASHENITE_SLAB).build();
    // endregion
    // region Polished Ashenite
    public static final Block POLISHED_ASHENITE = makeSimpleBlockAndSimpleItem(
            makeId("polished_ashenite"),
            AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF).strength(3f, 12f)
    );
    public static final Block POLISHED_ASHENITE_STAIRS = makeBlockAndSimpleItem(
            makeId("polished_ashenite_stairs"), settings -> new StairsBlock(POLISHED_ASHENITE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_STAIRS)
                    .strength(3f, 12f)
    );
    public static final Block POLISHED_ASHENITE_SLAB = makeBlockAndSimpleItem(
            makeId("polished_ashenite_slab"), SlabBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB)
                    .strength(3f, 12f));
    public static final Block POLISHED_ASHENITE_WALL = makeBlockAndSimpleItem(
            makeId("polished_ashenite_wall"), WallBlock::new, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_WALL)
                    .strength(3f, 12f)
    );

    public static final BlockFamily POLISHED_ASHENITE_FAMILY = new BlockFamily.Builder(POLISHED_ASHENITE)
            .wall(POLISHED_ASHENITE_WALL).stairs(POLISHED_ASHENITE_STAIRS).slab(POLISHED_ASHENITE_SLAB).build();
    // endregion
    // region Polished Ashenite Bricks
    public static final Block POLISHED_ASHENITE_BRICKS = makeSimpleBlockAndSimpleItem(
            makeId("polished_ashenite_bricks"),
            AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS).strength(3f, 12f)
    );
    public static final Block POLISHED_ASHENITE_BRICK_STAIRS = makeBlockAndSimpleItem(
            makeId("polished_ashenite_brick_stairs"), settings -> new StairsBlock(POLISHED_ASHENITE_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_STAIRS)
                    .strength(3f, 12f)
    );
    public static final Block POLISHED_ASHENITE_BRICK_SLAB = makeBlockAndSimpleItem(
            makeId("polished_ashenite_brick_slab"), SlabBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB)
                    .strength(3f, 12f));
    public static final Block POLISHED_ASHENITE_BRICK_WALL = makeBlockAndSimpleItem(
            makeId("polished_ashenite_brick_wall"), WallBlock::new, AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_WALL)
                    .strength(3f, 12f)
    );

    public static final BlockFamily POLISHED_ASHENITE_BRICK_FAMILY = new BlockFamily.Builder(POLISHED_ASHENITE_BRICKS)
            .wall(POLISHED_ASHENITE_BRICK_WALL).stairs(POLISHED_ASHENITE_BRICK_STAIRS).slab(POLISHED_ASHENITE_BRICK_SLAB).build();
    // endregion

    public static final Block GERUNDITE_BLOCK = makeSimpleBlockAndSimpleItem(
            makeId("gerundite_block"), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)
                    .sounds(BlockSoundGroup.COPPER)
    );

    public static final Block SLUDGE = makeBlock(
            makeId("sludge"),
            settings -> new FluidBlock(ModFluid.STILL_SLUDGE, settings) {
                @Override
                protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
                    if (entity instanceof LivingEntity livingEntity) {
                        if (!livingEntity.isInCreativeMode()) {
                            livingEntity.setInPowderSnow(true);
                        }
                    }
                    super.onEntityCollision(state, world, pos, entity);
                }
            },
            AbstractBlock.Settings.copy(Blocks.WATER)
    );

    public static void init() {
        FromTheAshes.LOGGER.info("Registering blocks for From The Ashes...");
    }
}
