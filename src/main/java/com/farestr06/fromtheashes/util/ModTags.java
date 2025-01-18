package com.farestr06.fromtheashes.util;

import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModTags {
    public static class Fluids {
        public static TagKey<Fluid> SLUDGE = TagKey.of(RegistryKeys.FLUID, makeId("sludge"));
    }
}
