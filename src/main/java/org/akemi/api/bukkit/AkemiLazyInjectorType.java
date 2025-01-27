package org.akemi.api.bukkit;

import lombok.Getter;
import lombok.NonNull;

@Getter
public enum AkemiLazyInjectorType {

    DECODER("akemi_decoder"),
    SPLITTER("akemi_splitter"),
    VIA_DECODER("via-decoder"),
    VIA_SPLITTER("via-splitter"),
    VIA_DECOMPRESS("via-decompress"),
    DECOMPRESS("akemi_decompress");

    final @NonNull String type;

    AkemiLazyInjectorType(final @NonNull String type) {
        this.type = type;
    }

}
