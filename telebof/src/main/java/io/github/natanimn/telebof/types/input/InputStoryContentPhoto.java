package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Describes a photo to post as a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @param photo The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB
 */
public record InputStoryContentPhoto(String photo, File file) implements InputStoryContent{
    @Override
    public String type() {
        return "photo";
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

    public static InputStoryContentVideo.InputStoryContentVideoBuilder builder(File video) {
        return new InputStoryContentVideo.InputStoryContentVideoBuilder(video);
    }

    /**
     * Builder class for InputStoryContentPhoto
     */
    public static class InputStoryContentPhotoBuilder {
        private final File photo;

        public InputStoryContentPhotoBuilder(File photo) {
            this.photo = photo;
        }

        public InputStoryContentPhoto build() {
            return new InputStoryContentPhoto(
                    "attach://" + photo.getName(),
                    photo
            );
        }
    }
}
