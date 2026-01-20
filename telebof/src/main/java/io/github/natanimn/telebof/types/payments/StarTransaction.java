package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a Telegram Star transaction.
 * Note that if the buyer initiates a chargeback with the payment provider from whom they acquired Stars (e.g., Apple, Google)
 * following this transaction, the refunded Stars will be deducted from the bot's balance.
 * This is outside of Telegram's control.
 * @author Natanim
 * @since March 3, 2025
 * @version 1.3.0
 */
public class StarTransaction {
    /**
     * Unique identifier of the transaction. Coincides with the identifier of the original transaction for refund transactions. Coincides with SuccessfulPayment.telegram_payment_charge_id for successful incoming payments from users.
     */
    private String id;

    /**
     * Integer amount of Telegram Stars transferred by the transaction
     */
    private Integer amount;

    /**
     * Date the transaction was created in Unix time
     */
    private Integer date;

    /**
     * Source of an incoming transaction (e.g., a user purchasing goods or services, Fragment refunding a failed withdrawal). Only for incoming transactions
     */
    private TransactionPartner source;

    /**
     * Receiver of an outgoing transaction (e.g., a user for a purchase refund, Fragment for a withdrawal). Only for outgoing transactions
     */
    private TransactionPartner receiver;

    /**
     * The number of 1/1000000000 shares of Telegram Stars transferred by the transaction; from 0 to 999999999
     */
    @SerializedName("nanostar_amount")
    private Integer nanostarAmount;

    public String getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getDate() {
        return date;
    }

    public TransactionPartner getSource() {
        return source;
    }

    public TransactionPartner getReceiver() {
        return receiver;
    }

    public Integer getNanostarAmount() {
        return nanostarAmount;
    }
}