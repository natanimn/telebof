package io.github.natanimn.telebof.types.payments;

import java.io.Serializable;
import java.util.List;

/**
 * This object represents one shipping option.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ShippingOption implements Serializable {
    /**
     * Shipping option identifier
     */
    private String id;

    /**
     * Option title
     */
    private String title;

    /**
     * List of price portions
     */
    private List<LabeledPrice> prices;

    public ShippingOption(){}

    public ShippingOption(String id, String title, List<LabeledPrice> prices) {
        this.id = id;
        this.title = title;
        this.prices = prices;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<LabeledPrice> getPrices() {
        return prices;
    }
}