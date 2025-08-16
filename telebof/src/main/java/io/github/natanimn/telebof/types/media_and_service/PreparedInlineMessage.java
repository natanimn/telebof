package io.github.natanimn.telebof.types.media_and_service;

/**
 * This class represents an inline message to be sent by a user of a Mini App.
 * @author Natanim
 * @since jul 25, 2025
 * @version 0.6
 */
public class PreparedInlineMessage {
    /**
     * Unique identifier of the prepared message
     */
    public String id;

    /**
     * Expiration date of the prepared message, in Unix time. Expired prepared messages can no longer be used
     */
    public Integer expiration_date;
}
