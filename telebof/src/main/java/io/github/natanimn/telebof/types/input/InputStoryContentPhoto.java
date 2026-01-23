package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Describes a photo to post as a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class InputStoryContentPhoto implements InputStoryContent {
    private final String type = "photo";
    private String photo;
    transient private File file;

    /**
     * Required
     * @param photo The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB
     */
    public InputStoryContentPhoto(File photo) {
        this.file = photo;
        this.photo = "attach://" + photo.getName();
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return true;
    }

    /**
     * Used only for internal purpose
     * @return List of files
     */
    @Override
    public List<File> getFiles() {
        return List.of(file);
    }
}