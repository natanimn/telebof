package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.util.List;

/**
 * A static profile photo in the .JPG format.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class InputProfilePhotoStatic implements InputProfilePhoto {
    private String photo, type;
    private File file;

    /**
     * Required
     * @param photo The static profile photo.
     */
    public InputProfilePhotoStatic(File photo){
        this.photo = "attach://"+photo.getName();
        this.file  = photo;
        this.type  = "static";
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
