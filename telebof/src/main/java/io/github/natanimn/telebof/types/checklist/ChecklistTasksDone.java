package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a service message about checklist tasks marked as done or not done.
 * @param checklistMessage Optional. Message containing the checklist whose tasks were marked as done or not done. Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
 * @param markedAsDoneTaskIds Optional. Identifiers of the tasks that were marked as done
 * @param markedAsNotDoneTaskIds Optional. Identifiers of the tasks that were marked as not done
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public record ChecklistTasksDone(
        @SerializedName("checklist_message") Message checklistMessage,
        @SerializedName("marked_as_done_task_ids") List<Integer> markedAsDoneTaskIds,
        @SerializedName("marked_as_not_done_task_ids") List<Integer> markedAsNotDoneTaskIds
) {}