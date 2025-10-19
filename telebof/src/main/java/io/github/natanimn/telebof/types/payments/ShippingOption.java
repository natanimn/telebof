package io.github.natanimn.telebof.types.payments;

import java.io.Serializable;
import java.util.List;

/**
 * This object represents one shipping option.
 * @param id Shipping option identifier
 * @param title Option title
 * @param prices List of price portions
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ShippingOption(
        String id,
        String title,
        List<LabeledPrice> prices
) implements Serializable {}