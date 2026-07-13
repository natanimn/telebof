package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.RichTextType;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents a rich formatted text.
 * @author Natanim
 * @since 2.1
 */
public class RichText {
    /**
     * Type of the rich text
     */
    private RichTextType type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The Unix time associated with the entity. Available for {@link RichTextType#DATE_TIME}
     */
    @SerializedName("unix_time")
    private Integer unixTime;

    /**
     * The string that defines the formatting of the date and time. Available for {@link RichTextType#DATE_TIME}
     */
    @SerializedName("date_time_format")
    private String dateTimeFormat;

    /**
     * The mentioned user. Available for {@link RichTextType#TEXT_MENTION}
     */
    private User user;

    /**
     * Unique identifier of the custom emoji. Available for {@link RichTextType#CUSTOM_EMOJI}
     */
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    /**
     * Alternative emoji for the custom emoji. Available for {@link RichTextType#CUSTOM_EMOJI}
     */
    @SerializedName("alternative_text")
    private String alternativeText;

    /**
     * The expression in LaTeX format. Available for {@link RichTextType#MATHEMATICAL_EXPRESSION}
     */
    private String expression;

    /**
     * A text with an email address. Available for {@link RichTextType#URL}
     */
    private String url;

    /**
     * Alternative emoji for the custom emoji. Available for {@link RichTextType#EMAIL_ADDRESS}
     */
    @SerializedName("email_address")
    private String emailAddress;

    /**
     * A text with a phone number. Available for {@link RichTextType#PHONE_NUMBER}
     */
    @SerializedName("phone_number")
    private String phoneNumber;

    /**
     * A text with a phone number. Available for {@link RichTextType#BANK_CARD_NUMBER}
     */
    @SerializedName("bank_card_number")
    private String bankCardNumber;

    /**
     * A mention by a username. Available for {@link RichTextType#MENTION}
     */
    private String username;

    /**
     * The hashtag. Available for {@link RichTextType#HASHTAG}
     */
    private String hashtag;

    /**
     * The cashtag. Available for {@link RichTextType#CASHTAG}
     */
    private String cashtag;

    /**
     * A bot command. Available for {@link RichTextType#BOT_COMMAND}
     */
    @SerializedName("bot_command")
    private String botCommand;

    /**
     * The name of the anchor. Available for {@link RichTextType#ANCHOR}
     */
    private String name;

    /**
     * The name of the anchor. If the name is empty, then the link brings back to the top of the message.
     * Available for {@link RichTextType#ANCHOR_LINK}
     */
    @SerializedName("anchor_name")
    private String anchorName;

    /**
     * A reference. Available for {@link RichTextType#REFERENCE}
     */
    private String reference;

    /**
     * A link to a reference. A bot command. Available for {@link RichTextType#REFERENCE_LINK}
     */
    @SerializedName("reference_name")
    private String referenceName;

    public RichTextType getType() {
        return type;
    }

    public RichText getText() {
        return text;
    }

    public Integer getUnixTime() {
        return unixTime;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public User getUser() {
        return user;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public String getAlternativeText() {
        return alternativeText;
    }

    public String getExpression() {
        return expression;
    }

    public String getUrl() {
        return url;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getHashtag() {
        return hashtag;
    }

    public String getCashtag() {
        return cashtag;
    }

    public String getBotCommand() {
        return botCommand;
    }

    public String getName() {
        return name;
    }

    public String getAnchorName() {
        return anchorName;
    }

    public String getReference() {
        return reference;
    }

    public String getReferenceName() {
        return referenceName;
    }
}
