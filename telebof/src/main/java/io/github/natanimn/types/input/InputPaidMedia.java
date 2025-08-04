package io.github.natanimn.types.input;

import io.github.natanimn.types.media_and_service.InputFile;

import java.io.Serializable;

public interface InputPaidMedia extends Serializable {
    boolean isFile();
    InputFile getInputFile();
    boolean hasThumbnailFile();
    InputFile getThumbnailFile();
}
