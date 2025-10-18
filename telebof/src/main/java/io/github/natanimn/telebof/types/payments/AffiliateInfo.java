package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * This class Contains information about the affiliate that received a commission via this transaction.
 * @param affiliateUser The bot or the user that received an affiliate commission if it was received by a bot or a user
 * @param affiliateChat The chat that received an affiliate commission if it was received by a chat
 * @param commissionPerMille The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the bot from referred users
 * @param amount Integer amount of Telegram Stars received by the affiliate from the transaction, rounded to 0; can be negative for refunds
 * @param nanostarAmount The number of 1/1000000000 shares of Telegram Stars received by the affiliate; from -999999999 to 999999999; can be negative for refunds
 * @author Natanim
 * @since July 3, 2025
 * @version 1.3.0
 */
public record AffiliateInfo(
        @SerializedName("affiliate_user") User affiliateUser,
        @SerializedName("affiliate_chat") Chat affiliateChat,
        @SerializedName("commission_per_mille") Integer commissionPerMille,
        Integer amount,
        @SerializedName("nanostar_amount") Integer nanostarAmount
) {}