package io.github.natanimn.types.chat_and_user;

import io.github.natanimn.types.media_and_service.PhotoSize;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ChatShared implements Serializable {
    public Integer request_id;
    public Long chat_id;
    public String title, username;
    public List<PhotoSize> photo;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatShared that = (ChatShared) object;
        return Objects.equals(request_id, that.request_id) && Objects.equals(chat_id, that.chat_id) &&
                Objects.equals(title, that.title) && Objects.equals(username, that.username) && Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request_id, chat_id, title, username, photo);
    }
}
