package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Describes a photo to post as a story.
 * @param photo The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB
 * @param file The file object for internal use
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record InputStoryContentPhoto(
        String photo,
        File file
) implements InputStoryContent {

    @Override
    public String type() {
        return "photo";
    }

    @Override
    public boolean hasFile() {
        return true;
    }

    @Override
    public List<File> getFiles() {
        return List.of(file);
    }

    /**
     * Creates a new InputStoryContentPhoto
     * @param photo The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB
     */
    public static InputStoryContentPhoto fromFile(File photo) {
        return new InputStoryContentPhoto("attach://" + photo.getName(), photo);
    }
}