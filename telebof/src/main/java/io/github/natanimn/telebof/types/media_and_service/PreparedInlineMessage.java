package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents an inline message to be sent by a user of a Mini App.
 * @param id Unique identifier of the prepared message
 * @param expirationDate Expiration date of the prepared message, in Unix time. Expired prepared messages can no longer be used
 * @author Natanim
 * @since jul 25, 2025
 * @version 1.3.0
 */
public record PreparedInlineMessage(
        String id,
        @SerializedName("expiration_date") Integer expirationDate
) {}