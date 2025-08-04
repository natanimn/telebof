package io.github.natanimn.types.payments;

import java.util.Objects;

/**
 * This class contains basic information about a refunded payment.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.7
 */

public class RefundedPayment {
    /**
     * Three-letter ISO 4217 <a href="https://core.telegram.org/bots/payments#supported-currencies">currency code</a>,
     * or “XTR” for payments in <a href="https://t.me/BotNews/90">Telegram Stars.</a> Currently, always “XTR”
     */
    public String currency;

    /**
     * Total refunded price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45, total_amount = 145.
     * See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies)
     */

    public Integer total_amount;

    /**
     * Bot-specified invoice payload
     */
    public String invoice_payload;

    /**
     * Telegram payment identifier
     */
    public String telegram_payment_charge_id;

    /**
     * Provider payment identifier
     */
    public String provider_payment_charge_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        RefundedPayment that = (RefundedPayment) object;
        return  Objects.equals(currency, that.currency) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(telegram_payment_charge_id, that.telegram_payment_charge_id) &&
                Objects.equals(provider_payment_charge_id, that.provider_payment_charge_id) &&
                Objects.equals(total_amount, that.total_amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currency,
                invoice_payload,
                telegram_payment_charge_id,
                provider_payment_charge_id,
                total_amount
        );
    }
}
