package io.github.natanimn.telebof.types;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Describes reply parameters for the message that is being sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ReplyParameters implements Serializable {
    @SerializedName("message_id")
    private int messageId;

    @SerializedName("chat_id")
    private Object chatId;

    @SerializedName("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply;

    private String quote;

    @SerializedName("quote_parse_mode")
    private ParseMode quoteParseMode;

    @SerializedName("quote_entities")
    private MessageEntity[] quoteEntities;

    @SerializedName("quote_position")
    private Integer quotePosition;

    @SerializedName("checklist_task_id")
    private Integer checklistTaskId;

    /**
     * Required
     * @param messageId Identifier of the message that will be replied to in the current chat, or in the chat chatId if it is specified
     */
    public ReplyParameters(int messageId) {
        this.messageId = messageId;
    }

    /**
     * Optional
     * @param chatId If the message to be replied to is from a different chat, unique identifier for the chat or username of the channel (in the format @channelusername).
     *               Not supported for messages sent on behalf of a business account.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setChatId(Object chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Optional
     * @param allowSendingWithoutReply Pass True if the message should be sent even if the specified message to be replied to is not found.
     *                                 Always False for replies in another chat or forum topic.
     *                                 Always True for messages sent on behalf of a business account.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
        this.allowSendingWithoutReply = allowSendingWithoutReply;
        return this;
    }

    /**
     * Optional
     * @param quote Quoted part of the message to be replied to; 0-1024 characters after entities parsing.
     *              The quote must be an exact substring of the message to be replied to, including bold, italic, underline, strikethrough, spoiler, and custom_emoji entities.
     *              The message will fail to send if the quote isn't found in the original message.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * Optional
     * @param quoteParseMode Mode for parsing entities in the quote.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setQuoteParseMode(ParseMode quoteParseMode) {
        this.quoteParseMode = quoteParseMode;
        return this;
    }

    /**
     * Optional
     * @param quoteEntities A JSON-serialized list of special entities that appear in the quote. It can be specified instead of {@link #setQuoteParseMode(ParseMode)}.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setQuoteEntities(MessageEntity[] quoteEntities) {
        this.quoteEntities = quoteEntities;
        return this;
    }

    /**
     * Optional
     * @param quotePosition Position of the quote in the original message in UTF-16 code units
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setQuotePosition(Integer quotePosition) {
        this.quotePosition = quotePosition;
        return this;
    }

    /**
     * Optional
     * @param checklistTaskId Identifier of the specific checklist task to be replied to
     * @return {@link ReplyParameters}
     */
    public ReplyParameters setChecklistTaskId(Integer checklistTaskId) {
        this.checklistTaskId = checklistTaskId;
        return this;
    }
}