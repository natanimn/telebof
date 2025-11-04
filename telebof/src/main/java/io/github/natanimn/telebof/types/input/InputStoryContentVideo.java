package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.List;

/**
 * Describes a video to post as a story.
 * @param video The video to post as a story. The video must be of the size 720x1280, streamable, encoded with H.265 codec, with key frames added each second in the MPEG4 format, and must not exceed 30 MB.
 * @param duration Optional. Precise duration of the video in seconds; 0-60
 * @param coverFrameTimestamp Optional. Timestamp in seconds of the frame that will be used as the static cover for the story. Defaults to 0.0.
 * @param isAnimation Optional. Pass True if the video has no sound
 * @param file The file object for internal use
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record InputStoryContentVideo(
        String video,
        Double duration,
        @SerializedName("cover_frame_timestamp") Double coverFrameTimestamp,
        @SerializedName("is_animation") Boolean isAnimation,
        File file
) implements InputStoryContent {

    @Override
    public String type() {
        return "video";
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
     * Creates a new InputStoryContentVideo builder
     * @param video The video to post as a story. The video must be of the size 720x1280, streamable, encoded with H.265 codec, with key frames added each second in the MPEG4 format, and must not exceed 30 MB.
     */
    public static InputStoryContentVideoBuilder builder(File video) {
        return new InputStoryContentVideoBuilder(video);
    }

    /**
     * Builder class for InputStoryContentVideo
     */
    public static class InputStoryContentVideoBuilder {
        private final File video;
        private Double duration;
        private Double coverFrameTimestamp;
        private Boolean isAnimation;

        public InputStoryContentVideoBuilder(File video) {
            this.video = video;
        }

        public InputStoryContentVideoBuilder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        public InputStoryContentVideoBuilder coverFrameTimestamp(Double coverFrameTimestamp) {
            this.coverFrameTimestamp = coverFrameTimestamp;
            return this;
        }

        public InputStoryContentVideoBuilder isAnimation(Boolean isAnimation) {
            this.isAnimation = isAnimation;
            return this;
        }

        public InputStoryContentVideo build() {
            return new InputStoryContentVideo(
                    "attach://" + video.getName(),
                    duration,
                    coverFrameTimestamp,
                    isAnimation,
                    video
            );
        }
    }
}