package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.types.media_and_service.MaskPosition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This object describes a sticker to be added to a sticker set.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public abstract class InputSticker implements InputMedia {
    private String sticker;
    private StickerFormat format;

    @SerializedName("emoji_list")
    private List<String> emojiList;

    private List<String> keywords;

    @SerializedName("mask_position")
    private MaskPosition maskPosition;

    transient private List<File> files = new ArrayList<>();

    /**
     * Required
     * @param sticker The added sticker. Pass an object of {@link File} to upload from your local machine.
     * @param format Format of the added sticker, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, {@link StickerFormat#VIDEO} for a .WEBM video
     * @param emojiList List of 1-20 emoji associated with the sticker
     */
    public InputSticker(File sticker, StickerFormat format, String[] emojiList) {
        this.sticker = "attach://"+sticker.getName();
        this.format = format;
        this.emojiList = List.of(emojiList);
        this.files.add(sticker);
    }

    /**
     * Required
     * @param sticker The added sticker. Pass a file_id as a String to send a file that already exists on the Telegram servers, or
     *               pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @param format Format of the added sticker, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, {@link StickerFormat#VIDEO} for a .WEBM video
     * @param emojiList List of 1-20 emoji associated with the sticker
     */
    public InputSticker(String sticker, StickerFormat format, String[] emojiList) {
        this.sticker = sticker;
        this.format = format;
        this.emojiList = List.of(emojiList);
    }

    /**
     * Optional
     * @param maskPosition Position where the mask should be placed on faces. For “mask” stickers only.
     * @return {@link InputSticker}
     */
    public InputSticker setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    /**
     * Optional
     * @param keywords List of 0-20 search keywords for the sticker with total length of up to 64 characters.
     *                For {@link io.github.natanimn.telebof.enums.StickerType#REGULAR} and {@link io.github.natanimn.telebof.enums.StickerType#CUSTOM_EMOJI} stickers only.
     * @return {@link InputSticker}
     */
    public InputSticker setKeywords(String[] keywords) {
        this.keywords = List.of(keywords);
        return this;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return !files.isEmpty();
    }

    /**
     * Used only for internal purpose
     * @return List of files
     */
    @Override
    public List<File> getFiles() {
        return files;
    }

}