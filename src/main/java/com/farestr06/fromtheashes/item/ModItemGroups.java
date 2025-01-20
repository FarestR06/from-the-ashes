package com.farestr06.fromtheashes.item;

import com.farestr06.fromtheashes.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> BUILDING_BLOCKS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), makeId("building_blocks"));
    public static final ItemGroup BUILDING_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.ASHENITE))
            .displayName(Text.translatable("itemGroup.ashen_building_blocks"))
            .build();
    public static final RegistryKey<ItemGroup> NATURAL_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), makeId("natural_blocks"));
    public static final ItemGroup NATURAL = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.TEPHRA))
            .displayName(Text.translatable("itemGroup.ashen_natural"))
            .build();

    public static final RegistryKey<ItemGroup> TOOLS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), makeId("tools_and_utilities"));
    public static final ItemGroup TOOLS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GERUNDITE_PICKAXE))
            .displayName(Text.translatable("itemGroup.ashen_tools_and_utilities"))
            .build();
    public static final RegistryKey<ItemGroup> COMBAT_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), makeId("combat"));
    public static final ItemGroup COMBAT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GERUNDITE_SWORD))
            .displayName(Text.translatable("itemGroup.ashen_combat"))
            .build();

    public static final RegistryKey<ItemGroup> INGREDIENTS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), makeId("ingredients"));
    public static final ItemGroup INGREDIENTS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GERUNDITE_INGOT))
            .displayName(Text.translatable("itemGroup.ashen_ingredients"))
            .build();

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, BUILDING_BLOCKS_KEY, BUILDING_BLOCKS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItemGroups::buildingBlockEntries);
        ItemGroupEvents.modifyEntriesEvent(BUILDING_BLOCKS_KEY).register(ModItemGroups::buildingBlockEntries);

        Registry.register(Registries.ITEM_GROUP, NATURAL_KEY, NATURAL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItemGroups::naturalEntries);
        ItemGroupEvents.modifyEntriesEvent(NATURAL_KEY).register(ModItemGroups::naturalEntries);

        Registry.register(Registries.ITEM_GROUP, TOOLS_KEY, TOOLS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItemGroups::toolEntries);
        ItemGroupEvents.modifyEntriesEvent(TOOLS_KEY).register(ModItemGroups::toolEntries);

        Registry.register(Registries.ITEM_GROUP, COMBAT_KEY, COMBAT);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItemGroups::combatEntries);
        ItemGroupEvents.modifyEntriesEvent(COMBAT_KEY).register(ModItemGroups::combatEntries);

        Registry.register(Registries.ITEM_GROUP, INGREDIENTS_KEY, INGREDIENTS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::ingredientEntries);
        ItemGroupEvents.modifyEntriesEvent(INGREDIENTS_KEY).register(ModItemGroups::ingredientEntries);
    }

    private static void buildingBlockEntries(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.ASHENITE);
        entries.add(ModBlocks.ASHENITE_STAIRS);
        entries.add(ModBlocks.ASHENITE_SLAB);
        entries.add(ModBlocks.ASHENITE_WALL);
        entries.add(ModBlocks.POLISHED_ASHENITE);
        entries.add(ModBlocks.POLISHED_ASHENITE_STAIRS);
        entries.add(ModBlocks.POLISHED_ASHENITE_SLAB);
        entries.add(ModBlocks.POLISHED_ASHENITE_WALL);
        entries.add(ModBlocks.POLISHED_ASHENITE_BRICKS);
        entries.add(ModBlocks.POLISHED_ASHENITE_BRICK_STAIRS);
        entries.add(ModBlocks.POLISHED_ASHENITE_BRICK_SLAB);
        entries.add(ModBlocks.POLISHED_ASHENITE_BRICK_WALL);
        entries.add(ModBlocks.GERUNDITE_BLOCK);
    }
    private static void naturalEntries(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.TEPHRA);
    }
    private static void toolEntries(FabricItemGroupEntries entries) {
        entries.add(ModItems.GERUNDITE_SHOVEL);
        entries.add(ModItems.GERUNDITE_PICKAXE);
        entries.add(ModItems.GERUNDITE_AXE);
        entries.add(ModItems.GERUNDITE_HOE);

        entries.add(ModItems.SLUDGE_BUCKET);
    }
    private static void combatEntries(FabricItemGroupEntries entries) {
        entries.add(ModItems.GERUNDITE_SWORD);
        entries.add(ModItems.GERUNDITE_AXE);
        entries.add(ModItems.GERUNDITE_HELMET);
        entries.add(ModItems.GERUNDITE_CHESTPLATE);
        entries.add(ModItems.GERUNDITE_LEGGINGS);
        entries.add(ModItems.GERUNDITE_BOOTS);
    }
    private static void ingredientEntries(FabricItemGroupEntries entries) {
        entries.add(ModItems.RAW_AMOGIUM);
        entries.add(ModItems.RAW_GERUNDITE);
        entries.add(ModItems.GERUNDITE_NUGGET);
        entries.add(ModItems.AMOGIUM_INGOT);
        entries.add(ModItems.GERUNDITE_INGOT);
    }
}
