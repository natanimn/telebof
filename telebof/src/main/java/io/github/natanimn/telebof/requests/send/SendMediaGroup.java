package io.github.natanimn.telebof.requests.send;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.log.BotLog;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputMedia;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.updates.Message;

import java.lang.reflect.Type;
import java.util.List;


/**
 * SendMediaGroup class. Returns sent array of {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendMediaGroup
 */
public class SendMediaGroup extends SendBuilder<SendMediaGroup, List<Message>> {

    public static Type responseType = TypeToken.getParameterized(List.class, Message.class).getType();
    public  SendMediaGroup(Object chatId, InputMedia[] media, Api api) {
        super(chatId, api, "sendMediaGroup", responseType);
        add("media", media);
        for (InputMedia im: media){
            if (im.hasFile()) setHasMultipart(true);
        }

    }

    /**
     * Not implemented
     */
    @Override
    @Deprecated(forRemoval = true)
    public SendMediaGroup replyMarkup(Markup replyMarkup) {
        BotLog.warn("`sendMediaGroup` method does not support replyMarkup option.");
        return this;
    }

}
