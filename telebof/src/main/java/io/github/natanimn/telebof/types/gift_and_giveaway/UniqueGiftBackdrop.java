package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object describes the backdrop of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class UniqueGiftBackdrop implements Serializable {
    /**
     * Name of the backdrop
     */
    private String name;

    /**
     * Colors of the backdrop
     */
    private UniqueGiftBackdropColors colors;

    /**
     * The number of unique gifts that receive this backdrop for every 1000 gifts upgraded
     */
    @SerializedName("rarity_per_mille")
    private Integer rarityPerMille;

    public UniqueGiftBackdrop(String name, UniqueGiftBackdropColors colors, Integer rarityPerMille) {
        this.name = name;
        this.colors = colors;
        this.rarityPerMille = rarityPerMille;
    }

    public String getName() {
        return name;
    }

    public UniqueGiftBackdropColors getColors() {
        return colors;
    }

    public Integer getRarityPerMille() {
        return rarityPerMille;
    }
}