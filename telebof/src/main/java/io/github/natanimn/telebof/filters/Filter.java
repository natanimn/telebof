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
        return update.getMessage() !=null && update.getMessage().groupChatCreated() != null;
    }

    /**
     * Filter service messages for supergroup chat created.
     * @return {@link Boolean}
     */
    public Boolean supergroupCreated(){
        return update.getMessage() !=null && update.getMessage().supergroupChatCreated() != null;
    }

    /**
     * Filter service messages for channel deleted.
     * @return {@link Boolean}
     */
    public Boolean channelCreated(){
        return update.getMessage() !=null && update.getMessage().channelChatCreated() != null;
    }

    /**
     * Filter service messages for message auto timer changed.
     * @return {@link Boolean}
     */
    public Boolean messageAutoDeleteTimerChanged(){
        return update.getMessage() !=null && update.getMessage().messageAutoDeleteTimerChanged() != null;
    }

    /**
     * Filter service messages for migration from group to supergroup and vice versa
     * @return {@link Boolean}
     */
    public Boolean migrated(){
        return update.getMessage() !=null && (update.getMessage().migrateToChatId() != null || update.getMessage().migrateFromChatId() != null);
    }

    /**
     * Filter service messages for successful payment.
     * @return {@link Boolean}
     */
    public Boolean successfulPayment() {
        return update.getMessage() != null && update.getMessage().successfulPayment() != null;
    }

    /**
     * Filter service messages for proximity alert triggered.
     * @return {@link Boolean}
     */
    public Boolean proximityAlertTriggered() {
        return update.getMessage() != null && update.getMessage().proximityAlertTriggered() != null;
    }

    /**
     * Filter service messages for forum topic created.
     * @return {@link Boolean}
     */
    public Boolean forumTopicCreated() {
        return update.getMessage() != null && update.getMessage().forumTopicCreated() != null;
    }

    /**
     * Filter service messages for forum topic edited.
     * @return {@link Boolean}
     */
    public Boolean forumTopicEdited() {
        return update.getMessage() != null && update.getMessage().forumTopicEdited() != null;
    }

    /**
     * Filter service messages for forum topic closed.
     * @return {@link Boolean}
     */
    public Boolean forumTopicClosed() {
        return update.getMessage() != null && update.getMessage().forumTopicClosed() != null;
    }

    /**
     * Filter service messages for forum topic reopened.
     * @return {@link Boolean}
     */
    public Boolean forumTopicReopened() {
        return update.getMessage() != null && update.getMessage().forumTopicReopened() != null;
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
        return update.getMessage() != null && update.getMessage().replyToStory() != null;
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
        return update.getMessage() != null && update.getMessage().usersShared() != null;
    }

    /**
     * Filter service messages for writing access allowed.
     * @return {@link Boolean}
     */
    public Boolean writeAccessAllowed() {
        return update.getMessage() != null && update.getMessage().writeAccessAllowed() != null;
    }

    /**
     * Filter messages for containing {@link io.github.natanimn.telebof.types.checklist.Checklist}
     * @return {@link Boolean}
     */
    public Boolean checklist(){
        return update.getMessage() != null && update.getMessage().checklist() != null;
    }


    /**
     * Filter service messages for checklist tasks done
     * @return {@link Boolean}
     */
    public Boolean checklistTasksDone(){
        return update.getMessage() != null && update.getMessage().checklistTasksDone() != null;
    }

    /**
     * Filter service messages for checklist tasks added
     * @return {@link Boolean}
     */
    public Boolean checklistTasksAdded(){
        return update.getMessage() != null && update.getMessage().checklistTasksAdded() != null;
    }

    /**
     * Filter service messages for direct message price changed
     * @return {@link Boolean}
     */
    public Boolean directMessagePriceChanged(){
        return update.getMessage() != null && update.getMessage().directMessagePriceChanged() != null;
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
        return update.getMessage() != null && update.getMessage().chatShared() != null;
    }

    /**
     * Filter inline query for empty query.
     * @return {@link Boolean}
     */
    public Boolean emptyQuery(){
        return update.inlineQuery() != null && update.inlineQuery().query().isEmpty();
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
        return update.getMessage() != null && update.getMessage().suggestedPostApproved() != null;
    }

    /**
     * Filter service messages for approval failed suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostApprovalFailed(){
        return update.getMessage() != null && update.getMessage().suggestedPostApprovalFailed() != null;
    }

    /**
     * Filter service messages for declined suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostDeclined(){
        return update.getMessage() != null && update.getMessage().suggestedPostDeclined() != null;
    }

    /**
     * Filter service messages for paid suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostPaid(){
        return update.getMessage() != null && update.getMessage().suggestedPostPaid() != null;
    }

    /**
     * Filter service messages for refunded suggested post
     * @return {@link Boolean}
     */
    public Boolean suggestedPostRefunded(){
        return (update.getMessage() != null && update.getMessage().suggestedPostRefunded() != null);
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
        if (update.getMessage()!=null) return update.getMessage().chat().type() == chat;
        else if (update.callbackQuery() != null) return update.callbackQuery().getMessage().chat().type() == chat;
        else if (update.editedMessage() != null) return update.editedMessage().chat().type() == chat;
        else if (update.inlineQuery() != null) return update.inlineQuery().chatType() == chat;
        else return false;
    }

    /**
     * Filter callback data of inline button
     * @param data The callback data
     * @return {@link Boolean}
     */
    public boolean callbackData(String... data){
        if (update.callbackQuery() == null) return false;
        String _data = update.callbackQuery().data();
        if (_data == null) return false;
        return List.of(data).contains(_data);
    }

    /**
     * Filter query of inline query
     * @param queries The query
     * @return {@link Boolean}
     */
    public boolean inlineQuery(String... queries){
        if (update.inlineQuery() == null) return false;
        String query = update.inlineQuery().query();
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
            if (update.getMessage().date() == 0) return false;

            message = update.getMessage();
            user = message.from();
        }

        else if (update.callbackQuery() != null){
            // In accessible message
            if (update.callbackQuery().getMessage().date() == 0) return false;

            message = update.callbackQuery().getMessage();
            user = update.callbackQuery().from();
        }

        else return false;

        String chatStateName = storage.getName(message.from().id(), user.id());
        String userStateName = storage.getName(user.id());

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
            if (update.callbackQuery() != null){
                String data = update.callbackQuery().data();
                return instance.matcher(data).find();
            } else if (update.inlineQuery() != null) {
                String query = update.inlineQuery().query();
                return instance.matcher(query).find();
            } else if (update.preCheckoutQuery() != null){
              String payload = update.preCheckoutQuery().invoicePayload();
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
        if (update.getMessage() !=null) return chatsId.contains(update.getMessage().chat().id());
        else if (update.channelPost() !=null) return chatsId.contains(update.channelPost().chat().id());
        else if (update.businessMessage() !=null) return chatsId.contains(update.businessMessage().chat().id());
        else if (update.editedChannelPost() !=null) return chatsId.contains(update.editedChannelPost().chat().id());
        else if (update.callbackQuery() !=null) return chatsId.contains(update.callbackQuery().getMessage().chat().id());
        else if (update.editedMessage() !=null) return chatsId.contains(update.editedMessage().chat().id());
        else if (update.editedBusinessMessage() !=null) return chatsId.contains(update.editedBusinessMessage().chat().id());
        else return false;
    }

    /**
     * Filter updates that match a user id.
     * @param ids user ids
     * @return {@link Boolean}
     */
    public boolean fromIds(Long... ids){
        List<Long> usersId = List.of(ids);
        if (update.getMessage() !=null) return usersId.contains(update.getMessage().from().id());
        else if (update.channelPost() != null) return usersId.contains(update.channelPost().from().id());
        else if (update.businessMessage() != null) return usersId.contains(update.businessMessage().from().id());
        else if (update.editedChannelPost() != null) return usersId.contains(update.editedChannelPost().from().id());
        else if (update.callbackQuery() != null) return usersId.contains(update.callbackQuery().from().id());
        else if (update.inlineQuery() != null) return usersId.contains(update.inlineQuery().from().id());
        else if (update.editedMessage() != null) return usersId.contains(update.editedMessage().from().id());
        else if (update.editedBusinessMessage() != null) return usersId.contains(update.editedBusinessMessage().from().id());
        else return false;
    }

    /**
     * Filter updates that match a given chat username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean chatUsernames(String... usernames){
        List<String> chatUsernames = List.of(usernames);
        if (update.getMessage() !=null) return chatUsernames.contains(update.getMessage().chat().username());
        else if (update.channelPost() !=null) return chatUsernames.contains(update.channelPost().chat().username());
        else if (update.businessMessage() !=null) return chatUsernames.contains(update.businessMessage().chat().username());
        else if (update.editedChannelPost() !=null) return chatUsernames.contains(update.editedChannelPost().chat().username());
        else if (update.callbackQuery() !=null) return chatUsernames.contains(update.callbackQuery().getMessage().chat().username());
        else if (update.editedMessage() !=null) return chatUsernames.contains(update.editedMessage().chat().username());
        else if (update.editedBusinessMessage() !=null) return chatUsernames.contains(update.editedBusinessMessage().chat().username());
        else return false;
    }

    /**
     * Filter updates that match a given user's username.
     * @param usernames The username
     * @return {@link Boolean}
     */
    public boolean usernames(String... usernames){
        List<String> $usernames = List.of(usernames);
        if (update.getMessage() !=null) return $usernames.contains(update.getMessage().from().username());
        else if (update.channelPost() !=null) return $usernames.contains(update.channelPost().from().username());
        else if (update.businessMessage()  !=null) return $usernames.contains(update.businessMessage().from().username());
        else if (update.editedChannelPost() !=null) return $usernames.contains(update.editedChannelPost().from().username());
        else if (update.callbackQuery() !=null) return $usernames.contains(update.callbackQuery().getMessage().from().username());
        else if (update.editedMessage() !=null) return $usernames.contains(update.editedMessage().from().username());
        else if (update.editedBusinessMessage() !=null) return $usernames.contains(update.editedBusinessMessage().from().username());
        else return false;
    }

    /**
     * Filter reactions that match a given reaction.
     * @param react reactions
     * @return {@link Boolean}
     */
    public boolean reaction(String react){
        if (update.messageReaction() != null){
            for (ReactionType reactionType: update.messageReaction().newReaction()){
                if (reactionType.emoji().equals(react)) return true;
            };
        }
        return false;
    }
    private String getText(){
        if (update.getMessage() != null) return update.getMessage().text();
        else if (update.editedMessage() != null) return update.editedMessage().text();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().text();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().text();
        else if (update.channelPost() != null) return update.channelPost().text();
        else if (update.businessMessage() != null) return update.businessMessage().text();
        else return null;
    }

    private List<PhotoSize> getPhoto(){
        if (update.getMessage() != null) return update.getMessage().photo();
        else if (update.editedMessage() != null) return update.editedMessage().photo();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().photo();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().photo();
        else if (update.channelPost() != null) return update.channelPost().photo();
        else if (update.businessMessage() != null) return update.businessMessage().photo();
        else return null;
    }

    private Video getVideo(){
        if (update.getMessage() != null) return update.getMessage().video();
        else if (update.editedMessage() != null) return update.editedMessage().video();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().video();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().video();
        else if (update.channelPost() != null) return update.channelPost().video();
        else if (update.businessMessage() != null) return update.businessMessage().video();
        else return null;
    }

    private Document getDocument(){
        if (update.getMessage() != null) return update.getMessage().document();
        else if (update.editedMessage() != null) return update.editedMessage().document();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().document();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().document();
        else if (update.channelPost() != null) return update.channelPost().document();
        else if (update.businessMessage() != null) return update.businessMessage().document();
        else return null;
    }

    private Animation getAnimation(){
        if (update.getMessage() != null) return update.getMessage().animation();
        else if (update.editedMessage() != null) return update.editedMessage().animation();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().animation();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().animation();
        else if (update.channelPost() != null) return update.channelPost().animation();
        else if (update.businessMessage() != null) return update.businessMessage().animation();
        else return null;
    }

    private Audio getAudio(){
        if (update.getMessage() != null) return update.getMessage().audio();
        else if (update.editedMessage() != null) return update.editedMessage().audio();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().audio();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().audio();
        else if (update.channelPost() != null) return update.channelPost().audio();
        else if (update.businessMessage() != null) return update.businessMessage().audio();
        else return null;
    }

    private Voice getVoice(){
        if (update.getMessage() != null) return update.getMessage().voice();
        else if (update.editedMessage() != null) return update.editedMessage().voice();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().voice();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().voice();
        else if (update.channelPost() != null) return update.channelPost().voice();
        else if (update.businessMessage() != null) return update.businessMessage().voice();
        else return null;
    }

    private VideoNote getVideoNote(){
        if (update.getMessage() != null) return update.getMessage().videoNote();
        else if (update.editedMessage() != null) return update.editedMessage().videoNote();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().videoNote();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().videoNote();
        else if (update.channelPost() != null) return update.channelPost().videoNote();
        else if (update.businessMessage()  != null) return update.businessMessage().videoNote();
        else return null;
    }

    private Contact getContact(){
        if (update.getMessage() != null) return update.getMessage().contact();
        else if (update.editedMessage() != null) return update.editedMessage().contact();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().contact();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().contact();
        else if (update.channelPost() != null) return update.channelPost().contact();
        else if (update.businessMessage()  != null) return update.businessMessage().contact();
        else return null;
    }

    private List<MessageEntity> getEntities(){
        if (update.getMessage() != null) return update.getMessage().entities();
        else if (update.editedMessage() != null) return update.editedMessage().entities();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().entities();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().entities();
        else if (update.channelPost() != null) return update.channelPost().entities();
        else if (update.businessMessage()  != null) return update.businessMessage().entities();
        else return null;
    }

    private RefundedPayment getRefundedPayment(){
        if (update.getMessage() != null) return update.getMessage().refundedPayment();
        else if (update.editedMessage() != null) return update.editedMessage().refundedPayment();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().refundedPayment();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().refundedPayment();
        else if (update.channelPost() != null) return update.channelPost().refundedPayment();
        else if (update.businessMessage()  != null) return update.businessMessage().refundedPayment();
        else return null;
    }

    private MessageOrigin getForwardedMessage(){
        if (update.getMessage() != null) return update.getMessage().forwardOrigin();
        else if (update.editedMessage() != null) return update.editedMessage().forwardOrigin();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().forwardOrigin();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().forwardOrigin();
        else if (update.channelPost() != null) return update.channelPost().forwardOrigin();
        else if (update.businessMessage()  != null) return update.businessMessage().forwardOrigin();
        else return null;
    }

    private Message getRepliedMessage(){
        if (update.getMessage() != null) return update.getMessage().replyToMessage();
        else if (update.editedMessage() != null) return update.editedMessage().replyToMessage();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().replyToMessage();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().replyToMessage();
        else if (update.channelPost() != null) return update.channelPost().replyToMessage();
        else if (update.businessMessage()  != null) return update.businessMessage().replyToMessage();
        else return null;
    }

    private Invoice getInvoice(){
        if (update.getMessage() != null) return update.getMessage().invoice();
        else if (update.editedMessage() != null) return update.editedMessage().invoice();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().invoice();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().invoice();
        else if (update.channelPost() != null) return update.channelPost().invoice();
        else if (update.businessMessage()  != null) return update.businessMessage().invoice();
        else return null;
    }

    private Sticker getSticker(){
        if (update.getMessage() != null) return update.getMessage().sticker();
        else if (update.editedMessage() != null) return update.editedMessage().sticker();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().sticker();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().sticker();
        else if (update.channelPost() != null) return update.channelPost().sticker();
        else if (update.businessMessage()  != null) return update.businessMessage().sticker();
        else return null;
    }

    private Location getLocation(){
        if (update.getMessage() != null) return update.getMessage().location();
        else if (update.editedMessage() != null) return update.editedMessage().location();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().location();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().location();
        else if (update.channelPost() != null) return update.channelPost().location();
        else if (update.businessMessage()  != null) return update.businessMessage().location();
        else return null;
    }


    private Venue getVenue(){
        if (update.getMessage() != null) return update.getMessage().venue();
        else if (update.editedMessage() != null) return update.editedMessage().venue();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().venue();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().venue();
        else if (update.channelPost() != null) return update.channelPost().venue();
        else if (update.businessMessage()  != null) return update.businessMessage().venue();
        else return null;
    }

    private Game getGame(){
        if (update.getMessage() != null) return update.getMessage().game();
        else if (update.editedMessage() != null) return update.editedMessage().game();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().game();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().game();
        else if (update.channelPost() != null) return update.channelPost().game();
        else if (update.businessMessage()  != null) return update.businessMessage().game();
        else return null;
    }

    private Dice getDice(){
        if (update.getMessage() != null) return update.getMessage().dice();
        else if (update.editedMessage() != null) return update.editedMessage().dice();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().dice();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().dice();
        else if (update.channelPost() != null) return update.channelPost().dice();
        else if (update.businessMessage()  != null) return update.businessMessage().dice();
        else return null;
    }

    private TextQuote getQuote(){
        if (update.getMessage() != null) return update.getMessage().quote();
        else if (update.editedMessage() != null) return update.editedMessage().quote();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().quote();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().quote();
        else if (update.channelPost() != null) return update.channelPost().quote();
        else if (update.businessMessage()  != null) return update.businessMessage().quote();
        else return null;
    }

    private Giveaway getGiveaway(){
        if (update.getMessage() != null) return update.getMessage().giveaway();
        else if (update.editedMessage() != null) return update.editedMessage().giveaway();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().giveaway();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().giveaway();
        else if (update.channelPost() != null) return update.channelPost().giveaway();
        else if (update.businessMessage()  != null) return update.businessMessage().giveaway();
        else return null;
    }

    private GiveawayCompleted getGiveawayCompleted(){
        if (update.getMessage() != null) return update.getMessage().giveawayCompleted();
        else if (update.editedMessage() != null) return update.editedMessage().giveawayCompleted();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().giveawayCompleted();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().giveawayCompleted();
        else if (update.channelPost() != null) return update.channelPost().giveawayCompleted();
        else if (update.businessMessage()  != null) return update.businessMessage().giveawayCompleted();
        else return null;
    }

    private GiveawayCreated getGiveawayCreated(){
        if (update.getMessage() != null) return update.getMessage().giveawayCreated();
        else if (update.editedMessage() != null) return update.editedMessage().giveawayCreated();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().giveawayCreated();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().giveawayCreated();
        else if (update.channelPost() != null) return update.channelPost().giveawayCreated();
        else if (update.businessMessage()  != null) return update.businessMessage().giveawayCreated();
        else return null;
    }

    private Message getPinnedMessage(){
        if (update.getMessage() != null) return update.getMessage().pinnedMessage();
        else if (update.editedMessage() != null) return update.editedMessage().pinnedMessage();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().pinnedMessage();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().pinnedMessage();
        else if (update.channelPost() != null) return update.channelPost().pinnedMessage();
        else if (update.businessMessage()  != null) return update.businessMessage().pinnedMessage();
        else return null;
    }

    private VideoChatStarted getVideoChatStarted(){
        if (update.getMessage() != null) return update.getMessage().videoChatStarted();
        else if (update.editedMessage() != null) return update.editedMessage().videoChatStarted();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().videoChatStarted();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().videoChatStarted();
        else if (update.channelPost() != null) return update.channelPost().videoChatStarted();
        else if (update.businessMessage()  != null) return update.businessMessage().videoChatStarted();
        else return null;
    }

    private VideoChatScheduled getVideoChatScheduled(){
        if (update.getMessage() != null) return update.getMessage().videoChatScheduled();
        else if (update.editedMessage() != null) return update.editedMessage().videoChatScheduled();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().videoChatScheduled();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().videoChatScheduled();
        else if (update.channelPost() != null) return update.channelPost().videoChatScheduled();
        else if (update.businessMessage()  != null) return update.businessMessage().videoChatScheduled();
        else return null;
    }

    private VideoChatEnded getVideoChatEnded(){
        if (update.getMessage() != null) return update.getMessage().videoChatEnded();
        else if (update.editedMessage() != null) return update.editedMessage().videoChatEnded();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().videoChatEnded();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().videoChatEnded();
        else if (update.channelPost() != null) return update.channelPost().videoChatEnded();
        else if (update.businessMessage()  != null) return update.businessMessage().videoChatEnded();
        else return null;
    }

    private VideoChatParticipantsInvited getVideoChatParticipantInvited(){
        if (update.getMessage() != null) return update.getMessage().videoChatParticipantsInvited();
        else if (update.editedMessage() != null) return update.editedMessage().videoChatParticipantsInvited();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().videoChatParticipantsInvited();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().videoChatParticipantsInvited();
        else if (update.channelPost() != null) return update.channelPost().videoChatParticipantsInvited();
        else if (update.businessMessage()  != null) return update.businessMessage().videoChatParticipantsInvited();
        else return null;
    }

    private Boolean isBot(){
        if (update.getMessage() != null) return update.getMessage().from().isBot();
        else if (update.editedMessage() != null) return update.editedMessage().from().isBot();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().from().isBot();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().from().isBot();
        else if (update.channelPost() != null) return update.channelPost().from().isBot();
        else if (update.businessMessage()  != null) return update.businessMessage().from().isBot();
        else if (update.callbackQuery() != null) return update.callbackQuery().from().isBot();
        else if (update.inlineQuery() != null) return update.inlineQuery().from().isBot();
        else return null;
    }

    private ChatBoostAdded getBoostAdded(){
        if (update.getMessage() != null) return update.getMessage().boostAdded();
        else if (update.editedMessage() != null) return update.editedMessage().boostAdded();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().boostAdded();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().boostAdded();
        else if (update.channelPost() != null) return update.channelPost().boostAdded();
        else if (update.businessMessage()  != null) return update.businessMessage().boostAdded();
        else return null;
    }

    private ChatBackground getChatBackgroundSet(){
        if (update.getMessage() != null) return update.getMessage().chatBackgroundSet();
        else if (update.editedMessage() != null) return update.editedMessage().chatBackgroundSet();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().chatBackgroundSet();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().chatBackgroundSet();
        else if (update.channelPost() != null) return update.channelPost().chatBackgroundSet();
        else if (update.businessMessage()  != null) return update.businessMessage().chatBackgroundSet();
        else return null;
    }

    private WebAppData getWebAppData(){
        if (update.getMessage() != null) return update.getMessage().webAppData();
        else if (update.editedMessage() != null) return update.editedMessage().webAppData();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().webAppData();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().webAppData();
        else if (update.channelPost() != null) return update.channelPost().webAppData();
        else if (update.businessMessage()  != null) return update.businessMessage().webAppData();
        else return null;
    }

    private PassportData getPassportData(){
        if (update.getMessage() != null) return update.getMessage().passportData();
        else if (update.editedMessage() != null) return update.editedMessage().passportData();
        else if (update.editedBusinessMessage() != null) return update.editedBusinessMessage().passportData();
        else if (update.editedChannelPost() != null) return update.editedChannelPost().passportData();
        else if (update.channelPost() != null) return update.channelPost().passportData();
        else if (update.businessMessage()  != null) return update.businessMessage().passportData();
        else return null;
    }
}
