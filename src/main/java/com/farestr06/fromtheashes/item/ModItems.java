package com.farestr06.fromtheashes.item;

import com.farestr06.fromtheashes.FromTheAshes;
import com.farestr06.fromtheashes.fluid.ModFluid;
import com.farestr06.fromtheashes.item.equipment.GerunditeEquipment;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;

import static com.farestr06.api.item.ItemHelper.*;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModItems {
    public static final Item SLUDGE_BUCKET = makeAdvancedItem(
            makeId("sludge_bucket"),
            settings -> new BucketItem(ModFluid.STILL_SLUDGE, settings),
            new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)
    );

    public static final Item RAW_AMOGIUM = makeSimpleItem(makeId("raw_amogium"));
    public static final Item AMOGIUM_INGOT = makeSimpleItem(makeId("amogium_ingot"));

    public static final Item RAW_GERUNDITE = makeSimpleItem(makeId("raw_gerundite"));
    public static final Item GERUNDITE_INGOT = makeSimpleItem(makeId("gerundite_ingot"));
    public static final Item GERUNDITE_NUGGET = makeSimpleItem(makeId("gerundite_nugget"));

    public static final Item GERUNDITE_SWORD = makeAdvancedItemWithDefaultSettings(makeId("gerundite_sword"),
            settings -> new SwordItem(
                    GerunditeEquipment.GERUNDITE_TOOL, 3f, -2.4f, settings
            ));
    public static final Item GERUNDITE_SHOVEL = makeAdvancedItemWithDefaultSettings(makeId("gerundite_shovel"),
            settings -> new ShovelItem(
                    GerunditeEquipment.GERUNDITE_TOOL, 1.5f, -3f, settings
            ));
    public static final Item GERUNDITE_PICKAXE = makeAdvancedItemWithDefaultSettings(makeId("gerundite_pickaxe"),
            settings -> new PickaxeItem(
                    GerunditeEquipment.GERUNDITE_TOOL, 1f, -2.8f, settings
            ));
    public static final Item GERUNDITE_AXE = makeAdvancedItemWithDefaultSettings(makeId("gerundite_axe"),
            settings -> new AxeItem(
                    GerunditeEquipment.GERUNDITE_TOOL, 5f, -3f, settings
            ));
    public static final Item GERUNDITE_HOE = makeAdvancedItemWithDefaultSettings(makeId("gerundite_hoe"),
            settings -> new HoeItem(
                    GerunditeEquipment.GERUNDITE_TOOL, -3f, 0f, settings
            ));

    public static final Item GERUNDITE_HELMET = makeAdvancedItem(
            makeId("gerundite_helmet"),
            settings -> new ArmorItem(
                    GerunditeEquipment.GERUNDITE_ARMOR,
                    EquipmentType.HELMET,
                    settings
            ),
            new Item.Settings().maxCount(1).maxDamage(
                    EquipmentType.HELMET.getMaxDamage(GerunditeEquipment.ARMOR_BASE_DURABILITY)
            )
    );
    public static final Item GERUNDITE_CHESTPLATE = makeAdvancedItem(
            makeId("gerundite_chestplate"),
            settings -> new ArmorItem(
                    GerunditeEquipment.GERUNDITE_ARMOR,
                    EquipmentType.CHESTPLATE,
                    settings
            ),
            new Item.Settings().maxCount(1).maxDamage(
                    EquipmentType.CHESTPLATE.getMaxDamage(GerunditeEquipment.ARMOR_BASE_DURABILITY)
            )
    );
    public static final Item GERUNDITE_LEGGINGS = makeAdvancedItem(
            makeId("gerundite_leggings"),
            settings -> new ArmorItem(
                    GerunditeEquipment.GERUNDITE_ARMOR,
                    EquipmentType.LEGGINGS,
                    settings
            ),
            new Item.Settings().maxCount(1).maxDamage(
                    EquipmentType.LEGGINGS.getMaxDamage(GerunditeEquipment.ARMOR_BASE_DURABILITY)
            )
    );
    public static final Item GERUNDITE_BOOTS = makeAdvancedItem(
            makeId("gerundite_boots"),
            settings -> new ArmorItem(
                    GerunditeEquipment.GERUNDITE_ARMOR,
                    EquipmentType.BOOTS,
                    settings
            ),
            new Item.Settings().maxCount(1).maxDamage(
                    EquipmentType.BOOTS.getMaxDamage(GerunditeEquipment.ARMOR_BASE_DURABILITY)
            )
    );

    public static void init() {
        FromTheAshes.LOGGER.info("Registering items for From The Ashes...");
    }
}
