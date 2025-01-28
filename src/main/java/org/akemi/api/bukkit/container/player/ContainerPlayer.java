package org.akemi.api.bukkit.container.player;

import org.akemi.api.bukkit.AkemiLazyInjectorType;
import org.akemi.api.bukkit.container.codec.ContainerPacketDecoder;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import io.netty.channel.Channel;

public interface ContainerPlayer {

    Player getPlayer();

    Channel getChannel();

    boolean isInContainer();

}
