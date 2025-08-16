package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * Verifies a chat on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 0.8
 */
public class VerifyChat extends AbstractBaseRequest<VerifyChat, Boolean> {
    /**
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param rs Request
     */
    public VerifyChat(Object chat_id, RequestSender rs){
        super(chat_id, rs, "verifyChat", Boolean.class);
    }

    /**
     * Optional
     * @param custom_description Custom description for the verification; 0-70 characters. Must be empty if the organization
     *                           isn't allowed to provide a custom verification description.
     * @return {@link #VerifyChat}
     */
    public VerifyChat customDescription(String custom_description){
        return add("custom_description", custom_description);
    }
}
