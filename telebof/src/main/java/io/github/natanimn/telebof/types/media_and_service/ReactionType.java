package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.TypeReaction;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object describes the type of a reaction.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class ReactionType implements Serializable, JsonFormatter {
    private TypeReaction type;

    /**Reaction emoji. Currently, it can be one of
     *              "❤", "👍", "👎", "🔥", "🥰", "👏", "😁", "🤔", "🤯", "😱", "🤬", "😢", "🎉", "🤩", "🤮", "💩", "🙏", "👌", "🕊",
     *              "🤡", "🥱", "🥴", "😍", "🐳", "❤‍🔥", "🌚", "🌭", "💯", "🤣", "⚡", "🍌", "🏆", "💔", "🤨", "😐", "🍓", "🍾", "💋",
     *              "🖕", "😈", "😴", "😭", "🤓", "👻", "👨‍💻", "👀", "🎃", "🙈", "😇", "😨", "🤝", "✍", "🤗", "🫡", "🎅", "🎄", "☃",
     *              "💅", "🤪", "🗿", "🆒", "💘", "🙉", "🦄", "😘", "💊", "🙊", "😎", "👾", "🤷‍♂", "🤷", "🤷‍♀", "😡"
     *
     */
    private String emoji;

    /**
     * Custom emoji identifier
     */
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    /**
     * Required
     * @param type Type of the reaction
     */
    public ReactionType(TypeReaction type) {
        this.type = type;
    }

}