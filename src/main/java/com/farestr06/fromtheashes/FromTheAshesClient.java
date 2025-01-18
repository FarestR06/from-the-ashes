package com.farestr06.fromtheashes;

import com.farestr06.fromtheashes.fluid.ModFluid;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class FromTheAshesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluid.STILL_SLUDGE, ModFluid.FLOWING_SLUDGE,
                new SimpleFluidRenderHandler(
                        makeId("block/sludge_still"),
                        makeId("block/sludge_flow")
                )
        );


    }
}
