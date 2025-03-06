package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Sticker implements Serializable {
    public String file_id, file_unique_id, type;
    public Integer width, height;
    public Boolean is_animated, is_video;
    public PhotoSize thumbnail;
    public String emoji, setName;
    public File premium_animation;
    public MaskPosition mask_position;
    public String custom_emoji_id;
    public Boolean needs_repainting;
    public Integer file_size;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Sticker sticker = (Sticker) object;
        return Objects.equals(file_id, sticker.file_id) && Objects.equals(file_unique_id, sticker.file_unique_id) &&
                Objects.equals(type, sticker.type) && Objects.equals(width, sticker.width) &&
                Objects.equals(height, sticker.height) && Objects.equals(is_animated, sticker.is_animated) &&
                Objects.equals(is_video, sticker.is_video) && Objects.equals(thumbnail, sticker.thumbnail) &&
                Objects.equals(emoji, sticker.emoji) && Objects.equals(setName, sticker.setName) &&
                Objects.equals(premium_animation, sticker.premium_animation) &&
                Objects.equals(mask_position, sticker.mask_position) &&
                Objects.equals(custom_emoji_id, sticker.custom_emoji_id) &&
                Objects.equals(needs_repainting, sticker.needs_repainting) && Objects.equals(file_size, sticker.file_size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, type, width, height, is_animated, is_video, thumbnail, emoji,
                setName, premium_animation, mask_position, custom_emoji_id, needs_repainting, file_size);
    }
}
