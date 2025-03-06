package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetMyName extends AbstractBaseRequest<SetMyName, Boolean> {

    public SetMyName(RequestSender requestSender){
        super(requestSender, "setMyName");

    }

    public SetMyName name(String name){
        add("name", name);
        return this;
    }

    public SetMyName languageCode(String languageCode){
        add("language_code", languageCode);
        return this;
    }
}
