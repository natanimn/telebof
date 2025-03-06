package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;
import java.io.File;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendAnimation extends DefaultParameters<SendAnimation, Message> {

    public SendAnimation(Object chatId, String animation, RequestSender requestSender) {
        super(chatId, requestSender, "sendAnimation");
        add("animation", animation);

    }

    public SendAnimation(Object chatId, File animation, RequestSender requestSender) {
        super(chatId, requestSender, "sendAnimation");
        add("animation", animation);
        setContentType(MediaContentType.GIF);
    }

    public SendAnimation caption(String cap) {
        return add("caption", cap);
    }

    public SendAnimation captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    public SendAnimation hasSpoiler(boolean hasSpoiler) {
        return add("has_spoiler", hasSpoiler);
    }
    
    public SendAnimation thumbnail(String thumbnail) { 
        return add("thumbnail", thumbnail);
    }
    
    public SendAnimation thumbnail(File thumbnail){
        setContentType(MediaContentType.DEFAULT);
        return add("thumbnail", thumbnail);
    }
    public SendAnimation width(int width) {
        return add("width", width);
    }
    
    public SendAnimation height(int  height) {
        return add("height", height);
    }
    
    public SendAnimation duration(int  duration) {
        return add("duration", duration);
    }

    public SendAnimation showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

}
