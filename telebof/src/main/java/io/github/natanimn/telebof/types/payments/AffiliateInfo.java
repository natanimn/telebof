package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * This class Contains information about the affiliate that received a commission via this transaction.
 * @author Natanim
 * @since July 3, 2025
 * @version 1.3.0
 */
public class AffiliateInfo {
    /**
     * The bot or the user that received an affiliate commission if it was received by a bot or a user
     */
    @SerializedName("affiliate_user")
    private User affiliateUser;

    /**
     * The chat that received an affiliate commission if it was received by a chat
     */
    @SerializedName("affiliate_chat")
    private Chat affiliateChat;

    /**
     * The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the bot from referred users
     */
    @SerializedName("commission_per_mille")
    private Integer commissionPerMille;

    /**
     * Integer amount of Telegram Stars received by the affiliate from the transaction, rounded to 0; can be negative for refunds
     */
    private Integer amount;

    /**
     * The number of 1/1000000000 shares of Telegram Stars received by the affiliate; from -999999999 to 999999999; can be negative for refunds
     */
    @SerializedName("nanostar_amount")
    private Integer nanostarAmount;

    public User getAffiliateUser() {
        return affiliateUser;
    }

    public Chat getAffiliateChat() {
        return affiliateChat;
    }

    public Integer getCommissionPerMille() {
        return commissionPerMille;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getNanostarAmount() {
        return nanostarAmount;
    }
}