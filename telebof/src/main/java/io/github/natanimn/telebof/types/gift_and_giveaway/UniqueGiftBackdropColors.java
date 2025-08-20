package io.github.natanimn.telebof.types.gift_and_giveaway;


import java.io.Serializable;

/**
 * This object describes the colors of the backdrop of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class UniqueGiftBackdropColors implements Serializable {
    /**
     * The color in the center of the backdrop in RGB format
     */
    public Integer center_color;

    /**
     * The color on the edges of the backdrop in RGB format
     */
    public Integer edge_color;

    /**
     * The color to be applied to the symbol in RGB format
     */
    public Integer symbol_color;

    /**
     * The color for the text on the backdrop in RGB format
     */
    public Integer text_color;
}