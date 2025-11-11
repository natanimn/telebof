package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.Updates;
import com.google.gson.annotations.SerializedName;

/**
 * This record represents an incoming updates.
 * At most one of the optional parameters can be present in any given update.
 *
 * @param updateId The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
 *                 This identifier becomes especially handy if you're using webhook since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
 *                 If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
 * @param message New incoming message of any kind - text, photo, sticker, etc.
 * @param editedMessage New version of a message that is known to the bot and was edited.
 *                      This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
 * @param channelPost New incoming channel post of any kind - text, photo, sticker, etc.
 * @param editedChannelPost New version of a channel post that is known to the bot and was edited.
 *                          This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
 * @param businessMessage New message from a connected business account
 * @param editedBusinessMessage New version of a message from a connected business account
 * @param callbackQuery New incoming callback query
 * @param inlineQuery New incoming inline query
 * @param chosenInlineResult The result of an inline query that was chosen by a user and sent to their chat partner.
 * @param poll New poll state. Bots receive only updates about manually stopped polls and polls, which are sent by the bot
 * @param pollAnswer A user changed their answer in a non-anonymous poll. Bots receive new votes only in polls that were sent by the bot itself.
 * @param preCheckoutQuery New incoming pre-checkout query. Contains full information about checkout
 * @param shippingQuery New incoming shipping query. Only for invoices with flexible price
 * @param myChatMember The bot's chat member status was updated in a chat.
 *                     For private chats, this update is received only when the bot is blocked or unblocked by the user.
 * @param chatMember A chat member's status was updated in a chat.
 *                   The bot must be an administrator in the chat and must explicitly specify {@link Updates#CHAT_MEMBER} in the list of allowed_updates to receive these updates.
 * @param chatJoinRequest A request to join the chat has been sent.
 *                        The bot must have the can_invite_users administrator right in the chat to receive these updates.
 * @param messageReaction A reaction to a message was changed by a user.
 *                        The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION} in the list of allowed_updates to receive these updates.
 *                        The update isn't received for reactions set by bots.
 * @param messageReactionCount Reactions to a message with anonymous reactions were changed.
 *                             The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION_COUNT} in the list of
 *                             allowed_updates to receive these updates. The updates are grouped and can be sent with delay up to a few minutes.
 * @param chatBoost A chat boost was added or changed. The bot must be an administrator in the chat to receive these updates.
 * @param removedChatBoost A boost was removed from a chat. The bot must be an administrator in the chat to receive these updates.
 * @param businessConnection The bot was connected to or disconnected from a business account, or a user edited an existing connection with the bot
 * @param deletedBusinessMessages Messages were deleted from a connected business account
 * @param purchasedPaidMedia A user purchased paid media with a non-empty payload sent by the bot in a non-channel chat
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Update(
        @SerializedName("update_id") int updateId,
        Message message,
        @SerializedName("edited_message") Message editedMessage,
        @SerializedName("channel_post") Message channelPost,
        @SerializedName("edited_channel_post") Message editedChannelPost,
        @SerializedName("business_message") Message businessMessage,
        @SerializedName("edited_business_message") Message editedBusinessMessage,
        @SerializedName("callback_query") CallbackQuery callbackQuery,
        @SerializedName("inline_query") InlineQuery inlineQuery,
        @SerializedName("chosen_inline_result") ChosenInlineResult chosenInlineResult,
        Poll poll,
        @SerializedName("poll_answer") PollAnswer pollAnswer,
        @SerializedName("pre_checkout_query") PreCheckoutQuery preCheckoutQuery,
        @SerializedName("shipping_query") ShippingQuery shippingQuery,
        @SerializedName("my_chat_member") ChatMemberUpdated myChatMember,
        @SerializedName("chat_member") ChatMemberUpdated chatMember,
        @SerializedName("chat_join_request") ChatJoinRequest chatJoinRequest,
        @SerializedName("message_reaction") MessageReactionUpdated messageReaction,
        @SerializedName("message_reaction_count") MessageReactionCountUpdated messageReactionCount,
        @SerializedName("chat_boost") ChatBoostUpdated chatBoost,
        @SerializedName("removed_chat_boost") ChatBoostRemoved removedChatBoost,
        @SerializedName("business_connection") BusinessConnection businessConnection,
        @SerializedName("deleted_business_messages") BusinessMessagesDeleted deletedBusinessMessages,
        @SerializedName("purchased_paid_media") PaidMediaPurchased purchasedPaidMedia
) implements TelegramUpdate {}