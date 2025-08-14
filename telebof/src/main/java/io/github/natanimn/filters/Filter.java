package io.github.natanimn.filters;

import io.github.natanimn.Util;
import io.github.natanimn.types.media_and_service.*;
import io.github.natanimn.types.chat_and_user.ChatBackground;
import io.github.natanimn.types.chat_and_user.ChatBoostAdded;
import io.github.natanimn.types.gift_and_giveaway.Giveaway;
import io.github.natanimn.types.gift_and_giveaway.GiveawayCompleted;
import io.github.natanimn.types.gift_and_giveaway.GiveawayCreated;
import io.github.natanimn.types.passport.PassportData;
import io.github.natanimn.types.payments.RefundedPayment;
import io.github.natanimn.types.updates.Update;
import io.github.natanimn.states.StateMemoryStorage;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.web.WebAppData;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Filter{
    private final Update update;
    private final StateMemoryStorage storage;

    public Filter(Update update, StateMemoryStorage storage){
        this.update = update;
        this.storage = storage;
    }

    public Boolean text(){
        return getText() != null;
    }

    public Boolean Private(){
        return chatType("private");
    }

    public Boolean channel(){
        return chatType("channel");
    }

    public Boolean supergroup(){
        return chatType("supergroup");
    }

    public Boolean group(){
        return chatType("group");
    }

    public Boolean photo(){
        return getPhoto() != null;
    }

    public Boolean video(){
        return getVideo() != null;
    }

    public Boolean voice(){
        return getVoice() != null;
    }

    public Boolean document(){
        return getDocument() != null;
    }

    public Boolean videoNote(){
        return getVideoNote() != null;
    }

    public Boolean animation(){
        return getAnimation() != null;
    }

    public Boolean contact(){
        return getContact() != null;
    }

    public Boolean location(){
        return getLocation() != null;
    }

    public Boolean venue(){
        return getVenue() != null;
    }

    public Boolean game(){
        return getGame() != null;
    }

    public Boolean dice(){
        return getDice() != null;
    }

    public Boolean sticker(){
        return getSticker() != null ;
    }

    public Boolean audio(){
        return getAudio() != null;
    }

    public Boolean invoice(){
        return getInvoice() != null;
    }

    public Boolean quote(){
        return getQuote() != null;
    }

    public Boolean giveaway(){
        return getGiveaway() != null;
    }

    public Boolean media(){
        return update.message !=null && (photo() || video() || videoNote() || sticker() || audio() || animation() || document() || voice());
    }

    public Boolean newChatMember(){
        return update.message !=null && update.message.new_chat_members != null;
    }

    public Boolean leftChatMember(){
        return update.message !=null && update.message.left_chat_member != null;
    }

    public Boolean pinnedMessage(){
        return getPinnedMessage() != null;
    }

    public Boolean newChatPhoto(){
        return update.message !=null && update.message.new_chat_photo != null;
    }

    public Boolean newChatTitle(){
        return update.message !=null && update.message.new_chat_title != null;
    }

    public Boolean groupCreated(){
        return update.message !=null && update.message.group_chat_created != null;
    }

    public Boolean supergroupCreated(){
        return update.message !=null && update.message.supergroup_chat_created != null;
    }

    public Boolean channelCreated(){
        return update.message !=null && update.message.channel_chat_created != null;
    }

    public Boolean messageAutoDeleteTimerChanged(){
        return update.message !=null && update.message.message_auto_delete_timer_changed != null;
    }

    public Boolean migrated(){
        return update.message !=null && (update.message.migrate_to_chat_id != null || update.message.migrate_from_chat_id != null);
    }

    public Boolean successfulPayment() {
        return update.message != null && update.message.successful_payment != null;
    }

    public Boolean proximityAlertTriggered() {
        return update.message != null && update.message.proximity_alert_triggered != null;
    }

    public Boolean forumTopicCreated() {
        return update.message != null && update.message.forum_topic_edited != null;
    }

    public Boolean forumTopicEdited() {
        return update.message != null && update.message.forum_topic_edited != null;
    }

    public Boolean forumTopicClosed() {
        return update.message != null && update.message.forum_topic_closed != null;
    }


    public Boolean forumTopicReopened() {
        return update.message != null && update.message.forum_topic_reopened != null;
    }

    public Boolean videoChatStarted() {
        return getVideoChatStarted() != null;
    }

    public Boolean videoChatScheduled() {
        return getVideoChatScheduled() != null;
    }

    public Boolean videoChatParticipantInvited() {
        return getVideoChatParticipantInvited() != null;
    }

    public Boolean videoChatEnded() {
        return getVideoChatEnded() != null;
    }

    public Boolean forwarded() {
        return getForwardedMessage() != null;
    }

    public Boolean replied() {
        return getRepliedMessage() != null;
    }

    public Boolean repliedToStory() {
        return update.message != null && update.message.reply_to_story != null;
    }

    public Boolean bot() {
        return isBot();
    }

    public Boolean giveawayCreated() {
        return getGiveawayCreated() != null;
    }

    public Boolean giveawayCompleted() {
        return getGiveawayCompleted() != null;
    }

    public Boolean boostAdded() {
        return getBoostAdded() != null;
    }

    public Boolean usersShared() {
        return update.message != null && update.message.users_shared != null;
    }

    public Boolean writeAccessAllowed() {
        return update.message != null && update.message.write_access_allowed != null;
    }

    public Boolean entities() {
        return getEntities() != null;
    }

    public Boolean chatBackgroundSet() {
        return getChatBackgroundSet() != null;
    }

    public Boolean chatShared() {
        return update.message != null && update.message.chat_shared != null;
    }

    public Boolean emptyQuery(){
        return update.inline_query != null && update.inline_query.query.isEmpty();
    }

    public Boolean webAppData(){
        return getWebAppData() != null;
    }

    public Boolean passportData(){
        return getPassportData() != null;
    }

    public Boolean refundedPayment(){
        return getRefundedPayment() != null;
    }

    public boolean commands(String... commands){
        if (getText() == null) return false;
        String command = Util.extractCommand(getText());
        if (command == null) return false;
        return List.of(commands).contains(command);
    }

    private boolean chatType(String chat){
        if (update.message!=null) return update.message.chat.type.equals(chat);
        else if (update.callback_query != null) return update.callback_query.message.chat.type.equals(chat);
        else if (update.edited_message != null) return update.edited_message.chat.type.equals(chat);
        else if (update.inline_query != null) return update.inline_query.chat_type.equals(chat);
        else return false;
    }

    public boolean callbackData(String... callbacks){
        if (update.callback_query == null) return false;
        String data = update.callback_query.data;
        if (data == null) return false;
        return List.of(callbacks).contains(data);
    }

    public boolean inlineQuery(String... queries){
        if (update.inline_query == null) return false;
        String query = update.inline_query.query;
        if (query == null) return false;
        return List.of(queries).contains(query);
    }

    public boolean customFilter(CustomFilter customFilter){
        return customFilter.check(update);
    }

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

    public boolean texts(String... texts){
        if (text()){
            return List.of(texts).contains(getText());
        } else return false;
    }

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
            } else {
                return false;
            }
        }

        return instance.matcher(text).find();
    }

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

    public boolean reaction(String react){
        if (update.message_reaction != null){
            for (ReactionType reactionType: update.message_reaction.new_reaction){
                System.out.println(reactionType.emoji);
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
