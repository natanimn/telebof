package io.github.natanimn.telebof.types.rich.block;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichBlock;

import com.google.gson.annotations.SerializedName;

/**
 * An item of a list
 * @author Natanim
 * @since 2.1
 */
public class RichBlockListItem implements RichText {
    private final String label;

    private final RichBlock[] blocks;

    @SerializedName("has_checkbox")
    private Boolean hasCheckbox;

    @SerializedName("is_checked")
    private Boolean isChecked;

    private Integer value;

    private String type;

    /**
     * Required
     * @param label Label of the item
     * @param blocks The content of the item
     */
    public RichBlockListItem(String label, RichBlock[] blocks){
        this.label = label;
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param hasCheckbox True, if the item has a checkbox
     * @return {@link RichBlockListItem}
     */
    public RichBlockListItem setHasCheckbox(Boolean hasCheckbox) {
        this.hasCheckbox = hasCheckbox;
        return this;
    }

    /**
     * Optional
     * @param checked True, if the item has a checked checkbox
     * @return {@link RichBlockListItem}
     */
    public RichBlockListItem setIsChecked(Boolean checked) {
        this.isChecked = checked;
        return this;
    }

    /**
     * Optional
     * @param value For ordered lists, the numeric value of the item label
     * @return {@link RichBlockListItem}
     */
    public RichBlockListItem setValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Optional
     * @param type For ordered lists, the type of the item label; must be one of “a” for lowercase letters,
     *             “A” for uppercase letters, “i” for lowercase Roman numerals, “I” for uppercase Roman numerals, or “1” for decimal numbers
     * @return {@link RichBlockListItem}
     */
    public RichBlockListItem setType(String type) {
        this.type = type;
        return this;
    }
}
