package org.akemi.api;

import lombok.Getter;
import org.akemi.api.bukkit.packet.PacketName;
import org.bukkit.plugin.java.JavaPlugin;

public class AkemiAPILoader extends JavaPlugin {

    @Getter
    private static AkemiAPILoader API_LOADER;
    @Getter
    private PacketName packetName;

    @Override
    public void onEnable() {
        API_LOADER = this;

        this.initialize();
    }

    @Override
    public void onDisable() {
        API_LOADER = null;
    }


    private void initialize() {
        this.packetName = new PacketName();

    }
}
