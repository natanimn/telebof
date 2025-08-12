package io.github.natanimn.types.payments;

import java.io.Serializable;
import java.util.List;

/**
 * This object represents one shipping option.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ShippingOption implements Serializable {
    private String id, title;
    private List<LabeledPrice> prices;

    /**
     * Required
     * @param id Shipping option identifier
     * @param title Option title
     * @param prices List of price portions
     */
    public ShippingOption(String id, String title, List<LabeledPrice> prices){
        this.id = id;
        this.title = title;
        this.prices = prices;
    }
}
