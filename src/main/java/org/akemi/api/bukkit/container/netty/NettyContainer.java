package org.akemi.api.bukkit.container.netty;


import org.akemi.api.bukkit.container.Codec;

public class NettyContainer implements Codec {

    @Override
    public boolean isContainerSettingEnabled() {
        return Codec.super.isContainerSettingEnabled();
    }

    @Override
    public void switchContainerSetting(boolean toggle) {
        Codec.super.switchContainerSetting(toggle);
    }
}
