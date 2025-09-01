package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.util.List;

/**
 * This object represents a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 */
public class Checklist {
    /**
     * Title of the checklist
     */
    public String title;

    /**
     * Optional. Special entities that appear in the checklist title
     */
    public List<MessageEntity> title_entities;

    /**
     * List of tasks in the checklist
     */
    public List<ChecklistTask> tasks;

    /**
     * Optional. True, if users other than the creator of the list can add tasks to the list
     */
    public Boolean others_can_add_tasks;

    /**
     * Optional. True, if users other than the creator of the list can mark tasks as done or not done
     */
    public Boolean others_can_mark_tasks_as_done;
}