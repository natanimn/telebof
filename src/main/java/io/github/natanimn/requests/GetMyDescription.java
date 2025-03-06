package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.BotDescription;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetMyDescription extends AbstractBaseRequest<GetMyDescription, BotDescription> {
    public GetMyDescription(RequestSender requestSender) {
        super(requestSender, "getMyDescription", BotDescription.class);
    }

}
