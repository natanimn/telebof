package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.input.InputRichMessage;
import io.github.natanimn.telebof.requests.Api;

/**
 * Returns {@link Message} on success.
 * @author Natanim
 * @since 2.1
 * @see BotContext#sendRichMessage
 */
public class SendRichMessage extends SendBuilder<SendRichMessage, Message>{
    public SendRichMessage(Object chatId, InputRichMessage richMessage, Api api){
        super(chatId, api, "sendRichMessage");
        add("rich_message", richMessage);
    }
}
