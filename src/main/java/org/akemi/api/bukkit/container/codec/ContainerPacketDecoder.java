package org.akemi.api.bukkit.container.codec;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import net.minecraft.server.v1_8_R3.Packet;

import java.util.List;

public class ContainerPacketDecoder extends MessageToMessageDecoder<Packet<?>> {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, Packet<?> packet, List<Object> list) throws Exception {
        if (!list.isEmpty())
            list.clear();
    }
}
