package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * Describes a photo to post as a story.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class InputStoryContentVideo implements InputStoryContent{
    transient private File file;
    private String type, video;
    private Double duration, cover_frame_timestamp;
    private Boolean is_animation;

    /**
     * Required
     * @param video The video to post as a story.
     *              The video must be of the size 720x1280, streamable, encoded with H.265 codec, with key frames added each second in the MPEG4 format, and must not exceed 30 MB.
     */
    public InputStoryContentVideo(File video){
        this.video = "attach://"+video.getName();
        this.type  = "video";
        this.file  = video;
    }

    /**
     * Optional.
     * @param duration Precise duration of the video in seconds; 0-60
     * @return {@link InputStoryContentVideo}
     */
    public InputStoryContentVideo duration(double duration){
        this.duration = duration;
        return this;
    }

    /**
     * Optional
     * @param cover_frame_timestamp Timestamp in seconds of the frame that will be used as the static cover for the story. Defaults to 0.0.
     * @return {@link InputStoryContentVideo}
     */
    public InputStoryContentVideo coverFrameTimestamp(double cover_frame_timestamp){
        this.cover_frame_timestamp = cover_frame_timestamp;
        return this;
    }

    /**
     * Optional
     * @param is_animation Pass True if the video has no sound
     * @return {@link InputStoryContentVideo}
     */
    public InputStoryContentVideo isAnimation(boolean is_animation){
        this.is_animation = is_animation;
        return this;
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
