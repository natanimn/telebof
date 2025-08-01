package io.github.natanimn.types.media_and_service;


import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class Document implements Serializable {
    public String file_id, file_unique_id, file_name, mime_type;
    public Integer file_size;
    public PhotoSize thumbnail;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Document document = (Document) object;
        return Objects.equals(file_id, document.file_id) && Objects.equals(file_unique_id, document.file_unique_id) &&
                Objects.equals(file_name, document.file_name) && Objects.equals(mime_type, document.mime_type) &&
                Objects.equals(file_size, document.file_size) && Objects.equals(thumbnail, document.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_name, mime_type, file_size, thumbnail);
    }
}
