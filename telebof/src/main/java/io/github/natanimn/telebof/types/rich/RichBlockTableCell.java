package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.TableCellAlign;
import io.github.natanimn.telebof.enums.TableCellValign;

/**
 * Cell in a table.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockTableCell {
    /**
     * Optional. Text in the cell. If omitted, then the cell is invisible.
     */
    private RichText text;

    /**
     * Optional. True, if the cell is a header cell
     */
    @SerializedName("is_header")
    private Boolean isHeader;

    /**
     * Optional. The number of columns the cell spans if it is bigger than 1
     */
    private Integer colspan;

    /**
     * Optional. The number of rows the cell spans if it is bigger than 1
     */
    private Integer rowspan;

    /**
     * Horizontal cell content alignment.
     */
    private TableCellAlign align;

    /**
     * Vertical cell content alignment.
     */
    private TableCellValign valign;

    public RichText getText() {
        return text;
    }

    public Boolean getHeader() {
        return isHeader;
    }

    public Integer getColspan() {
        return colspan;
    }

    public Integer getRowspan() {
        return rowspan;
    }

    public TableCellAlign getAlign() {
        return align;
    }

    public TableCellValign getValign() {
        return valign;
    }
}
