package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EncryptedPassportElement implements Serializable {
    public String type, data, phone_number, email;
    public List<PassportFile> files;
    public PassportFile front_side, reverse_side, selfie;
    public List<PassportFile> translation;
    public String hash;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EncryptedPassportElement that = (EncryptedPassportElement) object;
        return Objects.equals(type, that.type) && Objects.equals(data, that.data) &&
                Objects.equals(phone_number, that.phone_number) && Objects.equals(email, that.email) &&
                Objects.equals(files, that.files) && Objects.equals(front_side, that.front_side) &&
                Objects.equals(reverse_side, that.reverse_side) && Objects.equals(selfie, that.selfie) &&
                Objects.equals(translation, that.translation) && Objects.equals(hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data, phone_number, email, files, front_side, reverse_side, selfie, translation, hash);
    }
}
