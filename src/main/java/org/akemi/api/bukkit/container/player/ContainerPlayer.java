package org.akemi.api.bukkit.container.player;

import org.akemi.api.bukkit.AkemiLazyInjectorType;
import org.akemi.api.bukkit.container.codec.ContainerPacketDecoder;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import io.netty.channel.Channel;

public class ContainerPlayer {

    private final Player player;
    private Channel channel;

    public ContainerPlayer(final Player player) {
        this.player = player;
        this.channel = getChannel();
    }

    private Channel getChannel() {
        if (this.channel == null || !this.channel.isOpen()) {
            this.channel = ((CraftPlayer) this.player).getHandle().playerConnection.networkManager.channel;
        }
        return this.channel;
    }

    public boolean isInContainer() {
        if (this.channel == null || !this.channel.isOpen()) return false;
        return this.channel.pipeline().get("decoder") == null;
    }

    public void addContainer() {
        if (this.channel == null || !this.channel.isOpen()) return;

        if (channel.pipeline().get(AkemiLazyInjectorType.DECODER.getType()) != null) {
            channel.pipeline().remove(AkemiLazyInjectorType.DECODER.getType());
        }
        channel.pipeline().addAfter("decoder", AkemiLazyInjectorType.DECODER.getType(), new ContainerPacketDecoder());
    }
}
