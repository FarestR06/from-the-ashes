package com.farestr06.fromtheashes.util;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> REPAIRS_GERUNDITE_ARMOR = of("repairs_gerundite_armor");
        public static final TagKey<Item> GERUNDITE_TOOL_MATERIALS = of("gerundite_tool_materials");

        private static TagKey<Item> of(String id) {
            return TagKey.of(RegistryKeys.ITEM, makeId(id));
        }
    }
    public static class Fluids {
        public static TagKey<Fluid> SLUDGE = TagKey.of(RegistryKeys.FLUID, makeId("sludge"));
    }
}
