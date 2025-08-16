package io.github.natanimn.telebof.types.web;

import io.github.natanimn.telebof.enums.Updates;

import java.util.List;

/**
 * Describes the current status of a webhook.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class WebhookInfo {
    /**
     * Webhook URL, may be empty if webhook is not set up
     */
    public String url;

    /**
     * Optional. Currently used webhook IP address
     */
    public String ip_address;

    /**
     * Optional. Error message in human-readable format for the most recent error that happened when trying to deliver an update via webhook
     */
    public String last_error_message;

    /**
     * Number of updates awaiting delivery
     */
    public Integer pending_update_count;

    /**
     * Optional. Unix time of the most recent error that happened when trying to synchronize available updates with Telegram datacenters
     */
    public Integer last_synchronization_error_date;

    /**
     * Optional. The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery
     */
    public Integer max_connections;

    /**
     * True, if a custom certificate was provided for webhook certificate checks
     */
    public Boolean has_custom_certificate;

    /**
     * Optional. A list of update types the bot is subscribed to. Defaults to all update types except chat_member
     */
    public List<Updates> allowed_updates;

}

