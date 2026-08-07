package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This class represents a unique message identifier.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class MessageId {
    /**
     * Unique message identifier. In specific instances (e.g., message containing a video sent to a big chat), the server might automatically schedule a message instead of sending it immediately.
     * In such cases, this field will be 0 and the relevant message will be unusable until it is actually sent
     */
    @SerializedName("message_id")
    private Integer messageId;

}