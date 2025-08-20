package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * An animated profile photo in the MPEG4 format.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class InputProfilePhotoAnimated implements InputProfilePhoto {
    private String animation, type;
    transient private File file;
    private Double main_frame_timestamp;

    /**
     * Required
     * @param animation The animated profile photo.
     */
    public InputProfilePhotoAnimated(File animation){
        this.animation = "attach://"+animation.getName();
        this.file      = animation;
        this.type      = "animated";
    }

    /**
     * Optional
     * @param main_frame_timestamp Timestamp in seconds of the frame that will be used as the static profile photo. Defaults to 0.0
     * @return {@link InputProfilePhotoAnimated}
     */
    public InputProfilePhotoAnimated mainFrameTimestamp(double main_frame_timestamp){
        this.main_frame_timestamp = main_frame_timestamp;
        return this;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    public boolean hasFile(){
        return true;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    public List<File> getFiles(){
        return List.of(file);
    }
}
