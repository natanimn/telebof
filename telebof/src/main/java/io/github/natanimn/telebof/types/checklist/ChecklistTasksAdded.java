package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a service message about tasks added to a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class ChecklistTasksAdded {
    /**
     * Optional. Message containing the checklist to which the tasks were added. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @SerializedName("checklist_message")
    private Message checklistMessage;

    /**
     * List of tasks added to the checklist
     */
    private List<ChecklistTask> tasks;

    public Message getChecklistMessage() {
        return checklistMessage;
    }

    public List<ChecklistTask> getTasks() {
        return tasks;
    }

}