package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BackgroundType {
    public String type, theme_name;
    public BackgroundFill fill;
    public Integer dark_theme_dimming, intensity;
    public Document document;
    public Boolean is_blurred, is_moving, is_inverted;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BackgroundType that = (BackgroundType) object;
        return Objects.equals(type, that.type) &&
                Objects.equals(theme_name, that.theme_name) &&
                Objects.equals(fill, that.fill) &&
                Objects.equals(dark_theme_dimming, that.dark_theme_dimming) &&
                Objects.equals(intensity, that.intensity) &&
                Objects.equals(document, that.document) &&
                Objects.equals(is_blurred, that.is_blurred) &&
                Objects.equals(is_moving, that.is_moving) &&
                Objects.equals(is_inverted, that.is_inverted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, theme_name, fill, dark_theme_dimming, intensity, document, is_blurred, is_moving, is_inverted);
    }
}
