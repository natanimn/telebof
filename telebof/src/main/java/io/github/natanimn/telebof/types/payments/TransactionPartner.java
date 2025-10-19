package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.enums.TransactionPartnerType;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gift;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This class describes the source of a transaction, or its recipient for outgoing transactions.
 * @param type Type of the transaction partner
 * @param transactionType Type of the transaction, currently one of invoice_payment for payments via invoices, paid_media_payment for payments for paid media, gift_purchase for gifts sent by the bot, premium_purchase for Telegram Premium subscriptions gifted by the bot, business_account_transfer for direct transfers from managed business accounts
 * @param invoicePayload Bot-specified invoice payload. Can be available only for "invoice_payment" transactions.
 * @param user Information about the user
 * @param withdrawalState State of the transaction if the transaction is outgoing
 * @param paidMedia Information about the paid media bought by the user; for "paid_media_payment" transactions only
 * @param requestCount The number of successful requests that exceeded regular limits and were therefore billed
 * @param subscriptionPeriod The duration of the paid subscription. Can be available only for "invoice_payment" transactions.
 * @param gift The gift sent to the user by the bot; for "gift_purchase" transactions only or The gift sent to the chat by the bot
 * @param affiliate Information about the affiliate that received a commission via this transaction. Can be available only for "invoice_payment" and "paid_media_payment" transactions.
 * @param sponsorUser Information about the bot that sponsored the affiliate program
 * @param commissionPerMille The number of Telegram Stars received by the bot for each 1000 Telegram Stars received by the affiliate program sponsor from referred users
 * @param chat Information about the chat
 * @param premiumSubscriptionDuration Optional. Number of months the gifted Telegram Premium subscription will be active for; for "premium_purchase" transactions only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record TransactionPartner(
        TransactionPartnerType type,
        @SerializedName("transaction_type") String transactionType,
        @SerializedName("invoice_payload") String invoicePayload,
        User user,
        @SerializedName("withdrawal_state") RevenueWithdrawalState withdrawalState,
        @SerializedName("paid_media") List<PaidMedia> paidMedia,
        @SerializedName("request_count") Integer requestCount,
        @SerializedName("subscription_period") Integer subscriptionPeriod,
        Gift gift,
        AffiliateInfo affiliate,
        @SerializedName("sponsor_user") User sponsorUser,
        @SerializedName("commission_per_mille") Integer commissionPerMille,
        Chat chat,
        @SerializedName("premium_subscription_duration") Integer premiumSubscriptionDuration
) {}