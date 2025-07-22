/*
Jul 22, 2025
 */

package io.github.natanimn.types;

import java.io.Serializable;

/*
This class represents an inline keyboard button that copies specified text to the clipboard.
 */
public class CopyTextButton implements Serializable {
    /*
    @param text - The text to be copied to the clipboard; 1-256 characters
     */
    public String text;
}
