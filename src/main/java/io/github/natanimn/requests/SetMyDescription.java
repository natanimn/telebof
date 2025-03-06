package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.Message;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetMyDescription extends AbstractBaseRequest<SetMyDescription, Boolean>{

    public SetMyDescription(String description, String languageCode, RequestSender requestSender){
        super(requestSender, "setMyDescription");
        add("description", description);
        add("language_code", languageCode);
    }

}
