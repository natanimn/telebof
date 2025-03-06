package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class WebAppData implements Serializable {
    public String data, button_text;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        WebAppData that = (WebAppData) object;
        return Objects.equals(data, that.data) && Objects.equals(button_text, that.button_text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, button_text);
    }

    @Override
    public String toString() {
        return "WebAppData{" +
                "data='" + data + '\'' +
                ", button_text='" + button_text + '\'' +
                '}';
    }
}
