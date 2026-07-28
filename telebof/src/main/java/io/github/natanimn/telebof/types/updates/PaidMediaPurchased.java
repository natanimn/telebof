package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This class contains information about a paid media purchase.
 * @author Natanim
 * @since 17 April 2025
 */
@Getter
public class PaidMediaPurchased implements TelegramUpdate, JsonFormatter {
    /**
     * User who purchased the media
     */
    private User from;

    /**
     * Bot-specified paid media payload
     */
    @SerializedName("paid_media_payload")
    private String paidMediaPayload;
}