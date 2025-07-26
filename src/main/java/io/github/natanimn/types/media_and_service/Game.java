package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class Game implements Serializable {
    public String title, description;
    public List<PhotoSize> photo;
    public String text;
    public List<MessageEntity> text_entities;
    public Animation animation;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Game game = (Game) object;
        return Objects.equals(title, game.title) && Objects.equals(description, game.description) &&
                Objects.equals(photo, game.photo) && Objects.equals(text, game.text) &&
                Objects.equals(text_entities, game.text_entities) && Objects.equals(animation, game.animation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, photo, text, text_entities, animation);
    }
}
