package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ChatInviteLink implements Serializable {
    public String invite_link, name;
    public User creator;
    public Integer expire_date, member_limit, pending_join_request_count;
    public Boolean is_primary, is_revoked, creates_join_request;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatInviteLink that = (ChatInviteLink) object;
        return Objects.equals(invite_link, that.invite_link) &&
                Objects.equals(name, that.name) && Objects.equals(creator, that.creator) &&
                Objects.equals(expire_date, that.expire_date) &&
                Objects.equals(member_limit, that.member_limit) &&
                Objects.equals(pending_join_request_count, that.pending_join_request_count) &&
                Objects.equals(is_primary, that.is_primary) && Objects.equals(is_revoked, that.is_revoked) &&
                Objects.equals(creates_join_request, that.creates_join_request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invite_link, name, creator, expire_date, member_limit, pending_join_request_count,
                is_primary, is_revoked, creates_join_request);
    }
}
