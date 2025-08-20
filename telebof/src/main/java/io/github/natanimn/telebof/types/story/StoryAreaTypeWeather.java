package io.github.natanimn.telebof.types.story;

/**
 * Describes a story area containing weather information. Currently, a story can have up to 3 weather areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryAreaTypeWeather implements StoryAreaType {
    private String type;
    private Double temperature;
    private String emoji;
    private Integer background_color;

    /**
     * Required
     * @param temperature Temperature, in degree Celsius
     * @param emoji Emoji representing the weather
     */
    public StoryAreaTypeWeather(double temperature, String emoji) {
        this.type = "weather";
        this.temperature = temperature;
        this.emoji = emoji;
    }

    /**
     * Optional
     * @param background_color A color of the area background in the ARGB format
     * @return {@link StoryAreaTypeWeather}
     */
    public StoryAreaTypeWeather backgroundColor(Integer background_color) {
        this.background_color = background_color;
        return this;
    }
}