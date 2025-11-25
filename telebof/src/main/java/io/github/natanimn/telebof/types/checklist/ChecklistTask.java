package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a task in a checklist.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.3.0
 */
public class ChecklistTask {
    /**
     * Unique identifier of the task
     */
    private Integer id;

    /**
     * Text of the task
     */
    private String text;

    /**
     * Optional. Special entities that appear in the task text
     */
    @SerializedName("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Optional. User that completed the task; omitted if the task wasn't completed
     */
    @SerializedName("completed_by_user")
    private User completedByUser;

    /**
     * Optional. Point in time (Unix timestamp) when the task was completed; 0 if the task wasn't completed
     */
    @SerializedName("completion_date")
    private Integer completionDate;

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public User getCompletedByUser() {
        return completedByUser;
    }

    public Integer getCompletionDate() {
        return completionDate;
    }
}