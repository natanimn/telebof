package io.github.natanimn.types.media_and_service;

import io.github.natanimn.enums.TypeReaction;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ReactionType implements Serializable {

    public TypeReaction type;
    public String emoji;
    public String custom_emoji_id;

    public ReactionType(TypeReaction reaction){
        this.type = reaction;
    }

    public void emoji(String emoji){
        this.emoji = emoji;
    }

    public void customEmojiId(String custom_emoji_id){
        this.custom_emoji_id = custom_emoji_id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReactionType that = (ReactionType) object;
        return Objects.equals(type, that.type) && Objects.equals(emoji, that.emoji) &&
                Objects.equals(custom_emoji_id, that.custom_emoji_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, emoji, custom_emoji_id);
    }
}
