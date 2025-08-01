package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class Close extends AbstractBaseRequest<Close, Boolean> {
    public Close(RequestSender requestSender){
        super(requestSender, "close");
    }

}
