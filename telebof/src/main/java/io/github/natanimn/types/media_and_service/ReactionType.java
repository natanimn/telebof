package io.github.natanimn.types.media_and_service;

import io.github.natanimn.enums.TypeReaction;

import java.io.Serializable;

/**
 * This object describes the type of a reaction.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ReactionType implements Serializable {
    /**
     * Type of the reaction
     */
    public TypeReaction type;

    /**
     * Reaction emoji. Currently, it can be one of
     * "❤", "👍", "👎", "🔥", "🥰", "👏", "😁", "🤔", "🤯", "😱", "🤬", "😢", "🎉", "🤩", "🤮", "💩", "🙏", "👌", "🕊",
     * "🤡", "🥱", "🥴", "😍", "🐳", "❤‍🔥", "🌚", "🌭", "💯", "🤣", "⚡", "🍌", "🏆", "💔", "🤨", "😐", "🍓", "🍾", "💋",
     * "🖕", "😈", "😴", "😭", "🤓", "👻", "👨‍💻", "👀", "🎃", "🙈", "😇", "😨", "🤝", "✍", "🤗", "🫡", "🎅", "🎄", "☃",
     * "💅", "🤪", "🗿", "🆒", "💘", "🙉", "🦄", "😘", "💊", "🙊", "😎", "👾", "🤷‍♂", "🤷", "🤷‍♀", "😡"
     */
    public String emoji;

    /**
     * Custom emoji identifier
     */
    public String custom_emoji_id;

    public ReactionType(TypeReaction reaction){
        this.type = reaction;
    }

    public void emoji(String emoji){
        this.emoji = emoji;
    }

    public void customEmojiId(String custom_emoji_id){
        this.custom_emoji_id = custom_emoji_id;
    }
}
