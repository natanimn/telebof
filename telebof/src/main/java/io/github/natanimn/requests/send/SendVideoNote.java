package io.github.natanimn.requests.send;

import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;
import java.io.File;

/**
 * SendVideoNote class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendVideoNote extends SendBuilder<SendVideoNote, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param video_note file id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#sendVideoNote(Object, String)}
     */
    public SendVideoNote(Object chat_id, String video_note, RequestSender requestSender) {
        super(chat_id, requestSender, "sendVideoNote");
        add("video_note", video_note);
    }

    /**
     * Required
     * @param chat_id chat id
     * @param video_note file
     * @param requestSender request sender
     */
    public SendVideoNote(Object chat_id, File video_note, RequestSender requestSender) {
        super(chat_id, requestSender, "sendVideoNote");
        add("video_note", video_note);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     *                  Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendVideoNote}
     */
    public SendVideoNote thumbnail(String thumbnail){
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     *                  Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link SendVideoNote}
     */
    public SendVideoNote thumbnail(File thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param length Video width and height, i.e. diameter of the video message
     * @return {@link SendVideoNote}
     */
    public SendVideoNote length(int length){
        return add("length", length);
    }

    /**
     * Optional
     * @param duration Duration of sent video in seconds
     * @return {@link SendVideoNote}
     */
    public SendVideoNote duration(int duration) {
        return add("duration", duration);
    }

}
