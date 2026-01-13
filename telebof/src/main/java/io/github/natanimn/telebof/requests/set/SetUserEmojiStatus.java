package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */
public class SetUserEmojiStatus extends AbstractBaseRequest<SetUserEmojiStatus, Boolean> {
    /**
     * @param userId Unique identifier of the target user
     * @param api Api class
     */
    public SetUserEmojiStatus(long userId, Api api){
        super(api, "setUserEmojiStatus");
        add("user_id", api);
    }

    /**
     * Optional
     * @param emojiStatusCustomEmojiId Custom emoji identifier of the emoji status to set. Pass an empty string to remove the status.
     * @return {@link SetUserEmojiStatus}
     */
    public SetUserEmojiStatus emojiStatusCustomEmojiId(String emojiStatusCustomEmojiId){
        return add("emoji_status_custom_emoji_id", emojiStatusCustomEmojiId);
    }

    /**
     * Optional
     * @param emojiStatusExpirationDate Expiration date of the emoji status, if any
     * @return {@link SetUserEmojiStatus}
     */
    public SetUserEmojiStatus emojiStatusExpirationDate(Integer emojiStatusExpirationDate){
        return add("emoji_status_expiration_date", emojiStatusExpirationDate);
    }
}
