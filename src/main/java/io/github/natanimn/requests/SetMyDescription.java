package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetMyDescription extends AbstractBaseRequest<SetMyDescription, Boolean>{

    public SetMyDescription(String description, String languageCode, RequestSender requestSender){
        super(requestSender, "setMyDescription");
        add("description", description);
        add("language_code", languageCode);
    }

}
