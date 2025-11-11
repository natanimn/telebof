package io.github.natanimn.telebof.types.web;

import io.github.natanimn.telebof.enums.Updates;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Describes the current status of a webhook.
 *
 * @param url Webhook URL, may be empty if webhook is not set up
 * @param ipAddress Optional. Currently used webhook IP address
 * @param lastErrorMessage Optional. Error message in human-readable format for the most recent error that happened when trying to deliver an update via webhook
 * @param pendingUpdateCount Number of updates awaiting delivery
 * @param lastSynchronizationErrorDate Optional. Unix time of the most recent error that happened when trying to synchronize available updates with Telegram datacenters
 * @param maxConnections Optional. The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery
 * @param hasCustomCertificate True, if a custom certificate was provided for webhook certificate checks
 * @param allowedUpdates Optional. A list of update types the bot is subscribed to. Defaults to all update types except chat_member
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record WebhookInfo(
        String url,
        @SerializedName("ip_address") String ipAddress,
        @SerializedName("last_error_message") String lastErrorMessage,
        @SerializedName("pending_update_count") Integer pendingUpdateCount,
        @SerializedName("last_synchronization_error_date") Integer lastSynchronizationErrorDate,
        @SerializedName("max_connections") Integer maxConnections,
        @SerializedName("has_custom_certificate") Boolean hasCustomCertificate,
        @SerializedName("allowed_updates") List<Updates> allowedUpdates
) {}