package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sticker file to be sent.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class InputMediaSticker implements InputMedia, InputPollOptionMedia{
    private final String type = "sticker";
    private String media;
    private transient final List<File> files = new ArrayList<>();

    private String emoji;

    /**
     * Constructor
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a .WEBP sticker from the Internet
     */
    public InputMediaSticker(String media){
        this.media = media;
    }

    /**
     * Constructor
     * @param media File to send. Upload a new .WEBP, .TGS, or .WEBM sticker
     */
    public InputMediaSticker(File media){
        this.media = "attach://" + media.getName();
        files.add(media);
    }

    public InputMediaSticker setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    @Override
    public boolean hasFile() {
        return !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }
}
