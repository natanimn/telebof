package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a service message about a change in the price of paid messages within a chat.
 * @param paidMessageStarCount The new number of Telegram Stars that must be paid by non-administrator users of the supergroup chat for each sent message
 * @author Natanim
 * @since 20 August 2025
 * @version 1.3.0
 */
public record PaidMessagePriceChanged(
        @SerializedName("paid_message_star_count") Integer paidMessageStarCount
) {}