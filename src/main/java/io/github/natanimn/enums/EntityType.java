package io.github.natanimn.enums;

import java.io.Serializable;

public enum EntityType implements Serializable {
    MENTION,
    HASHTAG,
    CASHTAG,
    BOT_COMMAND,
    URL,
    EMAIL,
    PHONE_NUMBER,
    BOLD,
    ITALIC,
    UNDERLINE,
    STRIKETHROUGH,
    SPOILER,
    CODE,
    PRE,
    TEXT_LINK,
    TEXT_MENTION,
    CUSTOM_EMOJI
}
