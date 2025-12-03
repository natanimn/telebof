package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object represents a checklist to create.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class InputChecklist implements Serializable {
    private final String title;
    private final List<InputChecklistTask> tasks;
    @SerializedName("parse_mode")
    private ParseMode parseMode;
    @SerializedName("title_entities")
    private List<MessageEntity> titleEntities;
    @SerializedName("others_can_add_tasks")
    private Boolean othersCanAddTasks;
    @SerializedName("others_can_mark_tasks_as_done")
    private Boolean othersCanMarkTasksAsDone;

    /**
     * @param title Title of the checklist; 1-255 characters after entities parsing
     * @param tasks Array of 1-30 tasks in the checklist
     */
    public InputChecklist(String title, InputChecklistTask[] tasks) {
        this.title = title;
        this.tasks = List.of(tasks);
    }

    /**
     * Optional. Mode for parsing entities in the title
     * @param parseMode Parse mode for entities
     * @return {@link InputChecklist}
     */
    public InputChecklist setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. A JSON-serialized list of special entities that appear in the title. It can be specified instead of parseMode
     * @param titleEntities List of message entities
     * @return {@link InputChecklist}
     */
    public InputChecklist setTitleEntities(MessageEntity[] titleEntities) {
        this.titleEntities = List.of(titleEntities);
        return this;
    }

    /**
     * Optional. Pass True if other users can add tasks to the checklist
     * @param othersCanAddTasks Whether others can add tasks
     * @return {@link InputChecklist}
     */
    public InputChecklist setOthersCanAddTasks(Boolean othersCanAddTasks) {
        this.othersCanAddTasks = othersCanAddTasks;
        return this;
    }

    /**
     * Optional. Pass True if other users can mark tasks as done or not done in the checklist
     * @param othersCanMarkTasksAsDone Whether others can mark tasks as done
     * @return {@link InputChecklist}
     */
    public InputChecklist setOthersCanMarkTasksAsDone(Boolean othersCanMarkTasksAsDone) {
        this.othersCanMarkTasksAsDone = othersCanMarkTasksAsDone;
        return this;
    }
}