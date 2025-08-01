package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class StickerSet implements Serializable {
    public String name, title, sticker_type;
    public List<Sticker> stickers;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        StickerSet that = (StickerSet) object;
        return Objects.equals(name, that.name) && Objects.equals(title, that.title) &&
                Objects.equals(sticker_type, that.sticker_type) && Objects.equals(stickers, that.stickers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, sticker_type, stickers);
    }
}
