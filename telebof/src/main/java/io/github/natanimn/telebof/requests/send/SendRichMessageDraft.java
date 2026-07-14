package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputRichMessage;

/**
 * SendMessageDraft class. Returns True on success.
 * @author Natanim
 * @since 2.1
 */
public class SendRichMessageDraft extends AbstractBaseRequest<SendRichMessageDraft, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param richMessage The partial message to be streamed
     * @param draftId draft id
     * @param api api
     */
    public SendRichMessageDraft(long chatId, InputRichMessage richMessage, int draftId, Api api){
        super(chatId, api, "sendMessageDraft", Boolean.class);
        add("rich_message", richMessage);
        add("draft_id", draftId);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread
     * @return {@link SendRichMessageDraft}
     */
    public SendRichMessageDraft messageThreadId(int messageThreadId){
        return add("message_thread_id", messageThreadId);
    }

}
