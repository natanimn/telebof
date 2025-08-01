package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ExportChatInviteLink extends AbstractBaseRequest<ExportChatInviteLink, String> {
    public ExportChatInviteLink(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "exportChatInviteLink", Object.class);
    }

}
