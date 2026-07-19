package io.github.natanimn.telebof.types.input.rich_block;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichBlockTableCell;

/**
 * A table, corresponding to the HTML tag <table>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockTable implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "table";

    private final RichBlockTableCell[][] cells;

    private String caption;

    @SerializedName("is_bordered")
    private Boolean isBordered;

    @SerializedName("is_striped")
    private Boolean isStriped;


    /**
     * Required
     * @param cells Cells of the table
     */
    public InputRichBlockTable(RichBlockTableCell[][] cells){
        this.cells = cells;
    }

    /**
     * Optional
     * @param bordered Pass True if the table has borders
     * @return {@link InputRichBlockTable}
     */
    public InputRichBlockTable setBordered(Boolean bordered) {
        isBordered = bordered;
        return this;
    }

    /**
     * Optional
     * @param striped Pass True if the table is striped
     * @return {@link InputRichBlockTable}
     */
    public InputRichBlockTable setStriped(Boolean striped) {
        isStriped = striped;
        return this;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockTable}
     */
    public InputRichBlockTable setCaption(String caption) {
        this.caption = caption;
        return this;
    }
}
