package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about a chat boost.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatBoost {
    @SerializedName("boost_id")
    private String boostId;

    @SerializedName("add_date")
    private Integer addDate;

    @SerializedName("expiration_data")
    private Integer expirationData;

    private ChatBoostSource source;

    /**
     * Gets the unique identifier of the boost.
     * @return Unique identifier of the boost
     */
    public String getBoostId() {
        return boostId;
    }

    /**
     * Gets the point in time (Unix timestamp) when the chat was boosted.
     * @return Point in time (Unix timestamp) when the chat was boosted
     */
    public Integer getAddDate() {
        return addDate;
    }

    /**
     * Gets the point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged.
     * @return Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged
     */
    public Integer getExpirationData() {
        return expirationData;
    }

    /**
     * Gets the source of the added boost.
     * @return Source of the added boost
     */
    public ChatBoostSource getSource() {
        return source;
    }
}