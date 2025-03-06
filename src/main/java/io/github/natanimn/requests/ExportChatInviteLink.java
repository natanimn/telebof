package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ExportChatInviteLink extends AbstractBaseRequest<ExportChatInviteLink, String> {
    public ExportChatInviteLink(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "exportChatInviteLink", Object.class);
    }

}
