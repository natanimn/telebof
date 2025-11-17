package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.Serializable;
/**
 * This object represents a checklist to create.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class InputChecklist implements Serializable {
    private String title;
    private ParseMode parse_mode;
    private MessageEntity[] title_entities;
    private InputChecklistTask[] tasks;
    private Boolean others_can_add_tasks;
    private Boolean others_can_mark_tasks_as_done;

    /**
     * Required
     * @param title Title of the checklist; 1-255 characters after entities parsing
     * @param tasks Array of 1-30 tasks in the checklist
     */
    public InputChecklist(String title, InputChecklistTask[] tasks) {
        this.title = title;
        this.tasks = tasks;
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the title
     * @return {@link InputChecklist}
     */
    public InputChecklist parseMode(ParseMode parseMode) {
        this.parse_mode = parseMode;
        return this;
    }

    /**
     * Optional
     * @param titleEntities A JSON-serialized list of special entities that appear in the title.
     *                       It can be specified instead of {@link #parseMode(ParseMode)}
     * @return {@link InputChecklist}
     */
    public InputChecklist titleEntities(MessageEntity[] titleEntities) {
        this.title_entities = titleEntities;
        return this;
    }

    /**
     * Optional
     * @param othersCanAddTasks Pass True if other users can add tasks to the checklist
     * @return {@link InputChecklist}
     */
    public InputChecklist othersCanAddTasks(Boolean othersCanAddTasks) {
        this.others_can_add_tasks = othersCanAddTasks;
        return this;
    }

    /**
     * Optional
     * @param othersCanMarkTasksAsDone Pass True if other users can mark tasks as done or not done in the checklist
     * @return {@link InputChecklist}
     */
    public InputChecklist othersCanMarkTasksAsDone(Boolean othersCanMarkTasksAsDone) {
        this.others_can_mark_tasks_as_done = othersCanMarkTasksAsDone;
        return this;
    }
}