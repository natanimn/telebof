package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class TransactionPartner {
    public String type, invoice_payload;
    public User user;
    public RevenueWithdrawalState withdrawal_state;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TransactionPartner that = (TransactionPartner) object;
        return Objects.equals(type, that.type) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(user, that.user) &&
                Objects.equals(withdrawal_state, that.withdrawal_state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, invoice_payload, user, withdrawal_state);
    }
}
