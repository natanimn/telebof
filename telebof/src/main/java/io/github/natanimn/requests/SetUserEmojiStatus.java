package io.github.natanimn.requests;

/**
 * @author Natanim
 * @since July 25, 2025
 * @version 0.6
 */
public class SetUserEmojiStatus extends AbstractBaseRequest<SetUserEmojiStatus, Boolean>{
    /**
     * @param user_id Unique identifier of the target user
     * @param rs RequestSender class
     */
    public SetUserEmojiStatus(long user_id, RequestSender rs){
        super(rs, "setUserEmojiStatus");
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param emoji_status_custom_emoji_id Custom emoji identifier of the emoji status to set. Pass an empty string to remove the status.
     * @return {@link SetUserEmojiStatus}
     */
    public SetUserEmojiStatus emojiStatusCustomEmojiId(String emoji_status_custom_emoji_id){
        return add("emoji_status_custom_emoji_id", emoji_status_custom_emoji_id);
    }

    /**
     * Optional
     * @param emoji_status_expiration_date Expiration date of the emoji status, if any
     * @return {@link SetUserEmojiStatus}
     */
    public SetUserEmojiStatus emojiStatusExpirationDate(Integer emoji_status_expiration_date){
        return add("emoji_status_expiration_date", emoji_status_expiration_date);
    }

}
