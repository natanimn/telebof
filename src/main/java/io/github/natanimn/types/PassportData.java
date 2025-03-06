package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class PassportData implements Serializable {
    public List<EncryptedPassportElement> data;
    public EncryptedCredentials credentials;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PassportData that = (PassportData) object;
        return Objects.equals(data, that.data) && Objects.equals(credentials, that.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, credentials);
    }
}
