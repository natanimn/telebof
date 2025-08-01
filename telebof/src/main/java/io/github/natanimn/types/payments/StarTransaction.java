package io.github.natanimn.types.payments;

import java.util.Objects;

/**
 * Describes a Telegram Star transaction.
 * Note that if the buyer initiates a chargeback with the payment provider from whom they acquired Stars (e.g., Apple, Google)
 * following this transaction, the refunded Stars will be deducted from the bot's balance.
 * This is outside of Telegram's control.
 * @author Natanim
 * @since March 3, 2025
 * @version 0.7
 */
public class StarTransaction {
    /**
     * Unique identifier of the transaction. Coincides with the identifier of the original transaction for refund transactions.
     * Coincides with SuccessfulPayment.telegram_payment_charge_id for successful incoming payments from users.
     */
    public String id;

    /**
     * Integer amount of Telegram Stars transferred by the transaction
     */
    public Integer amount;

    /**
     * Date the transaction was created in Unix time
     */
    public Integer date;

    /**
     * Source of an incoming transaction (e.g., a user purchasing goods or services, Fragment refunding a failed withdrawal).
     * Only for incoming transactions
     */
    public TransactionPartner source;

    /**
     * Receiver of an outgoing transaction (e.g., a user for a purchase refund, Fragment for a withdrawal).
     * Only for outgoing transactions
     */
    public TransactionPartner receiver;

    /**
     * The number of 1/1000000000 shares of Telegram Stars transferred by the transaction; from 0 to 999999999
     */
    public Integer nanostar_amount;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        StarTransaction that = (StarTransaction) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(date, that.date) &&
                Objects.equals(source, that.source) &&
                Objects.equals(receiver, that.receiver) &&
                Objects.equals(nanostar_amount, that.nanostar_amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, date, source, receiver, nanostar_amount);
    }
}
