package io.github.natanimn.telebof.types.payments;

/**
 * Describes an amount of Telegram Stars.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StarAmount {
    /**
     * Integer amount of Telegram Stars, rounded to 0; can be negative
     */
    public Integer amount;

    /**
     * Optional.
     * The number of 1/1000000000 shares of Telegram Stars; from -999999999 to 999999999; can be negative if and only if amount is non-positive
     */
    public Integer nanostar_amount;

}
