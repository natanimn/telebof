package io.github.natanimn.types.input;


import io.github.natanimn.types.media_and_service.InputFile;

public interface  InputMedia {
    boolean isFile();
    InputFile getInputFile();
    boolean hasThumbnailFile();
    InputFile getThumbnailFile();
}
