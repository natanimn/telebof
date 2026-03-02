package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetChatMemberTag class. Returns True on success.
 * @author Natanim
 * @since 1.5.0
 * @version 1.5.0
 */
public class SetChatMemberTag extends AbstractBaseRequest<SetChatMemberTag, Boolean> {
    public SetChatMemberTag(Object chatId, long userId, Api api){
        super(chatId, api, "setChatMemberTag", Boolean.class);
        add("user_id", userId);
    }

    /**
     * Optional
     * @param tag New tag for the member; 0-16 characters, emoji are not allowed
     * @return {@link SetChatMemberTag}
     */
    public SetChatMemberTag tag(String tag){
        add("tag", tag);
        return this;
    }
}
