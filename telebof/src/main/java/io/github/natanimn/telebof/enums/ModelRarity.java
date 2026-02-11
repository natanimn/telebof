package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents unique gift model rarity
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public enum ModelRarity {
    @SerializedName("uncommon")
    UNCOMMON,

    @SerializedName("rare")
    RARE,

    @SerializedName("epic")
    EPIC,

    @SerializedName("legendary")
    LEGENDARY
}
