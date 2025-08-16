package io.github.natanimn.telebof.types.keyboard;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Describes reply parameters for the message that is being sent.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ReplyParameters implements Serializable {
    private int message_id;
    private Object chat_id;
    private Boolean allow_sending_without_reply;
    private String quote;
    private ParseMode quote_parse_mode;
    private MessageEntity[] quote_entities;
    private Integer quote_position;

    /**
     * Required
     * @param message_id Identifier of the message that will be replied to in the current chat, or in the chat chat_id if it is specified
     */
    public ReplyParameters(int message_id){
        this.message_id = message_id;
    }

    /**
     * Optional
     * @param chat_id If the message to be replied to is from a different chat, unique identifier for the chat or username of the channel (in the format @channelusername).
     *                Not supported for messages sent on behalf of a business account.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters chatId(Object chat_id){
        this.chat_id = chat_id;
        return this;
    }

    /**
     * Optional
     * @param allow_sending_without_reply Pass True if the message should be sent even if the specified message to be replied to is not found.
     *                                    Always False for replies in another chat or forum topic.
     *                                    Always True for messages sent on behalf of a business account.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters allowSendingWithoutReply(boolean allow_sending_without_reply){
        this.allow_sending_without_reply = allow_sending_without_reply;
        return this;
    }

    /**
     * Optional
     * @param quote Quoted part of the message to be replied to; 0-1024 characters after entities parsing.
     *              The quote must be an exact substring of the message to be replied to, including bold, italic, underline, strikethrough, spoiler, and custom_emoji entities.
     *              The message will fail to send if the quote isn't found in the original message.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters quote(String quote){
        this.quote = quote;
        return this;
    }

    /**
     * Optional
     * @param quote_parse_mode Mode for parsing entities in the quote.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters quoteParseMode(ParseMode quote_parse_mode){
        this.quote_parse_mode = quote_parse_mode;
        return this;
    }

    /**
     * Optional
     * @param quote_entities  A JSON-serialized list of special entities that appear in the quote. It can be specified instead of {@link #quoteParseMode(ParseMode)}.
     * @return {@link ReplyParameters}
     */
    public ReplyParameters quoteEntities(MessageEntity[] quote_entities){
        this.quote_entities = quote_entities;
        return this;
    }

    /**
     * Optional
     * @param quote_position Position of the quote in the original message in UTF-16 code units
     * @return {@link ReplyParameters}
     */
    public ReplyParameters quotePosition(Integer quote_position){
        this.quote_position = quote_position;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReplyParameters that = (ReplyParameters) object;
        return message_id == that.message_id && Objects.equals(chat_id, that.chat_id) &&
                Objects.equals(allow_sending_without_reply, that.allow_sending_without_reply) &&
                Objects.equals(quote, that.quote) && quote_parse_mode == that.quote_parse_mode &&
                Arrays.equals(quote_entities, that.quote_entities) && Objects.equals(quote_position, that.quote_position);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(message_id, chat_id, allow_sending_without_reply, quote, quote_parse_mode, quote_position);
        result = 31 * result + Arrays.hashCode(quote_entities);
        return result;
    }
}
