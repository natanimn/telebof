package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.media_and_service.ReactionType;

import java.util.List;

/**
 * SetMessageReaction class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setMessageReaction}
 */
public class SetMessageReaction extends AbstractBaseRequest<SetMessageReaction, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     */
    public SetMessageReaction(Object chat_id, int message_id, RequestSender requestSender){
        super(chat_id, requestSender, "setMessageReaction", Boolean.class);
        add("message_id", message_id);
    }

    /**
     * Optional
     * @param reaction A JSON-serialized list of reaction types to set on the message.
     *                 Currently, as non-premium users, bots can set up to one reaction per message.
     *                 A custom emoji reaction can be used if it is either already present on the message or explicitly allowed by chat administrators.
     *                 Paid reactions can't be used by bots.
     * @return {@link SetMessageReaction}
     */
    public SetMessageReaction reaction(List<ReactionType> reaction){
        return add("reaction", reaction);
    }

    /**
     * Optional
     * @param is_big Pass True to set the reaction with a big animation
     * @return {@link SetMessageReaction}
     */
    public SetMessageReaction isBig(boolean is_big){
        return add("is_big", is_big);
    }

}
