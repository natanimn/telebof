package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents an inline message to be sent by a user of a Mini App.
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */
public class PreparedInlineMessage {
    /**
     * Unique identifier of the prepared message
     */
    private String id;

    /**
     * Expiration date of the prepared message, in Unix time. Expired prepared messages can no longer be used
     */
    @SerializedName("expiration_date")
    private Integer expirationDate;

    public String getId() {
        return id;
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }
}