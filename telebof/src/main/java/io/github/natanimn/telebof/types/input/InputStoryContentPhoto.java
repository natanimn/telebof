package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Describes a photo to post as a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class InputStoryContentPhoto implements InputStoryContent{
    transient private File file;
    private String type, photo;

    /**
     * Required
     * @param photo The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB
     */
    public InputStoryContentPhoto(File photo){
        this.photo = "attach://"+photo.getName();
        this.type  = "photo";
        this.file  = photo;
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
