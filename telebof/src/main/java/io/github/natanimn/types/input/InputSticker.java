package io.github.natanimn.types.input;

import io.github.natanimn.requests.service.MediaContentType;
import io.github.natanimn.types.media_and_service.InputFile;
import io.github.natanimn.types.media_and_service.MaskPosition;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public abstract class InputSticker implements InputMedia {
    private String sticker, format;
    private List<String> emoji_list, keywords;
    private MaskPosition mask_position;
    transient private boolean hasFile;
    transient private List<File> files = new ArrayList<>();

    public InputSticker(File sticker, String format) {
        this.sticker = "attach://"+sticker.getName();
        this.format = format;
        setHasFile(true);
        this.files.add(sticker);
    }

    public InputSticker(String sticker, String format) {
        this.sticker = sticker;
        this.format = format;
        setHasFile(false);
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

    private void setHasFile(boolean has){
        this.hasFile = has;
    }

    @Override
    public boolean hasFile() {
        return hasFile;
    }

    @Override
    public List<File> getFiles() {
        return List.of();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InputSticker that = (InputSticker) object;
        return Objects.equals(sticker, that.sticker) && Objects.equals(format, that.format) &&
                Objects.equals(emoji_list, that.emoji_list) && Objects.equals(keywords, that.keywords) &&
                Objects.equals(mask_position, that.mask_position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sticker, format, emoji_list, keywords, mask_position);
    }
}