package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class TextQuote implements Serializable {
    public String text;
    public List<MessageEntity> entities;
    public Integer position;
    public Boolean is_manual;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TextQuote textQuote = (TextQuote) object;
        return Objects.equals(text, textQuote.text) && Objects.equals(entities, textQuote.entities) &&
                Objects.equals(position, textQuote.position) && Objects.equals(is_manual, textQuote.is_manual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, entities, position, is_manual);
    }
}
