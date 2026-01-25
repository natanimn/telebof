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
 * @version 1.3.0
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
        return update.getMessage() !=null && (photo() || video() || videoNote() || sticker() || audio() || animation() || document() || voice() );
    }

    /**
     * Filter service messages for new chat members.
     * @return {@link Boolean}
     */
    public Boolean newChatMember(){
        return update.getMessage() !=null && update.getMessage().getNewChatMembers() != null;
    }

    /**
     * Filter service messages for left chat member.
     * @return {@link Boolean}
     */
    public Boolean leftChatMember(){
        return update.getMessage() !=null && update.getMessage().getLeftChatMember() != null;
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
        return update.getMessage() !=null && update.getMessage().getNewChatPhoto() != null;
    }

    /**
     * Filter service messages for new chat title.
     * @return {@link Boolean}
     */
    public Boolean newChatTitle(){
        return update.getMessage() !=null && update.getMessage().getNewChatTitle() != null;
    }

    /**
     * Filter service messages for group chat created.
     * @return {@link Boolean}
     */
    public Boolean groupCreated(){
        return update.getMessage() !=null && update.getMessage().getGroupChatCreated() != null;
    }

    /**
     * Filter service messages for supergroup chat created.
     * @return {@link Boolean}
     */
    public Boolean supergroupCreated(){
        return update.getMessage() !=null && update.getMessage().getSupergroupChatCreated() != null;
    }

    /**
     * Filter service messages for channel deleted.
     * @return {@link Boolean}
     */
    public Boolean channelCreated(){
        return update.getMessage() !=null && update.getMessage().getChannelChatCreated() != null;
    }

    /**
     * Filter service messages for message auto timer changed.
     * @return {@link Boolean}
     */
    public Boolean messageAutoDeleteTimerChanged(){
        return update.getMessage() !=null && update.getMessage().getMessageAutoDeleteTimerChanged() != null;
    }

    /**
     * Filter service messages for migration from group to supergroup and vice versa
     * @return {@link Boolean}
     */
    public Boolean migrated(){
        return update.getMessage() !=null && (update.getMessage().getMigrateToChatId() != null || update.getMessage().getMigrateFromChatId() != null);
    }

    /**
     * Filter service messages for successful payment.
     * @return {@link Boolean}
     */
    public Boolean successfulPayment() {
        return update.getMessage() != null && update.getMessage().getSuccessfulPayment() != null;
    }

    /**
     * Filter service messages for proximity alert triggered.
     * @return {@link Boolean}
     */
    public Boolean proximityAlertTriggered() {
        return update.getMessage() != null && update.getMessage().getProximityAlertTriggered() != null;
    }

    /**
     * Filter service messages for forum topic created.
     * @return {@link Boolean}
     */
    public Boolean forumTopicCreated() {
        return update.getMessage() != null && update.getMessage().getForumTopicCreated() != null;
    }

    /**
     * Filter service messages for forum topic edited.
     * @return {@link Boolean}
     */
    public Boolean forumTopicEdited() {
        return update.getMessage() != null && update.getMessage().getForumTopicEdited() != null;
    }

    /**
     * Filter service messages for forum topic closed.
     * @return {@link Boolean}
     */
    public Boolean forumTopicClosed() {
        return update.getMessage() != null && update.getMessage().getForumTopicClosed() != null;
    }

    /**
     * Filter service messages for forum topic reopened.
     * @return {@link Boolean}
     */
    public Boolean forumTopicReopened() {
        return update.getMessage() != null && update.getMessage().getForumTopicReopened() != null;
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
        return update.getMessage() != null && update.getMessage().getReplyToStory() != null;
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
        return update.getMessage() != null && update.getMessage().getUsersShared() != null;
    }

    /**
     * Filter service messages for writing access allowed.
     * @return {@link Boolean}
     */
    public Boolean writeAccessAllowed() {
        return update.getMessage() != null && update.getMessage().getWriteAccessAllowed() != null;
    }

    /**
     * Filter messages for containing {@link io.github.natanimn.telebof.types.checklist.Checklist}
     * @return {@link Boolean}
     */
    public Boolean checklist(){
        return update.getMessage() != null && update.getMessage().getChecklist() != null;
    }


    /**
     * Filter service messages for checklist tasks done
     * @return {@link Boolean}
     */
    public Boolean checklistTasksDone(){
        return update.getMessage() != null && update.getMessage().getChecklistTasksDone() != null;
    }

    /**
     * Filter service messages for checklist tasks added
     * @return {@link Boolean}
     */
    public Boolean checklistTasksAdded(){
        return update.getMessage() != null && update.getMessage().getChecklistTasksAdded() != null;
    }

    /**
     * Filter service messages for direct message price changed
     * @return {@link Boolean}
     */
    public Boolean directMessagePriceChanged(){
        return update.getMessage() != null && update.getMessage().getDirectMessagePriceChanged() != null;
    }

    /**
     * Filter messages for containing {@link MessageEntity}.
     * @return {@link Boolean}
     */
    public Boolean entities() {
        return getEntities() != null;
    }

    /**
     * Filter service messages for chat background set.
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
        return update.getMessage() != null && update.getMessage().getChatShared() != null;
    }

    /**
     * Filter inline query for empty query.
     * @return {@link Boolean}
     */
    public Boolean emptyQuery(){
        return update.getInlineQuery() != null && update.getInlineQuery().getQuery().isEmpty();
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
        return update.getMessage() != null && update.getMessage().getSuggestedPostApproved() != null;
    }

    /**
     * Filter service messages for approval failed suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostApprovalFailed(){
        return update.getMessage() != null && update.getMessage().getSuggestedPostApprovalFailed() != null;
    }

    /**
     * Filter service messages for declined suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostDeclined(){
        return update.getMessage() != null && update.getMessage().getSuggestedPostDeclined() != null;
    }

    /**
     * Filter service messages for paid suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostPaid(){
        return update.getMessage() != null && update.getMessage().getSuggestedPostPaid() != null;
    }

    /**
     * Filter service messages for refunded suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostRefunded(){
        return (update.getMessage() != null && update.getMessage().getSuggestedPostRefunded() != null);
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
        if (update.getMessage() != null) return update.getMessage().getChat().getType() == chat;
        else if (update.getCallbackQuery() != null) return update.getCallbackQuery().getMessage().getChat().getType() == chat;
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getChat().getType() == chat;
        else if (update.getInlineQuery() != null) return update.getInlineQuery().getChatType() == chat;
        else return false;
    }

    /**
     * Filter callback data of inline button
     * @param data The callback data
     * @return {@link Boolean}
     */
    public boolean callbackData(String... data){
        if (update.getCallbackQuery() == null) return false;
        String _data = update.getCallbackQuery().getData();
        if (_data == null) return false;
        return List.of(data).contains(_data);
    }

    /**
     * Filter query of inline query
     * @param queries The query
     * @return {@link Boolean}
     */
    public boolean inlineQuery(String... queries){
        if (update.getInlineQuery() == null) return false;
        String query = update.getInlineQuery().getQuery();
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

        if (update.getMessage() != null) {
            // In accessible message
            if (update.getMessage().getDate() == 0) return false;

            message = update.getMessage();
            user = message.getFrom();
        }

        else if (update.getCallbackQuery() != null){
            // In accessible message
            if (update.getCallbackQuery().getMessage().getDate() == 0) return false;

            message = update.getCallbackQuery().getMessage();
            user = update.getCallbackQuery().getFrom();
        }

        else return false;

        String chatStateName = storage.getName(message.getFrom().getId(), user.getId());
        String userStateName = storage.getName(user.getId());

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
            if (update.getCallbackQuery() != null){
                String data = update.getCallbackQuery().getData();
                return instance.matcher(data).find();
            } else if (update.getInlineQuery() != null) {
                String query = update.getInlineQuery().getQuery();
                return instance.matcher(query).find();
            } else if (update.getPreCheckoutQuery() != null){
              String payload = update.getPreCheckoutQuery().getInvoicePayload();
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
        if (update.getMessage() !=null) return chatsId.contains(update.getMessage().getChat().getId());
        else if (update.getChannelPost() !=null) return chatsId.contains(update.getChannelPost().getChat().getId());
        else if (update.getBusinessMessage() !=null) return chatsId.contains(update.getBusinessMessage().getChat().getId());
        else if (update.getEditedChannelPost() !=null) return chatsId.contains(update.getEditedChannelPost().getChat().getId());
        else if (update.getCallbackQuery() !=null) return chatsId.contains(update.getCallbackQuery().getMessage().getChat().getId());
        else if (update.getEditedMessage() !=null) return chatsId.contains(update.getEditedMessage().getChat().getId());
        else if (update.getEditedBusinessMessage() !=null) return chatsId.contains(update.getEditedBusinessMessage().getChat().getId());
        else return false;
    }

    /**
     * Filter updates that match a user id.
     * @param ids user ids
     * @return {@link Boolean}
     */
    public boolean fromIds(Long... ids){
        List<Long> usersId = List.of(ids);
        if (update.getMessage() !=null) return usersId.contains(update.getMessage().getFrom().getId());
        else if (update.getChannelPost() != null) return usersId.contains(update.getChannelPost().getFrom().getId());
        else if (update.getBusinessMessage() != null) return usersId.contains(update.getBusinessMessage().getFrom().getId());
        else if (update.getEditedChannelPost() != null) return usersId.contains(update.getEditedChannelPost().getFrom().getId());
        else if (update.getCallbackQuery() != null) return usersId.contains(update.getCallbackQuery().getFrom().getId());
        else if (update.getInlineQuery() != null) return usersId.contains(update.getInlineQuery().getFrom().getId());
        else if (update.getEditedMessage() != null) return usersId.contains(update.getEditedMessage().getFrom().getId());
        else if (update.getEditedBusinessMessage() != null) return usersId.contains(update.getEditedBusinessMessage().getFrom().getId());
        else return false;
    }

    /**
     * Filter updates that match a given chat username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean chatUsernames(String... usernames){
        List<String> chatUsernames = List.of(usernames);
        if (update.getMessage() !=null) return chatUsernames.contains(update.getMessage().getChat().getUsername());
        else if (update.getChannelPost() !=null) return chatUsernames.contains(update.getChannelPost().getChat().getUsername());
        else if (update.getBusinessMessage() !=null) return chatUsernames.contains(update.getBusinessMessage().getChat().getUsername());
        else if (update.getEditedChannelPost() !=null) return chatUsernames.contains(update.getEditedChannelPost().getChat().getUsername());
        else if (update.getCallbackQuery() !=null) return chatUsernames.contains(update.getCallbackQuery().getMessage().getChat().getUsername());
        else if (update.getEditedMessage() !=null) return chatUsernames.contains(update.getEditedMessage().getChat().getUsername());
        else if (update.getEditedBusinessMessage() !=null) return chatUsernames.contains(update.getEditedBusinessMessage().getChat().getUsername());
        else return false;
    }

    /**
     * Filter updates that match a given user's username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean usernames(String... usernames){
        List<String> $usernames = List.of(usernames);
        if (update.getMessage() !=null) return $usernames.contains(update.getMessage().getFrom().getUsername());
        else if (update.getChannelPost() !=null) return $usernames.contains(update.getChannelPost().getFrom().getUsername());
        else if (update.getBusinessMessage()  !=null) return $usernames.contains(update.getBusinessMessage().getFrom().getUsername());
        else if (update.getEditedChannelPost() !=null) return $usernames.contains(update.getEditedChannelPost().getFrom().getUsername());
        else if (update.getCallbackQuery() !=null) return $usernames.contains(update.getCallbackQuery().getMessage().getFrom().getUsername());
        else if (update.getEditedMessage() !=null) return $usernames.contains(update.getEditedMessage().getFrom().getUsername());
        else if (update.getEditedBusinessMessage() !=null) return $usernames.contains(update.getEditedBusinessMessage().getFrom().getUsername());
        else return false;
    }

    /**
     * Filter reactions that match a given reaction.
     * @param react reactions
     * @return {@link Boolean}
     */
    public boolean reaction(String react){
        if (update.getMessageReaction() != null){
            for (ReactionType reactionType: update.getMessageReaction().getNewReaction()){
                if (reactionType.getEmoji().equals(react)) return true;
            };
        }
        return false;
    }
    private String getText(){
        if (update.getMessage() != null) return update.getMessage().getText();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getText();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getText();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getText();
        else if (update.getChannelPost() != null) return update.getChannelPost().getText();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getText();
        else return null;
    }

    private List<PhotoSize> getPhoto(){
        if (update.getMessage() != null) return update.getMessage().getPhoto();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getPhoto();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getPhoto();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getPhoto();
        else if (update.getChannelPost() != null) return update.getChannelPost().getPhoto();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getPhoto();
        else return null;
    }

    private Video getVideo(){
        if (update.getMessage() != null) return update.getMessage().getVideo();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideo();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideo();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideo();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideo();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getVideo();
        else return null;
    }

    private Document getDocument(){
        if (update.getMessage() != null) return update.getMessage().getDocument();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getDocument();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getDocument();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getDocument();
        else if (update.getChannelPost() != null) return update.getChannelPost().getDocument();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getDocument();
        else return null;
    }

    private Animation getAnimation(){
        if (update.getMessage() != null) return update.getMessage().getAnimation();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getAnimation();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getAnimation();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getAnimation();
        else if (update.getChannelPost() != null) return update.getChannelPost().getAnimation();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getAnimation();
        else return null;
    }

    private Audio getAudio(){
        if (update.getMessage() != null) return update.getMessage().getAudio();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getAudio();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getAudio();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getAudio();
        else if (update.getChannelPost() != null) return update.getChannelPost().getAudio();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getAudio();
        else return null;
    }

    private Voice getVoice(){
        if (update.getMessage() != null) return update.getMessage().getVoice();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVoice();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVoice();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVoice();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVoice();
        else if (update.getBusinessMessage() != null) return update.getBusinessMessage().getVoice();
        else return null;
    }

    private VideoNote getVideoNote(){
        if (update.getMessage() != null) return update.getMessage().getVideoNote();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideoNote();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideoNote();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideoNote();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideoNote();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVideoNote();
        else return null;
    }

    private Contact getContact(){
        if (update.getMessage() != null) return update.getMessage().getContact();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getContact();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getContact();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getContact();
        else if (update.getChannelPost() != null) return update.getChannelPost().getContact();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getContact();
        else return null;
    }

    private List<MessageEntity> getEntities(){
        if (update.getMessage() != null) return update.getMessage().getEntities();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getEntities();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getEntities();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getEntities();
        else if (update.getChannelPost() != null) return update.getChannelPost().getEntities();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getEntities();
        else return null;
    }

    private RefundedPayment getRefundedPayment(){
        if (update.getMessage() != null) return update.getMessage().getRefundedPayment();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getRefundedPayment();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getRefundedPayment();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getRefundedPayment();
        else if (update.getChannelPost() != null) return update.getChannelPost().getRefundedPayment();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getRefundedPayment();
        else return null;
    }

    private MessageOrigin getForwardedMessage(){
        if (update.getMessage() != null) return update.getMessage().getForwardOrigin();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getForwardOrigin();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getForwardOrigin();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getForwardOrigin();
        else if (update.getChannelPost() != null) return update.getChannelPost().getForwardOrigin();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getForwardOrigin();
        else return null;
    }

    private Message getRepliedMessage(){
        if (update.getMessage() != null) return update.getMessage().getReplyToMessage();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getReplyToMessage();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getReplyToMessage();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getReplyToMessage();
        else if (update.getChannelPost() != null) return update.getChannelPost().getReplyToMessage();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getReplyToMessage();
        else return null;
    }

    private Invoice getInvoice(){
        if (update.getMessage() != null) return update.getMessage().getInvoice();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getInvoice();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getInvoice();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getInvoice();
        else if (update.getChannelPost() != null) return update.getChannelPost().getInvoice();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getInvoice();
        else return null;
    }

    private Sticker getSticker(){
        if (update.getMessage() != null) return update.getMessage().getSticker();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getSticker();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getSticker();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getSticker();
        else if (update.getChannelPost() != null) return update.getChannelPost().getSticker();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getSticker();
        else return null;
    }

    private Location getLocation(){
        if (update.getMessage() != null) return update.getMessage().getLocation();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getLocation();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getLocation();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getLocation();
        else if (update.getChannelPost() != null) return update.getChannelPost().getLocation();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getLocation();
        else return null;
    }


    private Venue getVenue(){
        if (update.getMessage() != null) return update.getMessage().getVenue();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVenue();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVenue();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVenue();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVenue();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVenue();
        else return null;
    }

    private Game getGame(){
        if (update.getMessage() != null) return update.getMessage().getGame();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getGame();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getGame();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getGame();
        else if (update.getChannelPost() != null) return update.getChannelPost().getGame();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getGame();
        else return null;
    }

    private Dice getDice(){
        if (update.getMessage() != null) return update.getMessage().getDice();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getDice();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getDice();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getDice();
        else if (update.getChannelPost() != null) return update.getChannelPost().getDice();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getDice();
        else return null;
    }

    private TextQuote getQuote(){
        if (update.getMessage() != null) return update.getMessage().getQuote();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getQuote();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getQuote();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getQuote();
        else if (update.getChannelPost() != null) return update.getChannelPost().getQuote();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getQuote();
        else return null;
    }

    private Giveaway getGiveaway(){
        if (update.getMessage() != null) return update.getMessage().getGiveaway();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getGiveaway();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getGiveaway();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getGiveaway();
        else if (update.getChannelPost() != null) return update.getChannelPost().getGiveaway();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getGiveaway();
        else return null;
    }

    private GiveawayCompleted getGiveawayCompleted(){
        if (update.getMessage() != null) return update.getMessage().getGiveawayCompleted();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getGiveawayCompleted();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getGiveawayCompleted();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getGiveawayCompleted();
        else if (update.getChannelPost() != null) return update.getChannelPost().getGiveawayCompleted();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getGiveawayCompleted();
        else return null;
    }

    private GiveawayCreated getGiveawayCreated(){
        if (update.getMessage() != null) return update.getMessage().getGiveawayCreated();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getGiveawayCreated();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getGiveawayCreated();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getGiveawayCreated();
        else if (update.getChannelPost() != null) return update.getChannelPost().getGiveawayCreated();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getGiveawayCreated();
        else return null;
    }

    private Message getPinnedMessage(){
        if (update.getMessage() != null) return update.getMessage().getPinnedMessage();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getPinnedMessage();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getPinnedMessage();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getPinnedMessage();
        else if (update.getChannelPost() != null) return update.getChannelPost().getPinnedMessage();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getPinnedMessage();
        else return null;
    }

    private VideoChatStarted getVideoChatStarted(){
        if (update.getMessage() != null) return update.getMessage().getVideoChatStarted();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideoChatStarted();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideoChatStarted();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideoChatStarted();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideoChatStarted();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVideoChatStarted();
        else return null;
    }

    private VideoChatScheduled getVideoChatScheduled(){
        if (update.getMessage() != null) return update.getMessage().getVideoChatScheduled();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideoChatScheduled();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideoChatScheduled();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideoChatScheduled();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideoChatScheduled();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVideoChatScheduled();
        else return null;
    }

    private VideoChatEnded getVideoChatEnded(){
        if (update.getMessage() != null) return update.getMessage().getVideoChatEnded();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideoChatEnded();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideoChatEnded();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideoChatEnded();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideoChatEnded();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVideoChatEnded();
        else return null;
    }

    private VideoChatParticipantsInvited getVideoChatParticipantInvited(){
        if (update.getMessage() != null) return update.getMessage().getVideoChatParticipantsInvited();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getVideoChatParticipantsInvited();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getVideoChatParticipantsInvited();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getVideoChatParticipantsInvited();
        else if (update.getChannelPost() != null) return update.getChannelPost().getVideoChatParticipantsInvited();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getVideoChatParticipantsInvited();
        else return null;
    }

    private Boolean isBot(){
        if (update.getMessage() != null) return update.getMessage().getFrom().getIsBot();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getFrom().getIsBot();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getFrom().getIsBot();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getFrom().getIsBot();
        else if (update.getChannelPost() != null) return update.getChannelPost().getFrom().getIsBot();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getFrom().getIsBot();
        else if (update.getCallbackQuery() != null) return update.getCallbackQuery().getFrom().getIsBot();
        else if (update.getInlineQuery() != null) return update.getInlineQuery().getFrom().getIsBot();
        else return null;
    }

    private ChatBoostAdded getBoostAdded(){
        if (update.getMessage() != null) return update.getMessage().getBoostAdded();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getBoostAdded();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getBoostAdded();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getBoostAdded();
        else if (update.getChannelPost() != null) return update.getChannelPost().getBoostAdded();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getBoostAdded();
        else return null;
    }

    private ChatBackground getChatBackgroundSet(){
        if (update.getMessage() != null) return update.getMessage().getChatBackgroundSet();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getChatBackgroundSet();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getChatBackgroundSet();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getChatBackgroundSet();
        else if (update.getChannelPost() != null) return update.getChannelPost().getChatBackgroundSet();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getChatBackgroundSet();
        else return null;
    }

    private WebAppData getWebAppData(){
        if (update.getMessage() != null) return update.getMessage().getWebAppData();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getWebAppData();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getWebAppData();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getWebAppData();
        else if (update.getChannelPost() != null) return update.getChannelPost().getWebAppData();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getWebAppData();
        else return null;
    }

    private PassportData getPassportData(){
        if (update.getMessage() != null) return update.getMessage().getPassportData();
        else if (update.getEditedMessage() != null) return update.getEditedMessage().getPassportData();
        else if (update.getEditedBusinessMessage() != null) return update.getEditedBusinessMessage().getPassportData();
        else if (update.getEditedChannelPost() != null) return update.getEditedChannelPost().getPassportData();
        else if (update.getChannelPost() != null) return update.getChannelPost().getPassportData();
        else if (update.getBusinessMessage()  != null) return update.getBusinessMessage().getPassportData();
        else return null;
    }
}
