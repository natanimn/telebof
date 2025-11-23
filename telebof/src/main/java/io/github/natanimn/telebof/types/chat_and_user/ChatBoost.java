package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about a chat boost.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
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

    public String getBoostId() {
        return boostId;
    }

    public Integer getAddDate() {
        return addDate;
    }

    public Integer getExpirationData() {
        return expirationData;
    }

    public ChatBoostSource getSource() {
        return source;
    }
}