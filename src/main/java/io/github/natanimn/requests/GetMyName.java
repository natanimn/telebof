package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.BotName;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetMyName extends AbstractBaseRequest<GetMyName, BotName> {
    public GetMyName(RequestSender requestSender){
        super(requestSender, "getMyName", BotName.class);
    }

}
