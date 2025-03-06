package io.github.natanimn.types;


public interface  InputMedia {
    boolean isFile();
    InputFile getInputFile();
    boolean hasThumbnailFile();
    InputFile getThumbnailFile();
}
