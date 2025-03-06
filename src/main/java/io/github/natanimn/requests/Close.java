package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Close extends AbstractBaseRequest<Close, Boolean> {
    public Close(RequestSender requestSender){
        super(requestSender, "close");
    }

}
