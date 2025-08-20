package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.media_and_service.Sticker;

/**
 * This object describes the model of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class UniqueGiftModel {
    /**
     * Name of the model
     */
    public String name;

    /**
     * The sticker that represents the unique gift
     */
    public Sticker sticker;

    /**
     * The number of unique gifts that receive this model for every 1000 gifts upgraded
     */
    public Integer rarity_per_mille;
}
