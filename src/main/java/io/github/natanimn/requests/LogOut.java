package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class LogOut extends AbstractBaseRequest<LogOut, Boolean> {
    public LogOut(RequestSender requestSender) {
        super(requestSender, "logOut");
    }

}
