package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.TransactionPartnerType;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gift;
import java.util.List;
import java.util.Objects;

/**
 * This class describes the source of a transaction, or its recipient for outgoing transactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.0.0
 */
public class TransactionPartner {
    /**
     * Type of the transaction partner
     */
    public TransactionPartnerType type;

    /**
     * Type of the transaction, currently one of {@link io.github.natanimn.telebof.enums.TransactionType#INVOICE_PAYMENT} for payments via invoices,
     * {@link io.github.natanimn.telebof.enums.TransactionType#PAID_MEDIA_PAYMENT} for payments for paid media, {@link io.github.natanimn.telebof.enums.TransactionType#GIFT_PURCHASE} for gifts sent by the bot,
     * {@link io.github.natanimn.telebof.enums.TransactionType#PREMIUM_PURCHASE} for Telegram Premium subscriptions gifted by the bot,
     * {@link io.github.natanimn.telebof.enums.TransactionType#BUSINESS_ACCOUNT_TRANSFER} for direct transfers from managed business accounts
     */
    public String transaction_type;

    /**
     * Bot-specified invoice payload. Can be available only for “invoice_payment” transactions.
     */
    public String invoice_payload;

    /**
     * Information about the user
     */
    public User user;

    /**
     * State of the transaction if the transaction is outgoing
     */
    public RevenueWithdrawalState withdrawal_state;

    /**
     * Information about the paid media bought by the user; for “paid_media_payment” transactions only
     */
    public List<PaidMedia> paid_media;

    /**
     * The number of successful requests that exceeded regular limits and were therefore billed
     */
    public Integer request_count;

    /**
     * The duration of the paid subscription. Can be available only for “invoice_payment” transactions.
     */
    public Integer subscription_period;

    /**
     * The gift sent to the user by the bot; for “gift_purchase” transactions only or
     * The gift sent to the chat by the bot
     */
    public Gift gift;

    /**
     * Information about the affiliate that received a commission via this transaction.
     * Can be available only for “invoice_payment” and “paid_media_payment” transactions.
     */
    public AffiliateInfo affiliate;

    /**
     * Information about the bot that sponsored the affiliate program
     */
    public User sponsor_user;

    /**
     * The number of Telegram Stars received by the bot for each 1000 Telegram Stars received by the affiliate program sponsor from referred users
     */
    public Integer commission_per_mille;

    /**
     * Information about the chat
     */
    public Chat chat;

    /**
     * Optional. Number of months the gifted Telegram Premium subscription will be active for; for “premium_purchase” transactions only
     */
    public Integer premium_subscription_duration;

}
