package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a checklist.
 * @param title Title of the checklist
 * @param titleEntities Optional. Special entities that appear in the checklist title
 * @param tasks List of tasks in the checklist
 * @param othersCanAddTasks Optional. True, if users other than the creator of the list can add tasks to the list
 * @param othersCanMarkTasksAsDone Optional. True, if users other than the creator of the list can mark tasks as done or not done
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public record Checklist(
        String title,
        @SerializedName("title_entities") List<MessageEntity> titleEntities,
        List<ChecklistTask> tasks,
        @SerializedName("others_can_add_tasks") Boolean othersCanAddTasks,
        @SerializedName("others_can_mark_tasks_as_done") Boolean othersCanMarkTasksAsDone
) {}