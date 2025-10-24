package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * Interface for input media types
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public interface InputMediaInt extends InputMedia {
    String type();
    String media();
    String caption();
    ParseMode parseMode();
    MessageEntity[] captionEntities();
    List<File> getFiles();
    boolean hasFile();
}