package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Represents an HTTP link to be sent.
 * @author Natanim
 * @since 2.1
 */
public class InputMediaLink implements InputPollOptionMedia{
    /**
     * Type of the media, must be link
     */
    private final String type = "link";

    private final String url;

    /**
     * Required
     * @param url HTTP URL of the link
     */
    public InputMediaLink(String url) {
        this.url = url;
    }

    @Override
    public boolean hasFile() {
        return false;
    }

    @Override
    public List<File> getFiles() {
        return List.of();
    }
}
