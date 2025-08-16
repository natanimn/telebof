package io.github.natanimn.telebof.types.chat_and_user;

import java.util.Objects;

/**
 * This object represents a chat photo.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatPhoto {
    /**
     * File identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    public String small_file_id;

    /**
     * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    public String small_file_unique_id;

    /**
     * File identifier of big (640x640) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    public String big_file_id;

    /**
     * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    public String big_file_unique_id;

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
