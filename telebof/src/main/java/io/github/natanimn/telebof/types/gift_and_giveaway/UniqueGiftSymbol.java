package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes the symbol shown on the pattern of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class UniqueGiftSymbol {
    /**
     * Name of the symbol
     */
    private String name;

    /**
     * The sticker that represents the unique gift
     */
    private Sticker sticker;

    /**
     * The number of unique gifts that receive this model for every 1000 gifts upgraded
     */
    @SerializedName("rarity_per_mille")
    private Integer rarityPerMille;

    public String getName() {
        return name;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Integer getRarityPerMille() {
        return rarityPerMille;
    }
}