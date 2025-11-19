package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * This object represents a checklist to create.
 * @param title Title of the checklist; 1-255 characters after entities parsing
 * @param tasks Array of 1-30 tasks in the checklist
 * @param parseMode Optional. Mode for parsing entities in the title
 * @param titleEntities Optional. A JSON-serialized list of special entities that appear in the title. It can be specified instead of parseMode
 * @param othersCanAddTasks Optional. Pass True if other users can add tasks to the checklist
 * @param othersCanMarkTasksAsDone Optional. Pass True if other users can mark tasks as done or not done in the checklist
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public record InputChecklist(
        String title,
        List<InputChecklistTask> tasks,
        @SerializedName("parse_mode") ParseMode parseMode,
        @SerializedName("title_entities") List<MessageEntity> titleEntities,
        @SerializedName("others_can_add_tasks") Boolean othersCanAddTasks,
        @SerializedName("others_can_mark_tasks_as_done") Boolean othersCanMarkTasksAsDone
) implements Serializable {

    /**
     * Creates a new InputChecklist builder
     * @param title Title of the checklist; 1-255 characters after entities parsing
     * @param tasks Array of 1-30 tasks in the checklist
     */
    public static InputChecklistBuilder builder(String title, List<InputChecklistTask> tasks) {
        return new InputChecklistBuilder(title, tasks);
    }

    /**
     * Builder class for InputChecklist
     */
    public static class InputChecklistBuilder {
        private final String title;
        private final List<InputChecklistTask> tasks;
        private ParseMode parseMode;
        private List<MessageEntity> titleEntities;
        private Boolean othersCanAddTasks;
        private Boolean othersCanMarkTasksAsDone;

        public InputChecklistBuilder(String title, List<InputChecklistTask> tasks) {
            this.title = title;
            this.tasks = tasks;
        }

        public InputChecklistBuilder parseMode(ParseMode parseMode) {
            this.parseMode = parseMode;
            return this;
        }

        public InputChecklistBuilder titleEntities(List<MessageEntity> titleEntities) {
            this.titleEntities = titleEntities;
            return this;
        }

        public InputChecklistBuilder othersCanAddTasks(Boolean othersCanAddTasks) {
            this.othersCanAddTasks = othersCanAddTasks;
            return this;
        }

        public InputChecklistBuilder othersCanMarkTasksAsDone(Boolean othersCanMarkTasksAsDone) {
            this.othersCanMarkTasksAsDone = othersCanMarkTasksAsDone;
            return this;
        }

        public InputChecklist build() {
            return new InputChecklist(
                    title, tasks, parseMode, titleEntities, othersCanAddTasks, othersCanMarkTasksAsDone
            );
        }
    }
}