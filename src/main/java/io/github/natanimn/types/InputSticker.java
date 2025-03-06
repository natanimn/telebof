package io.github.natanimn.types;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InputSticker implements InputMedia, Serializable {
    private String sticker, format;
    private List<String> emoji_list, keywords;
    private MaskPosition mask_position;
    private boolean isFile;
    transient private InputFile inputFile;

    public InputSticker(File sticker, String format) {
        this.sticker = "attach://"+sticker.getName();
        this.format = format;
        this.inputFile = new InputFile(sticker, MediaContentType.PHOTO);
        isFile = true;
    }

    public InputSticker(String sticker, String format) {
        this.sticker = sticker;
        this.format = format;
        isFile = false;
    }

    public InputSticker emojiList(String[] emojiList) {
        this.emoji_list = List.of(emojiList);
        return this;
    }

    public InputSticker maskPosition(MaskPosition maskPosition) {
        this.mask_position = maskPosition;
        return this;
    }

    public InputSticker keywords(String[] keywords) {
        this.keywords = List.of(keywords);
        return this;
    }

    @Override
    public boolean isFile() {
        return isFile;
    }

    @Override
    public InputFile getInputFile() {
        return null;
    }

    @Override
    public InputFile getThumbnailFile() {
        return null;
    }

    @Override
    public boolean hasThumbnailFile() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InputSticker that = (InputSticker) object;
        return Objects.equals(sticker, that.sticker) && Objects.equals(format, that.format) &&
                Objects.equals(emoji_list, that.emoji_list) && Objects.equals(keywords, that.keywords) &&
                Objects.equals(mask_position, that.mask_position) && Objects.equals(inputFile, that.inputFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sticker, format, emoji_list, keywords, mask_position, inputFile);
    }
}