package io.github.natanimn.requests.create;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * CreateChatSubscriptionInviteLink class
 * @author Natanim
 * @since 12 April 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#createChatSubscriptionInviteLink}
 */

public class CreateChatSubscriptionInviteLink extends AbstractBaseRequest<CreateChatSubscriptionInviteLink, CreateChatSubscriptionInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param subscription_period period
     * @param subscription_price price
     * @param requestSender request sender
     */
    public CreateChatSubscriptionInviteLink(Object chat_id, int subscription_period, int subscription_price,
                                            RequestSender requestSender) {
        super(chat_id, requestSender, "createChatSubscriptionInviteLink", CreateChatSubscriptionInviteLink.class);
        add("subscription_period", subscription_period);
        add("subscription_price", subscription_price);
    }

    /**
     * Optional
     * @param name Invite link name; 0-32 characters
     * @return {@link CreateChatSubscriptionInviteLink}
     */
    public CreateChatSubscriptionInviteLink name(String name) {
        return add("name", name);
    }

}