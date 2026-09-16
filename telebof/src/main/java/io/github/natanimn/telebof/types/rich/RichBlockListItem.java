package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * An item of a list
 * @author Natanim
 * @since 2.1
 */
@Getter
public class RichBlockListItem {
    /**
     * Label of the item
     */
    private String label;

    /**
     * The content of the item
     */
    private List<RichBlock> blocks;

    /**
     * Optional. True, if the item has a checkbox
     */
    @SerializedName("has_checkbox")
    private Boolean hasCheckbox;

    /**
     * Optional. True, if the item has a checked checkbox
     */
    @SerializedName("is_checked")
    private Boolean isChecked;

    /**
     * Optional. For ordered lists, the numeric value of the item label
     */
    private Integer value;

    /**
     * Optional. For ordered lists, the type of the item label; must be one of “a” for lowercase letters,
     * “A” for uppercase letters, “i” for lowercase Roman numerals, “I” for uppercase Roman numerals, or “1” for decimal numbers
     */
    private String type;


}
