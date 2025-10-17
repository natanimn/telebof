package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.StickerType;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a sticker.
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param type Type of the sticker. The type of the sticker is independent of its format, which is determined by the fields is_animated and is_video.
 * @param width Sticker width
 * @param height Sticker height
 * @param isAnimated True, if the sticker is animated
 * @param isVideo True, if the sticker is video sticker
 * @param thumbnail Sticker thumbnail in the .WEBP or .JPG format
 * @param emoji Emoji associated with the sticker
 * @param setName Name of the sticker set to which the sticker belongs
 * @param premiumAnimation For premium regular stickers, premium animation for the sticker
 * @param maskPosition For mask stickers, the position where the mask should be placed
 * @param customEmojiId For custom emoji stickers, unique identifier of the custom emoji
 * @param needsRepainting True, if the sticker must be repainted to a text color in messages, the color of the Telegram Premium badge in emoji status, white color on chat photos, or another appropriate color in other places
 * @param fileSize File size in bytes
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Sticker(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        StickerType type,
        Integer width,
        Integer height,
        @SerializedName("is_animated") Boolean isAnimated,
        @SerializedName("is_video") Boolean isVideo,
        PhotoSize thumbnail,
        String emoji,
        @SerializedName("set_name") String setName,
        @SerializedName("premium_animation") File premiumAnimation,
        @SerializedName("mask_position") MaskPosition maskPosition,
        @SerializedName("custom_emoji_id") String customEmojiId,
        @SerializedName("needs_repainting") Boolean needsRepainting,
        @SerializedName("file_size") Integer fileSize
) {}