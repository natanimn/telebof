package io.github.natanimn.telebof.types.media_and_service;

import java.util.List;

/**
 * This object contains information about the quoted part of a message that is replied to by the given message.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class TextQuote {
    /**
     * Text of the quoted part of a message that is replied to by the given message
     */
    public String text;

    /**
     * Optional. Special entities that appear in the quote. Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are kept in quotes.
     */
    public List<MessageEntity> entities;

    /**
     * Approximate quote position in the original message in UTF-16 code units as specified by the sender
     */
    public Integer position;

    /**
     * Optional. True, if the quote was chosen manually by the message sender. Otherwise, the quote was added automatically by the server.
     */
    public Boolean is_manual;

}
