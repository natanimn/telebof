package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This class Contains information about the affiliate that received a commission via this transaction.
 * @author Natanim
 * @since July 3, 2025
 * @version 0.7
 */
public class AffiliateInfo {
    /**
     * The bot or the user that received an affiliate commission if it was received by a bot or a user
     */
    public User affiliate_user;

    /**
     * The chat that received an affiliate commission if it was received by a chat
     */
    public Chat affiliate_chat;

    /**
     * The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the bot from referred users
     */
    public Integer commission_per_mille;

    /**
     * Integer amount of Telegram Stars received by the affiliate from the transaction, rounded to 0; can be negative for refunds
     */
    public Integer amount;

    /**
     * The number of 1/1000000000 shares of Telegram Stars received by the affiliate; from -999999999 to 999999999;
     * can be negative for refunds
     */
    public Integer nanostar_amount;

}
