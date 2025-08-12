package io.github.natanimn.types.input;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputPaidMediaPhoto implements InputPaidMedia {
    private String type;
    private String media;
    private transient Boolean hasFile;
    private transient List<File> files = new ArrayList<>();

    public InputPaidMediaPhoto(String media){
        this.type = "photo";
        this.media = media;
        this.hasFile = false;
    }

    public InputPaidMediaPhoto(File media){
        this.type = "photo";
        this.media = "attach://" + media.getName();
        this.hasFile = true;
        this.files.add(media);
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public boolean hasFile() {
        return hasFile;
    }
}
