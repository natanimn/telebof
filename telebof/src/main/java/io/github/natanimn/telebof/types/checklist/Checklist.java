package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
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

    public String getTitle() {
        return title;
    }

    public List<MessageEntity> getTitleEntities() {
        return titleEntities;
    }

    public List<ChecklistTask> getTasks() {
        return tasks;
    }

    public Boolean getOthersCanAddTasks() {
        return othersCanAddTasks;
    }

    public Boolean getOthersCanMarkTasksAsDone() {
        return othersCanMarkTasksAsDone;
    }
}