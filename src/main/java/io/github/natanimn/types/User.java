package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;
import io.github.natanimn.Util;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class User implements Serializable {
    public long id;
    public Boolean is_bot, is_premium, added_to_attachment_menu, can_join_groups,
            can_read_all_group_messages, supports_inline_queries, can_connect_to_business;
    public String first_name, last_name, language_code, username;

    public String mention(){
        // Do not forget to set parseMode to ParseMode.HTML
        String name = Util.escapeHtml(first_name + (last_name != null ? last_name : ""));
        return String.format("<a href='tg://user?id=%d'>%s</a>", id, name);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id && Objects.equals(is_bot, user.is_bot) && Objects.equals(is_premium, user.is_premium) &&
                Objects.equals(added_to_attachment_menu, user.added_to_attachment_menu) &&
                Objects.equals(can_join_groups, user.can_join_groups) &&
                Objects.equals(can_read_all_group_messages, user.can_read_all_group_messages) &&
                Objects.equals(supports_inline_queries, user.supports_inline_queries) &&
                Objects.equals(can_connect_to_business, user.can_connect_to_business) &&
                Objects.equals(first_name, user.first_name) && Objects.equals(last_name, user.last_name) &&
                Objects.equals(language_code, user.language_code) && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, is_bot, is_premium, added_to_attachment_menu, can_join_groups,
                can_read_all_group_messages, supports_inline_queries, can_connect_to_business, first_name, last_name,
                language_code, username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", is_bot=" + is_bot +
                ", is_premium=" + is_premium +
                ", added_to_attachment_menu=" + added_to_attachment_menu +
                ", can_join_groups=" + can_join_groups +
                ", can_read_all_group_messages=" + can_read_all_group_messages +
                ", supports_inline_queries=" + supports_inline_queries +
                ", can_connect_to_business=" + can_connect_to_business +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", language_code='" + language_code + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}


