package org.akemi.api.bukkit.packet;

import lombok.Getter;

@Getter
public enum PacketType {

    CUSTOM_PAYLOAD("CUSTOM_PAYLOAD"),
    WINDOW_CLICK("WINDOW_CLICK"),
    SET_CREATIVE_SLOT("SET_CREATIVE_SLOT"),
    STEER_VEHICLE("STEER_VEHICLE"),
    TAB_COMPLETE("TAB_COMPLETE"),
    SPECTATE("SPECTATE"),
    HELD_ITEM_SLOT("HELD_ITEM_SLOT"),
    CLOSE_WINDOW("CLOSE_WINDOW"),
    CHAT("CHAT"),
    BLOCK_PLACE("BLOCK_PLACE"),
    BLOCK_DIG("BLOCK_DIG"),
    ABILITIES("ABILITIES"),
    CHUNK("CHUNK"),
    DROP_ITEM("DROP_ITEM"),
    FLYING("FLYING"),
    FOOD_CHANGE("FOOD_CHANGE"),
    PICK_UP_ITEM("PICK_UP_ITEM"),
    COMMAND_PREPROCESS("COMMAND_PREPROCESS"),
    SETTINGS("SETTINGS"),
    SWING_ARM("SWING_ARM"),
    ENCHANT_ITEM("ENCHANT_ITEM"),
    CLIENT_COMMAND("CLIENT_COMMAND"),
    USE_ENTITY("USE_ENTITY"),
    ENTITY_ACTION("ENTITY_ACTION"),
    KEEP_ALIVE("KEEP_ALIVE"),
    POSITION("POSITION"),
    LOOK("LOOK"),
    POSITION_LOOK("POSITION_LOOK"),
    RESOURCE_PACK_STATUS("RESOURCE_PACK_STATUS"),
    TRANSACTION("TRANSACTION"),
    UPDATE_SIGN("UPDATE_SIGN"),
    UNKNOWN("UNKNOWN");

    final String packetName;

    PacketType(final String packetName) {
        this.packetName = packetName;
    }

}
