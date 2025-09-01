package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;

/**
 * This object represents a service message about tasks added to a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 */
public class ChecklistTasksAdded {
    /**
     * Optional. Message containing the checklist to which the tasks were added.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message checklist_message;

    /**
     * List of tasks added to the checklist
     */
    public List<ChecklistTask> tasks;
}