package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.SubscriptionState;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This object contains information about changes to a user payment subscription toward the current bot.
 * @author Natanim
 * @since 2.2
 */
@Getter
public class BotSubscriptionUpdated implements TelegramUpdate, JsonFormatter {
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

}
