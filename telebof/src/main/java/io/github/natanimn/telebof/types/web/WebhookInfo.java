package io.github.natanimn.telebof.types.web;

import io.github.natanimn.telebof.enums.Updates;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Describes the current status of a webhook.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class WebhookInfo {
    /**
     * Webhook URL, may be empty if webhook is not set up
     */
    private String url;

    /**
     * Optional.
     * Currently used webhook IP address
     */
    @SerializedName("ip_address")
    private String ipAddress;

    /**
     * Optional.
     * Error message in human-readable format for the most recent error that happened when trying to deliver an update via webhook
     */
    @SerializedName("last_error_message")
    private String lastErrorMessage;

    /**
     * Number of updates awaiting delivery
     */
    @SerializedName("pending_update_count")
    private Integer pendingUpdateCount;

    /**
     * Optional.
     * Unix time of the most recent error that happened when trying to synchronize available updates with Telegram datacenters
     */
    @SerializedName("last_synchronization_error_date")
    private Integer lastSynchronizationErrorDate;

    /**
     * Optional.
     * The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery
     */
    @SerializedName("max_connections")
    private Integer maxConnections;

    /**
     * True, if a custom certificate was provided for webhook certificate checks
     */
    @SerializedName("has_custom_certificate")
    private Boolean hasCustomCertificate;

    /**
     * Optional.
     * A list of update types the bot is subscribed to. Defaults to all update types except chat_member
     */
    @SerializedName("allowed_updates")
    private List<Updates> allowedUpdates;

    public String getUrl() {
        return url;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public Integer getPendingUpdateCount() {
        return pendingUpdateCount;
    }

    public Integer getLastSynchronizationErrorDate() {
        return lastSynchronizationErrorDate;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public Boolean getHasCustomCertificate() {
        return hasCustomCertificate;
    }

    public List<Updates> getAllowedUpdates() {
        return allowedUpdates;
    }
}