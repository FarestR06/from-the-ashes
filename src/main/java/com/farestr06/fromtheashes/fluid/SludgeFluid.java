package com.farestr06.fromtheashes.fluid;

import com.farestr06.fromtheashes.block.ModBlocks;
import com.farestr06.fromtheashes.item.ModItems;
import com.farestr06.fromtheashes.util.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class SludgeFluid extends FlowableFluid {
    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }

    @Override
    public Fluid getFlowing() {
        return ModFluid.FLOWING_SLUDGE;
    }

    @Override
    public Fluid getStill() {
        return ModFluid.STILL_SLUDGE;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.SLUDGE_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.SLUDGE.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    @Override
    protected boolean isInfinite(ServerWorld world) {
        return true;
    }

    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }

    @Override
    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {
        BlockPos blockPos = pos.up();
        if (world.getBlockState(blockPos).isAir() && !world.getBlockState(blockPos).isOpaqueFullCube()) {
            if (random.nextInt(100) == 0) {
                double d = (double)pos.getX() + random.nextDouble();
                double e = (double)pos.getY() + 1.0;
                double f = (double)pos.getZ() + random.nextDouble();
                world.addParticle(ParticleTypes.SNOWFLAKE, d, e, f, 0.0, 0.0, 0.0);
                world.playSound(d, e, f, ModSounds.BLOCK_SLUDGE_POP, SoundCategory.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 1.4f + random.nextFloat() * 0.15f, false);
            }

            if (random.nextInt(200) == 0) {
                world.playSound(
                        pos.getX(),
                        pos.getY(),
                        pos.getZ(),
                        ModSounds.BLOCK_SLUDGE_AMBIENT,
                        SoundCategory.BLOCKS,
                        0.2f + random.nextFloat() * 0.2f,
                        1.4f + random.nextFloat() * 0.15f,
                        false
                );
            }
        }
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    @Override
    public int getTickRate(WorldView world) {
        return 7;
    }

    @Override
    protected float getBlastResistance() {
        return 100f;
    }



    @Override
    protected int getMaxFlowDistance(WorldView world) {
        return 3;
    }

    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }

    public static class Flowing extends SludgeFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }
    }

    public static class Still extends SludgeFluid {
        @Override
        public boolean isStill(FluidState state) {
            return true;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }
    }
}
