package io.github.natanimn.types;

import java.io.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputFile{
    public File file;
    public String contentType;

    public InputFile(File file, String contentType){
        this.file = file;
        this.contentType = contentType;
    }
}
