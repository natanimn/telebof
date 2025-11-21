package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.Location;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChosenInlineResult implements TelegramUpdate {
    /**
     * The unique identifier for the result that was chosen
     */
    @SerializedName("result_id")
    private String resultId;

    /**
     * The user that chose the result
     */
    private User from;

    /**
     * Sender location, only for bots that require user location
     */
    private Location location;

    /**
     * Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
     */
    @SerializedName("inline_message_id")
    private String inlineMessageId;

    /**
     * The query that was used to obtain the result
     */
    private String query;

    public String getResultId() {
        return resultId;
    }

    public User getFrom() {
        return from;
    }

    public Location getLocation() {
        return location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChosenInlineResult that = (ChosenInlineResult) object;
        return Objects.equals(resultId, that.resultId) &&
                Objects.equals(from, that.from) &&
                Objects.equals(location, that.location) &&
                Objects.equals(inlineMessageId, that.inlineMessageId) &&
                Objects.equals(query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, from, location, inlineMessageId, query);
    }

    @Override
    public String toString() {
        return "ChosenInlineResult{" +
                "resultId='" + resultId + '\'' +
                ", from=" + from +
                ", location=" + location +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}