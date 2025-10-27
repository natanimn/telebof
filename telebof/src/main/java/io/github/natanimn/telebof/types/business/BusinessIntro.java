package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Sticker;

/**
 * Contains information about the start page settings of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessIntro {
    private String title;
    private String message;
    private Sticker sticker;

    /**
     * Gets the title text of the business intro.
     * @return Title text of the business intro
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the message text of the business intro.
     * @return Message text of the business intro
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the sticker of the business intro.
     * @return Sticker of the business intro
     */
    public Sticker getSticker() {
        return sticker;
    }
}