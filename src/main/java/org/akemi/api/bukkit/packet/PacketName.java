package org.akemi.api.bukkit.packet;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.NonNull;
import net.minecraft.server.v1_8_R3.*;

import java.util.Map;

@Getter
public class PacketName {

    private final @NonNull Map<Class<?>, PacketType> packetMap = Maps.newHashMap();

    public PacketName() {
        packetMap.put(PacketPlayInCustomPayload.class, PacketType.CUSTOM_PAYLOAD);
        packetMap.put(PacketPlayInWindowClick.class, PacketType.WINDOW_CLICK);
        packetMap.put(PacketPlayInSetCreativeSlot.class, PacketType.SET_CREATIVE_SLOT);
        packetMap.put(PacketPlayInSteerVehicle.class, PacketType.STEER_VEHICLE);
        packetMap.put(PacketPlayInTabComplete.class, PacketType.TAB_COMPLETE);
        packetMap.put(PacketPlayInSpectate.class, PacketType.SPECTATE);
        packetMap.put(PacketPlayInHeldItemSlot.class, PacketType.HELD_ITEM_SLOT);
        packetMap.put(PacketPlayInCloseWindow.class, PacketType.CLOSE_WINDOW);
        packetMap.put(PacketPlayInChat.class, PacketType.CHAT);
        packetMap.put(PacketPlayInBlockPlace.class, PacketType.BLOCK_PLACE);
        packetMap.put(PacketPlayInBlockDig.class, PacketType.BLOCK_DIG);
        packetMap.put(PacketPlayInUseEntity.class, PacketType.USE_ENTITY);
        packetMap.put(PacketPlayInEntityAction.class, PacketType.ENTITY_ACTION);
        packetMap.put(PacketPlayInEnchantItem.class, PacketType.ENCHANT_ITEM);
        packetMap.put(PacketPlayInClientCommand.class, PacketType.CLIENT_COMMAND);
        packetMap.put(PacketPlayInArmAnimation.class, PacketType.SWING_ARM);
        packetMap.put(PacketPlayInSettings.class, PacketType.SETTINGS);
        packetMap.put(PacketPlayInFlying.class, PacketType.FLYING);
        packetMap.put(PacketPlayInKeepAlive.class, PacketType.KEEP_ALIVE);
        packetMap.put(PacketPlayInFlying.PacketPlayInLook.class, PacketType.LOOK);
        packetMap.put(PacketPlayInFlying.PacketPlayInPositionLook.class, PacketType.POSITION_LOOK);
        packetMap.put(PacketPlayInFlying.PacketPlayInPosition.class, PacketType.POSITION);
        packetMap.put(PacketPlayInResourcePackStatus.class, PacketType.RESOURCE_PACK_STATUS);
        packetMap.put(PacketPlayInTransaction.class, PacketType.TRANSACTION);
        packetMap.put(PacketPlayInAbilities.class, PacketType.ABILITIES);
        packetMap.put(PacketPlayInUpdateSign.class, PacketType.UPDATE_SIGN);
    }

    public String get(final @NonNull Packet<?> packet) {
        return packetMap.getOrDefault(packet.getClass(), PacketType.UNKNOWN).getPacketName();
    }

    public String getOriginalName(final @NonNull Packet<?> packet) {
        return packet.getClass().getSimpleName();
    }
}
