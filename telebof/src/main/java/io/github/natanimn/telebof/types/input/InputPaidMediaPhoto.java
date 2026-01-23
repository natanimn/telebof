package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a photo.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputPaidMediaPhoto implements InputPaidMedia {
    private final String type = "photo";
    private String media;
    transient private final List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputPaidMediaPhoto(String media) {
        this.media = media;
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputPaidMediaPhoto(File media) {
        this.media = "attach://" + media.getName();
        this.files.add(media);
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