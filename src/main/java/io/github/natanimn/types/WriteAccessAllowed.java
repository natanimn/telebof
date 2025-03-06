package io.github.natanimn.types;


import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class WriteAccessAllowed implements Serializable {
    public String web_app_name;
    public Boolean from_request, from_attachment_menu;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        WriteAccessAllowed that = (WriteAccessAllowed) object;
        return Objects.equals(web_app_name, that.web_app_name) && Objects.equals(from_request, that.from_request) &&
                Objects.equals(from_attachment_menu, that.from_attachment_menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(web_app_name, from_request, from_attachment_menu);
    }
}
