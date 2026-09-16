package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Sticker;
import lombok.Getter;

/**
 * Contains information about the start page settings of a Telegram Business account.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}