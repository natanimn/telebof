package io.github.natanimn.telebof.types.media_and_service;

/**
 * Describes the birthdate of a user.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
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

    public Byte getDay() {
        return day;
    }

    public Byte getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }
}