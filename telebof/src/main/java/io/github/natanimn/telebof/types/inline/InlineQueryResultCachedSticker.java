package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be sent by the user.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the sticker.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedSticker implements InlineQueryResult {
    @SerializedName("sticker_file_id")
    private String stickerFileId;
    private String type;
    private String id;
    @SerializedName("input_message_content")
    private InputTextMessageContent inputMessageContent;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param stickerFileId A valid file identifier of the sticker
     */
    public InlineQueryResultCachedSticker(String id, String stickerFileId) {
        this.type = "sticker";
        this.id = id;
        this.stickerFileId = stickerFileId;
    }

    /**
     * Optional
     * @param inputMessageContent Content of the message to be sent instead of the sticker
     * @return {@link InlineQueryResultCachedSticker}
     */
    public InlineQueryResultCachedSticker setInputMessageContent(InputTextMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultCachedSticker}
     */
    public InlineQueryResultCachedSticker setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }
}