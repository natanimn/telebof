package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.enums.TableCellAlign;
import io.github.natanimn.telebof.types.rich.RichMessageButton;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * A block containing a list of buttons that are shown in one row, corresponding to the custom HTML tag <tg-button-row>.
 * @author Natanim
 * @since 2.3
 */
@Setter
@Accessors(chain = true)
public class InputRichBlockButtons implements InputRichBlock {
    private final String type = "buttons";

    /**
     * List of 1-8 buttons to send
     */
    private final RichMessageButton[] buttons;

    /**
     * Optional. Horizontal alignment of the buttons.
     */
    private TableCellAlign align;


    public InputRichBlockButtons(RichMessageButton[] buttons) {
        this.buttons = buttons;
    }
}
