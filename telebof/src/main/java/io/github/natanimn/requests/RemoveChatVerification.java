package io.github.natanimn.requests;

/**
 * Removes verification from a chat that is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
 * @author Natanim
 * @since 2 August 2025
 * @version 0.8
 */
public class RemoveChatVerification extends AbstractBaseRequest<RemoveChatVerification, Boolean>{
    /**
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param rs Request sender
     */
    public RemoveChatVerification(Object chat_id, RequestSender rs){
        super(chat_id, rs, "removeChatVerification");
    }

}
