package com.farestr06.fromtheashes.util;

import com.farestr06.fromtheashes.FromTheAshes;
import net.minecraft.sound.SoundEvent;

import static com.farestr06.api.sound.SoundHelper.*;
import static com.farestr06.fromtheashes.FromTheAshes.makeId;

public class ModSounds {
    public static final SoundEvent BLOCK_SLUDGE_POP = makeEvent(makeId("block.sludge.pop"));
    public static final SoundEvent BLOCK_SLUDGE_AMBIENT = makeEvent(makeId("block.sludge.ambient"));

    public static void init() {
        FromTheAshes.LOGGER.info("Registering sound events for From The Ashes...");
    }
}
