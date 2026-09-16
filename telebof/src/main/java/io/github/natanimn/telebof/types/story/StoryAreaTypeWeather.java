package io.github.natanimn.telebof.types.story;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes a story area containing weather information. Currently, a story can have up to 3 weather areas.
 * @author Natanim
 * @since 19 August 2025
 */
@Getter
public class StoryAreaTypeWeather implements StoryAreaType {

    private final String type = "weather";
    /**
     * Temperature, in degree Celsius
     */
    private Double temperature;

    /**
     * Emoji representing the weather
     */
    private String emoji;

    /**
     * Optional. A color of the area background in the ARGB format
     */
    @SerializedName("background_color")
    private Integer backgroundColor;

    public StoryAreaTypeWeather() {
    }

    /**
     * Required
     *
     * @param temperature Temperature, in degree Celsius
     * @param emoji       Emoji representing the weather
     */
    public StoryAreaTypeWeather(double temperature, String emoji) {
        this.temperature = temperature;
        this.emoji = emoji;
    }

    /**
     * @param backgroundColor A color of the area background in the ARGB format
     * @return this
     */
    public StoryAreaTypeWeather setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
}