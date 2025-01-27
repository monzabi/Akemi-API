package org.akemi.api.bukkit.container;

import org.akemi.api.AkemiAPILoader;

public interface Codec {

    default boolean isContainerSettingEnabled() {
        return AkemiAPILoader.getAPI_LOADER().getConfig().getBoolean("packet-decoder.Packets.Decoder-Limit.container-decoder.enabled");
    }

    default void switchContainerSetting(boolean toggle) {
        AkemiAPILoader.getAPI_LOADER().getConfig().set("packet-decoder.Packets.Decoder-Limit.container-decoder.enabled", toggle);
    }
}
