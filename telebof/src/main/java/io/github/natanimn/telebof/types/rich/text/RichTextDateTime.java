package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * Formatted date and time.
 * @author Natanim
 * @since 2.1
 */
public class RichTextDateTime implements RichText {
    /**
     * Type of the rich text, always “date_time”
     */
    private final String type = "date_time";

    private final RichText text;

    @SerializedName("unix_time")
    private final long unixTime;

    @SerializedName("date_time_format")
    private final String dateTimeFormat;

    /**
     * Required
     * @param text The text
     * @param unixTime The Unix time associated with the entity
     * @param dateTimeFormat The string that defines the formatting of the date and time. <a href="https://core.telegram.org/bots/api#date-time-entity-formatting">See date-time entity formatting</a> for more details.
     */
    public RichTextDateTime(String text, long unixTime, String dateTimeFormat){
        this.text = new RichTextImpl(text, type);
        this.unixTime = unixTime;
        this.dateTimeFormat = dateTimeFormat;
    }

    /**
     * Required
     * @param text The text
     * @param unixTime The Unix time associated with the entity
     * @param dateTimeFormat The string that defines the formatting of the date and time. <a href="https://core.telegram.org/bots/api#date-time-entity-formatting">See date-time entity formatting</a> for more details.
     */
    public RichTextDateTime(RichText text, long unixTime, String dateTimeFormat){
        this.text = text;
        this.unixTime = unixTime;
        this.dateTimeFormat = dateTimeFormat;
    }

}
