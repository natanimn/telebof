package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.StickerType;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a sticker.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Sticker {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @SerializedName("file_id")
    private String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @SerializedName("file_unique_id")
    private String fileUniqueId;

    /**
     * Type of the sticker. The type of the sticker is independent of its format, which is determined by the fields is_animated and is_video.
     */
    private StickerType type;

    /**
     * Sticker width
     */
    private Integer width;

    /**
     * Sticker height
     */
    private Integer height;

    /**
     * True, if the sticker is animated
     */
    @SerializedName("is_animated")
    private Boolean isAnimated;

    /**
     * True, if the sticker is video sticker
     */
    @SerializedName("is_video")
    private Boolean isVideo;

    /**
     * Sticker thumbnail in the .WEBP or .JPG format
     */
    private PhotoSize thumbnail;

    /**
     * Emoji associated with the sticker
     */
    private String emoji;

    /**
     * Name of the sticker set to which the sticker belongs
     */
    @SerializedName("set_name")
    private String setName;

    /**
     * For premium regular stickers, premium animation for the sticker
     */
    @SerializedName("premium_animation")
    private File premiumAnimation;

    /**
     * For mask stickers, the position where the mask should be placed
     */
    @SerializedName("mask_position")
    private MaskPosition maskPosition;

    /**
     * For custom emoji stickers, unique identifier of the custom emoji
     */
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    /**
     * True, if the sticker must be repainted to a text color in messages, the color of the Telegram Premium badge in emoji status, white color on chat photos, or another appropriate color in other places
     */
    @SerializedName("needs_repainting")
    private Boolean needsRepainting;

    /**
     * File size in bytes
     */
    @SerializedName("file_size")
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public StickerType getType() {
        return type;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean getIsAnimated() {
        return isAnimated;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getSetName() {
        return setName;
    }

    public File getPremiumAnimation() {
        return premiumAnimation;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public Boolean getNeedsRepainting() {
        return needsRepainting;
    }

    public Integer getFileSize() {
        return fileSize;
    }
}