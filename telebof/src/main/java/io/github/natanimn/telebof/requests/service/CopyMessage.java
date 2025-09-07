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

import java.util.List;

/**
 * CopyMessage class.
 * Return {@link MessageId} on success
 * @see BotContext#copy
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class CopyMessage extends AbstractBaseRequest<CopyMessage, MessageId> {

    public CopyMessage(Object chat, Object fromChatId, int messageId, Api api) {
        super(chat, api, "copyMessage", MessageId.class);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param message_thread_id Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link CopyMessage}
     */
    public CopyMessage messageThreadId(int message_thread_id) {
        return add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the new caption.
     * @return {@link CopyMessage}
     */
    public CopyMessage parseMode(ParseMode parse_mode) {
        return add("parse_mode", parse_mode);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link CopyMessage}
     */
    public CopyMessage disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link CopyMessage}
     */
    public CopyMessage protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link CopyMessage}
     */
    public CopyMessage replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link CopyMessage}
     */
    public CopyMessage replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
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
     * @param caption_entities A JSON-serialized list of special entities that appear in the new caption, which can be specified instead of parse_mode
     * @return {@link CopyMessage}
     */
    public CopyMessage captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media.
     *                                 Ignored if a new caption isn't specified.
     * @return {@link CopyMessage}
     */
    public CopyMessage showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

    /**
     * Optional
     * @param video_start_timestamp New start timestamp for the forwarded video in the message
     * @return {@link CopyMessage}
     */
    public CopyMessage videoStartTimestamp(int video_start_timestamp){
        return add("video_start_timestamp", video_start_timestamp);
    }

    /***
     * Optional
     * @param direct_messages_topic_id Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link CopyMessage}
     */
    public CopyMessage directMessagesTopicId(int direct_messages_topic_id){
        return add("direct_messages_topic_id", direct_messages_topic_id);
    }

    /**
     * Optional
     * @param suggested_post_parameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link CopyMessage}
     */
    public CopyMessage suggestedPostParameters(SuggestedPostParameters suggested_post_parameters){
        return add("suggested_post_parameters", suggested_post_parameters);
    }
}
