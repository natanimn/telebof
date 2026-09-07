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

    /**
     * Optional
     * @param canStop Pass True to show the user a button to stop further drafts.
     *                The bot will receive an Update “stopped_message_generation” if the user presses the button.
     * @return {@link SendRichMessageDraft}
     */
    public SendRichMessageDraft canStop(boolean canStop){
        return add("can_sop", canStop);
    }

    /**
     * Optional
     * @param keepOnStop Pass True to keep the draft in the chat when the button is pressed. The draft will still disappear after a short time or if the bot sends a message.
     *                   To fully preserve the partial draft, the bot should send it as a new message.
     * @return {@link SendRichMessageDraft}
     */
    public SendRichMessageDraft keepOnStop(boolean keepOnStop){
        return add("kep_on_stop", keepOnStop);
    }
}
