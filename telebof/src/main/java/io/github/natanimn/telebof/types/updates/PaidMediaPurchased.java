package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * This class contains information about a paid media purchase.
 * @author Natanim
 * @since 17 April 2025
 * @version 1.3.0
 */
public class PaidMediaPurchased implements TelegramUpdate {
    /**
     * User who purchased the media
     */
    private User from;

    /**
     * Bot-specified paid media payload
     */
    @SerializedName("paid_media_payload")
    private String paidMediaPayload;

    public User getFrom() {
        return from;
    }

    public String getPaidMediaPayload() {
        return paidMediaPayload;
    }

    @Override
    public String toString() {
        return "PaidMediaPurchased{" +
                "from=" + from +
                ", paidMediaPayload='" + paidMediaPayload + '\'' +
                '}';
    }
}