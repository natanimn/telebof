package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This object contains information about the quoted part of a message that is replied to by the given message.
 * @author Natanim
 * @since 0.1
 * @version 1.3.0
 */
@Getter
public class TextQuote {
    /**
     * Text of the quoted part of a message that is replied to by the given message
     */
    private String text;

    /**
     * Optional. Special entities that appear in the quote.
     * Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are kept in quotes.
     */
    private List<MessageEntity> entities;

    /**
     * Approximate quote position in the original message in UTF-16 code units as specified by the sender
     */
    private Integer position;

    /**
     * Optional. True, if the quote was chosen manually by the message sender. Otherwise, the quote was added automatically by the server.
     */
    @SerializedName("is_manual")
    private Boolean isManual;

}