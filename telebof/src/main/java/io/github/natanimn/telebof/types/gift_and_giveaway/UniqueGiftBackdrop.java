package io.github.natanimn.telebof.types.gift_and_giveaway;


import java.io.Serializable;

/**
 * This object describes the backdrop of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class UniqueGiftBackdrop {
    /**
     * Name of the backdrop
     */
    public String name;

    /**
     * Colors of the backdrop
     */
    public UniqueGiftBackdropColors colors;

    /**
     * The number of unique gifts that receive this backdrop for every 1000 gifts upgraded
     */
    public Integer rarity_per_mille;
}
