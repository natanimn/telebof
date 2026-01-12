package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;

import java.util.List;

/**
 * SetMessageReaction class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setMessageReaction
 */
public class SetMessageReaction extends AbstractBaseRequest<SetMessageReaction, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     */
    public SetMessageReaction(Object chatId, int messageId, Api api){
        super(chatId, api, "setMessageReaction", Boolean.class);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param reaction A JSON-serialized list of reaction types to set on the message.
     *                 Currently, as non-premium users, bots can set up to one reaction per message.
     *                 A custom emoji reaction can be used if it is either already present on the message or explicitly allowed by chat administrators.
     *                 Paid reactions can't be used by bots.
     * @return {@link SetMessageReaction}
     */
    public SetMessageReaction reaction(ReactionType[] reaction){
        return add("reaction", reaction);
    }

    /**
     * Optional
     * @param isBig Pass True to set the reaction with a big animation
     * @return {@link SetMessageReaction}
     */
    public SetMessageReaction isBig(boolean isBig){
        return add("is_big", isBig);
    }

}
