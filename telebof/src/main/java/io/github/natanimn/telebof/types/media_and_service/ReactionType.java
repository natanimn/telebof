package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.TypeReaction;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object describes the type of a reaction.
 * @param type Type of the reaction
 * @param emoji Reaction emoji. Currently, it can be one of
 * "❤", "👍", "👎", "🔥", "🥰", "👏", "😁", "🤔", "🤯", "😱", "🤬", "😢", "🎉", "🤩", "🤮", "💩", "🙏", "👌", "🕊",
 * "🤡", "🥱", "🥴", "😍", "🐳", "❤‍🔥", "🌚", "🌭", "💯", "🤣", "⚡", "🍌", "🏆", "💔", "🤨", "😐", "🍓", "🍾", "💋",
 * "🖕", "😈", "😴", "😭", "🤓", "👻", "👨‍💻", "👀", "🎃", "🙈", "😇", "😨", "🤝", "✍", "🤗", "🫡", "🎅", "🎄", "☃",
 * "💅", "🤪", "🗿", "🆒", "💘", "🙉", "🦄", "😘", "💊", "🙊", "😎", "👾", "🤷‍♂", "🤷", "🤷‍♀", "😡"
 * @param customEmojiId Custom emoji identifier
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ReactionType(
        TypeReaction type,
        String emoji,
        @SerializedName("custom_emoji_id") String customEmojiId
) implements Serializable {

    /**
     * Creates a new ReactionType builder
     * @param type Type of the reaction
     */
    public static ReactionTypeBuilder builder(TypeReaction type) {
        return new ReactionTypeBuilder(type);
    }

    /**
     * Builder class for ReactionType
     */
    public static class ReactionTypeBuilder {
        private final TypeReaction type;
        private String emoji;
        private String customEmojiId;

        public ReactionTypeBuilder(TypeReaction type) {
            this.type = type;
        }

        public ReactionTypeBuilder emoji(String emoji) {
            this.emoji = emoji;
            return this;
        }

        public ReactionTypeBuilder customEmojiId(String customEmojiId) {
            this.customEmojiId = customEmojiId;
            return this;
        }

        public ReactionType build() {
            return new ReactionType(
                    type,
                    emoji,
                    customEmojiId
            );
        }
    }
}