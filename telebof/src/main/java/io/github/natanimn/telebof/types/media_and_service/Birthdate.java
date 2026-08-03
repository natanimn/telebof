package io.github.natanimn.telebof.types.media_and_service;

import lombok.Getter;

/**
 * Describes the birthdate of a user.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Birthdate {
    /**
     * Day of the user's birth; 1-31
     */
    private Byte day;

    /**
     * Month of the user's birth; 1-12
     */
    private Byte month;

    /**
     * Optional. Year of the user's birth
     */
    private Integer year;

}