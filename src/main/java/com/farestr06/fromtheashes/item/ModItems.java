package com.farestr06.fromtheashes.item;

import com.farestr06.fromtheashes.FromTheAshes;
import com.farestr06.fromtheashes.fluid.ModFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import static com.farestr06.api.item.ItemHelper.*;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModItems {

    public static final Item SLUDGE_BUCKET = makeAdvancedItem(
            makeId("sludge_bucket"),
            new BucketItem(ModFluid.STILL_SLUDGE, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, makeId("sludge_bucket")))
            )
    );

    public static void init() {
        FromTheAshes.LOGGER.info("Registering items for From The Ashes...");
    }
}
