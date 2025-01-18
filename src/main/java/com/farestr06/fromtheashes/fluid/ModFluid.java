package com.farestr06.fromtheashes.fluid;

import com.farestr06.fromtheashes.FromTheAshes;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModFluid {
    public static final FlowableFluid STILL_SLUDGE = Registry.register(Registries.FLUID, makeId("sludge"), new SludgeFluid.Still());
    public static final FlowableFluid FLOWING_SLUDGE = Registry.register(Registries.FLUID, makeId("flowing_sludge"), new SludgeFluid.Flowing());

    public static void init() {
        FromTheAshes.LOGGER.info("Registering fluids for From The Ashes...");
    }
}
