package io.github.natanimn.telebof.types.media_and_service;

import java.io.Serializable;

/**
 * This class represents an inline keyboard button that copies specified text to the clipboard.
 * @author Natanim
 * @since Jul 22, 2025
 * @version 1.3.0
 */
public class CopyTextButton implements Serializable {
    /**
     * The text to be copied to the clipboard; 1-256 characters
     */
    private String text;

    public CopyTextButton(){}

    public CopyTextButton(String text){
        this.text = text;
    }
    public String getText() {
        return text;
    }
}