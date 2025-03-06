package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class UsersShared implements Serializable {
    public int request_id;
    public List<SharedUser> users;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UsersShared that = (UsersShared) object;
        return request_id == that.request_id && Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request_id, users);
    }
}
