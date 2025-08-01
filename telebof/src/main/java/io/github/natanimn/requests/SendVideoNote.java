package io.github.natanimn.requests;

import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendVideoNote extends DefaultParameters<SendVideoNote, Message> {
    public SendVideoNote(Object chatId, String videoNote, RequestSender requestSender) {
        super(chatId, requestSender, "sendVideoNote");
        add("video_note", videoNote);
    }

    public SendVideoNote(Object chatId, File videoNote, RequestSender requestSender) {
        super(chatId, requestSender, "sendVideoNote");
        add("video_note", videoNote);
        setContentType(MediaContentType.VIDEO);
    }

    public SendVideoNote caption(String cap){
        return add("caption", cap);
    }

    public SendVideoNote captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public SendVideoNote thumbnail(String thumbnail){
        return add("thumbnail", thumbnail);
    }
    public SendVideoNote thumbnail(File thumbnail) {
        setContentType(MediaContentType.DEFAULT);
        return add("thumbnail", thumbnail);
    }
    public SendVideoNote length(int length){
        return add("length", length);
    }

    public SendVideoNote duration(int duration) {
        return add("duration", duration);
    }

}
