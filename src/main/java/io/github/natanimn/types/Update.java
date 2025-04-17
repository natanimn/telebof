package io.github.natanimn.types;
import java.io.Serializable;
import java.util.Objects;

/** This class represents an incoming updates.
 * At most one of the optional parameters can be present in any given update.
 *
 * @see <a href="https://core.telegram.org/bots/api#Update">Telegram documentation</a>"
 * @author Natanim Negash
 */

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class Update implements Serializable {
    public int update_id;
    public Message message, edited_message, channel_post, edited_channel_post, business_message, edited_business_message;
    public CallbackQuery callback_query;
    public InlineQuery inline_query;
    public ChosenInlineResult chosen_inline_result;
    public Poll poll;
    public PollAnswer poll_answer;
    public PreCheckoutQuery pre_checkout_query;
    public ShippingQuery shipping_query;
    public ChatMemberUpdated my_chat_member, chat_member;
    public ChatJoinRequest chat_join_request;
    public MessageReactionUpdated message_reaction;
    public MessageReactionCountUpdated message_reaction_count;
    public ChatBoostUpdated chat_boost;
    public ChatBoostRemoved removed_chat_boost;
    public BusinessConnection business_connection;
    public BusinessMessagesDeleted deleted_business_messages;
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
