package org.akemi.api;

import lombok.Getter;
import lombok.Setter;
import org.akemi.api.bukkit.packet.PacketName;
import org.bukkit.plugin.java.JavaPlugin;

public interface AkemiAPI {

    AkemiAPI getInstance();

    JavaPlugin getPlugin();

    PacketName getPacketName();

}
