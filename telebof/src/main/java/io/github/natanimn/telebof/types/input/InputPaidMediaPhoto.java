package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a photo.
 * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
 * @param files List of files to be uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputPaidMediaPhoto(
        String media,
        List<File> files
) implements InputPaidMedia {

    @Override
    public String type() {
        return "photo";
    }

    @Override
    public boolean hasFile() {
        return files != null && !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    /**
     * Creates a new InputPaidMediaPhoto
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public static InputPaidMediaPhoto fromString(String media) {
        return new InputPaidMediaPhoto(media, new ArrayList<>());
    }

    /**
     * Creates a new InputPaidMediaPhoto
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public static InputPaidMediaPhoto fromFile(File media) {
        List<File> files = new ArrayList<>();
        files.add(media);
        return new InputPaidMediaPhoto("attach://" + media.getName(), files);
    }
}