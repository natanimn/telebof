package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;

/**
 * This object represents a service message about checklist tasks marked as done or not done.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 */
public class ChecklistTasksDone {
    /**
     * Optional. Message containing the checklist whose tasks were marked as done or not done.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    public Message checklist_message;

    /**
     * Optional. Identifiers of the tasks that were marked as done
     */
    public List<Integer> marked_as_done_task_ids;

    /**
     * Optional. Identifiers of the tasks that were marked as not done
     */
    public List<Integer> marked_as_not_done_task_ids;
}