package com.farestr06.fromtheashes.item.equipment;

import com.farestr06.fromtheashes.util.ModSounds;
import com.farestr06.fromtheashes.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;

import java.util.Map;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;
import static com.farestr06.fromtheashes.util.ModTags.Items.REPAIRS_GERUNDITE_ARMOR;

public class GerunditeEquipment {
    public static final int ARMOR_BASE_DURABILITY = 40;
    public static final RegistryKey<EquipmentAsset> EQUIPMENT_ASSET_KEY = RegistryKey.of(
            EquipmentAssetKeys.REGISTRY_KEY, makeId("gerundite")
    );

    public static final ToolMaterial GERUNDITE_TOOL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL, 2050, 5f, 1.5f, 19, ModTags.Items.GERUNDITE_TOOL_MATERIALS
    );
    public static final ArmorMaterial GERUNDITE_ARMOR = new ArmorMaterial(
            ARMOR_BASE_DURABILITY,
            Map.of(
                    EquipmentType.BOOTS, 1,
                    EquipmentType.LEGGINGS, 4,
                    EquipmentType.CHESTPLATE, 5,
                    EquipmentType.HELMET, 2
            ),
            18, ModSounds.ITEM_ARMOR_EQUIP_GERUNDITE, 0.5f, 0f,
            REPAIRS_GERUNDITE_ARMOR, EQUIPMENT_ASSET_KEY
    );
}
