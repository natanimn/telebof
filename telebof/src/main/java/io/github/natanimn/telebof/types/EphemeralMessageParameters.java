package io.github.natanimn.telebof.types;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Natanim
 * @since 2.3
 */
@RequiredArgsConstructor
@Setter
@Accessors(chain = true)
public class EphemeralMessageParameters {
    /**
     * Identifier of the user who will receive the message. It is not guaranteed that the user will receive the message, especially if they are offline.
     */
    private final long receiverUserId;

    /**
     * Optional. Identifier of the callback query which triggered the message, if any
     */
    private String callbackQueryId;

    /**
     * Optional. Pass True if the ephemeral message must be shown in place of the original message.
     * Must be False for callback queries from ephemeral messages, which must be edited using regular editEphemeralMessage… methods.
     */
    private Boolean replaceCallbackQueryMessage;
}
