package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;

public abstract class PassportElementError implements Serializable {

    private String source, type, message, file_hash;
    private List<String> file_hashes;

    public PassportElementError(String source, String type, String fileHash, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
        this.file_hash = fileHash;
    }

    public PassportElementError(String source, String type, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
    }

    public PassportElementError(String source, String type, String[] fileHashes, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
        this.file_hashes = List.of(fileHashes);

    }
}
