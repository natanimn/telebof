package io.github.natanimn.types;

import io.github.natanimn.enums.ParseMode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ReplyParameters implements Serializable {
    private int message_id;
    private Object chat_id;
    private Boolean allow_sending_without_reply;
    private String quote;
    private ParseMode quote_parse_mode;
    private MessageEntity[] quote_entities;
    private Integer quote_position;

    public ReplyParameters(int message_id){
        this.message_id = message_id;
    }

    public ReplyParameters chatId(Object chat_id){
        this.chat_id = chat_id;
        return this;
    }

    public ReplyParameters allowSendingWithoutReply(boolean allow_sending_without_reply){
        this.allow_sending_without_reply = allow_sending_without_reply;
        return this;
    }

    public ReplyParameters quote(String quote){
        this.quote = quote;
        return this;
    }

    public ReplyParameters quoteParseMode(ParseMode quote_parse_mode){
        this.quote = quote_parse_mode.name().toLowerCase();
        return this;
    }

    public ReplyParameters quoteEntities(MessageEntity[] quote_entities){
        this.quote_entities = quote_entities;
        return this;
    }

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
