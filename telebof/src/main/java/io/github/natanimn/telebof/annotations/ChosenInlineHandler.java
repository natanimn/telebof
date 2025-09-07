package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ChosenInlineHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling chosen inline result events in a declarative manner.
 * Designed specifically for handling events when a user selects a result from
 * an inline query, providing feedback about which result was chosen and the original query.
 *
 * <p><b>Basic chosen inline result handler example:</b>
 * <pre>{@code
 * @ChosenInlineHandler
 * void handleChosenResult(BotContext context, ChosenInlineResult result) {
 *     // Handle when a user selects an inline result
 * }
 * }</pre>
 *
 * <p><b>Specific result ID handler example:</b>
 * <pre>{@code
 * @ChosenInlineHandler(resultId = "news_article_123")
 * void handleNewsArticleSelection(BotContext context, ChosenInlineResult result) {
 *     // Handle when a specific news article result is chosen
 * }
 * }</pre>
 *
 * <p><b>Query-based handler example:</b>
 * <pre>{@code
 * @ChosenInlineHandler(query = "weather")
 * void handleWeatherQuerySelection(BotContext context, ChosenInlineResult result) {
 *     // Handle when any result from a "weather" query is chosen
 * }
 * }</pre>
 *
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onChosenInlineResult(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ChosenInlineHandlers.class)
public @interface ChosenInlineHandler {

    /**
     * Specifies the inline result IDs to match.
     * Multiple result IDs are combined using OR logic - the handler will trigger
     * if the chosen result ID matches any of the specified values.
     * Useful for tracking specific content selections or implementing analytics.
     *
     * @return array of result ID strings to match
     * @implNote Empty array matches any result ID
     * @example {"article_123", "product_456"}
     */
    String[] resultId() default {};

    /**
     * Specifies the original inline query text to match.
     * Multiple query strings are combined using OR logic - the handler will trigger
     * if the original query matches any of the specified strings.
     * Useful for categorizing chosen results by search intent.
     *
     * @return array of query strings to match
     * @implNote Empty array matches any query
     * @example {"weather", "news", "music"}
     */
    String[] query() default {};

    /**
     * Custom filter class for advanced filtering of chosen inline result events.
     * Use this to implement custom logic for determining which chosen results
     * should trigger this handler, such as filtering by user characteristics,
     * location, timing, or other application-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies to all chosen result events
     * @example Filter to only handle results chosen by users in specific countries
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same chosen result event.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority -10 executes before one with priority 5
     */
    int priority() default 0;
}