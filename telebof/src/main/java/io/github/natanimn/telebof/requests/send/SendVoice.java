package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;

/**
 * SendVoice class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendVoice extends SendBuilder<SendVoice, Message> {

    /**
     * Required
     * @param chatId Chat id
     * @param voice file or url
     * @param api api
     * @see BotContext#sendVoice(Object, String)
     */
    public SendVoice(Object chatId, String voice, Api api) {
        super(chatId, api, "sendVoice");
        add("voice", voice);
    }

    /**
     * Required
     * @param chatId chat id
     * @param voice File
     * @param api api
     * @see BotContext#sendVoice(Object, File)
     */
    public SendVoice(Object chatId, File voice, Api api) {
        super(chatId, api, "sendVoice");
        add("voice", voice);
    }

    /**
     * Optional
     * @param caption Voice message caption, 0-1024 characters after entities parsing
     * @return {@link SendVoice}
     */
    public SendVoice caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param captionEntities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendVoice}
     */
    public SendVoice captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

}
