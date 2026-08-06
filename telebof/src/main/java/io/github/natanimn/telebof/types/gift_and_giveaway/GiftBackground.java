package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object describes the background of a gift.
 * @author Natanim
 * @since 1.3.0
 */
@Getter
public class GiftBackground {
    /**
     * Center color of the background in RGB format
     */
    @SerializedName("center_color")
    private Integer centerColor;

    /**
     * Edge color of the background in RGB format
     */
    @SerializedName("edge_color")
    private Integer edgeColor;

    /**
     * Text color of the background in RGB format
     */
    @SerializedName("text_color")
    private Integer textColor;


}
