package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * CreateChatSubscriptionInviteLink class
 * @author Natanim
 * @since 12 April 2025
 * @version 0.9
 * @see BotContext#createChatSubscriptionInviteLink
 */

public class CreateChatSubscriptionInviteLink extends AbstractBaseRequest<CreateChatSubscriptionInviteLink, CreateChatSubscriptionInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param subscription_period period
     * @param subscription_price price
     * @param api api
     */
    public CreateChatSubscriptionInviteLink(Object chat_id, int subscription_period, int subscription_price,
                                            Api api) {
        super(chat_id, api, "createChatSubscriptionInviteLink", CreateChatSubscriptionInviteLink.class);
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