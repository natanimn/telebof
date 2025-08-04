package io.github.natanimn.types.media_and_service;

import java.io.File;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class InputFile{
    public File file;
    public String contentType;

    public InputFile(File file, String contentType){
        this.file = file;
        this.contentType = contentType;
    }
}
