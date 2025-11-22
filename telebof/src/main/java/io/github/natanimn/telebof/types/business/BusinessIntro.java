package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Sticker;

/**
 * Contains information about the start page settings of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessIntro {
    /**
     * Title text of the business intro
     */
    private String title;

    /**
     * Message text of the business intro
     */
    private String message;

    /**
     * Sticker of the business intro
     */
    private Sticker sticker;

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Sticker getSticker() {
        return sticker;
    }
}