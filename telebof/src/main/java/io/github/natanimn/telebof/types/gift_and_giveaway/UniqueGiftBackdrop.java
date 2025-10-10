package io.github.natanimn.telebof.types.gift_and_giveaway;

import java.io.Serializable;

/**
 * This object describes the backdrop of a unique gift.
 * @param name Name of the backdrop
 * @param colors Colors of the backdrop
 * @param rarityPerMille The number of unique gifts that receive this backdrop for every 1000 gifts upgraded
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record UniqueGiftBackdrop(
        String name,
        UniqueGiftBackdropColors colors,
        @com.google.gson.annotations.SerializedName("rarity_per_mille") Integer rarityPerMille
) implements Serializable {}