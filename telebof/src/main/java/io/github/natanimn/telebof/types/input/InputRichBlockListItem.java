package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.input.rich_block.InputRichBlock;

import java.io.Serializable;

/**
 * An item of a list to be sent.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockListItem implements Serializable {
    private final InputRichBlock[] blocks;

    @SerializedName("has_checkbox")
    private Boolean hasCheckbox;

    @SerializedName("is_checked")
    private Boolean isChecked;

    private Integer value;
    private String type;

    /**
     * Required
     * @param blocks The content of the item
     */
    public InputRichBlockListItem(InputRichBlock[] blocks) {
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param hasCheckbox Pass True if the item has a checkbox
     * @return {@link InputRichBlockListItem}
     */
    public InputRichBlockListItem setHasCheckbox(Boolean hasCheckbox) {
        this.hasCheckbox = hasCheckbox;
        return this;
    }

    /**
     * Optional
     * @param checked Pass True if the item has a checked checkbox
     * @return {@link InputRichBlockListItem}
     */
    public InputRichBlockListItem setChecked(Boolean checked) {
        isChecked = checked;
        return this;
    }

    /**
     * Optional
     * @param value For ordered lists, the numeric value of the item label
     * @return {@link InputRichBlockListItem}
     */
    public InputRichBlockListItem setValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Optional
     * @param type For ordered lists, the type of the item label; must be one of “a” for lowercase letters, “A” for uppercase letters,
     *             “i” for lowercase Roman numerals, “I” for uppercase Roman numerals, or “1” for decimal numbers
     * @return {@link InputRichBlockListItem}
     */
    public InputRichBlockListItem setType(String type) {
        this.type = type;
        return this;
    }
}
