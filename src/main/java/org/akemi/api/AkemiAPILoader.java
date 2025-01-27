package org.akemi.api;

import lombok.Getter;
import lombok.Setter;
import org.akemi.api.bukkit.packet.PacketName;
import org.bukkit.plugin.java.JavaPlugin;

public class AkemiAPILoader extends JavaPlugin {

    @Getter
    @Setter
    private static AkemiAPILoader API_LOADER;
    @Getter
    private PacketName packetName;

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {

    }


    public void initialize() {
        this.packetName = new PacketName();
    }
}
