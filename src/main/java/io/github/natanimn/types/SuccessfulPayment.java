package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim
 * @since 3 March 2025
 */
public class SuccessfulPayment implements Serializable {
    public String currency;
    public Integer total_amount, subscription_expiration_date;
    public String invoice_payload, shipping_option_id;
    public OrderInfo order_info;
    public String telegram_payment_charge_id, provider_payment_charge_id;
    public Boolean is_recurring, is_first_recurring;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SuccessfulPayment that = (SuccessfulPayment) object;
        return Objects.equals(currency, that.currency) && Objects.equals(total_amount, that.total_amount) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(shipping_option_id, that.shipping_option_id) &&
                Objects.equals(order_info, that.order_info) &&
                Objects.equals(telegram_payment_charge_id, that.telegram_payment_charge_id) &&
                Objects.equals(provider_payment_charge_id, that.provider_payment_charge_id) &&
                Objects.equals(subscription_expiration_date, that.subscription_expiration_date) &&
                Objects.equals(is_recurring, that.is_recurring) &&
                Objects.equals(is_first_recurring, that.is_first_recurring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, total_amount, invoice_payload, shipping_option_id, order_info,
                telegram_payment_charge_id, provider_payment_charge_id, subscription_expiration_date,
                is_recurring, is_first_recurring);
    }
}
