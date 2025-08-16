package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * This object represents the content of a media message to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9.4
 */
public interface InputMedia extends Serializable {
    /**
     * Used only for internal purpose
     * @return boolean
     */
    boolean hasFile();

    /**
     * Used only for internal purpose
     * @return boolean
     */
    List<File> getFiles();
}
