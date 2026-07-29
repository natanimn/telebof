package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This object represents a checklist.
 * @author Natanim
 * @since 1 September 2025
 */
@Getter
public class Checklist {
    /**
     * Title of the checklist
     */
    private String title;

    /**
     * Optional. Special entities that appear in the checklist title
     */
    @SerializedName("title_entities")
    private List<MessageEntity> titleEntities;

    /**
     * List of tasks in the checklist
     */
    private List<ChecklistTask> tasks;

    /**
     * Optional. True, if users other than the creator of the list can add tasks to the list
     */
    @SerializedName("others_can_add_tasks")
    private Boolean othersCanAddTasks;

    /**
     * Optional. True, if users other than the creator of the list can mark tasks as done or not done
     */
    @SerializedName("others_can_mark_tasks_as_done")
    private Boolean othersCanMarkTasksAsDone;

}