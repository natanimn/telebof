package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ChatPhoto implements Serializable {
    public String small_file_id, small_file_unique_id, big_file_id, big_file_unique_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatPhoto chatPhoto = (ChatPhoto) object;
        return Objects.equals(small_file_id, chatPhoto.small_file_id) &&
                Objects.equals(small_file_unique_id, chatPhoto.small_file_unique_id) &&
                Objects.equals(big_file_id, chatPhoto.big_file_id) &&
                Objects.equals(big_file_unique_id, chatPhoto.big_file_unique_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(small_file_id, small_file_unique_id, big_file_id, big_file_unique_id);
    }
}
