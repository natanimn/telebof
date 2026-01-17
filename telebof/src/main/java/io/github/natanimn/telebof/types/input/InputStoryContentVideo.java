package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.List;

/**
 * Describes a video to post as a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class InputStoryContentVideo implements InputStoryContent {
    private final String type = "video";
    private String video;
    private Double duration;

    @SerializedName("cover_frame_timestamp")
    private Double coverFrameTimestamp;

    @SerializedName("is_animation")
    private Boolean isAnimation;

    transient private File file;

    /**
     * Required
     * @param video The video to post as a story. The video must be of the size 720x1280, streamable, encoded with H.265 codec, with key frames added each second in the MPEG4 format, and must not exceed 30 MB.
     */
    public InputStoryContentVideo(File video) {
        this.file = video;
        this.video = "attach://" + video.getName();
    }

    /**
     * @param duration Precise duration of the video in seconds; 0-60
     * @return this
     */
    public InputStoryContentVideo setDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    /**
     * @param coverFrameTimestamp Timestamp in seconds of the frame that will be used as the static cover for the story. Defaults to 0.0.
     * @return this
     */
    public InputStoryContentVideo setCoverFrameTimestamp(Double coverFrameTimestamp) {
        this.coverFrameTimestamp = coverFrameTimestamp;
        return this;
    }

    /**
     * @param isAnimation Pass True if the video has no sound
     * @return this
     */
    public InputStoryContentVideo setIsAnimation(Boolean isAnimation) {
        this.isAnimation = isAnimation;
        return this;
    }

    @Override
    public boolean hasFile() {
        return true;
    }

    @Override
    public List<File> getFiles() {
        return List.of(file);
    }
}