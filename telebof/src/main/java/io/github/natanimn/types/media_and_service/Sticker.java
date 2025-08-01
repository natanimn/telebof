package io.github.natanimn.types.media_and_service;

import io.github.natanimn.enums.StickerType;
import java.io.Serializable;
import java.util.Objects;

/**
 * This class represents a sticker.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class Sticker implements Serializable {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    public String file_id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    public String file_unique_id;

    /**
     * Type of the sticker.
     * The type of the sticker is independent of its format, which is determined by the fields is_animated and is_video.
     */
    public StickerType type;

    /**
     * Sticker width
     */
    public Integer width;

    /**
     * Sticker height
     */
    public Integer height;

    /**
     * True, if the sticker is <a href="https://telegram.org/blog/animated-stickers">animated</a>
     */
    public Boolean is_animated;

    /**
     * True, if the sticker is <a href="https://telegram.org/blog/video-stickers-better-reactions">video sticker</a>
     */
    public Boolean is_video;

    /**
     * Sticker thumbnail in the .WEBP or .JPG format
     */
    public PhotoSize thumbnail;

    /**
     * Emoji associated with the sticker
     */
    public String emoji;

    /**
     * Name of the sticker set to which the sticker belongs
     */
    public String setName;

    /**
     * For premium regular stickers, premium animation for the sticker
     */
    public File premium_animation;

    /**
     * For mask stickers, the position where the mask should be placed
     */
    public MaskPosition mask_position;

    /**
     *  For custom emoji stickers, unique identifier of the custom emoji
     */
    public String custom_emoji_id;

    /**
     * True, if the sticker must be repainted to a text color in messages, the color of the Telegram Premium badge in emoji status,
     * white color on chat photos, or another appropriate color in other places
     */
    public Boolean needs_repainting;

    /**
     * File size in bytes
     */
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
