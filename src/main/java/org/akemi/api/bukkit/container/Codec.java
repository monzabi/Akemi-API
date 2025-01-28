package org.akemi.api.bukkit.container;

import org.akemi.api.AkemiAPI;

public interface Codec {

    boolean isContainerSettingEnabled();

    void switchContainerSetting(boolean toggle);

}
