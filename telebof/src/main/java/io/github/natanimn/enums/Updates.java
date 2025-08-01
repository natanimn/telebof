package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

public enum Updates{
    @SerializedName("message")
    MESSAGE,

    @SerializedName("channel_post")
    CHANNEL_POST,

    @SerializedName("edited_message")
    EDITED_MESSAGE,

    @SerializedName("edited_channel_post")
    EDITED_CHANNEL_POST,

    @SerializedName("edited_channel_post")
    CALLBACK_QUERY,

    @SerializedName("inline_query")
    INLINE_QUERY,

    @SerializedName("poll")
    POLL,

    @SerializedName("poll_answer")
    POLL_ANSWER,

    @SerializedName("chosen_inline_result")
    CHOSEN_INLINE_RESULT,

    @SerializedName("shipping_query")
    SHIPPING_QUERY,

    @SerializedName("pre_checkout_query")
    PRE_CHECKOUT_QUERY,

    @SerializedName("my_chat_member")
    MY_CHAT_MEMBER,

    @SerializedName("chat_member")
    CHAT_MEMBER,

    @SerializedName("chat_join_result")
    CHAT_JOIN_REQUEST,

    @SerializedName("message_reaction")
    MESSAGE_REACTION,

    @SerializedName("message_reaction_count")
    MESSAGE_REACTION_COUNT,

    @SerializedName("chat_boost")
    CHAT_BOOST,

    @SerializedName("removed_chat_boost")
    REMOVED_CHAT_BOOST,

    @SerializedName("business_message")
    BUSINESS_MESSAGE,

    @SerializedName("business_connection")
    BUSINESS_CONNECTION,

    @SerializedName("edited_business_message")
    EDITED_BUSINESS_MESSAGE,

    @SerializedName("deleted_business_messages")
    DELETED_BUSINESS_MESSAGES;


    public static final Updates[] ALL = {
            MESSAGE,
            CHANNEL_POST,
            EDITED_MESSAGE,
            EDITED_CHANNEL_POST,
            CALLBACK_QUERY,
            INLINE_QUERY,
            POLL,
            POLL_ANSWER,
            CHOSEN_INLINE_RESULT,
            SHIPPING_QUERY,
            PRE_CHECKOUT_QUERY,
            MY_CHAT_MEMBER,
            CHAT_MEMBER,
            CHAT_JOIN_REQUEST,
            MESSAGE_REACTION,
            MESSAGE_REACTION_COUNT,
            CHAT_BOOST,
            REMOVED_CHAT_BOOST,
            BUSINESS_MESSAGE,
            BUSINESS_CONNECTION,
            EDITED_BUSINESS_MESSAGE,
            DELETED_BUSINESS_MESSAGES
    };
}
