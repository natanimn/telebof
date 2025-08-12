package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.payments.OrderInfo;

import java.util.Objects;

/**
 * This class contains information about an incoming pre-checkout query.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PreCheckoutQuery implements TelegramUpdate{
    /**
     * Unique query identifier
     */
    public String id;

    /**
     * User who sent the query
     */
    public User from;

    /**
     * Three-letter ISO 4217 <a href="https://core.telegram.org/bots/payments#supported-currencies">currency</a> code, or “XTR” for payments in Telegram Stars
     */
    public String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json,</a>
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public Integer total_amount;

    /**
     * Bot-specified invoice payload
     */
    public String invoice_payload;

    /**
     * Identifier of the shipping option chosen by the user
     */
    public String shipping_option_id;

    /**
     * Order information provided by the user
     */
    public OrderInfo order_info;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PreCheckoutQuery that = (PreCheckoutQuery) object;
        return  Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(total_amount, that.total_amount) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(shipping_option_id, that.shipping_option_id) &&
                Objects.equals(order_info, that.order_info);
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
