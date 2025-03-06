package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputContactMessageContent implements Serializable {
    private String phone_number, first_name, last_name, vcard;

    public InputContactMessageContent(String phone_number, String first_name){
        this.phone_number = phone_number;
        this.first_name = first_name;
    }
    public InputContactMessageContent lastName(String lastName) {
        this.last_name = lastName;
        return this;
    }

    public InputContactMessageContent vcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

}
