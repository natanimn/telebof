package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class Invoice implements Serializable {
    public String title, description, start_parameter, currency;
    public Integer total_amount;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Invoice invoice = (Invoice) object;
        return Objects.equals(title, invoice.title) && Objects.equals(description, invoice.description) &&
                Objects.equals(start_parameter, invoice.start_parameter) && Objects.equals(currency, invoice.currency) &&
                Objects.equals(total_amount, invoice.total_amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, start_parameter, currency, total_amount);
    }
}
