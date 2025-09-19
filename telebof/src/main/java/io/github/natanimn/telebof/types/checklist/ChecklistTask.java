package io.github.natanimn.telebof.types.checklist;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a task in a checklist.
 * @param id Unique identifier of the task
 * @param text Text of the task
 * @param textEntities Optional. Special entities that appear in the task text
 * @param completedByUser Optional. User that completed the task; omitted if the task wasn't completed
 * @param completionDate Optional. Point in time (Unix timestamp) when the task was completed; 0 if the task wasn't completed
 * @author Natanim
 * @since 1 September 2025
 * @version 1.2.4
 */
public record ChecklistTask(
        Integer id,
        String text,
        @SerializedName("text_entities") List<MessageEntity> textEntities,
        @SerializedName("completed_by_user") User completedByUser,
        @SerializedName("completion_date") Integer completionDate
) {}