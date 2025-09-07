package io.github.natanimn.telebof.types.suggested;

import java.io.Serializable;

/**
 * Describes the price of a suggested post.
 * @author Natanim
 * @since 3 September 2025
 * @version 1.2.0
 */
public class SuggestedPostPrice implements Serializable {

    /**
     * Currency in which the post will be paid. Currently, must be one of “XTR” for Telegram Stars or “TON” for toncoins
     */
    public String currency;

    /**
     * The amount of the currency that will be paid for the post in the smallest units of the currency,
     * i.e. Telegram Stars or nanotoncoins. Currently, price in Telegram Stars must be between 5 and 100000, and price in nanotoncoins must be between 10000000 and 10000000000000.
     */
    public Long amount;

    /**
     * Required
     * @param currency Currency in which the post will be paid. Currently, must be one of “XTR” for Telegram Stars or “TON” for toncoins
     * @param amount The amount of the currency that will be paid for the post in the smallest units of the currency,
     *               i.e. Telegram Stars or nanotoncoins. Currently, price in Telegram Stars must be between 5 and 100000, and price in nanotoncoins must be between 10000000 and 10000000000000.
     */
    public SuggestedPostPrice(String currency, long amount){
        this.currency = currency;
        this.amount = amount;
    }
}
