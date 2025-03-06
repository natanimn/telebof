package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.BotLog;
import io.github.natanimn.Util;
import io.github.natanimn.types.InputMedia;
import io.github.natanimn.types.Markup;
import io.github.natanimn.types.Message;

import java.lang.reflect.Type;
import java.util.List;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SendMediaGroup extends DefaultParameters<SendMediaGroup, List<Message>> {

    public static Type responseType = TypeToken.getParameterized(List.class, Message.class).getType();
    public  SendMediaGroup(Object chatId, InputMedia[] medias, RequestSender requestSender) {
        super(chatId, requestSender, "sendMediaGroup", responseType);
        add("media", medias);
        for (InputMedia im: medias){
            if (im.isFile()){
                add(im.getInputFile().file.getName(), im.getInputFile().file);
                setContentType(im.getInputFile().contentType);
                setHasMultipart(true);
            }
            if (im.hasThumbnailFile()){
                add(im.getThumbnailFile().file.getName(), im.getThumbnailFile().file);
                setContentType(im.getThumbnailFile().contentType);
                setHasMultipart(true);
            }
        }

    }

    @Override
    @Deprecated(forRemoval = true)
    public SendMediaGroup replyMarkup(Markup replyMarkup) {
        BotLog.warn("`sendMediaGroup` method does not support replyMarkup option.");
        return this;
    }


}
