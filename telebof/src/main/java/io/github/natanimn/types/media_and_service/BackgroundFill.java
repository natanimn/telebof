package io.github.natanimn.types.media_and_service;

import java.util.List;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class BackgroundFill {
    public String type;
    public Integer color, top_color, bottom_color, rotation_angle;
    public List<Integer> colors;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BackgroundFill that = (BackgroundFill) object;
        return Objects.equals(type, that.type) &&
                Objects.equals(color, that.color) &&
                Objects.equals(top_color, that.top_color) &&
                Objects.equals(bottom_color, that.bottom_color) &&
                Objects.equals(rotation_angle, that.rotation_angle) &&
                Objects.equals(colors, that.colors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, top_color, bottom_color, rotation_angle, colors);
    }
}
