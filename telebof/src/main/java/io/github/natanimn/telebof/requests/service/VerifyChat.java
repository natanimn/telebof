package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Verifies a chat on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 1.3.0
 */
public class VerifyChat extends AbstractBaseRequest<VerifyChat, Boolean> {
    /**
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param api api
     */
    public VerifyChat(Object chatId, Api api){
        super(chatId, api, "verifyChat", Boolean.class);
    }

    /**
     * Optional
     * @param customDescription Custom description for the verification; 0-70 characters. Must be empty if the organization
     *                           isn't allowed to provide a custom verification description.
     * @return {@link #VerifyChat}
     */
    public VerifyChat customDescription(String customDescription){
        return add("custom_description", customDescription);
    }
}
