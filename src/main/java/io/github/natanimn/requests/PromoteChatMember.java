package io.github.natanimn.requests;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class PromoteChatMember extends AbstractBaseRequest<PromoteChatMember, Boolean> {

    public PromoteChatMember(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "promoteChatMember");
        add("user_id", userId);
    }

    public PromoteChatMember isAnonymous(boolean isAnonymous) {
        return add("is_anonymous", isAnonymous);
    }

    public PromoteChatMember canManageChat(boolean canManageChat) {
        return add("can_manage_chat", canManageChat);
    }

    public PromoteChatMember canPostMessages(boolean canPostMessages) {
        return add("can_post_messages", canPostMessages);
    }

    public PromoteChatMember canEditMessages(boolean canEditMessages) {
        return add("can_edit_messages", canEditMessages);
    }

    public PromoteChatMember canDeleteMessages(boolean canDeleteMessages) {
        return add("can_delete_messages", canDeleteMessages);
    }

    public PromoteChatMember canManageVideoChats(boolean canManageVideoChats) {
        return add("can_manage_video_chats", canManageVideoChats);
    }

    public PromoteChatMember can_restrict_members(boolean canRestrictMembers) {
        return add("can_restrict_members", canRestrictMembers);
    }

    public PromoteChatMember can_promote_members(boolean canPromoteMembers) {
        return add("can_promote_members", canPromoteMembers);
    }

    public PromoteChatMember canChangeInfo(boolean canChangeInfo) {
        return add("can_change_info", canChangeInfo);
    }

    public PromoteChatMember canInviteUsers(boolean canInviteUsers) {
        return add("can_invite_users", canInviteUsers);
    }

    public PromoteChatMember canPinMessages(boolean canPinMessages) {
        return add("can_pin_messages", canPinMessages);
    }

    public PromoteChatMember canManageTopics(boolean canManageTopics) {
        return add("can_manage_topics", canManageTopics);
    }

    public PromoteChatMember canPostStories(boolean canPostStories){
        return add("can_post_stories", canPostStories);
    }

    public PromoteChatMember canEditStories(boolean canEditStories){
        return add("can_edit_stories", canEditStories);
    }

    public PromoteChatMember canDeleteStories(boolean canDeleteStories){
        return add("can_delete_stories", canDeleteStories);
    }

}
