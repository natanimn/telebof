package io.github.natanimn.types;

import java.util.List;
import java.util.Objects;

/**
 * This class describes the source of a transaction, or its recipient for outgoing transactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.6
 */
public class TransactionPartner {
    /* Type of the transaction partner */
    public String type;

    /* Bot-specified invoice payload. Can be available only for “invoice_payment” transactions.*/
    public String invoice_payload;

    /* Information about the user */
    public User user;

    /* State of the transaction if the transaction is outgoing */
    public RevenueWithdrawalState withdrawal_state;

    /* */
    public List<PaidMedia> paid_media;

    /* The number of successful requests that exceeded regular limits and were therefore billed */
    public Integer request_count;

    /*  The duration of the paid subscription. Can be available only for “invoice_payment” transactions.*/
    public Integer subscription_period;

    /* The gift sent to the user by the bot; for “gift_purchase” transactions only */
    public Gift gift;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TransactionPartner that = (TransactionPartner) object;
        return Objects.equals(type, that.type) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(user, that.user) &&
                Objects.equals(withdrawal_state, that.withdrawal_state) &&
                Objects.equals(paid_media, that.paid_media) &&
                Objects.equals(request_count, that.request_count) &&
                Objects.equals(subscription_period, that.subscription_period) &&
                Objects.equals(gift, that.gift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                invoice_payload,
                user,
                withdrawal_state,
                paid_media,
                request_count,
                subscription_period,
                gift
        );
    }
}
