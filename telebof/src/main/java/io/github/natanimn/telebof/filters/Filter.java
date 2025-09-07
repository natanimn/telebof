package io.github.natanimn.telebof.filters;

import io.github.natanimn.telebof.Util;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.types.media_and_service.*;
import io.github.natanimn.telebof.types.chat_and_user.ChatBackground;
import io.github.natanimn.telebof.types.chat_and_user.ChatBoostAdded;
import io.github.natanimn.telebof.types.gift_and_giveaway.Giveaway;
import io.github.natanimn.telebof.types.gift_and_giveaway.GiveawayCompleted;
import io.github.natanimn.telebof.types.gift_and_giveaway.GiveawayCreated;
import io.github.natanimn.telebof.types.passport.PassportData;
import io.github.natanimn.telebof.types.payments.RefundedPayment;
import io.github.natanimn.telebof.types.updates.Update;
import io.github.natanimn.telebof.states.StateMemoryStorage;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.web.WebAppData;

import java.util.List;
import java.util.regex.Pattern;

/**
 * A class for filtering updates
 * @author Natanim
 * @since 3 March 2025
 * @version 1.1.0
 */
public class Filter{
    private final Update update;
    private final StateMemoryStorage storage;

    /**
     * Required
     * @param update an updated
     * @param storage state storage.
     */
    public Filter(Update update, StateMemoryStorage storage){
        this.update = update;
        this.storage = storage;
    }

    /**
     * Filter text messages.
     * @return {@link Boolean}
     */
    public Boolean text(){
        return getText() != null;
    }

    /**
     * Filter messages sent in private chats.
     * @return {@link Boolean}
     */
    public Boolean Private(){
        return chatType(ChatType.PRIVATE);
    }

    /**
     * Filter messages sent in channels.
     * @return {@link Boolean}
     */
    public Boolean channel(){
        return chatType(ChatType.CHANNEL);
    }

    /**
     * Filter messages sent in supergroup chats.
     * @return {@link Boolean}
     */
    public Boolean supergroup(){
        return chatType(ChatType.SUPERGROUP);
    }

    /**
     * Filter messages sent in group chats.
     * @return {@link Boolean}
     */
    public Boolean group(){
        return chatType(ChatType.GROUP);
    }

    /**
     * Filter messages that contain {@link PhotoSize} objects.
     * @return {@link Boolean}
     */
    public Boolean photo(){
        return getPhoto() != null;
    }

    /**
     * Filter messages that contain {@link Video} objects.
     * @return {@link Boolean}
     */
    public Boolean video(){
        return getVideo() != null;
    }

    /**
     * Filter messages that contain {@link Voice} objects.
     * @return {@link Boolean}
     */
    public Boolean voice(){
        return getVoice() != null;
    }

    /**
     * Filter messages that contain {@link Document} objects.
     * @return {@link Boolean}
     */
    public Boolean document(){
        return getDocument() != null;
    }

    /**
     * Filter messages that contain {@link VideoNote} objects.
     * @return {@link Boolean}
     */
    public Boolean videoNote(){
        return getVideoNote() != null;
    }

    /**
     * Filter messages that contain {@link Animation} objects.
     * @return {@link Boolean}
     */
    public Boolean animation(){
        return getAnimation() != null;
    }

    /**
     * Filter messages that contain {@link Contact} objects.
     * @return {@link Boolean}
     */
    public Boolean contact(){
        return getContact() != null;
    }

    /**
     * Filter messages that contain {@link Location} objects.
     * @return {@link Boolean}
     */
    public Boolean location(){
        return getLocation() != null;
    }

    /**
     * Filter messages that contain {@link Venue} objects.
     * @return {@link Boolean}
     */
    public Boolean venue(){
        return getVenue() != null;
    }

    /**
     * Filter messages that contain {@link Game} objects.
     * @return {@link Boolean}
     */
    public Boolean game(){
        return getGame() != null;
    }

    /**
     * Filter messages that contain {@link Dice} objects.
     * @return {@link Boolean}
     */
    public Boolean dice(){
        return getDice() != null;
    }

    /**
     * Filter messages that contain {@link Sticker} objects.
     * @return {@link Boolean}
     */
    public Boolean sticker(){
        return getSticker() != null ;
    }

    /**
     * Filter messages that contain {@link Audio} objects.
     * @return {@link Boolean}
     */
    public Boolean audio(){
        return getAudio() != null;
    }

    /**
     * Filter messages that contain {@link Invoice} objects.
     * @return {@link Boolean}
     */
    public Boolean invoice(){
        return getInvoice() != null;
    }

    /**
     * Filter messages that contain {@link TextQuote} objects.
     * @return {@link Boolean}
     */
    public Boolean quote(){
        return getQuote() != null;
    }

    /**
     * Filter messages that contain {@link Giveaway} objects.
     * @return {@link Boolean}
     */
    public Boolean giveaway(){
        return getGiveaway() != null;
    }

    /**
     * Filter media messages.
     * <br>
     * A media message contains any of the following fields set: {@link Audio}, {@link Document}, {@link PhotoSize},
     * {@link Sticker}, {@link Video}, {@link Animation}, {@link Voice}, {@link VideoNote}.
     * @return {@link Boolean}
     */
    public Boolean media(){
        return update.message !=null && (photo() || video() || videoNote() || sticker() || audio() || animation() || document() || voice() );
    }

    /**
     * Filter service messages for new chat members.
     * @return {@link Boolean}
     */
    public Boolean newChatMember(){
        return update.message !=null && update.message.new_chat_members != null;
    }

    /**
     * Filter service messages for left chat member.
     * @return {@link Boolean}
     */
    public Boolean leftChatMember(){
        return update.message !=null && update.message.left_chat_member != null;
    }

    /**
     * Filter service messages for new pinned message.
     * @return {@link Boolean}
     */
    public Boolean pinnedMessage(){
        return getPinnedMessage() != null;
    }

    /**
     * Filter service messages for new chat phot.
     * @return {@link Boolean}
     */
    public Boolean newChatPhoto(){
        return update.message !=null && update.message.new_chat_photo != null;
    }

    /**
     * Filter service messages for new chat title.
     * @return {@link Boolean}
     */
    public Boolean newChatTitle(){
        return update.message !=null && update.message.new_chat_title != null;
    }

    /**
     * Filter service messages for group chat created.
     * @return {@link Boolean}
     */
    public Boolean groupCreated(){
        return update.message !=null && update.message.group_chat_created != null;
    }

    /**
     * Filter service messages for supergroup chat created.
     * @return {@link Boolean}
     */
    public Boolean supergroupCreated(){
        return update.message !=null && update.message.supergroup_chat_created != null;
    }

    /**
     * Filter service messages for channel deleted.
     * @return {@link Boolean}
     */
    public Boolean channelCreated(){
        return update.message !=null && update.message.channel_chat_created != null;
    }

    /**
     * Filter service messages for message auto timer changed.
     * @return {@link Boolean}
     */
    public Boolean messageAutoDeleteTimerChanged(){
        return update.message !=null && update.message.message_auto_delete_timer_changed != null;
    }

    /**
     * Filter service messages for migration from group to supergroup and vice versa
     * @return {@link Boolean}
     */
    public Boolean migrated(){
        return update.message !=null && (update.message.migrate_to_chat_id != null || update.message.migrate_from_chat_id != null);
    }

    /**
     * Filter service messages for successful payment.
     * @return {@link Boolean}
     */
    public Boolean successfulPayment() {
        return update.message != null && update.message.successful_payment != null;
    }

    /**
     * Filter service messages for proximity alert triggered.
     * @return {@link Boolean}
     */
    public Boolean proximityAlertTriggered() {
        return update.message != null && update.message.proximity_alert_triggered != null;
    }

    /**
     * Filter service messages for forum topic created.
     * @return {@link Boolean}
     */
    public Boolean forumTopicCreated() {
        return update.message != null && update.message.forum_topic_edited != null;
    }

    /**
     * Filter service messages for forum topic edited.
     * @return {@link Boolean}
     */
    public Boolean forumTopicEdited() {
        return update.message != null && update.message.forum_topic_edited != null;
    }

    /**
     * Filter service messages for forum topic closed.
     * @return {@link Boolean}
     */
    public Boolean forumTopicClosed() {
        return update.message != null && update.message.forum_topic_closed != null;
    }

    /**
     * Filter service messages for forum topic reopened.
     * @return {@link Boolean}
     */
    public Boolean forumTopicReopened() {
        return update.message != null && update.message.forum_topic_reopened != null;
    }

    /**
     * Filter service messages for video chat started.
     * @return {@link Boolean}
     */
    public Boolean videoChatStarted() {
        return getVideoChatStarted() != null;
    }

    /**
     * Filter service messages for video chat scheduled.
     * @return {@link Boolean}
     */
    public Boolean videoChatScheduled() {
        return getVideoChatScheduled() != null;
    }

    /**
     * Filter service messages for video chat participant invited.
     * @return {@link Boolean}
     */
    public Boolean videoChatParticipantInvited() {
        return getVideoChatParticipantInvited() != null;
    }

    /**
     * Filter service messages for video chat ended.
     * @return {@link Boolean}
     */
    public Boolean videoChatEnded() {
        return getVideoChatEnded() != null;
    }

    /**
     * Filter service messages for forwarded messages.
     * @return {@link Boolean}
     */
    public Boolean forwarded() {
        return getForwardedMessage() != null;
    }

    /**
     * Filter service messages for replied messages.
     * @return {@link Boolean}
     */
    public Boolean replied() {
        return getRepliedMessage() != null;
    }

    /**
     * Filter service messages for replied to story messages.
     * @return {@link Boolean}
     */
    public Boolean repliedToStory() {
        return update.message != null && update.message.reply_to_story != null;
    }

    /**
     * Filter messages coming from bots.
     * @return {@link Boolean}
     */
    public Boolean bot() {
        return isBot();
    }

    /**
     * Filter service messages for giveaway created.
     * @return {@link Boolean}
     */
    public Boolean giveawayCreated() {
        return getGiveawayCreated() != null;
    }

    /**
     * Filter service messages for giveaway completed.
     * @return {@link Boolean}
     */
    public Boolean giveawayCompleted() {
        return getGiveawayCompleted() != null;
    }

    /**
     * Filter service messages for boost added.
     * @return {@link Boolean}
     */
    public Boolean boostAdded() {
        return getBoostAdded() != null;
    }

    /**
     * Filter service messages for users shared.
     * @return {@link Boolean}
     */
    public Boolean usersShared() {
        return update.message != null && update.message.users_shared != null;
    }

    /**
     * Filter service messages for writing access allowed.
     * @return {@link Boolean}
     */
    public Boolean writeAccessAllowed() {
        return update.message != null && update.message.write_access_allowed != null;
    }

    /**
     * Filter messages for containing {@link io.github.natanimn.telebof.types.checklist.Checklist}
     * @return {@link Boolean}
     */
    public Boolean checklist(){
        return update.message != null && update.message.checklist != null;
    }


    /**
     * Filter service messages for checklist tasks done
     * @return {@link Boolean}
     */
    public Boolean checklistTasksDone(){
        return update.message != null && update.message.checklist_tasks_done != null;
    }

    /**
     * Filter service messages for checklist tasks added
     * @return {@link Boolean}
     */
    public Boolean checklistTasksAdded(){
        return update.message != null && update.message.checklist_tasks_added != null;
    }

    /**
     * Filter service messages for direct message price changed
     * @return {@link Boolean}
     */
    public Boolean directMessagePriceChanged(){
        return update.message != null && update.message.direct_message_price_changed != null;
    }

    /**
     * Filter messages for containing {@link MessageEntity}.
     * @return {@link Boolean}
     */
    public Boolean entities() {
        return getEntities() != null;
    }

    /**
     * Filter service messages for gchat background set.
     * @return {@link Boolean}
     */
    public Boolean chatBackgroundSet() {
        return getChatBackgroundSet() != null;
    }

    /**
     * Filter service messages for chat shared.
     * @return {@link Boolean}
     */
    public Boolean chatShared() {
        return update.message != null && update.message.chat_shared != null;
    }

    /**
     * Filter inline query for empty query.
     * @return {@link Boolean}
     */
    public Boolean emptyQuery(){
        return update.inline_query != null && update.inline_query.query.isEmpty();
    }

    /**
     * Filter messages contain {@link WebAppData}.
     * @return {@link Boolean}
     */
    public Boolean webAppData(){
        return getWebAppData() != null;
    }

    /**
     * Filter messages contain {@link PassportData}.
     * @return {@link Boolean}
     */
    public Boolean passportData(){
        return getPassportData() != null;
    }

    /**
     * Filter service messages for refunded payment.
     * @return {@link Boolean}
     */
    public Boolean refundedPayment(){
        return getRefundedPayment() != null;
    }

    /**
     * Filter service messages for approved suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostApproved(){
        return update.message != null && update.message.suggested_post_approved != null;
    }

    /**
     * Filter service messages for approval failed suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostApprovalFailed(){
        return update.message != null && update.message.suggested_post_approval_failed != null;
    }

    /**
     * Filter service messages for declined suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostDeclined(){
        return update.message != null && update.message.suggested_post_declined != null;
    }

    /**
     * Filter service messages for paid suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostPaid(){
        return update.message != null && update.message.suggested_post_paid != null;
    }

    /**
     * Filter service messages for refunded suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostRefunded(){
        return (update.message != null && update.message.suggested_post_refunded != null);
    }

    /**
     * Filter commands
     * @param commands The command or array of commands as string
     * @return {@link Boolean}
     */
    public boolean commands(String... commands){
        if (getText() == null) return false;
        String command = Util.extractCommand(getText());
        if (command == null) return false;
        return List.of(commands).contains(command);
    }


    private boolean chatType(ChatType chat){
        if (update.message!=null) return update.message.chat.type == chat;
        else if (update.callback_query != null) return update.callback_query.message.chat.type == chat;
        else if (update.edited_message != null) return update.edited_message.chat.type == chat;
        else if (update.inline_query != null) return update.inline_query.chat_type == chat;
        else return false;
    }

    /**
     * Filter callback data of inline button
     * @param data The callback data
     * @return {@link Boolean}
     */
    public boolean callbackData(String... data){
        if (update.callback_query == null) return false;
        String _data = update.callback_query.data;
        if (_data == null) return false;
        return List.of(data).contains(_data);
    }

    /**
     * Filter query of inline query
     * @param queries The query
     * @return {@link Boolean}
     */
    public boolean inlineQuery(String... queries){
        if (update.inline_query == null) return false;
        String query = update.inline_query.query;
        if (query == null) return false;
        return List.of(queries).contains(query);
    }

    /**
     * Creates a custom filter.<br>
     * Custom filters give you extra control over which updates are allowed or not to be processed by your handlers.
     * @param customFilter The custom filter
     * @return {@link Boolean}
     */
    public boolean customFilter(CustomFilter customFilter){
        try {
            return customFilter.check(update);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Filters state
     * @param name state name
     * @return {@link Boolean}
     */
    public boolean state(String name){
        Message message;
        User user;

        if (update.message != null) {
            // In accessible message
            if (update.message.date == 0) return false;

            message = update.message;
            user = message.from;
        }

        else if (update.callback_query != null){
            // In accessible message
            if (update.callback_query.message.date == 0) return false;

            message = update.callback_query.message;
            user = update.callback_query.from;
        }

        else return false;

        String chatStateName = storage.getName(message.from.id, user.id);
        String userStateName = storage.getName(user.id);

        if (name.equals("*") && (chatStateName != null || userStateName != null)) return true;
        else if (chatStateName != null) return chatStateName.equals(name);
        else if (userStateName != null) return userStateName.equals(name);
        else return false;
    }

    /**
     * Filter messages containing a given texts
     * @param texts The text
     * @return {@link Boolean}
     */
    public boolean texts(String... texts){
        if (text()){
            return List.of(texts).contains(getText());
        } else return false;
    }

    /**
     * Filter updates that match a given regular expression pattern.
     * @param pattern regex pattern
     * @return {@link Boolean}
     */
    public boolean regex(String pattern){
        String text = getText();
        Pattern instance = Pattern.compile(pattern);

        if (text == null) {
            if (update.callback_query != null){
                String data = update.callback_query.data;
                return instance.matcher(data).find();
            } else if (update.inline_query != null) {
                String query = update.inline_query.query;
                return instance.matcher(query).find();
            } else if (update.pre_checkout_query != null){
              String payload = update.pre_checkout_query.invoice_payload;
              return instance.matcher(payload).find();
            } else {
                return false;
            }
        }

        return instance.matcher(text).find();
    }

    /**
     * Filter updates that match a chat id.
     * @param ids chat ids
     * @return {@link Boolean}
     */
    public boolean chatIds(Long... ids){
        List<Long> chatsId = List.of(ids);
        if (update.message !=null) return chatsId.contains(update.message.chat.id);
        else if (update.channel_post !=null) return chatsId.contains(update.channel_post.chat.id);
        else if (update.business_message !=null) return chatsId.contains(update.business_message.chat.id);
        else if (update.edited_channel_post !=null) return chatsId.contains(update.edited_channel_post.chat.id);
        else if (update.callback_query !=null) return chatsId.contains(update.callback_query.message.chat.id);
        else if (update.edited_message !=null) return chatsId.contains(update.edited_message.chat.id);
        else if (update.edited_business_message !=null) return chatsId.contains(update.edited_business_message.chat.id);
        else return false;
    }

    /**
     * Filter updates that match a user id.
     * @param ids user ids
     * @return {@link Boolean}
     */
    public boolean fromIds(Long... ids){
        List<Long> usersId = List.of(ids);
        if (update.message !=null) return usersId.contains(update.message.from.id);
        else if (update.channel_post !=null) return usersId.contains(update.channel_post.from.id);
        else if (update.business_message !=null) return usersId.contains(update.business_message.from.id);
        else if (update.edited_channel_post !=null) return usersId.contains(update.edited_channel_post.from.id);
        else if (update.callback_query !=null) return usersId.contains(update.callback_query.from.id);
        else if (update.inline_query !=null) return usersId.contains(update.inline_query.from.id);
        else if (update.edited_message !=null) return usersId.contains(update.edited_message.from.id);
        else if (update.edited_business_message !=null) return usersId.contains(update.edited_business_message.from.id);
        else return false;
    }

    /**
     * Filter updates that match a given chat username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean chatUsernames(String... usernames){
        List<String> chatUsernames = List.of(usernames);
        if (update.message !=null) return chatUsernames.contains(update.message.chat.username);
        else if (update.channel_post !=null) return chatUsernames.contains(update.channel_post.chat.username);
        else if (update.business_message !=null) return chatUsernames.contains(update.business_message.chat.username);
        else if (update.edited_channel_post !=null) return chatUsernames.contains(update.edited_channel_post.chat.username);
        else if (update.callback_query !=null) return chatUsernames.contains(update.callback_query.message.chat.username);
        else if (update.edited_message !=null) return chatUsernames.contains(update.edited_message.chat.username);
        else if (update.edited_business_message !=null) return chatUsernames.contains(update.edited_business_message.chat.username);
        else return false;
    }

    /**
     * Filter updates that match a given user's username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean usernames(String... usernames){
        List<String> $usernames = List.of(usernames);
        if (update.message !=null) return $usernames.contains(update.message.from.username);
        else if (update.channel_post !=null) return $usernames.contains(update.channel_post.from.username);
        else if (update.business_message !=null) return $usernames.contains(update.business_message.from.username);
        else if (update.edited_channel_post !=null) return $usernames.contains(update.edited_channel_post.from.username);
        else if (update.callback_query !=null) return $usernames.contains(update.callback_query.message.from.username);
        else if (update.edited_message !=null) return $usernames.contains(update.edited_message.from.username);
        else if (update.edited_business_message !=null) return $usernames.contains(update.edited_business_message.from.username);
        else return false;
    }

    /**
     * Filter reactions that match a given reaction.
     * @param react reactions
     * @return {@link Boolean}
     */
    public boolean reaction(String react){
        if (update.message_reaction != null){
            for (ReactionType reactionType: update.message_reaction.new_reaction){
                if (reactionType.emoji.equals(react)) return true;
            };
        }
        return false;
    }
    private String getText(){
        if (update.message != null) return update.message.text;
        else if (update.edited_message != null) return update.edited_message.text;
        else if (update.edited_business_message != null) return update.edited_business_message.text;
        else if (update.edited_channel_post != null) return update.edited_channel_post.text;
        else if (update.channel_post != null) return update.channel_post.text;
        else if (update.business_message != null) return update.business_message.text;
        else return null;
    }

    private List<PhotoSize> getPhoto(){
        if (update.message != null) return update.message.photo;
        else if (update.edited_message != null) return update.edited_message.photo;
        else if (update.edited_business_message != null) return update.edited_business_message.photo;
        else if (update.edited_channel_post != null) return update.edited_channel_post.photo;
        else if (update.channel_post != null) return update.channel_post.photo;
        else if (update.business_message != null) return update.business_message.photo;
        else return null;
    }

    private Video getVideo(){
        if (update.message != null) return update.message.video;
        else if (update.edited_message != null) return update.edited_message.video;
        else if (update.edited_business_message != null) return update.edited_business_message.video;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video;
        else if (update.channel_post != null) return update.channel_post.video;
        else if (update.business_message != null) return update.business_message.video;
        else return null;
    }

    private Document getDocument(){
        if (update.message != null) return update.message.document;
        else if (update.edited_message != null) return update.edited_message.document;
        else if (update.edited_business_message != null) return update.edited_business_message.document;
        else if (update.edited_channel_post != null) return update.edited_channel_post.document;
        else if (update.channel_post != null) return update.channel_post.document;
        else if (update.business_message != null) return update.business_message.document;
        else return null;
    }

    private Animation getAnimation(){
        if (update.message != null) return update.message.animation;
        else if (update.edited_message != null) return update.edited_message.animation;
        else if (update.edited_business_message != null) return update.edited_business_message.animation;
        else if (update.edited_channel_post != null) return update.edited_channel_post.animation;
        else if (update.channel_post != null) return update.channel_post.animation;
        else if (update.business_message != null) return update.business_message.animation;
        else return null;
    }

    private Audio getAudio(){
        if (update.message != null) return update.message.audio;
        else if (update.edited_message != null) return update.edited_message.audio;
        else if (update.edited_business_message != null) return update.edited_business_message.audio;
        else if (update.edited_channel_post != null) return update.edited_channel_post.audio;
        else if (update.channel_post != null) return update.channel_post.audio;
        else if (update.business_message != null) return update.business_message.audio;
        else return null;
    }

    private Voice getVoice(){
        if (update.message != null) return update.message.voice;
        else if (update.edited_message != null) return update.edited_message.voice;
        else if (update.edited_business_message != null) return update.edited_business_message.voice;
        else if (update.edited_channel_post != null) return update.edited_channel_post.voice;
        else if (update.channel_post != null) return update.channel_post.voice;
        else if (update.business_message != null) return update.business_message.voice;
        else return null;
    }

    private VideoNote getVideoNote(){
        if (update.message != null) return update.message.video_note;
        else if (update.edited_message != null) return update.edited_message.video_note;
        else if (update.edited_business_message != null) return update.edited_business_message.video_note;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video_note;
        else if (update.channel_post != null) return update.channel_post.video_note;
        else if (update.business_message != null) return update.business_message.video_note;
        else return null;
    }

    private Contact getContact(){
        if (update.message != null) return update.message.contact;
        else if (update.edited_message != null) return update.edited_message.contact;
        else if (update.edited_business_message != null) return update.edited_business_message.contact;
        else if (update.edited_channel_post != null) return update.edited_channel_post.contact;
        else if (update.channel_post != null) return update.channel_post.contact;
        else if (update.business_message != null) return update.business_message.contact;
        else return null;
    }

    private List<MessageEntity> getEntities(){
        if (update.message != null) return update.message.entities;
        else if (update.edited_message != null) return update.edited_message.entities;
        else if (update.edited_business_message != null) return update.edited_business_message.entities;
        else if (update.edited_channel_post != null) return update.edited_channel_post.entities;
        else if (update.channel_post != null) return update.channel_post.entities;
        else if (update.business_message != null) return update.business_message.entities;
        else return null;
    }

    private RefundedPayment getRefundedPayment(){
        if (update.message != null) return update.message.refunded_payment;
        else if (update.edited_message != null) return update.edited_message.refunded_payment;
        else if (update.edited_business_message != null) return update.edited_business_message.refunded_payment;
        else if (update.edited_channel_post != null) return update.edited_channel_post.refunded_payment;
        else if (update.channel_post != null) return update.channel_post.refunded_payment;
        else if (update.business_message != null) return update.business_message.refunded_payment;
        else return null;
    }

    private MessageOrigin getForwardedMessage(){
        if (update.message != null) return update.message.forward_origin;
        else if (update.edited_message != null) return update.edited_message.forward_origin;
        else if (update.edited_business_message != null) return update.edited_business_message.forward_origin;
        else if (update.edited_channel_post != null) return update.edited_channel_post.forward_origin;
        else if (update.channel_post != null) return update.channel_post.forward_origin;
        else if (update.business_message != null) return update.business_message.forward_origin;
        else return null;
    }

    private Message getRepliedMessage(){
        if (update.message != null) return update.message.reply_to_message;
        else if (update.edited_message != null) return update.edited_message.reply_to_message;
        else if (update.edited_business_message != null) return update.edited_business_message.reply_to_message;
        else if (update.edited_channel_post != null) return update.edited_channel_post.reply_to_message;
        else if (update.channel_post != null) return update.channel_post.reply_to_message;
        else if (update.business_message != null) return update.business_message.reply_to_message;
        else return null;
    }

    private Invoice getInvoice(){
        if (update.message != null) return update.message.invoice;
        else if (update.edited_message != null) return update.edited_message.invoice;
        else if (update.edited_business_message != null) return update.edited_business_message.invoice;
        else if (update.edited_channel_post != null) return update.edited_channel_post.invoice;
        else if (update.channel_post != null) return update.channel_post.invoice;
        else if (update.business_message != null) return update.business_message.invoice;
        else return null;
    }

    private Sticker getSticker(){
        if (update.message != null) return update.message.sticker;
        else if (update.edited_message != null) return update.edited_message.sticker;
        else if (update.edited_business_message != null) return update.edited_business_message.sticker;
        else if (update.edited_channel_post != null) return update.edited_channel_post.sticker;
        else if (update.channel_post != null) return update.channel_post.sticker;
        else if (update.business_message != null) return update.business_message.sticker;
        else return null;
    }

    private Location getLocation(){
        if (update.message != null) return update.message.location;
        else if (update.edited_message != null) return update.edited_message.location;
        else if (update.edited_business_message != null) return update.edited_business_message.location;
        else if (update.edited_channel_post != null) return update.edited_channel_post.location;
        else if (update.channel_post != null) return update.channel_post.location;
        else if (update.business_message != null) return update.business_message.location;
        else return null;
    }


    private Venue getVenue(){
        if (update.message != null) return update.message.venue;
        else if (update.edited_message != null) return update.edited_message.venue;
        else if (update.edited_business_message != null) return update.edited_business_message.venue;
        else if (update.edited_channel_post != null) return update.edited_channel_post.venue;
        else if (update.channel_post != null) return update.channel_post.venue;
        else if (update.business_message != null) return update.business_message.venue;
        else return null;
    }

    private Game getGame(){
        if (update.message != null) return update.message.game;
        else if (update.edited_message != null) return update.edited_message.game;
        else if (update.edited_business_message != null) return update.edited_business_message.game;
        else if (update.edited_channel_post != null) return update.edited_channel_post.game;
        else if (update.channel_post != null) return update.channel_post.game;
        else if (update.business_message != null) return update.business_message.game;
        else return null;
    }

    private Dice getDice(){
        if (update.message != null) return update.message.dice;
        else if (update.edited_message != null) return update.edited_message.dice;
        else if (update.edited_business_message != null) return update.edited_business_message.dice;
        else if (update.edited_channel_post != null) return update.edited_channel_post.dice;
        else if (update.channel_post != null) return update.channel_post.dice;
        else if (update.business_message != null) return update.business_message.dice;
        else return null;
    }

    private TextQuote getQuote(){
        if (update.message != null) return update.message.quote;
        else if (update.edited_message != null) return update.edited_message.quote;
        else if (update.edited_business_message != null) return update.edited_business_message.quote;
        else if (update.edited_channel_post != null) return update.edited_channel_post.quote;
        else if (update.channel_post != null) return update.channel_post.quote;
        else if (update.business_message != null) return update.business_message.quote;
        else return null;
    }

    private Giveaway getGiveaway(){
        if (update.message != null) return update.message.giveaway;
        else if (update.edited_message != null) return update.edited_message.giveaway;
        else if (update.edited_business_message != null) return update.edited_business_message.giveaway;
        else if (update.edited_channel_post != null) return update.edited_channel_post.giveaway;
        else if (update.channel_post != null) return update.channel_post.giveaway;
        else if (update.business_message != null) return update.business_message.giveaway;
        else return null;
    }

    private GiveawayCompleted getGiveawayCompleted(){
        if (update.message != null) return update.message.giveaway_completed;
        else if (update.edited_message != null) return update.edited_message.giveaway_completed;
        else if (update.edited_business_message != null) return update.edited_business_message.giveaway_completed;
        else if (update.edited_channel_post != null) return update.edited_channel_post.giveaway_completed;
        else if (update.channel_post != null) return update.channel_post.giveaway_completed;
        else if (update.business_message != null) return update.business_message.giveaway_completed;
        else return null;
    }

    private GiveawayCreated getGiveawayCreated(){
        if (update.message != null) return update.message.giveaway_created;
        else if (update.edited_message != null) return update.edited_message.giveaway_created;
        else if (update.edited_business_message != null) return update.edited_business_message.giveaway_created;
        else if (update.edited_channel_post != null) return update.edited_channel_post.giveaway_created;
        else if (update.channel_post != null) return update.channel_post.giveaway_created;
        else if (update.business_message != null) return update.business_message.giveaway_created;
        else return null;
    }

    private Message getPinnedMessage(){
        if (update.message != null) return update.message.pinned_message;
        else if (update.edited_message != null) return update.edited_message.pinned_message;
        else if (update.edited_business_message != null) return update.edited_business_message.pinned_message;
        else if (update.edited_channel_post != null) return update.edited_channel_post.pinned_message;
        else if (update.channel_post != null) return update.channel_post.pinned_message;
        else if (update.business_message != null) return update.business_message.pinned_message;
        else return null;
    }

    private VideoChatStarted getVideoChatStarted(){
        if (update.message != null) return update.message.video_chat_started;
        else if (update.edited_message != null) return update.edited_message.video_chat_started;
        else if (update.edited_business_message != null) return update.edited_business_message.video_chat_started;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video_chat_started;
        else if (update.channel_post != null) return update.channel_post.video_chat_started;
        else if (update.business_message != null) return update.business_message.video_chat_started;
        else return null;
    }

    private VideoChatScheduled getVideoChatScheduled(){
        if (update.message != null) return update.message.video_chat_scheduled;
        else if (update.edited_message != null) return update.edited_message.video_chat_scheduled;
        else if (update.edited_business_message != null) return update.edited_business_message.video_chat_scheduled;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video_chat_scheduled;
        else if (update.channel_post != null) return update.channel_post.video_chat_scheduled;
        else if (update.business_message != null) return update.business_message.video_chat_scheduled;
        else return null;
    }

    private VideoChatEnded getVideoChatEnded(){
        if (update.message != null) return update.message.video_chat_ended;
        else if (update.edited_message != null) return update.edited_message.video_chat_ended;
        else if (update.edited_business_message != null) return update.edited_business_message.video_chat_ended;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video_chat_ended;
        else if (update.channel_post != null) return update.channel_post.video_chat_ended;
        else if (update.business_message != null) return update.business_message.video_chat_ended;
        else return null;
    }

    private VideoChatParticipantsInvited getVideoChatParticipantInvited(){
        if (update.message != null) return update.message.video_chat_participants_invited;
        else if (update.edited_message != null) return update.edited_message.video_chat_participants_invited;
        else if (update.edited_business_message != null) return update.edited_business_message.video_chat_participants_invited;
        else if (update.edited_channel_post != null) return update.edited_channel_post.video_chat_participants_invited;
        else if (update.channel_post != null) return update.channel_post.video_chat_participants_invited;
        else if (update.business_message != null) return update.business_message.video_chat_participants_invited;
        else return null;
    }

    private Boolean isBot(){
        if (update.message != null) return update.message.from.is_bot;
        else if (update.edited_message != null) return update.edited_message.from.is_bot;
        else if (update.edited_business_message != null) return update.edited_business_message.from.is_bot;
        else if (update.edited_channel_post != null) return update.edited_channel_post.from.is_bot;
        else if (update.channel_post != null) return update.channel_post.from.is_bot;
        else if (update.business_message != null) return update.business_message.from.is_bot;
        else if (update.callback_query != null) return update.callback_query.from.is_bot;
        else if (update.inline_query != null) return update.inline_query.from.is_bot;
        else return null;
    }

    private ChatBoostAdded getBoostAdded(){
        if (update.message != null) return update.message.boost_added;
        else if (update.edited_message != null) return update.edited_message.boost_added;
        else if (update.edited_business_message != null) return update.edited_business_message.boost_added;
        else if (update.edited_channel_post != null) return update.edited_channel_post.boost_added;
        else if (update.channel_post != null) return update.channel_post.boost_added;
        else if (update.business_message != null) return update.business_message.boost_added;
        else return null;
    }

    private ChatBackground getChatBackgroundSet(){
        if (update.message != null) return update.message.chat_background_set;
        else if (update.edited_message != null) return update.edited_message.chat_background_set;
        else if (update.edited_business_message != null) return update.edited_business_message.chat_background_set;
        else if (update.edited_channel_post != null) return update.edited_channel_post.chat_background_set;
        else if (update.channel_post != null) return update.channel_post.chat_background_set;
        else if (update.business_message != null) return update.business_message.chat_background_set;
        else return null;
    }

    private WebAppData getWebAppData(){
        if (update.message != null) return update.message.web_app_data;
        else if (update.edited_message != null) return update.edited_message.web_app_data;
        else if (update.edited_business_message != null) return update.edited_business_message.web_app_data;
        else if (update.edited_channel_post != null) return update.edited_channel_post.web_app_data;
        else if (update.channel_post != null) return update.channel_post.web_app_data;
        else if (update.business_message != null) return update.business_message.web_app_data;
        else return null;
    }

    private PassportData getPassportData(){
        if (update.message != null) return update.message.passport_data;
        else if (update.edited_message != null) return update.edited_message.passport_data;
        else if (update.edited_business_message != null) return update.edited_business_message.passport_data;
        else if (update.edited_channel_post != null) return update.edited_channel_post.passport_data;
        else if (update.channel_post != null) return update.channel_post.passport_data;
        else if (update.business_message != null) return update.business_message.passport_data;
        else return null;
    }
}
