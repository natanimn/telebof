package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about a chat boost.
 * @param boostId Unique identifier of the boost
 * @param addDate Point in time (Unix timestamp) when the chat was boosted
 * @param expirationData Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged
 * @param source Source of the added boost
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatBoost(
        @SerializedName("boost_id")
        String boostId,

        @SerializedName("add_date")
        Integer addDate,

        @SerializedName("expiration_data")
        Integer expirationData,

        ChatBoostSource source
){}
