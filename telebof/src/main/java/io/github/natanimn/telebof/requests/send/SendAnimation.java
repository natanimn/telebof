package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;


/**
 * SendAnimation class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendAnimation extends SendBuilder<SendAnimation, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param animation file id or url
     * @param api api
     * @see BotContext#sendAnimation(Object, String)
     */
    public SendAnimation(Object chat_id, String animation, Api api) {
        super(chat_id, api, "sendAnimation");
        add("animation", animation);

    }

    /**
     * Required
     * @param chat_id chat id
     * @param animation file
     * @param api api
     * @see BotContext#sendAnimation(Object, File)
     */
    public SendAnimation(Object chat_id, File animation, Api api) {
        super(chat_id, api, "sendAnimation");
        add("animation", animation);
    }

    /**
     * Optional
     * @param caption Animation caption (may also be used when resending animation by file_id), 0-1024 characters after entities parsing
     * @return {@link SendAnimation}
     */
    public SendAnimation caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param caption_entities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendAnimation}
     */
    public SendAnimation captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", caption_entities);
    }

    /**
     * Optional
     * @param has_spoiler Pass True if the animation needs to be covered with a spoiler animation
     * @return {@link SendAnimation}
     */
    public SendAnimation hasSpoiler(boolean has_spoiler) {
        return add("has_spoiler", has_spoiler);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320. Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendAnimation}
     */
    public SendAnimation thumbnail(String thumbnail) { 
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320. Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendAnimation}
     */
    public SendAnimation thumbnail(File thumbnail){
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param width Animation width
     * @return {@link SendAnimation}
     */
    public SendAnimation width(int width) {
        return add("width", width);
    }

    /**
     * Optional
     * @param height Animation height
     * @return {@link SendAnimation}
     */
    public SendAnimation height(int  height) {
        return add("height", height);
    }

    /**
     * Optional
     * @param duration
     * @return {@link SendAnimation}
     */
    public SendAnimation duration(int  duration) {
        return add("duration", duration);
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link SendAnimation}
     */
    public SendAnimation showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }
}
