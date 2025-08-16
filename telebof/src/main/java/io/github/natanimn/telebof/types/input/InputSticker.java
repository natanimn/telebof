package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.types.media_and_service.MaskPosition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This object describes a sticker to be added to a sticker set.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9.4
 */
public abstract class InputSticker implements InputMedia {
    private String sticker;
    private StickerFormat format;
    private List<String> emoji_list, keywords;
    private MaskPosition mask_position;
    transient private boolean hasFile;
    transient private List<File> files = new ArrayList<>();

    /**
     * Required
     * @param sticker The added sticker. Pass an object of {@link File} to upload from your local machine.
     * @param format Format of the added sticker, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, {@link StickerFormat#VIDEO} for a .WEBM video
     * @param emoji_list List of 1-20 emoji associated with the sticker
     */
    public InputSticker(File sticker, StickerFormat format, String[] emoji_list) {
        this.sticker = "attach://"+sticker.getName();
        this.format = format;
        this.emoji_list = List.of(emoji_list);
        setHasFile(true);
        this.files.add(sticker);
    }

    /**
     * Required
     * @param sticker The added sticker. Pass a file_id as a String to send a file that already exists on the Telegram servers, or
     *               pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @param format Format of the added sticker, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, {@link StickerFormat#VIDEO} for a .WEBM video
     * @param emoji_list List of 1-20 emoji associated with the sticker
     */
    public InputSticker(String sticker, StickerFormat format, String[] emoji_list) {
        this.sticker = sticker;
        this.format = format;
        this.emoji_list = List.of(emoji_list);
        setHasFile(false);
    }

    /**
     * Optional
     * @param mask_position Position where the mask should be placed on faces. For “mask” stickers only.
     * @return {@link InputSticker}
     */
    public InputSticker maskPosition(MaskPosition mask_position) {
        this.mask_position = mask_position;
        return this;
    }

    /**
     * Optional
     * @param keywords List of 0-20 search keywords for the sticker with total length of up to 64 characters.
     *                For {@link io.github.natanimn.telebof.enums.StickerType#REGULAR} and {@link io.github.natanimn.telebof.enums.StickerType#CUSTOM_EMOJI} stickers only.
     * @return {@link InputSticker}
     */
    public InputSticker keywords(String[] keywords) {
        this.keywords = List.of(keywords);
        return this;
    }

    /**
     * Used only for internal purpose
     * @param has has
     */
    private void setHasFile(boolean has){
        this.hasFile = has;
    }

    /**
     * Used only for internal purpose
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return hasFile;
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