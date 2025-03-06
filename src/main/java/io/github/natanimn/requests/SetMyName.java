package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
