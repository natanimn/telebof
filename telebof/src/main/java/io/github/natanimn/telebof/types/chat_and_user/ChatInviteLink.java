package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * Represents an invite link for a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatInviteLink {
    /**
     * The invite link. If the link was created by another chat administrator, then the second part of the link will be replaced with "...".
     */
    @SerializedName("invite_link")
    private String inviteLink;

    /**
     * Optional. Invite link name
     */
    private String name;

    /**
     * Creator of the link
     */
    private User creator;

    /**
     * Optional. Point in time (Unix timestamp) when the link will expire or has been expired
     */
    @SerializedName("expire_date")
    private Integer expireDate;

    /**
     * Optional. The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
     */
    @SerializedName("member_limit")
    private Integer memberLimit;

    /**
     * Optional. Number of pending join requests created using this link
     */
    @SerializedName("pending_join_request_count")
    private Integer pendingJoinRequestCount;

    /**
     * Optional. The number of seconds the subscription will be active for before the next payment
     */
    @SerializedName("subscription_period")
    private Integer subscriptionPeriod;

    /**
     * Optional. The amount of Telegram Stars a user must pay initially and after each subsequent subscription period to be a member of the chat using the link
     */
    @SerializedName("subscription_price")
    private Integer subscriptionPrice;

    /**
     * True, if the link is primary
     */
    @SerializedName("is_primary")
    private Boolean isPrimary;

    /**
     * True, if the link is revoked
     */
    @SerializedName("is_revoked")
    private Boolean isRevoked;

    /**
     * True, if users joining the chat via the link need to be approved by chat administrators
     */
    @SerializedName("creates_join_request")
    private Boolean createsJoinRequest;

    public String getInviteLink() {
        return inviteLink;
    }

    public String getName() {
        return name;
    }

    public User getCreator() {
        return creator;
    }

    public Integer getExpireDate() {
        return expireDate;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public Integer getPendingJoinRequestCount() {
        return pendingJoinRequestCount;
    }

    public Integer getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public Integer getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public Boolean getIsRevoked() {
        return isRevoked;
    }

    public Boolean getCreatesJoinRequest() {
        return createsJoinRequest;
    }
}