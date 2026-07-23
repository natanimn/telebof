package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.SubscriptionState;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object contains information about changes to a user payment subscription toward the current bot.
 * @author Natanim
 * @since 2.2
 */
public class BotSubscriptionUpdated implements TelegramUpdate {
    /**
     * User who subscribed for payments toward the bot
     */
    private User user;

    /**
     * Bot-specified invoice payload
     */
    @SerializedName("invoice_payload")
    private String invoicePayload;

    /**
     * The new state of the subscription.
     */
    private SubscriptionState state;

    public User getUser() {
        return user;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public SubscriptionState getState() {
        return state;
    }
}
