package io.github.natanimn.types.updates;
import io.github.natanimn.types.payments.PaidMediaPurchased;
import io.github.natanimn.enums.Updates;
import java.io.Serializable;
import java.util.Objects;

/** This class represents an incoming updates.
 * At most one of the optional parameters can be present in any given update.
 *
 * @author Natanim
 * @since  3 March 2025
 * @version 0.7
 */
public class Update implements Serializable {
    /**
     * The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
     * This identifier becomes especially handy if you're using webhook since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
     * If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
     */
    public int update_id;

    /**
     * New incoming message of any kind - text, photo, sticker, etc.
     */
    public Message message;

    /**
     * New version of a message that is known to the bot and was edited.
     * This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
     */
    public Message edited_message;

    /**
     * New incoming channel post of any kind - text, photo, sticker, etc.
     */
    public Message channel_post;

    /**
     * New version of a channel post that is known to the bot and was edited.
     * This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
     */
    public Message edited_channel_post;

    /**
     * New message from a connected business account
     */
    public Message business_message;

    /**
     * New version of a message from a connected business account
     */
    public Message edited_business_message;

    /**
     *  New incoming callback query
     */
    public CallbackQuery callback_query;

    /**
     * New incoming inline query
     */
    public InlineQuery inline_query;

    /**
     * The result of an inline query that was chosen by a user and sent to their chat partner.
     */
    public ChosenInlineResult chosen_inline_result;

    /**
     * New poll state. Bots receive only updates about manually stopped polls and polls, which are sent by the bot
     */
    public Poll poll;

    /**
     *  A user changed their answer in a non-anonymous poll. Bots receive new votes only in polls that were sent by the bot itself.
     */
    public PollAnswer poll_answer;

    /**
     * New incoming pre-checkout query. Contains full information about checkout
     */
    public PreCheckoutQuery pre_checkout_query;

    /**
     * New incoming shipping query. Only for invoices with flexible price
     */
    public ShippingQuery shipping_query;

    /**
     * The bot's chat member status was updated in a chat.
     * For private chats, this update is received only when the bot is blocked or unblocked by the user.
     */
    public ChatMemberUpdated my_chat_member;

    /**
     * A chat member's status was updated in a chat.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#CHAT_MEMBER} in the list of allowed_updates to receive these updates.
     */
    public ChatMemberUpdated chat_member;

    /**
     * A request to join the chat has been sent.
     * The bot must have the can_invite_users administrator right in the chat to receive these updates.
     */
    public ChatJoinRequest chat_join_request;

    /**
     * A reaction to a message was changed by a user.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION} in the list of allowed_updates to receive these updates.
     * The update isn't received for reactions set by bots.
     */
    public MessageReactionUpdated message_reaction;

    /**
     * Reactions to a message with anonymous reactions were changed.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION_COUNT} in the list of
     * allowed_updates to receive these updates. The updates are grouped and can be sent with delay up to a few minutes.
     */
    public MessageReactionCountUpdated message_reaction_count;

    /**
     * A chat boost was added or changed. The bot must be an administrator in the chat to receive these updates.
     */
    public ChatBoostUpdated chat_boost;

    /**
     * A boost was removed from a chat. The bot must be an administrator in the chat to receive these updates.
     */
    public ChatBoostRemoved removed_chat_boost;

    /**
     * The bot was connected to or disconnected from a business account, or a user edited an existing connection with the bot
     */
    public BusinessConnection business_connection;

    /**
     * Messages were deleted from a connected business account
     */
    public BusinessMessagesDeleted deleted_business_messages;

    /**
     * A user purchased paid media with a non-empty payload sent by the bot in a non-channel chat
     */
    public PaidMediaPurchased purchased_paid_media;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Update update = (Update) object;
        return update_id == update.update_id && Objects.equals(message, update.message) &&
                Objects.equals(edited_message, update.edited_message) &&
                Objects.equals(channel_post, update.channel_post) &&
                Objects.equals(edited_channel_post, update.edited_channel_post) &&
                Objects.equals(business_message, update.business_message) &&
                Objects.equals(edited_business_message, update.edited_business_message) &&
                Objects.equals(callback_query, update.callback_query) &&
                Objects.equals(inline_query, update.inline_query) &&
                Objects.equals(chosen_inline_result, update.chosen_inline_result) &&
                Objects.equals(poll, update.poll) && Objects.equals(poll_answer, update.poll_answer) &&
                Objects.equals(pre_checkout_query, update.pre_checkout_query) &&
                Objects.equals(shipping_query, update.shipping_query) &&
                Objects.equals(my_chat_member, update.my_chat_member) &&
                Objects.equals(chat_member, update.chat_member) &&
                Objects.equals(chat_join_request, update.chat_join_request) &&
                Objects.equals(message_reaction, update.message_reaction) &&
                Objects.equals(message_reaction_count, update.message_reaction_count) &&
                Objects.equals(chat_boost, update.chat_boost) &&
                Objects.equals(removed_chat_boost, update.removed_chat_boost) &&
                Objects.equals(business_connection, update.business_connection) &&
                Objects.equals(deleted_business_messages, update.deleted_business_messages) &&
                Objects.equals(purchased_paid_media, update.purchased_paid_media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(update_id, message, edited_message, channel_post, edited_channel_post, business_message,
                edited_business_message, callback_query, inline_query, chosen_inline_result, poll, poll_answer,
                pre_checkout_query, shipping_query, my_chat_member, chat_member, chat_join_request, message_reaction,
                message_reaction_count, chat_boost, removed_chat_boost, business_connection, deleted_business_messages,
                purchased_paid_media);
    }


    @Override
    public String toString() {
        return "Update{" +
                "update_id=" + update_id +
                ", message=" + message +
                ", edited_message=" + edited_message +
                ", channel_post=" + channel_post +
                ", edited_channel_post=" + edited_channel_post +
                ", business_message=" + business_message +
                ", edited_business_message=" + edited_business_message +
                ", callback_query=" + callback_query +
                ", inline_query=" + inline_query +
                ", chosen_inline_result=" + chosen_inline_result +
                ", poll=" + poll +
                ", poll_answer=" + poll_answer +
                ", pre_checkout_query=" + pre_checkout_query +
                ", shipping_query=" + shipping_query +
                ", my_chat_member=" + my_chat_member +
                ", chat_member=" + chat_member +
                ", chat_join_request=" + chat_join_request +
                ", message_reaction=" + message_reaction +
                ", message_reaction_count=" + message_reaction_count +
                ", chat_boost=" + chat_boost +
                ", removed_chat_boost=" + removed_chat_boost +
                ", business_connection=" + business_connection +
                ", deleted_business_messages=" + deleted_business_messages +
                ", purchased_paid_media=" + purchased_paid_media +
                '}';
    }
}
