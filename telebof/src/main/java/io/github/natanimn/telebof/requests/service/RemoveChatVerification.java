package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Removes verification from a chat that is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
 * @author Natanim
 * @since 1 August 2025
 * @version 1.3.0
 */
public class RemoveChatVerification extends AbstractBaseRequest<RemoveChatVerification, Boolean> {
    /**
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param rs api
     */
    public RemoveChatVerification(Object chatId, Api rs){
        super(chatId, rs, "removeChatVerification", Boolean.class);
    }

}
