package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.List;

/**
 * An animated profile photo in the MPEG4 format.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class InputProfilePhotoAnimated implements InputProfilePhoto {
    private final String type = "animated";
    private String animation;
    transient private File file;

    @SerializedName("main_frame_timestamp")
    private Double mainFrameTimestamp;

    /**
     * Required
     * @param animation The animated profile photo.
     */
    public InputProfilePhotoAnimated(File animation) {
        this.file = animation;
        this.animation = "attach://" + animation.getName();
    }

    /**
     * Optional.
     * @param mainFrameTimestamp in seconds of the frame that will be used as the static profile photo. Defaults to 0.0
     * @return this
     */
    public InputProfilePhotoAnimated setMainFrameTimestamp(Double mainFrameTimestamp) {
        this.mainFrameTimestamp = mainFrameTimestamp;
        return this;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    public boolean hasFile() {
        return true;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    public List<File> getFiles() {
        return List.of(file);
    }
}