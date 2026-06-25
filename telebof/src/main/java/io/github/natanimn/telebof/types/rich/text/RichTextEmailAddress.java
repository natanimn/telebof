package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A text with an email address.
 * @author Natanim
 * @since 2.1
 */
public class RichTextEmailAddress implements RichText {
    /**
     * Type of the rich text, always “email_address”
     */
    private final String type = "email_address";

    private final RichText text;

    @SerializedName("email_address")
    private final String emailAddress;

    /**
     * Required
     * @param text The text
     * @param emailAddress The email address
     */
    public RichTextEmailAddress(String text, String emailAddress){
        this.text = new RichTextImpl(text, type);
        this.emailAddress = emailAddress;
    }

    /**
     * Required
     * @param text The text
     * @param emailAddress The email address
     */
    public RichTextEmailAddress(RichText text, String emailAddress){
        this.text = text;
        this.emailAddress = emailAddress;
    }
}
