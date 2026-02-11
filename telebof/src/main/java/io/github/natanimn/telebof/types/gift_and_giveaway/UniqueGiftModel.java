package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.enums.ModelRarity;
import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This object describes the model of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.4.0
 */
public class UniqueGiftModel {
    /**
     * Name of the model
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

    /**
     * Optional. Rarity of the model if it is a crafted model.
     */
    private ModelRarity rarity;

    public String getName() {
        return name;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Integer getRarityPerMille() {
        return rarityPerMille;
    }

    public ModelRarity getRarity() {
        return rarity;
    }
}