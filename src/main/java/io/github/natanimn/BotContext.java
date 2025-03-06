package io.github.natanimn;

import io.github.natanimn.enums.ChatAction;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.*;
import io.github.natanimn.states.StateMemoryStorage;
import io.github.natanimn.types.BotCommand;
import io.github.natanimn.types.ChatPermission;
import io.github.natanimn.types.InlineQueryResult;
import io.github.natanimn.types.InputMedia;
import io.github.natanimn.types.InputPaidMedia;
import io.github.natanimn.types.InputPollOption;
import io.github.natanimn.types.InputSticker;
import io.github.natanimn.types.LabeledPrice;
import io.github.natanimn.types.MaskPosition;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.PaidMedia;
import io.github.natanimn.types.PassportElementError;
import io.github.natanimn.types.ReplyParameters;
import io.github.natanimn.types.Update;
import java.io.File;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotContext {
    private Update update;
    private RequestSender requestSender;
    private StateMemoryStorage storage;
    private ParseMode parseMode;

    public BotContext(Update update, RequestSender requestSender, StateMemoryStorage storage, ParseMode parseMode){
        this.update = update;
        this.requestSender = requestSender;
        this.storage = storage;
        this.parseMode = parseMode;
    }

    protected void setUpdate(Update update){
        this.update = update;
    }
    public GetMe getMe() {
        return new GetMe(this.requestSender);
    }

    public LogOut logOut() {
        return new LogOut(this.requestSender);
    }

    public Close close() {
        return new Close(this.requestSender);
    }

    public SendMessage sendMessage(Object chatId, String text) {
        return new SendMessage(chatId, text, this.requestSender).parseMode(parseMode);
    }

    public SendMessage sendMessage(String text) {
        return new SendMessage(getChatId(), text, this.requestSender).parseMode(parseMode);
    }

    public byte[] downloadFile(String filePath) {
        return requestSender.downloadFile(filePath);
    }

    public SendMessage reply(String text) {
        return new SendMessage(getChatId(), text, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public ForwardMessage forwardMessage(Object toChatId, Object fromChatId, int messageId) {
        return new ForwardMessage(toChatId, fromChatId, messageId, this.requestSender);
    }

    public ForwardMessage forwardMessage(Object toChatId, int messageId) {
        return new ForwardMessage(toChatId, getChatId(), messageId, this.requestSender);
    }

    public ForwardMessage forward(Object toChatId, int messageId) {
        return new ForwardMessage(toChatId, getChatId(), messageId, this.requestSender);
    }

    public ForwardMessage forward(Object toChatId, Object fromChatId, int messageId) {
        return new ForwardMessage(toChatId, fromChatId, messageId, this.requestSender);
    }

    public CopyMessage copyMessage(Object toChatId, Object fromChatId, int messageId) {
        return new CopyMessage(toChatId, fromChatId, messageId, this.requestSender).parseMode(parseMode);
    }

    public CopyMessage copyMessage(Object toChatId, int messageId) {
        return new CopyMessage(toChatId, getChatId(), messageId, this.requestSender).parseMode(parseMode);
    }

    public CopyMessage copy(Object toChatId, Object fromChatId, int messageId) {
        return new CopyMessage(toChatId, fromChatId, messageId, this.requestSender).parseMode(parseMode);
    }

    public CopyMessage copy(Object toChatId, int messageId) {
        return new CopyMessage(toChatId, getChatId(), messageId, this.requestSender).parseMode(parseMode);
    }

    public CopyMessages copyMessages(Object toChatId, Object fromChatId, List<Integer> messageIds) {
        return new CopyMessages(toChatId, fromChatId, messageIds, this.requestSender);
    }

    public CopyMessages copyMessages(Object toChatId, List<Integer> messageIds) {
        return new CopyMessages(toChatId, getChatId(), messageIds, this.requestSender);
    }

    public CopyMessages copy(Object toChatId, Object fromChatId, List<Integer> messageIds) {
        return new CopyMessages(toChatId, fromChatId, messageIds, this.requestSender);
    }

    public CopyMessages copy(Object toChatId, List<Integer> messageIds) {
        return new CopyMessages(toChatId, getChatId(), messageIds, this.requestSender);
    }

    public ForwardMessages forwardMessages(Object toChatId, Object fromChatId, List<Integer> messageId) {
        return new ForwardMessages(toChatId, fromChatId, messageId, this.requestSender);
    }
    
    public ForwardMessages forwardMessages(Object toChatId, List<Integer> messageId) {
        return new ForwardMessages(toChatId, getChatId(), messageId, this.requestSender);
    }

    public ForwardMessages forward(Object toChatId, Object fromChatId, List<Integer> messageId) {
        return new ForwardMessages(toChatId, fromChatId, messageId, this.requestSender);
    }

    public ForwardMessages forward(Object toChatId, List<Integer> messageId) {
        return new ForwardMessages(toChatId, getChatId(), messageId, this.requestSender);
    }
    
    public SendPhoto sendPhoto(Object chatId, String photo) {
        return new SendPhoto(chatId, photo, this.requestSender).parseMode(parseMode);
    }

    public SendPhoto sendPhoto(String photo) {
        return new SendPhoto(getChatId(), photo, this.requestSender).parseMode(parseMode);
    }

    public SendPhoto sendPhoto(File photo) {
        return new SendPhoto(getChatId(), photo, this.requestSender).parseMode(parseMode);
    }

    public SendPhoto sendPhoto(Object chatId, File photo) {
        return new SendPhoto(chatId, photo, this.requestSender).parseMode(parseMode);
    }

    public SendPhoto replyPhoto(String photo) {
        return new SendPhoto(getChatId(), photo, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendPhoto replyPhoto(File photo) {
        return new SendPhoto(getChatId(), photo, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendAudio sendAudio(Object chatId, String audio) {
        return new SendAudio(chatId, audio, this.requestSender).parseMode(parseMode);
    }

    public SendAudio sendAudio(String audio) {
        return new SendAudio(getChatId(), audio, this.requestSender).parseMode(parseMode);
    }

    public SendAudio sendAudio(Object chatId, File audio) {
        return new SendAudio(chatId, audio, this.requestSender).parseMode(parseMode);
    }

    public SendAudio sendAudio(File audio) {
        return new SendAudio(getChatId(), audio, this.requestSender).parseMode(parseMode);
    }

    public SendAudio replyAudio(Message message, String audio) {
        return new SendAudio(message, audio, this.requestSender)
                .replyParameters(new ReplyParameters(message.message_id).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendAudio replyAudio(Message message, File audio) {
        return new SendAudio(message, audio, this.requestSender).messageThreadId(message.message_id).parseMode(parseMode);
    }

    public SendDocument sendDocument(Object chatId, String document) {
        return new SendDocument(chatId, document, this.requestSender).parseMode(parseMode);
    }

    public SendDocument sendDocument(String document) {
        return new SendDocument(getChatId(), document, this.requestSender).parseMode(parseMode);
    }

    public SendDocument sendDocument(Object chatId, File document) {
        return new SendDocument(chatId, document, this.requestSender).parseMode(parseMode);
    }

    public SendDocument sendDocument(File document) {
        return new SendDocument(getChatId(), document, this.requestSender).parseMode(parseMode);
    }

    public SendDocument replyDocument(String document) {
        return new SendDocument(getChatId(), document, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendDocument replyDocument(File document) {
        return new SendDocument(getChatId(), document, this.requestSender).parseMode(parseMode);
    }

    public SendVideo sendVideo(Object chatId, String video) {
        return new SendVideo(chatId, video, this.requestSender).parseMode(parseMode);
    }

    public SendVideo sendVideo(String video) {
        return new SendVideo(getChatId(), video, this.requestSender).parseMode(parseMode);
    }

    public SendVideo sendVideo(Object chatId, File video) {
        return new SendVideo(chatId, video, this.requestSender).parseMode(parseMode);
    }

    public SendVideo sendVideo(File video) {
        return new SendVideo(getChatId(), video, this.requestSender).parseMode(parseMode);
    }

    public SendVideo replyVideo(String video) {
        return new SendVideo(getChatId(), video, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendVideo replyVideo(File video) {
        return new SendVideo(getChatId(), video, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendAnimation sendAnimation(Object chatId, String animation) {
        return new SendAnimation(chatId, animation, this.requestSender).parseMode(parseMode);
    }

    public SendAnimation sendAnimation(String animation) {
        return new SendAnimation(getChatId(), animation, this.requestSender).parseMode(parseMode);
    }

    public SendAnimation sendAnimation(Object chatId, File animation) {
        return new SendAnimation(chatId, animation, this.requestSender).parseMode(parseMode);
    }

    public SendAnimation sendAnimation(File animation) {
        return new SendAnimation(getChatId(), animation, this.requestSender).parseMode(parseMode);
    }

    public SendAnimation replyAnimation(String animation) {
        return new SendAnimation(getChatId(), animation, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendAnimation replyAnimation(File animation) {
        return new SendAnimation(getChatId(), animation, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendVoice sendVoice(Object chatId, String voice) {
        return new SendVoice(chatId, voice, this.requestSender).parseMode(parseMode);
    }

    public SendVoice sendVoice(String voice) {
        return new SendVoice(getChatId(), voice, this.requestSender).parseMode(parseMode);
    }

    public SendVoice sendVoice(Object chatId, File voice) {
        return new SendVoice(chatId, voice, this.requestSender).parseMode(parseMode);
    }

    public SendVoice sendVoice(File voice) {
        return new SendVoice(getChatId(), voice, this.requestSender).parseMode(parseMode);
    }

    public SendVoice replyVoice(String voice) {
        return new SendVoice(getChatId(), voice, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendVoice replyVoice(File voice) {
        return new SendVoice(getChatId(), voice, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendVideoNote sendVideoNote(Object chatId, String video_note) {
        return new SendVideoNote(chatId, video_note, this.requestSender).parseMode(parseMode);
    }

    public SendVideoNote sendVideoNote(Object chatId, File video_note) {
        return new SendVideoNote(chatId, video_note, this.requestSender).parseMode(parseMode);
    }

    public SendVideoNote replyVideoNote(String videoNote) {
        return new SendVideoNote(getChatId(), videoNote, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendVideoNote replyVideoNote(File videoNote) {
        return new SendVideoNote(getChatId(), videoNote, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendMediaGroup sendMediaGroup(Object chatId, InputMedia[] medias) {
        return new SendMediaGroup(chatId, medias, this.requestSender).parseMode(parseMode);
    }

    public SendMediaGroup sendMediaGroup(InputMedia[] medias) {
        return new SendMediaGroup(getChatId(), medias, this.requestSender).parseMode(parseMode);
    }

    public SendMediaGroup replyMediaGroup(InputMedia[] medias) {
        return new SendMediaGroup(getChatId(), medias, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendPaidMedia sendPaidMedia(Object chatId, int star_count, InputPaidMedia[] medias){
        return new SendPaidMedia(chatId, star_count, medias, requestSender).parseMode(parseMode);
    }

    public SendPaidMedia sendPaidMedia(int star_count, InputPaidMedia[] medias){
        return new SendPaidMedia(getChatId(), star_count, medias, requestSender).parseMode(parseMode);
    }

    public SendPaidMedia replyPaidMedia(int star_count, InputPaidMedia[] medias){
        return new SendPaidMedia(getChatId(), star_count, medias, requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public SendLocation sendLocation(Object chatId, double latitude, double longitude) {
        return new SendLocation(chatId, latitude, longitude, this.requestSender);
    }

    public SendLocation sendLocation(double latitude, double longitude) {
        return new SendLocation(getChatId(), latitude, longitude, this.requestSender);
    }

    public SendLocation replyLocation(double latitude, double longitude) {
        return new SendLocation(getChatId(), latitude, longitude, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true));
    }

    public EditMessageLiveLocation editMessageLiveLocation(Object chatId, double latitude, double longitude, int messageId) {
        return new EditMessageLiveLocation(chatId, latitude, longitude, messageId, this.requestSender);
    }

    public EditMessageLiveLocation editMessageLiveLocation(double latitude, double longitude, int messageId) {
        return new EditMessageLiveLocation(getChatId(), latitude, longitude, messageId, this.requestSender);
    }

    public EditMessageLiveLocation editMessageLiveLocation(String inlineMessageId, double latitude, double longitude) {
        return new EditMessageLiveLocation(inlineMessageId, latitude, longitude, this.requestSender);
    }

    public StopMessageLiveLocation stopMessageLiveLocation(Object chatId, int messageId) {
        return new StopMessageLiveLocation(chatId, messageId, this.requestSender);
    }

    public StopMessageLiveLocation stopMessageLiveLocation(int messageId) {
        return new StopMessageLiveLocation(getChatId(), messageId, this.requestSender);
    }

    public StopMessageLiveLocation stopMessageLiveLocation(String inlineMessageId) {
        return new StopMessageLiveLocation(inlineMessageId, this.requestSender);
    }

    public SendVenue sendVenue(Object chatId, double latitude, double longitude, String title, String address) {
        return new SendVenue(chatId, latitude, longitude, title, address, this.requestSender);
    }

    public SendVenue sendVenue(double latitude, double longitude, String title, String address) {
        return new SendVenue(getChatId(), latitude, longitude, title, address, this.requestSender);
    }

    public SendVenue replyVenue(double latitude, double longitude, String title, String address) {
        return new SendVenue(getChatId(), latitude, longitude, title, address, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true));
    }

    public SendContact sendContact(Object chatId, String phoneNumber, String firstName) {
        return new SendContact(chatId, phoneNumber, firstName, this.requestSender);
    }

    public SendContact sendContact(String phoneNumber, String firstName) {
        return new SendContact(getChatId(), phoneNumber, firstName, this.requestSender);
    }

    public SendContact replyContact(String phoneNumber, String firstName) {
        return new SendContact(getChatId(), phoneNumber, firstName, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true));
    }

    public SendPoll sendPoll(Object chatId, String question, InputPollOption[] options) {
        return new SendPoll(chatId, question, options, this.requestSender);
    }

    public SendPoll replyPoll(String question, InputPollOption[] options) {
        return new SendPoll(getChatId(), question, options, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true));
    }

    public SendDice sendDice(Object chatId) {
        return new SendDice(chatId, this.requestSender);
    }

    public SendDice sendDice() {
        return new SendDice(getChatId(), this.requestSender);
    }

    public SendDice replyDice() {
        return new SendDice(getChatId(), this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true));
    }

    public SendChatAction sendChatAction(Object chatId, ChatAction chatAction) {
        return new SendChatAction(chatId, chatAction, this.requestSender);
    }

    public SendChatAction sendChatAction(ChatAction chatAction) {
        return new SendChatAction(getChatId(), chatAction, this.requestSender);
    }

    public GetUserProfilePhotos getUserProfilePhotos(long userId) {
        return new GetUserProfilePhotos(userId, this.requestSender);
    }

    public RefundStarPayment refundStarPayment(long user_id, String telegram_payment_change_id) {
        return new RefundStarPayment(user_id, telegram_payment_change_id, requestSender);
    }
    public GetFile getFile(String fileId) {
        return new GetFile(fileId, this.requestSender);
    }

    public BanChatMember banChatMember(Object chatId, long userId) {
        return new BanChatMember(chatId, userId, this.requestSender);
    }

    public BanChatMember banChatMember(long userId) {
        return new BanChatMember(getChatId(), userId, this.requestSender);
    }

    public UnbanChatMember unbanChatMember(Object chatId, long userId) {
        return new UnbanChatMember(chatId, userId, this.requestSender);
    }

    public UnbanChatMember unbanChatMember(long userId) {
        return new UnbanChatMember(getChatId(), userId, this.requestSender);
    }

    public RestrictChatMember restrictChatMember(Object chatId, ChatPermission permissions, long userId) {
        return new RestrictChatMember(chatId, userId, permissions, this.requestSender);
    }

    public RestrictChatMember restrictChatMember(ChatPermission permissions, long userId) {
        return new RestrictChatMember(getChatId(), userId, permissions, this.requestSender);
    }

    public PromoteChatMember promoteChatMember(Object chatId, long userId) {
        return new PromoteChatMember(chatId, userId, this.requestSender);
    }

    public PromoteChatMember promoteChatMember(long userId) {
        return new PromoteChatMember(getChatId(), userId, this.requestSender);
    }

    public SetChatAdministratorCustomTitle setChatAdministratorCustomTitle(Object chatId, long userId, String customTitle) {
        return new SetChatAdministratorCustomTitle(chatId, userId, customTitle, this.requestSender);
    }

    public SetChatAdministratorCustomTitle setChatAdministratorCustomTitle(long userId, String customTitle) {
        return new SetChatAdministratorCustomTitle(getChatId(), userId, customTitle, this.requestSender);
    }

    public BanChatSenderChat banChatSenderChat(Object chatId, long senderChatId) {
        return new BanChatSenderChat(chatId, senderChatId, this.requestSender);
    }

    public BanChatSenderChat banChatSenderChat(long senderChatId) {
        return new BanChatSenderChat(getChatId(), senderChatId, this.requestSender);
    }

    public SetChatPermissions setChatPermissions(Object chatId, ChatPermission permissions) {
        return new SetChatPermissions(chatId, permissions, this.requestSender);
    }

    public SetChatPermissions setChatPermissions(ChatPermission permissions) {
        return new SetChatPermissions(getChatId(), permissions, this.requestSender);
    }

    public ExportChatInviteLink exportChatInviteLink(Object chatId) {
        return new ExportChatInviteLink(chatId, this.requestSender);
    }

    public ExportChatInviteLink exportChatInviteLink() {
        return new ExportChatInviteLink(getChatId(), this.requestSender);
    }

    public CreateChatInviteLink createChatInviteLink(Object chatId) {
        return new CreateChatInviteLink(chatId, this.requestSender);
    }

    public CreateChatInviteLink createChatInviteLink() {
        return new CreateChatInviteLink(getChatId(), this.requestSender);
    }

    public EditChatInviteLink editChatInviteLink(Object chatId, String inviteLink) {
        return new EditChatInviteLink(chatId, inviteLink, this.requestSender);
    }

    public EditChatInviteLink editChatInviteLink(String inviteLink) {
        return new EditChatInviteLink(getChatId(), inviteLink, this.requestSender);
    }

    public RevokeChatInviteLink revokeChatInviteLink(Object chatId, String inviteLink) {
        return new RevokeChatInviteLink(chatId, inviteLink, this.requestSender);
    }

    public RevokeChatInviteLink revokeChatInviteLink(String inviteLink) {
        return new RevokeChatInviteLink(getChatId(), inviteLink, this.requestSender);
    }

    public ApproveChatJoinRequest approveChatJoinRequest(Object chatId, long userId) {
        return new ApproveChatJoinRequest(chatId, userId, this.requestSender);
    }

    public ApproveChatJoinRequest approveChatJoinRequest(long userId) {
        return new ApproveChatJoinRequest(getChatId(), userId, this.requestSender);
    }

    public DeclineChatJoinRequest declineChatJoinRequest(Object chatId, long userId) {
        return new DeclineChatJoinRequest(chatId, userId, this.requestSender);
    }

    public DeclineChatJoinRequest declineChatJoinRequest(long userId) {
        return new DeclineChatJoinRequest(getChatId(), userId, this.requestSender);
    }

    public SetChatPhoto setChatPhoto(Object chatId, File photo) {
        return new SetChatPhoto(chatId, photo, this.requestSender);
    }

    public SetChatPhoto setChatPhoto(File photo) {
        return new SetChatPhoto(getChatId(), photo, this.requestSender);
    }

    public DeleteChatPhoto deleteChatPhoto(Object chatId) {
        return new DeleteChatPhoto(chatId, this.requestSender);
    }

    public DeleteChatPhoto deleteChatPhoto() {
        return new DeleteChatPhoto(getChatId(), this.requestSender);
    }

    public SetChatTitle setChatTitle(Object chatId, String title) {
        return new SetChatTitle(chatId, title, this.requestSender);
    }

    public SetChatTitle setChatTitle(String title) {
        return new SetChatTitle(getChatId(), title, this.requestSender);
    }

    public SetChatDescription setChatDescription(Object chatId, String description) {
        return new SetChatDescription(chatId, description, this.requestSender);
    }

    public SetChatDescription setChatDescription(String description) {
        return new SetChatDescription(getChatId(), description, this.requestSender);
    }

    public PinChatMessage pinChatMessage(Object chatId, int messageId) {
        return new PinChatMessage(chatId, messageId, this.requestSender);
    }

    public PinChatMessage pinChatMessage(int messageId) {
        return new PinChatMessage(getChatId(), messageId, this.requestSender);
    }

    public UnpinChatMessage unpinChatMessage(Object chatId) {
        return new UnpinChatMessage(chatId, this.requestSender);
    }

    public UnpinChatMessage unpinChatMessage() {
        return new UnpinChatMessage(getChatId(), this.requestSender);
    }

    public UnpinAllChatMessages unpinAllChatMessages(Object chatId) {
        return new UnpinAllChatMessages(chatId, this.requestSender);
    }

    public UnpinAllChatMessages unpinAllChatMessages() {
        return new UnpinAllChatMessages(getChatId(), this.requestSender);
    }

    public GetStarTransactions getStarTransactions(){
        return new GetStarTransactions(requestSender);
    }

    public LeaveChat leaveChat(Object chatId) {
        return new LeaveChat(chatId, this.requestSender);
    }

    public LeaveChat leaveChat() {
        return new LeaveChat(getChatId(), this.requestSender);
    }

    public GetChat getChat(Object chatId) {
        return new GetChat(chatId, this.requestSender);
    }

    public GetUserChatBoosts getUserChatBoosts(Object chat_id, long user_id){
        return new GetUserChatBoosts(chat_id, user_id, requestSender);
    }

    public GetUserChatBoosts getUserChatBoosts(long user_id){
        return new GetUserChatBoosts(getChatId(), user_id, requestSender);
    }

    public GetChatAdministrators getChatAdministrators(Object chatId) {
        return new GetChatAdministrators(chatId, this.requestSender);
    }

    public GetChatAdministrators getChatAdministrators() {
        return new GetChatAdministrators(getChatId(), this.requestSender);
    }

    public GetChatMemberCount getChatMemberCount(Object chatId) {
        return new GetChatMemberCount(chatId, this.requestSender);
    }

    public GetChatMemberCount getChatMemberCount() {
        return new GetChatMemberCount(getChatId(), this.requestSender);
    }

    public GetChatMember getChatMember(Object chatId, long userId) {
        return new GetChatMember(chatId, userId, this.requestSender);
    }

    public SetMessageReaction setMessageReaction(Object chat_id, int message_id){
        return new SetMessageReaction(chat_id, message_id, requestSender);
    }

    public SetMessageReaction setMessageReaction(int message_id){
        return new SetMessageReaction(getChatId(), message_id, requestSender);
    }

    public SetChatStickerSet setChatStickerSet(Object chatId, String stickerSetName) {
        return new SetChatStickerSet(chatId, stickerSetName, this.requestSender);
    }

    public SetChatStickerSet setChatStickerSet(String stickerSetName) {
        return new SetChatStickerSet(getChatId(), stickerSetName, this.requestSender);
    }

    public DeleteChatStickerSet deleteChatStickerSet(Object chatId) {
        return new DeleteChatStickerSet(chatId, this.requestSender);
    }

    public DeleteChatStickerSet deleteChatStickerSet() {
        return new DeleteChatStickerSet(getChatId(), this.requestSender);
    }

    public GetForumTopicIconStickers getForumTopicIconStickers() {
        return new GetForumTopicIconStickers(this.requestSender);
    }

    public CreateForumTopic createForumTopic(Object chatId, String name) {
        return new CreateForumTopic(chatId, name, this.requestSender);
    }

    public CreateForumTopic createForumTopic(String name) {
        return new CreateForumTopic(getChatId(), name, this.requestSender);
    }

    public EditForumTopic editForumTopic(Object chatId, int messageThreadId) {
        return new EditForumTopic(chatId, messageThreadId, this.requestSender);
    }

    public EditForumTopic editForumTopic(int messageThreadId) {
        return new EditForumTopic(getChatId(), messageThreadId, this.requestSender);
    }

    public ReopenForumTopic reopenForumTopic(Object chatId, int messageThreadId) {
        return new ReopenForumTopic(chatId, messageThreadId, this.requestSender);
    }

    public ReopenForumTopic reopenForumTopic(int messageThreadId) {
        return new ReopenForumTopic(getChatId(), messageThreadId, this.requestSender);
    }

    public DeleteForumTopic deleteForumTopic(Object chatId, int messageThreadId) {
        return new DeleteForumTopic(chatId, messageThreadId, this.requestSender);
    }

    public DeleteForumTopic deleteForumTopic(int messageThreadId) {
        return new DeleteForumTopic(getChatId(), messageThreadId, this.requestSender);
    }

    public UnpinAllForumTopicMessages unpinAllForumTopicMessages(Object chatId, int messageThreadId) {
        return new UnpinAllForumTopicMessages(chatId, messageThreadId, this.requestSender);
    }

    public UnpinAllForumTopicMessages unpinAllForumTopicMessages(int messageThreadId) {
        return new UnpinAllForumTopicMessages(getChatId(), messageThreadId, this.requestSender);
    }

    public EditGeneralForumTopic editGeneralForumTopic(Object chatId, String name) {
        return new EditGeneralForumTopic(chatId, name, this.requestSender);
    }

    public EditGeneralForumTopic editGeneralForumTopic(String name) {
        return new EditGeneralForumTopic(getChatId(), name, this.requestSender);
    }

    public CloseGeneralForumTopic closeGeneralForumTopic(Object chatId) {
        return new CloseGeneralForumTopic(chatId, this.requestSender);
    }

    public CloseGeneralForumTopic closeGeneralForumTopic() {
        return new CloseGeneralForumTopic(getChatId(), this.requestSender);
    }

    public ReopenGeneralForumTopic reopenForumTopic(Object chatId) {
        return new ReopenGeneralForumTopic(chatId, this.requestSender);
    }

    public ReopenGeneralForumTopic reopenForumTopic() {
        return new ReopenGeneralForumTopic(getChatId(), this.requestSender);
    }

    public HideGeneralForumTopic hideGeneralForumTopic(Object chatId) {
        return new HideGeneralForumTopic(chatId, this.requestSender);
    }

    public HideGeneralForumTopic hideGeneralForumTopic() {
        return new HideGeneralForumTopic(getChatId(), this.requestSender);
    }

    public UnHideGeneralForumTopic unHideGeneralForumTopic(Object chatId) {
        return new UnHideGeneralForumTopic(chatId, this.requestSender);
    }

    public UnHideGeneralForumTopic unHideGeneralForumTopic() {
        return new UnHideGeneralForumTopic(getChatId(), this.requestSender);
    }

    public UnpinAllGeneralForumTopicMessages unpinAllGeneralForumTopicMessages(Object chat_id){
        return new UnpinAllGeneralForumTopicMessages(chat_id, this.requestSender);
    }

    public UnpinAllGeneralForumTopicMessages unpinAllGeneralForumTopicMessages(){
        return new UnpinAllGeneralForumTopicMessages(getChatId(), this.requestSender);
    }

    public AnswerCallbackQuery answer() {
        return new AnswerCallbackQuery(update.callback_query.id, this.requestSender);
    }

    public AnswerCallbackQuery answer(String text) {
        return new AnswerCallbackQuery(update.callback_query.id, this.requestSender).text(text);
    }

    public AnswerCallbackQuery answerCallbackQuery(String callbackQueryId) {
        return new AnswerCallbackQuery(callbackQueryId, this.requestSender);
    }

    public SetMyCommands setMyCommands(BotCommand[] commands) {
        return new SetMyCommands(commands, this.requestSender);
    }

    public DeleteMyCommands deleteMyCommands() {
        return new DeleteMyCommands(this.requestSender);
    }

    public GetMyCommands getMyCommands() {
        return new GetMyCommands(this.requestSender);
    }

    public SetChatMenuButton setChatMenuButton() {
        return new SetChatMenuButton(this.requestSender);
    }

    public GetChatMenuButton getChatMenuButton() {
        return new GetChatMenuButton(this.requestSender);
    }

    public SetMyDefaultAdministratorRights setMyDefaultAdministratorRights() {
        return new SetMyDefaultAdministratorRights(this.requestSender);
    }

    public GetMyDefaultAdministratorRights getMyDefaultAdministratorRights() {
        return new GetMyDefaultAdministratorRights(this.requestSender);
    }

    public EditMessageText editMessageText(String text, Object chatId, int messageId) {
        return new EditMessageText(text, chatId, messageId, this.requestSender).parseMode(parseMode);
    }

    public EditMessageText editMessageText(String text) {
        return new EditMessageText(text, getChatId(), getMessageId(), this.requestSender).parseMode(parseMode);
    }

    public EditMessageText editMessageText(String text, String inlineMessageId) {
        return new EditMessageText(text, inlineMessageId, this.requestSender).parseMode(parseMode);
    }

    public EditMessageCaption editMessageCaption(Object chatId, int messageId) {
        return new EditMessageCaption(chatId, messageId, this.requestSender).parseMode(parseMode);
    }

    public EditMessageCaption editMessageCaption(int messageId) {
        return new EditMessageCaption(getChatId(), messageId, this.requestSender).parseMode(parseMode);
    }

    public EditMessageCaption editMessageCaption(String inlineMessageId) {
        return new EditMessageCaption(inlineMessageId, this.requestSender).parseMode(parseMode);
    }

    public EditMessageMedia editMessageMedia(File media, Object chatId, int messageId) {
        return new EditMessageMedia(media, chatId, messageId, this.requestSender);
    }

    public EditMessageMedia editMessageMedia(File media) {
        return new EditMessageMedia(media, getChatId(), getMessageId(), this.requestSender);
    }

    public EditMessageMedia editMessageMedia(File media, String inlineMessageId) {
        return new EditMessageMedia(media, inlineMessageId, this.requestSender);
    }

    public EditMessageReplyMarkup editMessageReplyMarkup(Object chatId, int messageId) {
        return new EditMessageReplyMarkup(chatId, messageId, this.requestSender);
    }

    public EditMessageReplyMarkup editMessageReplyMarkup(int messageId) {
        return new EditMessageReplyMarkup(getChatId(), messageId, this.requestSender);
    }

    public EditMessageReplyMarkup editMessageReplyMarkup(String inlineMessageId) {
        return new EditMessageReplyMarkup(inlineMessageId, this.requestSender);
    }

    public StopPoll stopPoll(Object chatId, int messageId) {
        return new StopPoll(chatId, messageId, this.requestSender);
    }

    public StopPoll stopPoll(int messageId) {
        return new StopPoll(getChatId(), messageId, this.requestSender);
    }

    public DeleteMessage deleteMessage(Object chatId, int messageId) {
        return new DeleteMessage(chatId, messageId, this.requestSender);
    }

    public DeleteMessage deleteMessage(int messageId) {
        return new DeleteMessage(getChatId(), messageId, this.requestSender);
    }

    public SendSticker sendSticker(Object chatId, File sticker) {
        return new SendSticker(chatId, sticker, this.requestSender);
    }

    public SendSticker sendSticker(File sticker) {
        return new SendSticker(getChatId(), sticker, this.requestSender);
    }

    public SendSticker sendSticker(Object chatId, String sticker) {
        return new SendSticker(chatId, sticker, this.requestSender);
    }

    public SendSticker sendSticker(String sticker) {
        return new SendSticker(getChatId(), sticker, this.requestSender);
    }

    public GetStickerSet getStickerSet(String name) {
        return new GetStickerSet(name, this.requestSender);
    }

    public GetCustomEmojiStickers getCustomEmojiStickers(String[] customEmojiIds) {
        return new GetCustomEmojiStickers(customEmojiIds, this.requestSender);
    }

    public UploadStickerFile uploadStickerFile(long userId, File sticker, String stickerFormat) {
        return new UploadStickerFile(userId, sticker, stickerFormat, this.requestSender);
    }

    public CreateNewStickerSet createNewStickerSet(long userId, String name, String title, InputSticker[] stickers) {
        return new CreateNewStickerSet(userId, name, title, stickers, this.requestSender);
    }

    public AddStickerToSet addStickerToSet(long userId, String name, File sticker) {
        return new AddStickerToSet(userId, name, sticker, this.requestSender);
    }

    public SetStickerPositionInSet setStickerPositionInSet(String sticker, int position) {
        return new SetStickerPositionInSet(sticker, position, this.requestSender);
    }

    public DeleteStickerFromSet deleteStickerFromSet(String sticker) {
        return new DeleteStickerFromSet(sticker, this.requestSender);
    }

    public SetStickerEmojiList setStickerEmojiList(String sticker, String[] emojiList) {
        return new SetStickerEmojiList(sticker, emojiList, this.requestSender);
    }

    public SetStickerKeywords setStickerKeywords(String sticker, String[] keywords) {
        return new SetStickerKeywords(sticker, keywords, this.requestSender);
    }

    public SetStickerMaskPosition setStickerMaskPosition(String sticker, MaskPosition maskPosition) {
        return new SetStickerMaskPosition(sticker, maskPosition, this.requestSender);
    }

    public SetStickerSetTitle setStickerSetTitle(String sticker, String title) {
        return new SetStickerSetTitle(sticker, title, this.requestSender);
    }

    public ReplaceStickerInSet replaceStickerInSet(long user_id, String name, String  oldName, InputSticker sticker){
        return new ReplaceStickerInSet(user_id, name, oldName, sticker, requestSender);
    }

    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long userId, File thumbnail, String format) {
        return new SetStickerSetThumbnail(name, userId, thumbnail, format, this.requestSender);
    }

    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long userId, String thumbnail, String format) {
        return new SetStickerSetThumbnail(name, userId, thumbnail, format, this.requestSender);
    }

    public SetCustomEmojiStickerSetThumbnail setCustomEmojiStickerSetThumbnail(String name, String customEmojiId) {
        return new SetCustomEmojiStickerSetThumbnail(name, customEmojiId, this.requestSender);
    }

    public DeleteStickerSet deleteStickerSet(String name) {
        return new DeleteStickerSet(name, this.requestSender);
    }

    public GetBusinessConnection getBusinessConnection(String business_connection_id){
        return new GetBusinessConnection(business_connection_id, requestSender);
    }

    public AnswerInlineQuery answerInlineQuery(String inlineQueryId, InlineQueryResult[] results) {
        return new AnswerInlineQuery(inlineQueryId, results, this.requestSender);
    }

    public AnswerInlineQuery answerInlineQuery(InlineQueryResult[] results) {
        return new AnswerInlineQuery(update.inline_query.id, results, this.requestSender);
    }

    public AnswerInlineQuery answerInline(String inlineQueryId, InlineQueryResult[] results) {
        return new AnswerInlineQuery(inlineQueryId, results, this.requestSender);
    }

    public AnswerInlineQuery answerInline(InlineQueryResult[] results) {
        return new AnswerInlineQuery(update.inline_query.id, results, this.requestSender);
    }

    public AnswerWebAppQuery answerWebAppQuery(String webAppQueryId, InlineQueryResult result) {
        return new AnswerWebAppQuery(webAppQueryId, result, this.requestSender);
    }

    public SendInvoice sendInvoice(Object chatId, String title, String description, String payload, String currency,
                                   LabeledPrice[] prices) {
        return new SendInvoice(chatId, title, description, payload, currency, prices, this.requestSender)
                .parseMode(parseMode);
    }

    public SendInvoice sendInvoice(String title, String description, String payload,
                                   String currency, LabeledPrice[] prices) {
        return new SendInvoice(getChatId(), title, description, payload, currency, prices, this.requestSender)
                .parseMode(parseMode);
    }

    public SendInvoice replyInvoice(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        return new SendInvoice(getChatId(), title, description, payload, currency, prices, this.requestSender)
                .replyParameters(new ReplyParameters(getMessageId()).allowSendingWithoutReply(true))
                .parseMode(parseMode);
    }

    public CreateInvoiceLink createInvoiceLink(Object chatId, String title, String description, String payload, String currency, LabeledPrice[] prices) {
        return new CreateInvoiceLink(chatId, title, description, payload, currency, prices, this.requestSender);
    }

    public CreateInvoiceLink createInvoiceLink(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        return new CreateInvoiceLink(getChatId(), title, description, payload, currency, prices, this.requestSender);
    }

    public AnswerShippingQuery answerShippingQuery(String shippingQueryId, boolean ok) {
        return new AnswerShippingQuery(shippingQueryId, ok, this.requestSender);
    }

    public AnswerShippingQuery answerShipping(boolean ok) {
        return new AnswerShippingQuery(update.shipping_query.id, ok, this.requestSender);
    }

    public AnswerPreCheckoutQuery answerPreCheckoutQuery(String preCheckoutQueryId, Boolean ok) {
        return new AnswerPreCheckoutQuery(preCheckoutQueryId, ok, this.requestSender);
    }

    public AnswerPreCheckoutQuery answerPreCheckout(boolean ok) {
        return new AnswerPreCheckoutQuery(update.pre_checkout_query.id, ok, this.requestSender);
    }

    public SetPassportDataErrors setPassportDataErrors(long userId, PassportElementError[] errors) {
        return new SetPassportDataErrors(userId, errors, this.requestSender);
    }

    public SendGame sendGame(long chatId, String gameShortName) {
        return new SendGame(chatId, gameShortName, this.requestSender).parseMode(parseMode);
    }

    public SetGameScore setGameScore(long chatId, long userId, int score, int messageId) {
        return new SetGameScore(chatId, userId, score, messageId, this.requestSender);
    }

    public GetMyName getMyName(){
        return new GetMyName(this.requestSender);
    }

    public SetMyName setMyName(){
        return new SetMyName(this.requestSender);
    }

    public SetGameScore setGameScore(String inlineMessageId, long userId, int score) {
        return new SetGameScore(inlineMessageId, userId, score, this.requestSender);
    }

    public GetGameHighScores getGameHighScores(long chatId, long userId, int messageId) {
        return new GetGameHighScores(chatId, userId, messageId, this.requestSender);
    }

    public GetGameHighScores getGameHighScores(long userId, int messageId) {
        return new GetGameHighScores(getChatId(), userId, messageId, this.requestSender);
    }

    public GetGameHighScores getGameHighScores(String inlineMessageId, long userId) {
        return new GetGameHighScores(inlineMessageId, userId, this.requestSender);
    }

    public void setState(long chatId, long userId, String name){
        storage.save(chatId, userId, name);
    }

    public void setState(long userId, String name){
        storage.save(userId, name);
    }

    public void clearState(long chatId, long userId){
        storage.clear(chatId, userId);
    }

    public void clearState(long userId){
        storage.clear(userId);
    }

    public Map<String, Object> getStateData(long chatId, long userId){
        return storage.getData(chatId, userId);
    }

    public Map<String, Object> getStateData(long userId){
        return storage.getData(userId);
    }

    public GetUpdates getUpdates(){
        return new GetUpdates(requestSender);
    }

    private Long getChatId(){
        if (update.message != null) return update.message.chat.id;
        if (update.callback_query != null) return update.callback_query.message.chat.id;
        if (update.edited_message != null) return update.edited_message.chat.id;
        if (update.channel_post != null) return update.channel_post.chat.id;
        if (update.edited_channel_post != null) return update.edited_channel_post.chat.id;
        if (update.chat_member != null) return update.chat_member.chat.id;
        if (update.chat_join_request != null) return update.chat_join_request.chat.id;
        if (update.my_chat_member != null) return update.my_chat_member.chat.id;
        return 0L;
    }

    private int getMessageId(){
        if (update.message != null) return update.message.message_id;
        if (update.callback_query != null) return update.callback_query.message.message_id;
        if (update.edited_message != null) return update.edited_message.message_id;
        if (update.channel_post != null) return update.channel_post.message_id;
        if (update.edited_channel_post != null) return update.edited_channel_post.message_id;
        return 0;
    }


}
