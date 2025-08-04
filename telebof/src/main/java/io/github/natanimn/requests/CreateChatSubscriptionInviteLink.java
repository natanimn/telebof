package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  12 April 2025
 */

public class CreateChatSubscriptionInviteLink extends AbstractBaseRequest<CreateChatSubscriptionInviteLink, CreateChatSubscriptionInviteLink> {

    public CreateChatSubscriptionInviteLink(Object chatId, int subscription_period, int subscription_price,
                                            RequestSender requestSender) {
        super(chatId, requestSender, "createChatSubscriptionInviteLink", CreateChatSubscriptionInviteLink.class);
        add("subscription_period", subscription_period);
        add("subscription_price", subscription_price);
    }

    public CreateChatSubscriptionInviteLink name(String name) {
        return add("name", name);
    }

}