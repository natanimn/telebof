package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EncryptedCredentials implements Serializable {
    public String data, hash, secret;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EncryptedCredentials that = (EncryptedCredentials) object;
        return Objects.equals(data, that.data) && Objects.equals(hash, that.hash) && Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, hash, secret);
    }
}
