package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * This class contains information about a paid media purchase.
 * @param from User who purchased the media
 * @param paidMediaPayload Bot-specified paid media payload
 * @author Natanim
 * @since 17 April 2025
 * @version 1.3.0
 */
public record PaidMediaPurchased(
        User from,
        @SerializedName("paid_media_payload") String paidMediaPayload
) implements TelegramUpdate {}