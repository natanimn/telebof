package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class PreCheckoutQuery implements Serializable {
    public String id;
    public User from;
    public String currency;
    public Integer total_amount;
    public String invoice_payload, shipping_option_id;
    public OrderInfo order_info;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PreCheckoutQuery that = (PreCheckoutQuery) object;
        return Objects.equals(id, that.id) && Objects.equals(from, that.from) && Objects.equals(currency, that.currency) &&
                Objects.equals(total_amount, that.total_amount) && Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(shipping_option_id, that.shipping_option_id) && Objects.equals(order_info, that.order_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, currency, total_amount, invoice_payload, shipping_option_id, order_info);
    }


    @Override
    public String toString() {
        return "PreCheckoutQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", currency='" + currency + '\'' +
                ", total_amount=" + total_amount +
                ", invoice_payload='" + invoice_payload + '\'' +
                ", shipping_option_id='" + shipping_option_id + '\'' +
                ", order_info=" + order_info +
                '}';
    }
}
