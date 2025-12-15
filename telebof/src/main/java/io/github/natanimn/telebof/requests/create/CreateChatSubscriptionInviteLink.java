package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * CreateChatSubscriptionInviteLink class
 * @author Natanim
 * @since 12 April 2025
 * @version 1.3.0
 * @see BotContext#createChatSubscriptionInviteLink
 */

public class CreateChatSubscriptionInviteLink extends AbstractBaseRequest<CreateChatSubscriptionInviteLink, CreateChatSubscriptionInviteLink> {
    /**
     * Required
     * @param chatId chat id
     * @param subscriptionPeriod period
     * @param subscriptionPrice price
     * @param api api
     */
    public CreateChatSubscriptionInviteLink(Object chatId, int subscriptionPeriod, int subscriptionPrice,
                                            Api api) {
        super(chatId, api, "createChatSubscriptionInviteLink", CreateChatSubscriptionInviteLink.class);
        add("subscription_period", subscriptionPeriod);
        add("subscription_price", subscriptionPrice);
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