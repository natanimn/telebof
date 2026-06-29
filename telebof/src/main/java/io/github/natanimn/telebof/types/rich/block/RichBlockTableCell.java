package io.github.natanimn.telebof.types.rich.block;

import com.google.gson.annotations.SerializedName;

import io.github.natanimn.telebof.enums.TableCellAlign;
import io.github.natanimn.telebof.enums.TableCellValign;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * Cell in a table.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockTableCell implements RichText {
    private RichText text;

    @SerializedName("is_header")
    private Boolean isHeader;

    private Integer colspan;
    private Integer rowspan;

    /**
     * Horizontal cell content alignment.
     */
    private final TableCellAlign align;

    /**
     * Vertical cell content alignment.
     */
    private final TableCellValign valign;


    public RichBlockTableCell(TableCellAlign align, TableCellValign valign){
        this.align = align;
        this.valign = valign;
    }

    /**
     * Optional.
     * @param text Text in the cell. If omitted, then the cell is invisible.
     * @return {@link RichBlockTableCell}
     */
    public RichBlockTableCell setText(RichText text){
        this.text = text;
        return this;
    }

    /**
     * Optional.
     * @param text Text in the cell. If omitted, then the cell is invisible.
     * @return {@link RichBlockTableCell}
     */
    public RichBlockTableCell setText(String text){
        this.text = new RichTextImpl(text, null);
        return this;
    }

    /**
     * Optional
     * @param isHeader True, if the cell is a header cell
     * @return {@link RichBlockTableCell}
     */
    public RichBlockTableCell setIsHeader(Boolean isHeader) {
        this.isHeader = isHeader;
        return this;
    }

    /**
     * Optional.
     * @param colspan The number of columns the cell spans if it is bigger than 1
     * @return {@link RichBlockTableCell}
     */
    public RichBlockTableCell setColspan(Integer colspan) {
        this.colspan = colspan;
        return this;
    }

    /**
     * Optional.
     * @param rowspan The number of rows the cell spans if it is bigger than 1
     * @return {@link RichBlockTableCell}
     */
    public RichBlockTableCell setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
        return this;
    }
}
