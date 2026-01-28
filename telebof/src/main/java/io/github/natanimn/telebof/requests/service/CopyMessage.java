package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.media_and_service.MessageId;
import io.github.natanimn.telebof.types.ReplyParameters;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;

/**
 * CopyMessage class.
 * Return {@link MessageId} on success
 * @see BotContext#copy
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class CopyMessage extends AbstractBaseRequest<CopyMessage, MessageId> {

    public CopyMessage(Object chatId, Object fromChatId, int messageId, Api api) {
        super(chatId, api, "copyMessage", MessageId.class);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link CopyMessage}
     */
    public CopyMessage messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the new caption.
     * @return {@link CopyMessage}
     */
    public CopyMessage parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link CopyMessage}
     */
    public CopyMessage disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link CopyMessage}
     */
    public CopyMessage protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link CopyMessage}
     */
    public CopyMessage replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link CopyMessage}
     */
    public CopyMessage replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param caption New caption for media, 0-1024 characters after entities parsing. If not specified, the original caption is kept
     * @return {@link CopyMessage}
     */
    public CopyMessage caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the new caption, which can be specified instead of parse_mode
     * @return {@link CopyMessage}
     */
    public CopyMessage captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media.
     *                                 Ignored if a new caption isn't specified.
     * @return {@link CopyMessage}
     */
    public CopyMessage showCaptionAboveMedia(boolean showCaptionAboveMedia){
        return add("show_caption_above_media", showCaptionAboveMedia);
    }

    /**
     * Optional
     * @param videoStartTimestamp New start timestamp for the forwarded video in the message
     * @return {@link CopyMessage}
     */
    public CopyMessage videoStartTimestamp(int videoStartTimestamp){
        return add("video_start_timestamp", videoStartTimestamp);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link CopyMessage}
     */
    public CopyMessage directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    /**
     * Optional
     * @param suggestedPostParameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link CopyMessage}
     */
    public CopyMessage suggestedPostParameters(SuggestedPostParameters suggestedPostParameters){
        return add("suggested_post_parameters", suggestedPostParameters);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier of the message effect to be added to the message; only available when copying to private chats
     * @return {@link CopyMessage}
     */
    public CopyMessage messageEffectId(String messageEffectId){
        return add("message_effect_id", messageEffectId);
    }
}
