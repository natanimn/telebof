package io.github.natanimn.telebof.types.story;

import com.google.gson.annotations.SerializedName;

/**
 * Describes a story area containing weather information. Currently, a story can have up to 3 weather areas.
 * @param temperature Temperature, in degree Celsius
 * @param emoji Emoji representing the weather
 * @param backgroundColor Optional. A color of the area background in the ARGB format
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryAreaTypeWeather(
        Double temperature,
        String emoji,
        @SerializedName("background_color") Integer backgroundColor
) implements StoryAreaType {

    public String type() {
        return "weather";
    }

    /**
     * Creates a new StoryAreaTypeWeather builder
     * @param temperature Temperature, in degree Celsius
     * @param emoji Emoji representing the weather
     */
    public static StoryAreaTypeWeatherBuilder builder(double temperature, String emoji) {
        return new StoryAreaTypeWeatherBuilder(temperature, emoji);
    }

    /**
     * Builder class for StoryAreaTypeWeather
     */
    public static class StoryAreaTypeWeatherBuilder {
        private final double temperature;
        private final String emoji;
        private Integer backgroundColor;

        public StoryAreaTypeWeatherBuilder(double temperature, String emoji) {
            this.temperature = temperature;
            this.emoji = emoji;
        }

        public StoryAreaTypeWeatherBuilder backgroundColor(Integer backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public StoryAreaTypeWeather build() {
            return new StoryAreaTypeWeather(temperature, emoji, backgroundColor);
        }
    }
}