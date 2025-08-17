package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * SendVoice class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendVoice extends SendBuilder<SendVoice, Message> {

    /**
     * Required
     * @param chat_id Chat id
     * @param voice file or url
     * @param api api
     * @see BotContext#sendVoice(Object, String)
     */
    public SendVoice(Object chat_id, String voice, Api api) {
        super(chat_id, api, "sendVoice");
        add("voice", voice);
    }

    /**
     * Required
     * @param chat_id chat id
     * @param voice File
     * @param api api
     * @see BotContext#sendVoice(Object, File)
     */
    public SendVoice(Object chat_id, File voice, Api api) {
        super(chat_id, api, "sendVoice");
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
     * @param caption_entities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendVoice}
     */
    public SendVoice captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

}
