package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about the quoted part of a message that is replied to by the given message.
 * @param text Text of the quoted part of a message that is replied to by the given message
 * @param entities Optional. Special entities that appear in the quote. Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are kept in quotes.
 * @param position Approximate quote position in the original message in UTF-16 code units as specified by the sender
 * @param isManual Optional. True, if the quote was chosen manually by the message sender. Otherwise, the quote was added automatically by the server.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record TextQuote(
        String text,
        List<MessageEntity> entities,
        Integer position,
        @SerializedName("is_manual") Boolean isManual
) {}