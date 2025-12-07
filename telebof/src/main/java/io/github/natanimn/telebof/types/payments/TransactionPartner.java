package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.TransactionPartnerType;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gift;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This class describes the source of a transaction, or its recipient for outgoing transactions.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class TransactionPartner {
    /**
     * Type of the transaction partner
     */
    private TransactionPartnerType type;

    /**
     * Type of the transaction, currently one of invoice_payment for payments via invoices, paid_media_payment for payments for paid media, gift_purchase for gifts sent by the bot, premium_purchase for Telegram Premium subscriptions gifted by the bot, business_account_transfer for direct transfers from managed business accounts
     */
    @SerializedName("transaction_type")
    private String transactionType;

    /**
     * Bot-specified invoice payload. Can be available only for "invoice_payment" transactions.
     */
    @SerializedName("invoice_payload")
    private String invoicePayload;

    /**
     * Information about the user
     */
    private User user;

    /**
     * State of the transaction if the transaction is outgoing
     */
    @SerializedName("withdrawal_state")
    private RevenueWithdrawalState withdrawalState;

    /**
     * Information about the paid media bought by the user; for "paid_media_payment" transactions only
     */
    @SerializedName("paid_media")
    private List<PaidMedia> paidMedia;

    /**
     * The number of successful requests that exceeded regular limits and were therefore billed
     */
    @SerializedName("request_count")
    private Integer requestCount;

    /**
     * The duration of the paid subscription. Can be available only for "invoice_payment" transactions.
     */
    @SerializedName("subscription_period")
    private Integer subscriptionPeriod;

    /**
     * The gift sent to the user by the bot; for "gift_purchase" transactions only or The gift sent to the chat by the bot
     */
    private Gift gift;

    /**
     * Information about the affiliate that received a commission via this transaction. Can be available only for "invoice_payment" and "paid_media_payment" transactions.
     */
    private AffiliateInfo affiliate;

    /**
     * Information about the bot that sponsored the affiliate program
     */
    @SerializedName("sponsor_user")
    private User sponsorUser;

    /**
     * The number of Telegram Stars received by the bot for each 1000 Telegram Stars received by the affiliate program sponsor from referred users
     */
    @SerializedName("commission_per_mille")
    private Integer commissionPerMille;

    /**
     * Information about the chat
     */
    private Chat chat;

    /**
     * Optional. Number of months the gifted Telegram Premium subscription will be active for; for "premium_purchase" transactions only
     */
    @SerializedName("premium_subscription_duration")
    private Integer premiumSubscriptionDuration;

    public TransactionPartnerType getType() {
        return type;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public User getUser() {
        return user;
    }

    public RevenueWithdrawalState getWithdrawalState() {
        return withdrawalState;
    }

    public List<PaidMedia> getPaidMedia() {
        return paidMedia;
    }

    public Integer getRequestCount() {
        return requestCount;
    }

    public Integer getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public Gift getGift() {
        return gift;
    }

    public AffiliateInfo getAffiliate() {
        return affiliate;
    }

    public User getSponsorUser() {
        return sponsorUser;
    }

    public Integer getCommissionPerMille() {
        return commissionPerMille;
    }

    public Chat getChat() {
        return chat;
    }

    public Integer getPremiumSubscriptionDuration() {
        return premiumSubscriptionDuration;
    }
}