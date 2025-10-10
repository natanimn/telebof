package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object describes the colors of the backdrop of a unique gift.
 * @param centerColor The color in the center of the backdrop in RGB format
 * @param edgeColor The color on the edges of the backdrop in RGB format
 * @param symbolColor The color to be applied to the symbol in RGB format
 * @param textColor The color for the text on the backdrop in RGB format
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record UniqueGiftBackdropColors(
        @SerializedName("center_color") Integer centerColor,
        @SerializedName("edge_color") Integer edgeColor,
        @SerializedName("symbol_color") Integer symbolColor,
        @SerializedName("text_color") Integer textColor
) implements Serializable {}