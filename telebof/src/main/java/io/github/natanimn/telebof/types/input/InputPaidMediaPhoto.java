package io.github.natanimn.telebof.types.input;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The paid media to send is a photo.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputPaidMediaPhoto implements InputPaidMedia {
    private String type;
    private String media;
    private transient Boolean hasFile;
    private transient List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputPaidMediaPhoto(String media){
        this.type = "photo";
        this.media = media;
        this.hasFile = false;
    }

    /**
     * Required
     * @param media File to send. Pass an object of {@link File} to upload from your local machine.
     */
    public InputPaidMediaPhoto(File media){
        this.type = "photo";
        this.media = "attach://" + media.getName();
        this.hasFile = true;
        this.files.add(media);
    }

    /**
     * Used only for internal purpose
     * @return list of file
     */
    @Override
    public List<File> getFiles() {
        return files;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return hasFile;
    }
}
