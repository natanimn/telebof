package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object contains information about a chat boost.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatBoost {
    /**
     * Unique identifier of the boost
     */
    @SerializedName("boost_id")
    private String boostId;

    /**
     * Point in time (Unix timestamp) when the chat was boosted
     */
    @SerializedName("add_date")
    private Integer addDate;

    /**
     * Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged
     */
    @SerializedName("expiration_data")
    private Integer expirationData;

    /**
     * Source of the added boost
     */
    private ChatBoostSource source;

}