package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class RefundedPayment {
    public String currency, invoice_payload, telegram_payment_charge_id, provider_payment_charge_id;
    public Integer total_amount;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        RefundedPayment that = (RefundedPayment) object;
        return Objects.equals(currency, that.currency) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(telegram_payment_charge_id, that.telegram_payment_charge_id) &&
                Objects.equals(provider_payment_charge_id, that.provider_payment_charge_id) &&
                Objects.equals(total_amount, that.total_amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, invoice_payload, telegram_payment_charge_id,
                provider_payment_charge_id, total_amount);
    }
}
