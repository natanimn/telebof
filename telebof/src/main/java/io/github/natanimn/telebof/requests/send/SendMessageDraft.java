package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

/**
 * SendMessageDraft class. Returns True on success.
 * @author Natanim
 * @since 1.3.0
 * @version 1.3.0
 */
public class SendMessageDraft extends AbstractBaseRequest<SendMessageDraft, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param text text
     * @param draftId draft id
     * @param api api
     */
    public SendMessageDraft(long chatId, String text, int draftId, Api api){
        super(chatId, api, "sendMessageDraft", Boolean.class);
        add("text", text);
        add("draft_id", draftId);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread
     * @return {@link SendMessageDraft}
     */
    public SendMessageDraft messageThreadId(int messageThreadId){
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message text.
     * @return {@link SendMessageDraft}
     */
    public SendMessageDraft parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    /**
     * Optional
     * @param entities A JSON-serialized list of special entities that appear in message text, which can be specified instead of {@link #parseMode}
     * @return {@link SendMessageDraft}
     */
    public SendMessageDraft entities(MessageEntity[] entities){
        return add("entities", entities);
    }

}
