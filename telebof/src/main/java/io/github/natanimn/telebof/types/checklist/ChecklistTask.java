package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import java.util.List;

/**
 * This object represents a task in a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 */
public class ChecklistTask {
    /**
     * Unique identifier of the task
     */
    public Integer id;

    /**
     * Text of the task
     */
    public String text;

    /**
     * Optional. Special entities that appear in the task text
     */
    public List<MessageEntity> text_entities;

    /**
     * Optional. User that completed the task; omitted if the task wasn't completed
     */
    public User completed_by_user;

    /**
     * Optional. Point in time (Unix timestamp) when the task was completed; 0 if the task wasn't completed
     */
    public Integer completion_date;
}