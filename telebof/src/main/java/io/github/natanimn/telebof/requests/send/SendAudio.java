package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;


/**
 * SendAudio class. Returns {@link Message} on success
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendAudio extends SendBuilder<SendAudio, Message> {
    /**
     * Required
     * @param chat_id chat id
     * @param audio file or url
     * @param api api
     * @see BotContext#sendAudio(Object, String)
     */
    public SendAudio(Object chat_id, String audio, Api api) {
        super(chat_id, api, "sendAudio");
        add("audio", audio);
    }

    /**
     * Required
     * @param chat_id chat id
     * @param audio File
     * @param api api
     * @see BotContext#sendAudio(Object, File)
     */
    public SendAudio(Object chat_id, File audio, Api api) {
        super(chat_id, api, "sendAudio");
        add("audio", audio);
    }

    /**
     * Optional
     * @param caption Audio caption, 0-1024 characters after entities parsing
     * @return {@link SendAudio}
     */
    public SendAudio caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param caption_entities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendAudio}
     */
    public SendAudio captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

    /**
     * Optional
     * @param duration Duration of the audio in seconds
     * @return {@link SendAudio}
     */
    public SendAudio duration(int duration) {
        return add("duration", duration);
    }

    /**
     * Optional
     * @param performer Performer
     * @return {@link SendAudio}
     */
    public SendAudio performer(String performer) {
        return add("performer", performer);
    }

    /**
     * Optional
     * @param title Track name
     * @return {@link SendAudio}
     */
    public SendAudio title(String title) {
        return add("title", title);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320. Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendAudio}
     */
    public SendAudio thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320.
     *                  Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendAudio}
     */
    public SendAudio thumbnail(File thumbnail) {
        return add("thumbnail", thumbnail);
    }

}
