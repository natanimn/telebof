package io.github.natanimn.telebof.types.media_and_service;

/**
 * Describes the birthdate of a user.
 * @param day Day of the user's birth; 1-31
 * @param month Month of the user's birth; 1-12
 * @param year Optional. Year of the user's birth
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Birthdate(
        Byte day,
        Byte month,
        Integer year
) {}