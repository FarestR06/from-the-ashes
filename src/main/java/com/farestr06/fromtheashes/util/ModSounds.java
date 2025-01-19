package com.farestr06.fromtheashes.util;

import com.farestr06.fromtheashes.FromTheAshes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;

import static com.farestr06.api.sound.SoundHelper.*;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModSounds {
    public static final SoundEvent BLOCK_SLUDGE_POP = makeEvent(makeId("block.sludge.pop"));
    public static final SoundEvent BLOCK_SLUDGE_AMBIENT = makeEvent(makeId("block.sludge.ambient"));

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_GERUNDITE =
            makeReferenceEvent(makeId("item.armor.equip_gerundite"));

    public static void init() {
        FromTheAshes.LOGGER.info("Registering sound events for From The Ashes...");
    }
}
