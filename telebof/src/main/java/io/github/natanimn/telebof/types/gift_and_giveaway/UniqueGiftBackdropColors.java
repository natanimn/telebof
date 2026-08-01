package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.io.Serializable;

/**
 * This object describes the colors of the backdrop of a unique gift.
 * @author Natanim
 * @since 19 August 2025
 */
@Getter
public class UniqueGiftBackdropColors implements Serializable {
    /**
     * The color in the center of the backdrop in RGB format
     */
    @SerializedName("center_color")
    private Integer centerColor;

    /**
     * The color on the edges of the backdrop in RGB format
     */
    @SerializedName("edge_color")
    private Integer edgeColor;

    /**
     * The color to be applied to the symbol in RGB format
     */
    @SerializedName("symbol_color")
    private Integer symbolColor;

    /**
     * The color for the text on the backdrop in RGB format
     */
    @SerializedName("text_color")
    private Integer textColor;

    public UniqueGiftBackdropColors(){}

    public UniqueGiftBackdropColors(Integer centerColor, Integer edgeColor, Integer symbolColor, Integer textColor) {
        this.centerColor = centerColor;
        this.edgeColor = edgeColor;
        this.symbolColor = symbolColor;
        this.textColor = textColor;
    }

}