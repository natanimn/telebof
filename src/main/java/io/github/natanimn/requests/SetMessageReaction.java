package io.github.natanimn.requests;

import io.github.natanimn.types.ReactionType;

import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetMessageReaction extends AbstractBaseRequest<SetMessageReaction, Boolean>{
    public SetMessageReaction(Object chatId, int message_id, RequestSender requestSender){
        super(chatId, requestSender, "setMessageReaction");
    }

    public SetMessageReaction reaction(List<ReactionType> reaction){
        return add("reaction", reaction);
    }

    public SetMessageReaction isBig(boolean is_big){
        return add("is_big", is_big);
    }

}
