package io.github.natanimn.telebof.types.suggested;

import io.github.natanimn.telebof.types.payments.StarAmount;
import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a successful payment for a suggested post.
 * @param suggestedPostMessage Optional. Message containing the suggested post. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
 * @param currency Currency in which the payment was made. Currently, one of "XTR" for Telegram Stars or "TON" for toncoins
 * @param amount Optional. The amount of the currency that was received by the channel in nanotoncoins; for payments in toncoins only
 * @param starAmount Optional. The amount of Telegram Stars that was received by the channel; for payments in Telegram Stars only
 * @author Natanim
 * @since 3 September 2025
 * @version 1.3.0
 */
public record SuggestedPostPaid(
        @SerializedName("suggested_post_message") Message suggestedPostMessage,
        String currency,
        Integer amount,
        @SerializedName("star_amount") StarAmount starAmount
) {}