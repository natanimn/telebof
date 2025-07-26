package io.github.natanimn.types.media_and_service;


import java.io.Serializable;
import java.util.Objects;

public  class Contact implements Serializable {
    public String phone_number, first_name, last_name, vcard;
    public Long user_id;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Contact contact = (Contact) object;
        return Objects.equals(phone_number, contact.phone_number) && Objects.equals(first_name, contact.first_name) &&
                Objects.equals(last_name, contact.last_name) && Objects.equals(vcard, contact.vcard) &&
                Objects.equals(user_id, contact.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone_number, first_name, last_name, vcard, user_id);
    }
}
