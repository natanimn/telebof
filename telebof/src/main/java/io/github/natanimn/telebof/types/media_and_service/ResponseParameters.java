package io.github.natanimn.telebof.types.media_and_service;

/**
 * Describes why a request was unsuccessful.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ResponseParameters {
    /**
     * Optional. The group has been migrated to a supergroup with the specified identifier.
     */
    public Long migrate_to_chat_id;

    /**
     * Optional. In case of exceeding flood control, the number of seconds left to wait before the request can be repeated
     */
    public Integer retry_after;
}
