package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteEphemeralMessage class. Returns True on success.
 * @author Natanim
 * @since 2.2
 * @see BotContext#deleteEphemeralMessage
 */
public class DeleteEphemeralMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {

    public DeleteEphemeralMessage(Object chatId, long receiverUserId, int ephemeralMessageId, Api api) {
        super(chatId, api, "deleteEphemeralMessage", Boolean.class);
        add("receiver_user_id", receiverUserId);
        add("ephemeral_message_id", ephemeralMessageId);
    }

}
