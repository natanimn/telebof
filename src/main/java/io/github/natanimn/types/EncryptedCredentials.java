package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
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
