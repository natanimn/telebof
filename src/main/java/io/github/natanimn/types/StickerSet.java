package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
