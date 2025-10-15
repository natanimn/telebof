package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents a unique message identifier.
 * @param messageId Unique message identifier. In specific instances (e.g., message containing a video sent to a big chat), the server might automatically schedule a message instead of sending it immediately. In such cases, this field will be 0 and the relevant message will be unusable until it is actually sent
 * @author Natanim
 * @since 3 March, 2025
 * @version 1.3.0
 */
public record MessageId(
        @SerializedName("message_id") Integer messageId
) {}