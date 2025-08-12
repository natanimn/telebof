package io.github.natanimn.types.chat_and_user;


/**
 * Represents an invite link for a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatInviteLink {
    /**
     * The invite link. If the link was created by another chat administrator, then the second part of the link will be replaced with “…”.
     */
    public String invite_link;

    /**
     * Optional. Invite link name
     */
    public String name;

    /**
     * Creator of the link
     */
    public User creator;

    /**
     * Optional. Point in time (Unix timestamp) when the link will expire or has been expired
     */
    public Integer expire_date;

    /**
     * Optional.
     * The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
     */
    public Integer member_limit;

    /**
     * Optional. Number of pending join requests created using this link
     */
    public Integer pending_join_request_count;

    /**
     * Optional. The number of seconds the subscription will be active for before the next payment
     */
    public Integer subscription_period;

    /**
     * Optional.
     * The amount of Telegram Stars a user must pay initially and after each subsequent subscription period to be a member of the chat using the link
     */
    public Integer subscription_price;

    /**
     * True, if the link is primary
     */
    public Boolean is_primary;

    /**
     * True, if the link is revoked
     */
    public Boolean is_revoked;

    /**
     * True, if users joining the chat via the link need to be approved by chat administrators
     */
    public Boolean creates_join_request;

}
