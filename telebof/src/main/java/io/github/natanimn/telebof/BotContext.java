package io.github.natanimn.telebof;

import io.github.natanimn.telebof.enums.ChatAction;
import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.requests.*;
import io.github.natanimn.telebof.requests.answer.*;
import io.github.natanimn.telebof.requests.create.*;
import io.github.natanimn.telebof.requests.delete.*;
import io.github.natanimn.telebof.requests.edit.*;
import io.github.natanimn.telebof.requests.get.*;
import io.github.natanimn.telebof.requests.pin_and_unpin.*;
import io.github.natanimn.telebof.requests.send.*;
import io.github.natanimn.telebof.requests.service.*;
import io.github.natanimn.telebof.requests.set.*;
import io.github.natanimn.telebof.states.StateMemoryStorage;
import io.github.natanimn.telebof.types.bot.BotCommand;
import io.github.natanimn.telebof.types.chat_and_user.ChatPermissions;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gifts;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.input.InputProfilePhoto;
import io.github.natanimn.telebof.types.input.InputMedia;
import io.github.natanimn.telebof.types.input.InputPaidMedia;
import io.github.natanimn.telebof.types.input.InputPollOption;
import io.github.natanimn.telebof.types.input.InputStoryContent;
import io.github.natanimn.telebof.types.input.InputChecklist;
import io.github.natanimn.telebof.types.input.InputSticker;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import io.github.natanimn.telebof.types.passport.PassportElementError;
import io.github.natanimn.telebof.types.web.WebhookInfo;

import java.io.File;
import java.util.Map;

/**
 * This class implemented all classes defined in <i>io.github.natanimn.telebof.requests</i> as directly usable methods.
 * @author Natanim
 * @since March 3, 2025
 * @version 1.3.0
 */
@SuppressWarnings("unused")
public class BotContext {
    private final Api api;
    private StateMemoryStorage storage;

    public BotContext(Api api, StateMemoryStorage storage){
        this.api = api;
        this.storage = storage;
    }


    /**
     * <p>Use this method to specify a URL and receive incoming updates via an outgoing webhook. Whenever
     * there is an update for the bot, we will send an HTTPS POST request to the specified URL, containing a
     * JSON-serialized Update. In case of an unsuccessful request, we will give up after a reasonable</p>
     *
     * <p>If you'd like to make sure that the webhook was set by you, you can specify secret data in the
     * parameter secretToken. If specified, the request will contain a header “X-Telegram-Bot-Api-Secret-Token”
     * with the secret token as content.</p>
     * @apiNote <p> 1. You will not be able to receive updates using getUpdates for as long as an outgoing webhook is set up.</p>
     * <p>2. To use a self-signed certificate, you need to upload your public key certificate using
     * certificate parameter. Please upload as InputFile, sending a String will not work.</p>
     * <p>3. Ports currently supported for webhooks: 443, 80, 88, 8443.</p>
     * If you're having any trouble setting up webhooks, please check out this <a href="https://core.telegram.org/bots/webhooks">amazing guide to  webhooks.</a>
     * @param url holds parameters for webhook.
     * @see <a href="https://core.telegram.org/bots/api#setwebhook">Telegram Documentation</a>
     */
    public SetWebhook setWebhook(String url){
        return new SetWebhook(url, api);
    }

    public WebhookInfo getWebhookInfo(){
        return new GetWebhookInfo(api).exec();
    }

    /**
     * Use this method to remove webhook integration if you decide to back getUpdates.
     * @see <a href="https://core.telegram.org/bots/api#deletewebhook">Delete Webhook</a>
     */
    public void deleteWebhook(){
        new DeleteWebhook(api).exec();
    }

    /**
     * A simple method for testing your bot's authentication token.
     * @return {@link io.github.natanimn.telebof.requests.get.GetMe}
     */
    public GetMe getMe() {
        return new GetMe(this.api);
    }

    /**
     * Use this method to log out from the cloud Bot API server before launching the bot locally.
     * You must log out the bot before running it locally, otherwise there is no guarantee that the bot will receive updates.
     * After a successful call, you can immediately log in on a local server, but will not be able to log in back to the cloud Bot API server for 10 minutes.
     * @return {@link io.github.natanimn.telebof.requests.service.LogOut}
     */
    public LogOut logOut() {
        return new LogOut(this.api);
    }

    /**
     * Use this method to close the bot instance before moving it from one local server to another. 
     * You need to delete the webhook before calling this method to ensure that the bot isn't launched again after server restart. 
     * The method will return error 429 in the first 10 minutes after the bot is launched.
     * @return {@link io.github.natanimn.telebof.requests.service.Close}
     */
    public Close close() {
        return new Close(this.api);
    }

    /**
     * Use this method to send text messages.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param text Text of the message to be sent, 1-4096 characters after entities parsing
     * @return {@link io.github.natanimn.telebof.requests.send.SendMessage}
     */
    public SendMessage sendMessage(Object chatId, String text) {
        return new SendMessage(chatId, text, this.api);
    }

    /**
     * Use this method to download files up to 20MB in size. On success, a {@link io.github.natanimn.telebof.types.media_and_service.File}  object is returned.
     * @param filePath taken from {@link io.github.natanimn.telebof.requests.get.GetFile} response.
     *                  It is guaranteed that the link will be valid for at least 1 hour.
     *                  When the link expires, a new one can be requested by calling {@link #getFile(String)} again
     * @return array of byte
     */
    public byte[] downloadFile(String filePath) {
        return api.downloadFile(filePath);
    }

    /**
     * Use this method to forward messages of any kind. Service messages and messages with protected content can't be forwarded.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param fromChatId Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     * @param messageId Message identifier in the chat specified in fromChatId
     * @return {@link io.github.natanimn.telebof.requests.service.ForwardMessage}
     */
    public ForwardMessage forward(Object chatId, Object fromChatId, int messageId) {
        return new ForwardMessage(chatId, fromChatId, messageId, this.api);
    }

    /**
     * Use this method to copy messages of any kind. Service messages, paid media messages, giveaway messages, giveaway winners messages, and invoice messages can't be copied.
     * A quiz poll can be copied only if the value of the field correct_option_id is known to the bot.
     * The method is analogous to the method forwardMessage, but the copied message doesn't have a link to the original message.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param fromChatId Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     * @param messageId  Message identifier in the chat specified in fromChatId
     * @return {@link io.github.natanimn.telebof.requests.service.CopyMessage}
     */
    public CopyMessage copy(Object chatId, Object fromChatId, int messageId) {
        return new CopyMessage(chatId, fromChatId, messageId, this.api);
    }

    /**
     * Use this method to copy messages of any kind. If some of the specified messages can't be found or copied, they are skipped.
     * Service messages, paid media messages, giveaway messages, giveaway winners messages, and invoice messages can't be copied.
     * A quiz poll can be copied only if the value of the field correct_option_id is known to the bot. The method is analogous to the method forwardMessages,
     * but the copied messages don't have a link to the original message. Album grouping is kept for copied messages.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param fromChatId Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     * @param messageIds  A JSON-serialized list of 1-100 identifiers of messages in the chat fromChatId to copy. The identifiers must be specified in a strictly increasing order.
     * @return {@link io.github.natanimn.telebof.requests.service.CopyMessage}
     */
    public CopyMessages copyMessages(Object chatId, Object fromChatId, Integer[] messageIds) {
        return new CopyMessages(chatId, fromChatId, messageIds, this.api);
    }

    /**
     * Use this method to forward multiple messages of any kind. If some of the specified messages can't be found or forwarded, they are skipped.
     * Service messages and messages with protected content can't be forwarded. Album grouping is kept for forwarded messages.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param fromChatId Unique identifier for the chat where the original messages were sent (or channel username in the format @channelusername)
     * @param messageId A JSON-serialized list of 1-100 identifiers of messages in the chat fromChatId to forward. The identifiers must be specified in a strictly increasing order.
     * @return {@link io.github.natanimn.telebof.requests.service.ForwardMessages}
     */
    public ForwardMessages forwardMessages(Object chatId, Object fromChatId, Integer[] messageId) {
        return new ForwardMessages(chatId, fromChatId, messageId, this.api);
    }

    /**
     * Use this method to send photos.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo Photo to send. Pass a fileId as String to send a photo that exists on the Telegram servers (recommended),
     *              pass an HTTP URL as a String for Telegram to get a photo from the Internet
     * @return {@link io.github.natanimn.telebof.requests.send.SendPhoto}
     */
    public SendPhoto sendPhoto(Object chatId, String photo) {
        return new SendPhoto(chatId, photo, this.api);
    }

    /**
     * Use this method to send photos.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo Photo to send. Upload new photo using {@link File}.
     *              The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total.
     *              Width and height ratio must be at most 20
     * @return {@link io.github.natanimn.telebof.requests.send.SendPhoto}
     */
    public SendPhoto sendPhoto(Object chatId, File photo) {
        return new SendPhoto(chatId, photo, this.api);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display them in the music player.
     * Your audio must be in the .MP3 or .M4A format. Bots can currently send audio files of up to 50 MB in size, this limit may be changed in the future
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param audio Audio file to send. Pass a fileId as String to send an audio file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL as a String for Telegram to get an audio file from the Internet.
     * @return {@link io.github.natanimn.telebof.requests.send.SendAudio}
     */
    public SendAudio sendAudio(Object chatId, String audio) {
        return new SendAudio(chatId, audio, this.api);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display them in the music player.
     * Your audio must be in the .MP3 or .M4A format. Bots can currently send audio files of up to 50 MB in size, this limit may be changed in the future
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param audio Audio file to send. Upload using {@link File}.
     * @return {@link io.github.natanimn.telebof.requests.send.SendAudio}
     */
    public SendAudio sendAudio(Object chatId, File audio) {
        return new SendAudio(chatId, audio, this.api);
    }

    /**
     * Use this method to send general files.
     * Bots can currently send files of any type of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param document File to send. Pass a fileId as String to send a file that exists on the Telegram servers (recommended), or
     *                 pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @return {@link io.github.natanimn.telebof.requests.send.SendDocument}
     */
    public SendDocument sendDocument(Object chatId, String document) {
        return new SendDocument(chatId, document, this.api);
    }

    /**
     * Use this method to send general files.
     * Bots can currently send files of any type of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param document File to send. Upload using {@link File}
     * @return {@link io.github.natanimn.telebof.requests.send.SendDocument}
     */
    public SendDocument sendDocument(Object chatId, File document) {
        return new SendDocument(chatId, document, this.api);
    }

    /**
     * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may be sent as Document).
     * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video Video to send. Pass a fileId as String to send a video that exists on the Telegram servers (recommended), or
     *             pass an HTTP URL as a String for Telegram to get a video from the Internet
     * @return {@link io.github.natanimn.telebof.requests.send.SendVideo}
     */
    public SendVideo sendVideo(Object chatId, String video) {
        return new SendVideo(chatId, video, this.api);
    }

    /**
     * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may be sent as Document).
     * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video Video to send. Upload using {@link File}
     * @return {@link io.github.natanimn.telebof.requests.send.SendVideo}
     */
    public SendVideo sendVideo(Object chatId, File video) {
        return new SendVideo(chatId, video, this.api);
    }

    /**
     * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound).
     * Bots can currently send animation files of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param animation Animation to send. Pass a fileId as String to send an animation that exists on the Telegram servers (recommended), or
     *                 pass an HTTP URL as a String for Telegram to get an animation from the Internet.
     * @return {@link io.github.natanimn.telebof.requests.send.SendAnimation}
     */
    public SendAnimation sendAnimation(Object chatId, String animation) {
        return new SendAnimation(chatId, animation, this.api);
    }

    /**
     * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound).
     * Bots can currently send animation files of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param animation Animation to send. Upload using {@link File}.
     * @return {@link io.github.natanimn.telebof.requests.send.SendAnimation}
     */
    public SendAnimation sendAnimation(Object chatId, File animation) {
        return new SendAnimation(chatId, animation, this.api);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
     * For this to work, your audio must be in an .OGG file encoded with OPUS, or in .MP3 format, or in .M4A format (other formats may be sent as Audio or Document).
     * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param voice Audio file to send. Pass a fileId as String to send a file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @return {@link io.github.natanimn.telebof.requests.send.SendVoice}
     */
    public SendVoice sendVoice(Object chatId, String voice) {
        return new SendVoice(chatId, voice, this.api);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
     * For this to work, your audio must be in an .OGG file encoded with OPUS, or in .MP3 format, or in .M4A format (other formats may be sent as Audio or Document).
     * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param voice Audio file to send. Upload using {@link File}
     * @return {@link io.github.natanimn.telebof.requests.send.SendVoice}
     */
    public SendVoice sendVoice(Object chatId, File voice) {
        return new SendVoice(chatId, voice, this.api);
    }

    /**
     * As of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>, Telegram clients support rounded square MPEG4 videos of up to 1 minute long. <br>
     * Use this method to send video messages.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param videoNote Video note to send. Pass a fileId as String to send a video note that exists on the Telegram servers (recommended)
     * @return {@link io.github.natanimn.telebof.requests.send.SendVideoNote}
     */
    public SendVideoNote sendVideoNote(Object chatId, String videoNote) {
        return new SendVideoNote(chatId, videoNote, this.api);
    }

    /**
     * As of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>, Telegram clients support rounded square MPEG4 videos of up to 1 minute long. <br>
     * Use this method to send video messages.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param videoNote Video note to send. Upload using {@link File}
     * @return {@link io.github.natanimn.telebof.requests.send.SendVideoNote}
     */
    public SendVideoNote sendVideoNote(Object chatId, File videoNote) {
        return new SendVideoNote(chatId, videoNote, this.api);
    }

    /**
     * Use this method to send a group of photos, videos, documents or audios as an album.
     * Documents and audio files can be only grouped in an album with messages of the same type.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param media An array of {@link io.github.natanimn.telebof.types.input.InputMediaVideo}, {@link io.github.natanimn.telebof.types.input.InputMediaAudio},
     *              {@link io.github.natanimn.telebof.types.input.InputMediaPhoto}, or {@link io.github.natanimn.telebof.types.input.InputMediaDocument}
     *               describing messages to be sent, must include 2-10 items.
     * @return {@link io.github.natanimn.telebof.requests.send.SendMediaGroup}
     */
    public SendMediaGroup sendMediaGroup(Object chatId, InputMedia[] media) {
        return new SendMediaGroup(chatId, media, this.api);
    }

    /**
     * Use this method to send paid media.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     *                If the chat is a channel, all Telegram Star proceeds from this media will be credited to the chat's balance.
     *                Otherwise, they will be credited to the bot's balance.
     * @param starCount The number of Telegram Stars that must be paid to buy access to the media; 1-10000
     * @param media A JSON-serialized array describing the media to be sent; up to 10 items
     * @return {@link io.github.natanimn.telebof.requests.send.SendPaidMedia}
     */
    public SendPaidMedia sendPaidMedia(Object chatId, int starCount, InputPaidMedia[] media){
        return new SendPaidMedia(chatId, starCount, media, api);
    }

    /**
     * Use this method to send point on the map.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     * @return {@link io.github.natanimn.telebof.requests.send.SendLocation}
     */
    public SendLocation sendLocation(Object chatId, double latitude, double longitude) {
        return new SendLocation(chatId, latitude, longitude, this.api);
    }

    /**
     * Use this method to edit live location messages.
     * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
     * On success, the edited Message is returned.
     * @param chatId Required if inlineMessageId is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of new location
     * @param longitude Longitude of new location
     * @param messageId Required if inlineMessageId is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageLiveLocation}
     */
    public EditMessageLiveLocation editMessageLiveLocation(Object chatId, double latitude, double longitude, int messageId) {
        return new EditMessageLiveLocation(chatId, latitude, longitude, messageId, this.api);
    }

    /**
     * Use this method to edit live location messages.
     * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
     * On success, True is returned.
     * @param inlineMessageId Required if chatId and messageId are not specified. Identifier of the inline message
     * @param latitude Latitude of new location
     * @param longitude Longitude of new location
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageLiveLocation}
     */
    public EditMessageLiveLocation editMessageLiveLocation(String inlineMessageId, double latitude, double longitude) {
        return new EditMessageLiveLocation(inlineMessageId, latitude, longitude, this.api);
    }

    /**
     * This a method that allows the bot to cancel or re-enable extension of a subscription paid in Telegram Stars.
     * @param userId Identifier of the user whose subscription will be edited
     * @param telegramChargeId Telegram payment identifier for the subscription
     * @param isCancelled Pass True to cancel extension of the user subscription; the subscription must be active up to the end of the current subscription period.
     *                     Pass False to allow the user to re-enable a subscription that was previously canceled by the bot.
     * @return {@link io.github.natanimn.telebof.requests.edit.EditUserStarSubscription}
     */
    public EditUserStarSubscription editUserStarSubscription(long userId, String telegramChargeId, boolean isCancelled){
        return new EditUserStarSubscription(userId, telegramChargeId, isCancelled, api);
    }

    /**
     * Use this method to stop updating a live location message before live_period expires.
     * On success, the edited Message is returned.
     * @param chatId Required if inlineMessageId is not specified.
     *                Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Required if inlineMessageId is not specified. Identifier of the message with live location to stop
     * @return {@link io.github.natanimn.telebof.requests.service.StopMessageLiveLocation}
     */
    public StopMessageLiveLocation stopMessageLiveLocation(Object chatId, int messageId) {
        return new StopMessageLiveLocation(chatId, messageId, this.api);
    }

    /**
     * Use this method to stop updating a live location message before live_period expires.
     * On success, True is returned.
     * @param inlineMessageId <b>Required if chatId and messageId are not specified.</b><br>
     *                         Identifier of the inline message
     * @return {@link io.github.natanimn.telebof.requests.service.StopMessageLiveLocation}
     */
    public StopMessageLiveLocation stopMessageLiveLocation(String inlineMessageId) {
        return new StopMessageLiveLocation(inlineMessageId, this.api);
    }

    /**
     * Use this method to edit a checklist on behalf of a connected business account.
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @param chatId Unique identifier for the target chat
     * @param messageId Unique identifier for the target message
     * @param checklist A JSON-serialized object for the new checklist
     * @return {@link EditMessageChecklist}
     */
    public EditMessageChecklist editMessageChecklist(String businessConnectionId, Object chatId, Integer messageId, InputChecklist checklist){
        return new EditMessageChecklist(businessConnectionId, chatId, messageId, checklist, api);
    }

    /**
     * Use this method to send information about a venue.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of the venue
     * @param longitude Longitude of the venue
     * @param title Name of the venue
     * @param address Address of the venue
     * @return {@link io.github.natanimn.telebof.requests.send.SendVenue}
     */
    public SendVenue sendVenue(Object chatId, double latitude, double longitude, String title, String address) {
        return new SendVenue(chatId, latitude, longitude, title, address, this.api);
    }

    /**
     * Use this method to send phone contacts.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param phoneNumber Contact's phone number
     * @param firstName Contact's first name
     * @return {@link io.github.natanimn.telebof.requests.send.SendContact}
     */
    public SendContact sendContact(Object chatId, String phoneNumber, String firstName) {
        return new SendContact(chatId, phoneNumber, firstName, this.api);
    }

    /**
     * Use this method to send a native poll.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param question Poll question, 1-300 characters
     * @param options A JSON-serialized list of 2-12 answer options
     * @return {@link io.github.natanimn.telebof.requests.send.SendPoll}
     */
    public SendPoll sendPoll(Object chatId, String question, InputPollOption[] options) {
        return new SendPoll(chatId, question, options, this.api);
    }

    /**
     * Use this method to send a checklist on behalf of a connected business account.
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @param chatId Unique identifier for the target chat
     * @param checklist A JSON-serialized object for the checklist to send
     * @return {@link SendChecklist}
     */
    public SendChecklist sendChecklist(String businessConnectionId, Object chatId, InputChecklist checklist){
        return new SendChecklist(businessConnectionId, chatId, checklist, api);
    }

    /**
     * Use this method to send an animated emoji that will display a random value.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.send.SendDice}
     */
    public SendDice sendDice(Object chatId) {
        return new SendDice(chatId, this.api);
    }

    /**
     * Use this method to stream a partial message to a user while the message is being generated; supported only for bots with forum topic mode enabled.
     * @param chatId Unique identifier for the target private chat
     * @param text Text of the message to be sent, 1-4096 characters after entities parsing
     * @param draftId Unique identifier of the message draft; must be non-zero. Changes of drafts with the same identifier are animated
     * @return {@link SendMessageDraft}
     */
    public SendMessageDraft sendMessageDraft(long chatId, String text, int draftId){
        return new SendMessageDraft(chatId, text, draftId, api);
    }

    /**
     * Use this method when you need to tell the user that something is happening on the bot's side.
     * The status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients clear its typing status).
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param action Type of action to broadcast. Choose one, depending on what the user is about to receive:
     *               {@link ChatAction#TYPING} for text messages, {@link ChatAction#UPLOAD_PHOTO} for photos,
     *               {@link ChatAction#RECORD_VIDEO} or {@link ChatAction#UPLOAD_VIDEO} for videos,
     *               {@link ChatAction#RECORD_VOICE} or {@link ChatAction#UPLOAD_VOICE} for voice notes,
     *               {@link ChatAction#UPLOAD_DOCUMENT} for general files, {@link ChatAction#CHOSE_STICKER} for stickers,
     *               {@link ChatAction#FIND_LOCATION} for location data, {@link ChatAction#RECORD_VIDEO_NOTE} or {@link ChatAction#UPLOAD_VIDEO_NOTE} for video notes.
     * @return {@link io.github.natanimn.telebof.requests.send.SendChatAction}
     */
    public SendChatAction sendChatAction(Object chatId, ChatAction action) {
        return new SendChatAction(chatId, action, this.api);
    }

    /**
     * Sends a gift to the given user or channel chat. The gift can't be converted to Telegram Stars by the receiver
     * @param userId Unique identifier of the target user who will receive the gift.
     * @param giftId Identifier of the gift
     * @return {@link io.github.natanimn.telebof.requests.send.SendGift}
     */
    public SendGift sendGift(long userId, String giftId){
        return new SendGift(userId, giftId, api);
    }

    /**
     * Sends a gift to the given user or channel chat. The gift can't be converted to Telegram Stars by the receiver
     * @param chatId Unique identifier for the chat or username of the channel (in the format @channelusername) that will receive the gift.
     * @param giftId Identifier of the gift
     * @return {@link io.github.natanimn.telebof.requests.send.SendGift}
     */
    public SendGift sendGift(Object chatId, String giftId){
        return new SendGift(chatId, giftId, api);
    }

    /**
     * Gifts a Telegram Premium subscription to the given user.
     * @param userId Unique identifier of the target user who will receive a Telegram Premium subscription
     * @param monthCount Number of months the Telegram Premium subscription will be active for the user; must be one of 3, 6, or 12
     * @param starCount Number of Telegram Stars to pay for the Telegram Premium subscription; must be 1000 for 3 months, 1500 for 6 months, and 2500 for 12 months
     * @return {@link GiftPremiumSubscription}
     */
    public GiftPremiumSubscription giftPremiumSubscription(long userId, Integer monthCount, Integer starCount){
        return new GiftPremiumSubscription(userId, monthCount, starCount, api);
    }

    /**
     * Use this method to get a list of profile pictures for a user.
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.get.GetUserProfilePhotos}
     */
    public GetUserProfilePhotos getUserProfilePhotos(long userId) {
        return new GetUserProfilePhotos(userId, this.api);
    }

    /**
     * Refunds a successful payment in Telegram Stars.
     * @param userId Identifier of the user whose payment will be refunded
     * @param telegramPaymentChangeId Telegram payment identifier
     * @return {@link io.github.natanimn.telebof.requests.service.RefundStarPayment}
     */
    public RefundStarPayment refundStarPayment(long userId, String telegramPaymentChangeId) {
        return new RefundStarPayment(userId, telegramPaymentChangeId, api);
    }

    /**
     * Verifies a user on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
     * @param userId Unique identifier of the target user
     * @return {@link VerifyUser}
     */
    public VerifyUser verifyUser(long userId){
        return new VerifyUser(userId, api);
    }

    /**
     * Verifies a c chat on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link VerifyUser}
     */
    public VerifyChat verifyUChat(Object chatId){
        return new VerifyChat(chatId, api);
    }

    /**
     * Removes verification from a user who is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
     * @param userId Unique identifier of the target user
     * @return {@link RemoveUserVerification}
     */
    public RemoveUserVerification removeUserVerification(long userId){
        return new RemoveUserVerification(userId, api);
    }

    /**
     * Removes verification from a chat that is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link RemoveUserVerification}
     */
    public RemoveChatVerification removeChatVerification(Object chatId){
        return new RemoveChatVerification(chatId, api);
    }

    /**
     * Marks incoming message as read on behalf of a business account. Requires the can_read_messages business bot right.
     * @param chatId Unique identifier of the chat in which the message was received. The chat must have been active in the last 24 hours.
     * @param businessConnectionId Unique identifier of the business connection on behalf of which to read the message
     * @param messageId Unique identifier of the message to mark as read
     * @return {@link ReadBusinessMessage}
     */
    public ReadBusinessMessage readBusinessMessage(long chatId, String businessConnectionId, int messageId){
        return new ReadBusinessMessage(chatId, businessConnectionId, messageId, api);
    }

    /**
     * Use this method to approve a suggested post in a direct messages chat.
     * The bot must have the 'can_post_messages' administrator right in the corresponding channel chat.
     * @param chatId Unique identifier for the target direct messages chat
     * @param messageId Identifier of a suggested post message to approve
     * @return {@link ApproveSuggestedPost}
     */
    public ApproveSuggestedPost approveSuggestedPost(long chatId, int messageId){
        return new ApproveSuggestedPost(chatId, messageId, api);
    }


    /**
     * Use this method to decline a suggested post in a direct messages chat.
     * The bot must have the 'can_manage_direct_messages' administrator right in the corresponding channel chat.
     * @param chatId Unique identifier for the target direct messages chat
     * @param messageId Identifier of a suggested post message to approve
     * @return {@link ApproveSuggestedPost}
     */
    public DeclineSuggestedPost declineSuggestedPost(long chatId, int messageId){
        return new DeclineSuggestedPost(chatId, messageId, api);
    }

    /**
     * Delete messages on behalf of a business account.
     * Requires the can_delete_sent_messages business bot right to delete messages sent by the bot itself, or the can_delete_all_messages business bot right to delete any message.
     * @param businessConnectionId Unique identifier of the business connection on behalf of which to delete the messages
     * @param messageIds A JSON-serialized list of 1-100 identifiers of messages to delete. All messages must be from the same chat<br>
     *                     See {@link #deleteMessage} for limitations on which messages can be deleted
     *
     * @return {@link DeleteBusinessMessages}
     */
    public DeleteBusinessMessages deleteBusinessMessages(String businessConnectionId, Integer[] messageIds){
        return new DeleteBusinessMessages(businessConnectionId, messageIds, api);
    }

    /**
     * Changes the first and last name of a managed business account. Requires the can_change_name business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param firstName The new value of the first name for the business account; 1-64 characters
     * @return {@link SetBusinessAccountName}
     */
    public SetBusinessAccountName setBusinessAccountName(String businessConnectionId, String firstName){
        return new SetBusinessAccountName(businessConnectionId, firstName, api);
    }

    /**
     * Changes the username of a managed business account. Requires the can_change_username business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link SetBusinessAccountUsername}
     */
    public SetBusinessAccountUsername setBusinessAccountUsername(String businessConnectionId){
        return new SetBusinessAccountUsername(businessConnectionId, api);
    }

    /**
     * Changes the bio of a managed business account. Requires the can_change_bio business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link SetBusinessAccountBio}
     */
    public SetBusinessAccountBio setBusinessAccountBio(String businessConnectionId){
        return new SetBusinessAccountBio(businessConnectionId, api);
    }

    /**
     * Changes the profile photo of a managed business account. Requires the can_edit_profile_photo business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param photo The new profile photo to set
     * @return {@link SetBusinessAccountProfilePhoto}
     */
    public SetBusinessAccountProfilePhoto setBusinessAccountProfilePhoto(String businessConnectionId, InputProfilePhoto photo){
        return new SetBusinessAccountProfilePhoto(businessConnectionId, photo, api);
    }

    /**
     * Removes the current profile photo of a managed business account. Requires the can_edit_profile_photo business bot right
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link RemoveBusinessAccountProfilePhoto}
     */
    public RemoveBusinessAccountProfilePhoto removeBusinessAccountProfilePhoto(String businessConnectionId){
        return new RemoveBusinessAccountProfilePhoto(businessConnectionId, api);
    }

    /**
     * Changes the privacy settings pertaining to incoming gifts in a managed business account.
     * Requires the can_change_gift_settings business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param showGiftButton Pass True, if a button for sending a gift to the user or by the business account must always be shown in the input field
     * @param acceptedGiftTypes Types of gifts accepted by the business account
     * @return {@link SetBusinessAccountGiftSettings}
     */
    public SetBusinessAccountGiftSettings setBusinessAccountGiftSettings(String businessConnectionId, boolean showGiftButton,
                                                                         AcceptedGiftTypes acceptedGiftTypes){
        return new SetBusinessAccountGiftSettings(businessConnectionId, showGiftButton, acceptedGiftTypes, api);
    }

    /**
     * Returns the amount of Telegram Stars owned by a managed business account. Requires the can_view_gifts_and_stars business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link GetBusinessAccountStarBalance}
     */
    public GetBusinessAccountStarBalance getBusinessAccountStarBalance(String businessConnectionId){
        return new GetBusinessAccountStarBalance(businessConnectionId, api);
    }

    /**
     * Transfers Telegram Stars from the business account balance to the bot's balance. Requires the can_transfer_stars business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param starCount Number of Telegram Stars to transfer; 1-10000
     * @return {@link TransferBusinessAccountStars}
     */
    public TransferBusinessAccountStars transferBusinessAccountStars(String businessConnectionId, short starCount){
        return new TransferBusinessAccountStars(businessConnectionId, starCount, api);
    }

    /**
     * Returns the gifts received and owned by a managed business account. Requires the can_view_gifts_and_stars business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link GetBusinessAccountGifts}
     */
    public GetBusinessAccountGifts getBusinessAccountGifts(String businessConnectionId){
        return new GetBusinessAccountGifts(businessConnectionId, api);
    }

    /**
     * Returns the gifts owned and hosted by a user.
     * @param userId Unique identifier of the user
     * @return {@link GetUserGifts}
     */
    public GetUserGifts getUserGifts(long userId){
        return new GetUserGifts(userId, api);
    }

    /**
     * Returns the gifts owned by a chat.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link GetChatGifts}
     */
    public GetChatGifts getChatGifts(Object chatId){
        return new GetChatGifts(chatId, api);
    }

    /**
     * Converts a given regular gift to Telegram Stars. Requires the can_convert_gifts_to_stars business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param ownedGiftId Unique identifier of the regular gift that should be converted to Telegram Stars
     * @return {@link ConvertGiftToStars}
     */
    public ConvertGiftToStars convertGiftToStars(String businessConnectionId, String ownedGiftId){
        return new ConvertGiftToStars(businessConnectionId, ownedGiftId, api);
    }

    /**
     * Upgrades a given regular gift to a unique gift. Requires the can_transfer_and_upgrade_gifts business bot right.
     * Additionally, requires the can_transfer_stars business bot right if the upgrade is paid.
     * @param businessConnectionId Unique identifier of the business connection
     * @param ownedGiftId Unique identifier of the regular gift that should be upgraded to a unique one
     * @return {@link UpgradeGift}
     */
    public UpgradeGift upgradeGift(String businessConnectionId, String ownedGiftId){
        return new UpgradeGift(businessConnectionId, ownedGiftId, api);
    }

    /**
     * Transfers an owned unique gift to another user. Requires the can_transfer_and_upgrade_gifts business bot right.
     * Requires can_transfer_stars business bot right if the transfer is paid.
     * @param businessConnectionId Unique identifier of the business connection
     * @param ownedGiftId Unique identifier of the regular gift that should be transferred
     * @param newOwnerChatId Unique identifier of the chat which will own the gift. The chat must be active in the last 24 hours.
     * @return {@link TransferGift}
     */
    public TransferGift transferGift(String businessConnectionId, String ownedGiftId, long newOwnerChatId){
        return new TransferGift(businessConnectionId, ownedGiftId, newOwnerChatId, api);
    }

    /**
     * Posts a story on behalf of a managed business account. Requires the can_manage_stories business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param content Content of the story
     * @param activePeriod Period after which the story is moved to the archive, in seconds; must be one of 6 * 3600, 12 * 3600, 86400, or 2 * 86400
     * @return {@link PostStory}
     */
    public PostStory postStory(String businessConnectionId, InputStoryContent content, Integer activePeriod){
        return new PostStory(businessConnectionId, content, activePeriod, api);
    }

    /**
     * Reposts a story on behalf of a business account from another business account.
     * Both business accounts must be managed by the same bot, and the story on the source account must have been posted (or reposted) by the bot.
     * Requires the can_manage_stories business bot right for both business accounts.
     * @param businessConnectionId Unique identifier of the business connection
     * @param fromChatId Unique identifier of the chat which posted the story that should be reposted
     * @param fromStoryId Unique identifier of the story that should be reposted
     * @param activePeriod Period after which the story is moved to the archive, in seconds; must be one of 6 * 3600, 12 * 3600, 86400, or 2 * 86400
     * @return {@link RepostStory}
     */
    public RepostStory repostStory(String businessConnectionId, long fromChatId, int fromStoryId, int activePeriod){
        return new RepostStory(businessConnectionId, fromChatId, fromStoryId, activePeriod, api);
    }

    /**
     * Edits a story previously posted by the bot on behalf of a managed business account. Requires the can_manage_stories business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param storyId Unique identifier of the story to edit
     * @param content Content of the story
     * @return {@link EditStory}
     */
    public EditStory editStory(String businessConnectionId, Integer storyId, InputStoryContent content){
        return new EditStory(businessConnectionId, storyId, content, api);
    }

    /**
     * Deletes a story previously posted by the bot on behalf of a managed business account.
     * Requires the can_manage_stories business bot right.
     * @param businessConnectionId Unique identifier of the business connection
     * @param storyId Unique identifier of the story to delete
     * @return {@link DeleteStory}
     */
    public DeleteStory deleteStory(String businessConnectionId, Integer storyId){
        return new DeleteStory(businessConnectionId, storyId, api);
    }

    /**
     * Use this method to get basic information about a file and prepare it for downloading. 
     * For the moment, bots can download files of up to 20MB in size. The file can then be downloaded via {@link #downloadFile(String)} where field filePath is taken from the response.
     * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile again.
     * @param fileId File identifier to get information about
     * @return {@link io.github.natanimn.telebof.requests.get.GetFile}
     */
    public GetFile getFile(String fileId) {
        return new GetFile(fileId, this.api);
    }

    /**
     * Use this method to ban a user in a group, a supergroup or a channel.
     * In the case of supergroups and channels, the user will not be able to return to the chat on their own using invite links, etc., unless unbanned first.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.service.BanChatMember}
     */
    public BanChatMember banChatMember(Object chatId, long userId) {
        return new BanChatMember(chatId, userId, this.api);
    }

    /**
     * Use this method to unban a previously banned user in a supergroup or channel.
     * The user will not return to the group or channel automatically, but will be able to join via link, etc.
     * The bot must be an administrator for this to work. By default, this method guarantees that after the call the user is not a member of the chat, but will be able to join it.
     * So if the user is a member of the chat they will also be removed from the chat. If you don't want this, use the parameter only_if_banned.
     * @param chatId Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.service.UnbanChatMember}
     */
    public UnbanChatMember unbanChatMember(Object chatId, long userId) {
        return new UnbanChatMember(chatId, userId, this.api);
    }

    /**
     * Use this method to unban a previously banned channel chat in a supergroup or channel.
     * The bot must be an administrator for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param senderChatId Unique identifier of the target sender chat
     * @return {@link io.github.natanimn.telebof.requests.service.UnbanChatSenderChat}
     */
    public UnbanChatSenderChat unbanChatSenderChat(Object chatId, long senderChatId){
        return new UnbanChatSenderChat(chatId, senderChatId, api);
    }

    /**
     * Use this method to restrict a user in a supergroup.
     * The bot must be an administrator in the supergroup for this to work and must have the appropriate administrator rights.
     * Pass True for all permissions to lift restrictions from a user.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param userId Unique identifier of the target user
     * @param permissions A JSON-serialized object for new user permissions
     * @return {@link io.github.natanimn.telebof.requests.service.RestrictChatMember}
     */
    public RestrictChatMember restrictChatMember(Object chatId, long userId, ChatPermissions permissions) {
        return new RestrictChatMember(chatId, userId, permissions, this.api);
    }

    /**
     * Use this method to promote or demote a user in a supergroup or a channel.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Pass False for all boolean parameters to demote a user
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.service.PromoteChatMember}
     */
    public PromoteChatMember promoteChatMember(Object chatId, long userId) {
        return new PromoteChatMember(chatId, userId, this.api);
    }

    /**
     * Use this method to set a custom title for an administrator in a supergroup promoted by the bot. Returns True on success.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param userId Unique identifier of the target user
     * @param customTitle New custom title for the administrator; 0-16 characters, emoji are not allowed
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatAdministratorCustomTitle}
     */
    public SetChatAdministratorCustomTitle setChatAdministratorCustomTitle(Object chatId, long userId, String customTitle) {
        return new SetChatAdministratorCustomTitle(chatId, userId, customTitle, this.api);
    }

    /**
     * This method Changes the emoji status for a given user that previously allowed the bot to manage their emoji status
     * via the Mini App method <a href="https://core.telegram.org/bots/webapps#initializing-mini-apps">requestEmojiStatusAccess</a>.
     * Return True on success
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.set.SetUserEmojiStatus}
     */
    public SetUserEmojiStatus setUserEmojiStatus(long userId){
        return new SetUserEmojiStatus(userId, api);
    }

    /**
     * Use this method to ban a channel chat in a supergroup or a channel.
     * Until the chat is unbanned, the owner of the banned chat won't be able to send messages on behalf of any of their channels.
     * The bot must be an administrator in the supergroup or channel for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param senderChatId Unique identifier of the target sender chat
     * @return {@link io.github.natanimn.telebof.requests.service.BanChatSenderChat}
     */
    public BanChatSenderChat banChatSenderChat(Object chatId, long senderChatId) {
        return new BanChatSenderChat(chatId, senderChatId, this.api);
    }

    /**
     * Use this method to set default chat permissions for all members.
     * The bot must be an administrator in the group or a supergroup for this to work and must have the can_restrict_members administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param permissions A JSON-serialized object for new default chat permissions
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatPermissions}
     */
    public SetChatPermissions setChatPermissions(Object chatId, ChatPermissions permissions) {
        return new SetChatPermissions(chatId, permissions, this.api);
    }

    /**
     * Use this method to generate a new primary invite link for a chat; any previously generated primary link is revoked.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @apiNote Each administrator in a chat generates their own invite links.
     * Bots can't use invite links generated by other administrators. If you want your bot to work with invite links,
     * it will need to generate its own link using {@link #exportChatInviteLink} or by calling the {@link #getChat} method.
     * If your bot needs to generate a new primary invite link replacing its previous one, use  {@link #exportChatInviteLink} again.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.service.ExportChatInviteLink}
     */
    public ExportChatInviteLink exportChatInviteLink(Object chatId) {
        return new ExportChatInviteLink(chatId, this.api);
    }

    /**
     * Use this method to create an additional invite link for a chat.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * The link can be revoked using the method {@link #revokeChatInviteLink}.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.create.CreateChatInviteLink}
     */
    public CreateChatInviteLink createChatInviteLink(Object chatId) {
        return new CreateChatInviteLink(chatId, this.api);
    }

    /**
     * Use this method to create a subscription invite link for a channel chat.
     * The bot must have the can_invite_users administrator rights.
     * The link can be edited using the method {@link #editChatSubscriptionInviteLink}  or revoked using the method {@link #revokeChatInviteLink}.
     * @param chatId Unique identifier for the target channel chat or username of the target channel (in the format @channelusername)
     * @param subscriptionPeriod The number of seconds the subscription will be active for before the next payment. Currently, it must always be 2592000 (30 days).
     * @param subscriptionPrice The amount of Telegram Stars a user must pay initially and after each subsequent subscription period to be a member of the chat; 1-10000
     * @return {@link io.github.natanimn.telebof.requests.create.CreateChatSubscriptionInviteLink}
     */
    public CreateChatSubscriptionInviteLink createChatSubscriptionInviteLink(Object chatId, int subscriptionPeriod,
                                                                             int subscriptionPrice) {
        return new CreateChatSubscriptionInviteLink(chatId, subscriptionPeriod, subscriptionPrice, this.api);
    }

    /**
     * Use this method to edit a non-primary invite link created by the bot.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param inviteLink The invite link to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditChatInviteLink}
     */
    public EditChatInviteLink editChatInviteLink(Object chatId, String inviteLink) {
        return new EditChatInviteLink(chatId, inviteLink, this.api);
    }

    /**
     * Use this method to edit a subscription invite link created by the bot. The bot must have the can_invite_users administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param inviteLink The invite link to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditChatSubscriptionInviteLink}
     */
    public EditChatSubscriptionInviteLink editChatSubscriptionInviteLink(Object chatId, String inviteLink) {
        return new EditChatSubscriptionInviteLink(chatId, inviteLink, this.api);
    }

    /**
     * Use this method to revoke an invite link created by the bot. If the primary link is revoked, a new link is automatically generated.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier of the target chat or username of the target channel (in the format @channelusername)
     * @param inviteLink The invite link to revoke
     * @return {@link io.github.natanimn.telebof.requests.service.RevokeChatInviteLink}
     */
    public RevokeChatInviteLink revokeChatInviteLink(Object chatId, String inviteLink) {
        return new RevokeChatInviteLink(chatId, inviteLink, this.api);
    }

    /**
     * Use this method to approve a chat join request.
     * The bot must be an administrator in the chat for this to work and must have the can_invite_users administrator right.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.service.ApproveChatJoinRequest}
     */
    public ApproveChatJoinRequest approveChatJoinRequest(Object chatId, long userId) {
        return new ApproveChatJoinRequest(chatId, userId, this.api);
    }

    /**
     * Use this method to decline a chat join request.
     * The bot must be an administrator in the chat for this to work and must have the can_invite_users administrator right.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.service.DeclineChatJoinRequest}
     */
    public DeclineChatJoinRequest declineChatJoinRequest(Object chatId, long userId) {
        return new DeclineChatJoinRequest(chatId, userId, this.api);
    }

    /**
     * Use this method to set a new profile photo for the chat. Photos can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo New chat photo, uploaded using {@link File}
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatPhoto}
     */
    public SetChatPhoto setChatPhoto(Object chatId, File photo) {
        return new SetChatPhoto(chatId, photo, this.api);
    }

    /**
     * Use this method to delete a chat photo. Photos can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteChatPhoto}
     */
    public DeleteChatPhoto deleteChatPhoto(Object chatId) {
        return new DeleteChatPhoto(chatId, this.api);
    }

    /**
     * Use this method to change the title of a chat. Titles can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param title New chat title, 1-128 characters
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatTitle}
     */
    public SetChatTitle setChatTitle(Object chatId, String title) {
        return new SetChatTitle(chatId, title, this.api);
    }


    /**
     * Use this method to change the description of a group, a supergroup or a channel.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param description New chat description, 0-255 characters
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatDescription}
     */
    public SetChatDescription setChatDescription(Object chatId, String description) {
        return new SetChatDescription(chatId, description, this.api);
    }

    /**
     * Use this method to add a message to the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the
     * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right in a channel
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of a message to pin
     * @return {@link io.github.natanimn.telebof.requests.pin_and_unpin.PinChatMessage}
     */
    public PinChatMessage pinChatMessage(Object chatId, int messageId) {
        return new PinChatMessage(chatId, messageId, this.api);
    }

    /**
     * Use this method to remove a message from the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the
     * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right in a channel.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.pin_and_unpin.UnpinChatMessage}
     */
    public UnpinChatMessage unpinChatMessage(Object chatId) {
        return new UnpinChatMessage(chatId, this.api);
    }

    /**
     * Use this method to clear the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the 'can_pin_messages'
     * administrator right in a supergroup or 'can_edit_messages' administrator right in a channel
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.pin_and_unpin.UnpinAllChatMessages}
     */
    public UnpinAllChatMessages unpinAllChatMessages(Object chatId) {
        return new UnpinAllChatMessages(chatId, this.api);
    }

    /**
     * A method to get the current Telegram Stars balance of the bot. Requires no parameters.
     * @return {@link GetMyStarBalance}
     */
    public GetMyStarBalance getMyStarBalance(){
        return new GetMyStarBalance(api);
    }

    /**
     * Returns the bot's Telegram Star transactions in chronological order.
     * @return {@link io.github.natanimn.telebof.requests.get.GetStarTransactions}
     */
    public GetStarTransactions getStarTransactions(){
        return new GetStarTransactions(api);
    }

    /**
     * Use this method for your bot to leave a group, supergroup or channel.
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.service.LeaveChat}
     */
    public LeaveChat leaveChat(Object chatId) {
        return new LeaveChat(chatId, this.api);
    }

    /**
     * Use this method to get up-to-date information about the chat.
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.get.GetChat}
     */
    public GetChat getChat(Object chatId) {
        return new GetChat(chatId, this.api);
    }

    /**
     * Use this method to get the list of boosts added to a chat by a user. Requires administrator rights in the chat.
     * @param chatId Unique identifier for the chat or username of the channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.get.GetUserChatBoosts}
     */
    public GetUserChatBoosts getUserChatBoosts(Object chatId, long userId){
        return new GetUserChatBoosts(chatId, userId, api);
    }

    /**
     * Use this method to get a list of administrators in a chat, which aren't bots.
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.get.GetChatAdministrators}
     */
    public GetChatAdministrators getChatAdministrators(Object chatId) {
        return new GetChatAdministrators(chatId, this.api);
    }

    /**
     * Use this method to get the number of members in a chat.
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.telebof.requests.get.GetChatMemberCount}
     */
    public GetChatMemberCount getChatMemberCount(Object chatId) {
        return new GetChatMemberCount(chatId, this.api);
    }

    /**
     * Use this method to get information about a member of a chat.
     * The method is only guaranteed to work for other users if the bot is an administrator in the chat
     * @param chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @param userId Unique identifier of the target user
     * @return {@link io.github.natanimn.telebof.requests.get.GetChatMember}
     */
    public GetChatMember getChatMember(Object chatId, long userId) {
        return new GetChatMember(chatId, userId, this.api);
    }

    /**
     * Use this method to change the chosen reactions on a message. Service messages of some types can't be reacted to.
     * Automatically forwarded messages from a channel to its discussion group have the same available reactions as messages in the channel.
     * Bots can't use paid reactions.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of the target message. If the message belongs to a media group, the reaction is set to the first non-deleted message in the group instead.
     * @return {@link io.github.natanimn.telebof.requests.set.SetMessageReaction}
     */
    public SetMessageReaction setMessageReaction(Object chatId, int messageId){
        return new SetMessageReaction(chatId, messageId, api);
    }

    /**
     * Use this method to set a new group sticker set for a supergroup.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Use the field can_set_sticker_set optionally returned in {@link #getChat} requests to check if the bot can use this method.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param stickerSetName Name of the sticker set to be set as the group sticker set
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatStickerSet}
     */
    public SetChatStickerSet setChatStickerSet(Object chatId, String stickerSetName) {
        return new SetChatStickerSet(chatId, stickerSetName, this.api);
    }

    /**
     * Use this method to delete a group sticker set from a supergroup.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Use the field can_set_sticker_set optionally returned in {@link #getChat} requests to check if the bot can use this method.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteChatStickerSet}
     */
    public DeleteChatStickerSet deleteChatStickerSet(Object chatId) {
        return new DeleteChatStickerSet(chatId, this.api);
    }

    /**
     * Use this method to get custom emoji stickers, which can be used as a forum topic icon by any user. Requires no parameters.
     * @return {@link io.github.natanimn.telebof.requests.get.GetForumTopicIconStickers}
     */
    public GetForumTopicIconStickers getForumTopicIconStickers() {
        return new GetForumTopicIconStickers(this.api);
    }

    /**
     * Use this method to create a topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param name Topic name, 1-128 characters
     * @return {@link io.github.natanimn.telebof.requests.create.CreateForumTopic}
     */
    public CreateForumTopic createForumTopic(Object chatId, String name) {
        return new CreateForumTopic(chatId, name, this.api);
    }

    /**
     * Use this method to edit name and icon of a topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param messageThreadId Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.telebof.requests.edit.EditForumTopic}
     */
    public EditForumTopic editForumTopic(Object chatId, int messageThreadId) {
        return new EditForumTopic(chatId, messageThreadId, this.api);
    }

    /**
     * Use this method to close an open topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param messageThreadId Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.telebof.requests.service.CloseForumTopic}
     */
    public CloseForumTopic closeForumTopic(Object chatId, int messageThreadId){
        return new CloseForumTopic(chatId, messageThreadId, api);
    }

    /**
     * Use this method to reopen a closed topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param messageThreadId Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.telebof.requests.service.ReopenForumTopic}
     */
    public ReopenForumTopic reopenForumTopic(Object chatId, int messageThreadId) {
        return new ReopenForumTopic(chatId, messageThreadId, this.api);
    }

    /**
     * Use this method to delete a forum topic along with all its messages in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_delete_messages administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param messageThreadId Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteForumTopic}
     */
    public DeleteForumTopic deleteForumTopic(Object chatId, int messageThreadId) {
        return new DeleteForumTopic(chatId, messageThreadId, this.api);
    }

    /**
     * Use this method to clear the list of pinned messages in a forum topic.
     * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param messageThreadId Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.telebof.requests.pin_and_unpin.UnpinAllForumTopicMessages}
     */
    public UnpinAllForumTopicMessages unpinAllForumTopicMessages(Object chatId, int messageThreadId) {
        return new UnpinAllForumTopicMessages(chatId, messageThreadId, this.api);
    }

    /**
     * Use this method to edit the name of the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param name New topic name, 1-128 characters
     * @return {@link io.github.natanimn.telebof.requests.edit.EditGeneralForumTopic}
     */
    public EditGeneralForumTopic editGeneralForumTopic(Object chatId, String name) {
        return new EditGeneralForumTopic(chatId, name, this.api);
    }

    /**
     * Use this method to close an open 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.service.CloseForumTopic}
     */
    public CloseGeneralForumTopic closeGeneralForumTopic(Object chatId) {
        return new CloseGeneralForumTopic(chatId, this.api);
    }

    /**
     * Use this method to reopen a closed 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * The topic will be automatically unhidden if it was hidden.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.service.ReopenGeneralForumTopic}
     */
    public ReopenGeneralForumTopic reopenGeneralForumTopic(Object chatId) {
        return new ReopenGeneralForumTopic(chatId, this.api);
    }

    /**
     * Use this method to hide the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * The topic will be automatically closed if it was open.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.service.HideGeneralForumTopic}
     */
    public HideGeneralForumTopic hideGeneralForumTopic(Object chatId) {
        return new HideGeneralForumTopic(chatId, this.api);
    }

    /**
     * Use this method to unhide the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.service.UnHideGeneralForumTopic}
     */
    public UnHideGeneralForumTopic unHideGeneralForumTopic(Object chatId) {
        return new UnHideGeneralForumTopic(chatId, this.api);
    }

    /**
     * Use this method to clear the list of pinned messages in a General forum topic.
     * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
     * @param chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.telebof.requests.pin_and_unpin.UnpinAllGeneralForumTopicMessages}
     */
    public UnpinAllGeneralForumTopicMessages unpinAllGeneralForumTopicMessages(Object chatId){
        return new UnpinAllGeneralForumTopicMessages(chatId, this.api);
    }


    /**
     * Use this method to send answers to callback queries sent from inline keyboards.
     * The answer will be displayed to the user as a notification at the top of the chat screen or as an alert.
     * @param callbackQueryId Unique identifier for the query to be answered
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerCallbackQuery}
     */
    public AnswerCallbackQuery answerCallbackQuery(String callbackQueryId) {
        return new AnswerCallbackQuery(callbackQueryId, this.api);
    }

    /**
     * {@link #answerCallbackQuery} with text parameter
     * @param callbackQueryId Unique identifier for the query to be answered
     * @param text text Text of the notification.
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerCallbackQuery}
     */
    public AnswerCallbackQuery answerCallbackQuery(String callbackQueryId, String text) {
        return new AnswerCallbackQuery(callbackQueryId, this.api).text(text);
    }

    /**
     * Use this method to change the list of the bot's commands.
     * @see <a href="https://core.telegram.org/bots/features#commands">this manual</a> for more details about bot commands.
     * @param commands A JSON-serialized list of bot commands to be set as the list of the bot's commands. At most 100 commands can be specified.
     * @return {@link io.github.natanimn.telebof.requests.set.SetMyCommands}
     */
    public SetMyCommands setMyCommands(BotCommand[] commands) {
        return new SetMyCommands(commands, this.api);
    }

    /**
     * Use this method to delete the list of the bot's commands for the given scope and user language.
     * After deletion, <a href="https://core.telegram.org/bots/api#determining-list-of-commands">higher level commands</a> will be shown to affected users.
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteMyCommands}
     */
    public DeleteMyCommands deleteMyCommands() {
        return new DeleteMyCommands(this.api);
    }

    /**
     * Use this method to get the current list of the bot's commands for the given scope and user language.
     * @return {@link io.github.natanimn.telebof.requests.get.GetMyCommands}
     */
    public GetMyCommands getMyCommands() {
        return new GetMyCommands(this.api);

    }

    /**
     * Use this method to change the bot's menu button in a private chat, or the default menu button.
     * @return {@link io.github.natanimn.telebof.requests.set.SetChatMenuButton}
     */
    public SetChatMenuButton setChatMenuButton() {
        return new SetChatMenuButton(this.api);
    }

    /**
     * Use this method to get the current value of the bot's menu button in a private chat, or the default menu button.
     * @return {@link io.github.natanimn.telebof.requests.get.GetChatMenuButton}
     */
    public GetChatMenuButton getChatMenuButton() {
        return new GetChatMenuButton(this.api);
    }

    /**
     * Use this method to change the default administrator rights requested by the bot when it's added as an administrator to groups or channels.
     * These rights will be suggested to users, but they are free to modify the list before adding the bot.
     * @return {@link io.github.natanimn.telebof.requests.set.SetMyDefaultAdministratorRights}
     */
    public SetMyDefaultAdministratorRights setMyDefaultAdministratorRights() {
        return new SetMyDefaultAdministratorRights(this.api);
    }

    /**
     * Use this method to get the current default administrator rights of the bot. Returns ChatAdministratorRights on success.
     * @return {@link io.github.natanimn.telebof.requests.get.GetMyDefaultAdministratorRights}
     */
    public GetMyDefaultAdministratorRights getMyDefaultAdministratorRights() {
        return new GetMyDefaultAdministratorRights(this.api);
    }

    /**
     * Use this method to edit text and game messages.
     * On success,  the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param text New text of the message, 1-4096 characters after entities parsing
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of the message to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageText}
     */
    public EditMessageText editMessageText(Object chatId, String text, int messageId) {
        return new EditMessageText(chatId, text,  messageId, this.api);
    }

    /**
     * Use this method to edit text and game messages.
     * On success, True is returned. Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param text ew text of the message, 1-4096 characters after entities parsing
     * @param inlineMessageId Identifier of the inline message
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageText}
     */
    public EditMessageText editMessageText(String text, String inlineMessageId) {
        return new EditMessageText(text, inlineMessageId, this.api);
    }

    /**
     * Use this method to edit captions of messages. On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of the message to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageCaption}
     */
    public EditMessageCaption editMessageCaption(Object chatId, int messageId) {
        return new EditMessageCaption(chatId, messageId, this.api);
    }

    /**
     * Use this method to edit captions of messages.
     * On success, True is returned. Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param inlineMessageId Identifier of the inline message
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageCaption}
     */
    public EditMessageCaption editMessageCaption(String inlineMessageId) {
        return new EditMessageCaption(inlineMessageId, this.api);
    }

    /**
     * Use this method to edit animation, audio, document, photo, or video messages, or to add media to text messages.
     * If a message is part of a message album, then it can be edited only to an audio for audio albums, only to a document for document albums and to a photo or a video otherwise.
     * When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its fileId or specify a URL.
     * On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chatId Required if inlineMessageId is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param media A JSON-serialized object for a new media content of the message
     * @param messageId Required if inlineMessageId is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageMedia}
     */
    public EditMessageMedia editMessageMedia(Object chatId, InputMedia media, int messageId) {
        return new EditMessageMedia(media, chatId, messageId, this.api);
    }

    /**
     * Use this method to edit animation, audio, document, photo, or video messages, or to add media to text messages.
     * If a message is part of a message album, then it can be edited only to an audio for audio albums, only to a document for document albums and to a photo or a video otherwise.
     * When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its fileId or specify a URL.
     * On success, True is returned.
     * @param inlineMessageId Required if chatId and messageId are not specified. Identifier of the inline message
     * @param media A JSON-serialized object for a new media content of the message
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageMedia}
     */
    public EditMessageMedia editMessageMedia(String inlineMessageId, InputMedia media) {
        return new EditMessageMedia(media, inlineMessageId, this.api);
    }

    /**
     * Use this method to edit only the reply markup of messages.
     * On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chatId Required if inlineMessageId is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Required if inlineMessageId is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup editMessageReplyMarkup(Object chatId, int messageId) {
        return new EditMessageReplyMarkup(chatId, messageId, this.api);
    }

    /**
     * Use this method to edit only the reply markup of messages.
     * On success, True is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param inlineMessageId Required if chatId and messageId are not specified. Identifier of the inline message
     * @return {@link io.github.natanimn.telebof.requests.edit.EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup editMessageReplyMarkup(String inlineMessageId) {
        return new EditMessageReplyMarkup(inlineMessageId, this.api);
    }

    /**
     * Use this method to stop a poll which was sent by the bot.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of the original message with the poll
     * @return {@link io.github.natanimn.telebof.requests.service.StopPoll}
     */
    public StopPoll stopPoll(Object chatId, int messageId) {
        return new StopPoll(chatId, messageId, this.api);
    }

    /**
     * Use this method to delete a message, including service messages, with the following limitations:
     * <pre>
     * - A message can only be deleted if it was sent less than 48 hours ago.
     * - Service messages about a supergroup, channel, or forum topic creation can't be deleted.
     * - A dice message in a private chat can only be deleted if it was sent more than 24 hours ago.
     * - Bots can delete outgoing messages in private chats, groups, and supergroups.
     * - Bots can delete incoming messages in private chats.
     * - Bots granted can_post_messages permissions can delete outgoing messages in channels.
     * - If the bot is an administrator of a group, it can delete any message there.
     * - If the bot has can_delete_messages permission in a supergroup or a channel, it can delete any message there.
     * </pre>
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageId Identifier of the message to delete
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteMessage}
     */
    public DeleteMessage deleteMessage(Object chatId, int messageId) {
        return new DeleteMessage(chatId, messageId, this.api);
    }

    /**
     * Use this method to delete multiple messages simultaneously. If some of the specified messages can't be found, they are skipped.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param messageIds A JSON-serialized list of 1-100 identifiers of messages to delete.
     * @return {@link DeleteMessages}
     */
    public DeleteMessages deleteMessages(Object chatId, Integer[] messageIds) {
        return new DeleteMessages(chatId, messageIds, this.api);
    }

    /**
     * Use this method to send static .WEBP, <a href="https://telegram.org/blog/animated-stickers">animated</a> .TGS, or <a href="https://telegram.org/blog/video-stickers-better-reactions">video</a> .WEBM stickers.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sticker Sticker to send. Pass .WEBM file
     * @return {@link io.github.natanimn.telebof.requests.send.SendSticker}
     */
    public SendSticker sendSticker(Object chatId, File sticker) {
        return new SendSticker(chatId, sticker, this.api);
    }

    /**
     * Use this method to send static .WEBP, <a href="https://telegram.org/blog/animated-stickers">animated</a> .TGS, or <a href="https://telegram.org/blog/video-stickers-better-reactions">video</a> .WEBM stickers.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sticker Sticker to send. Pass a fileId as String to send a file that exists on the Telegram servers (recommended),
     *                pass an HTTP URL as a String for Telegram to get a .WEBP sticker from the Internet, or upload a new .WEBP, .TGS,
     *                Video and animated stickers can't be sent via an HTTP URL.
     * @return {@link io.github.natanimn.telebof.requests.send.SendSticker}
     */
    public SendSticker sendSticker(Object chatId, String sticker) {
        return new SendSticker(chatId, sticker, this.api);
    }

    /**
     * Use this method to get a sticker set.
     * @param name Name of the sticker set
     * @return {@link io.github.natanimn.telebof.requests.get.GetStickerSet}
     */
    public GetStickerSet getStickerSet(String name) {
        return new GetStickerSet(name, this.api);
    }

    /**
     * Use this method to get information about custom emoji stickers by their identifiers.
     * @param customEmojiIds A JSON-serialized list of custom emoji identifiers. At most 200 custom emoji identifiers can be specified.
     * @return {@link io.github.natanimn.telebof.requests.get.GetCustomEmojiStickers}
     */
    public GetCustomEmojiStickers getCustomEmojiStickers(String[] customEmojiIds) {
        return new GetCustomEmojiStickers(customEmojiIds, this.api);
    }

    /**
     * Use this method to upload a file with a sticker for later use in the {@link #createNewStickerSet}, {@link #addStickerToSet}, or {@link #replaceStickerInSet} methods (the file can be used multiple times).
     * @param userId User identifier of sticker file owner
     * @param sticker A file with the sticker in .WEBP, .PNG, .TGS, or .WEBM format.
     * @param sticker_format Format of the sticker
     * @return {@link io.github.natanimn.telebof.requests.service.UploadStickerFile}
     */
    public UploadStickerFile uploadStickerFile(long userId, File sticker, StickerFormat sticker_format) {
        return new UploadStickerFile(userId, sticker, sticker_format, this.api);
    }

    /**
     * Use this method to create a new sticker set owned by a user. The bot will be able to edit the sticker set thus created.
     * @param userId User identifier of created sticker set owner
     * @param name Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals).
     *             Can contain only English letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in "_by_<bot_username>".
     *             <bot_username> is case-insensitive. 1-64 characters.
     * @param title Sticker set title, 1-64 characters
     * @param stickers A JSON-serialized list of 1-50 initial stickers to be added to the sticker set
     * @return {@link io.github.natanimn.telebof.requests.create.CreateNewStickerSet}
     */
    public CreateNewStickerSet createNewStickerSet(long userId, String name, String title, InputSticker[] stickers) {
        return new CreateNewStickerSet(userId, name, title, stickers, this.api);
    }

    /**
     * Use this method to add a new sticker to a set created by the bot.
     * Emoji sticker sets can have up to 200 stickers. Other sticker sets can have up to 120 stickers.
     * @param userId User identifier of sticker set owner
     * @param name Sticker set name
     * @param sticker A JSON-serialized object with information about the added sticker.
     *                If exactly the same sticker had already been added to the set, then the set isn't changed.
     * @return {@link io.github.natanimn.telebof.requests.service.AddStickerToSet}
     */
    public AddStickerToSet addStickerToSet(long userId, String name, InputSticker sticker) {
        return new AddStickerToSet(userId, name, sticker, this.api);
    }

    /**
     * Use this method to move a sticker in a set created by the bot to a specific position.
     * @param sticker File identifier of the sticker
     * @param position New sticker position in the set, zero-based
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerPositionInSet}
     */
    public SetStickerPositionInSet setStickerPositionInSet(String sticker, int position) {
        return new SetStickerPositionInSet(sticker, position, this.api);
    }

    /**
     * Use this method to delete a sticker from a set created by the bot.
     * @param sticker File identifier of the sticker
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteStickerFromSet}
     */
    public DeleteStickerFromSet deleteStickerFromSet(String sticker) {
        return new DeleteStickerFromSet(sticker, this.api);
    }

    /**
     * Use this method to change the list of emoji assigned to a regular or custom emoji sticker.
     * The sticker must belong to a sticker set created by the bot.
     * @param sticker File identifier of the sticker
     * @param emojiList A JSON-serialized list of 1-20 emoji associated with the sticker
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerEmojiList}
     */
    public SetStickerEmojiList setStickerEmojiList(String sticker, String[] emojiList) {
        return new SetStickerEmojiList(sticker, emojiList, this.api);
    }

    /**
     * Use this method to change search keywords assigned to a regular or custom emoji sticker.
     * The sticker must belong to a sticker set created by the bot
     * @param sticker File identifier of the sticker
     * @param keywords A JSON-serialized list of 0-20 search keywords for the sticker with total length of up to 64 characters
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerKeywords}
     */
    public SetStickerKeywords setStickerKeywords(String sticker, String[] keywords) {
        return new SetStickerKeywords(sticker, keywords, this.api);
    }

    /**
     * Use this method to change the mask position of a mask sticker.
     * The sticker must belong to a sticker set that was created by the bot.
     * @param sticker File identifier of the sticker
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerMaskPosition}
     */
    public SetStickerMaskPosition setStickerMaskPosition(String sticker) {
        return new SetStickerMaskPosition(sticker, this.api);
    }

    /**
     * Use this method to set the title of a created sticker set.
     * @param name Sticker set name
     * @param title Sticker set title, 1-64 characters
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerSetTitle}
     */
    public SetStickerSetTitle setStickerSetTitle(String name, String title) {
        return new SetStickerSetTitle(name, title, this.api);
    }

    /**
     * Use this method to replace an existing sticker in a sticker set with a new one.
     * The method is equivalent to calling {@link #deleteStickerFromSet}, then {@link #addStickerToSet}, then {@link #setStickerPositionInSet}.
     * @param userId User identifier of the sticker set owner
     * @param name Sticker set name
     * @param oldSticker File identifier of the replaced sticker
     * @param sticker A JSON-serialized object with information about the added sticker. If exactly the same sticker had already been added to the set, then the set remains unchanged.
     * @return {@link io.github.natanimn.telebof.requests.service.ReplaceStickerInSet}
     */
    public ReplaceStickerInSet replaceStickerInSet(long userId, String name, String  oldSticker, InputSticker sticker){
        return new ReplaceStickerInSet(userId, name, oldSticker, sticker, api);
    }

    /**
     * Use this method to set the thumbnail of a regular or mask sticker set.
     * The format of the thumbnail file must match the format of the stickers in the set.
     * @param name Sticker set name
     * @param userId User identifier of the sticker set owner
     * @param thumbnail A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width and height of exactly 100px, or a .TGS animation with a thumbnail up to 32 kilobytes in size.
     *                  <a href="https://core.telegram.org/stickers#animation-requirements">animation-requirements</a> for animated sticker technical requirements), or a .WEBM video with the thumbnail up to 32 kilobytes in size;
     *                  <a href="https://core.telegram.org/stickers#video-requirements">see</a> for video sticker technical requirements.
     *                  Pass a fileId as a String to send a file that already exists on the Telegram servers, or
     *                  pass an HTTP URL as a String for Telegram to get a file from the Internet
     * @param format Format of the thumbnail, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, or {@link StickerFormat#VIDEO} for a .WEBM video
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerSetThumbnail}
     */
    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long userId, File thumbnail, StickerFormat format) {
        return new SetStickerSetThumbnail(name, userId, thumbnail, format, this.api);
    }

    /**
     * Use this method to set the thumbnail of a regular or mask sticker set.
     * The format of the thumbnail file must match the format of the stickers in the set.
     * @param name Sticker set name
     * @param userId User identifier of the sticker set owner
     * @param thumbnail A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width and height of exactly 100px, or a .TGS animation with a thumbnail up to 32 kilobytes in size.
     *                  <a href="https://core.telegram.org/stickers#animation-requirements">animation-requirements</a> for animated sticker technical requirements), or a .WEBM video with the thumbnail up to 32 kilobytes in size;
     *                  <a href="https://core.telegram.org/stickers#video-requirements">see</a> for video sticker technical requirements.
     *                  Upload using {@link File}
     * @param format Format of the thumbnail, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, or {@link StickerFormat#VIDEO} for a .WEBM video
     * @return {@link io.github.natanimn.telebof.requests.set.SetStickerSetThumbnail}
     */
    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long userId, String thumbnail, StickerFormat format) {
        return new SetStickerSetThumbnail(name, userId, thumbnail, format, this.api);
    }

    /**
     * Use this method to set the thumbnail of a custom emoji sticker set.
     * @param name Sticker set name
     * @return {@link io.github.natanimn.telebof.requests.set.SetCustomEmojiStickerSetThumbnail}
     */
    public SetCustomEmojiStickerSetThumbnail setCustomEmojiStickerSetThumbnail(String name) {
        return new SetCustomEmojiStickerSetThumbnail(name, this.api);
    }

    /**
     * Use this method to delete a sticker set that was created by the bot.
     * @param name Sticker set name
     * @return {@link io.github.natanimn.telebof.requests.delete.DeleteStickerSet}
     */
    public DeleteStickerSet deleteStickerSet(String name) {
        return new DeleteStickerSet(name, this.api);
    }

    /**
     * Use this method to get information about the connection of the bot with a business account.
     * @param businessConnectionId Unique identifier of the business connection
     * @return {@link io.github.natanimn.telebof.requests.get.GetBusinessConnection}
     */
    public GetBusinessConnection getBusinessConnection(String businessConnectionId){
        return new GetBusinessConnection(businessConnectionId, api);
    }

    /**
     * Use this method to send answers to an inline query.
     * No more than 50 results per query are allowed.
     * @param inlineQueryId Unique identifier for the answered query
     * @param results A JSON-serialized array of results for the inline query
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerInlineQuery}
     */
    public AnswerInlineQuery answerInlineQuery(String inlineQueryId, InlineQueryResult[] results) {
        return new AnswerInlineQuery(inlineQueryId, results, this.api);
    }

    /**
     * Stores a message that can be sent by a user of a Mini App. Returns a {@link io.github.natanimn.telebof.types.media_and_service.PreparedInlineMessage} object.
     * @param userId Unique identifier of the target user that can use the prepared message
     * @param result {@link InlineQueryResult} object describing the message to be sent
     * @return {@link io.github.natanimn.telebof.requests.service.SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage savePreparedInlineMessage(long userId, InlineQueryResult result){
        return new SavePreparedInlineMessage(userId, result, api);
    }

    /**
     * Use this method to set the result of an interaction with a Web App and send a corresponding message on behalf of the user to the chat from which the query originated.
     * @param web_app_query_id Unique identifier for the query to be answered
     * @param result A JSON-serialized object describing the message to be sent
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerWebAppQuery}
     */
    public AnswerWebAppQuery answerWebAppQuery(String web_app_query_id, InlineQueryResult result) {
        return new AnswerWebAppQuery(web_app_query_id, result, this.api);
    }

    /**
     * Use this method to send invoices.
     * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param title Product name, 1-32 characters
     * @param description Product description, 1-255 characters
     * @param payload Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @param currency Three-letter ISO 4217 currency code, <a href="https://core.telegram.org/bots/payments#supported-currencies">see more on currencies.</a>
     *                Pass “XTR” for payments in Telegram Stars.
     * @param prices Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.).
     *              Must contain exactly one item for payments in Telegram Stars.
     * @return {@link io.github.natanimn.telebof.requests.send.SendInvoice}
     */
    public SendInvoice sendInvoice(Object chatId, String title, String description, String payload, String currency,
                                   LabeledPrice[] prices) {
        return new SendInvoice(chatId, title, description, payload, currency, prices, this.api)
                ;
    }

    /**
     * Use this method to create a link for an invoice.
     * @param title Product name, 1-32 characters
     * @param description Product description, 1-255 characters
     * @param payload Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @param currency Three-letter ISO 4217 currency code. Pass “XTR” for payments in Telegram Stars.
     * @param prices Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.).
     *               Must contain exactly one item for payments in Telegram Stars.
     * @return {@link io.github.natanimn.telebof.requests.create.CreateInvoiceLink}
     */
    public CreateInvoiceLink createInvoiceLink(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        return new CreateInvoiceLink(title, description, payload, currency, prices, this.api);
    }

    /**
     * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified, the Bot API will send an Update with a shipping_query field to the bot.
     * Use this method to reply to shipping queries. On success, True is returned.
     * @param shipping_query_id Unique identifier for the query to be answered
     * @param ok Pass True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible)
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerShippingQuery}
     */
    public AnswerShippingQuery answerShippingQuery(String shipping_query_id, boolean ok) {
        return new AnswerShippingQuery(shipping_query_id, ok, this.api);
    }

    /**
     * Once the user has confirmed their payment and shipping details, the Bot API sends the final confirmation in the form of an Update with the field pre_checkout_query.
     * Use this method to respond to such pre-checkout queries.
     * <b>Note:</b> The Bot API must receive an answer within 10 seconds after the pre-checkout query was sent.
     * @param pre_checkout_query_id Unique identifier for the query to be answered
     * @param ok Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
     * @return {@link io.github.natanimn.telebof.requests.answer.AnswerPreCheckoutQuery}
     */
    public AnswerPreCheckoutQuery answerPreCheckoutQuery(String pre_checkout_query_id, boolean ok) {
        return new AnswerPreCheckoutQuery(pre_checkout_query_id, ok, this.api);
    }

    /**
     * Informs a user that some of the Telegram Passport elements they provided contains errors.
     * The user will not be able to re-submit their Passport to you until the errors are fixed (the contents of the field for which you returned the error must change). <br>
     *<br>
     * Use this if the data submitted by the user doesn't satisfy the standards your service requires for any reason.
     * For example, if a birthday date seems invalid, a submitted document is blurry, a scan shows evidence of tampering, etc.
     * Supply some details in the error message to make sure the user knows how to correct the issues.
     * @param userId User identifier
     * @param errors A JSON-serialized array describing the errors
     * @return {@link io.github.natanimn.telebof.requests.set.SetPassportDataErrors}
     */
    public SetPassportDataErrors setPassportDataErrors(long userId, PassportElementError[] errors) {
        return new SetPassportDataErrors(userId, errors, this.api);
    }

    /**
     * Use this method to send a game
     * @param chatId Unique identifier for the target chat
     * @param game_short_name Short name of the game, serves as the unique identifier for the game. Set up your games via @BotFather.
     * @return {@link io.github.natanimn.telebof.requests.send.SendGame}
     */
    public SendGame sendGame(long chatId, String game_short_name) {
        return new SendGame(chatId, game_short_name, this.api);
    }

    /**
     * Use this method to set the score of the specified user in a game message.
     * On success, the Message is returned. Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
     * @param chatId Required if inlineMessageId is not specified. Unique identifier for the target chat
     * @param userId User identifier
     * @param score New score, must be non-negative
     * @param messageId Required if inlineMessageId is not specified. Identifier of the sent message
     * @return {@link io.github.natanimn.telebof.requests.set.SetGameScore}
     */
    public SetGameScore setGameScore(long chatId, long userId, int score, int messageId) {
        return new SetGameScore(chatId, userId, score, messageId, this.api);
    }

    /**
     * Use this method to set the score of the specified user in a game message.
     * On success, True is returned. Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
     * @param inlineMessageId Required if chatId and messageId are not specified. Identifier of the inline message
     * @param userId User identifier
     * @param score New score, must be non-negative
     * @return {@link io.github.natanimn.telebof.requests.set.SetGameScore}
     */
    public SetGameScore setGameScore(String inlineMessageId, long userId, int score) {
        return new SetGameScore(inlineMessageId, userId, score, this.api);
    }

    /**
     * Returns the list of gifts that can be sent by the bot to users and channel chats. Requires no parameters.
     * Returns a {@link Gifts} object.
     * @return {@link io.github.natanimn.telebof.requests.get.GetAvailableGifts}
     */
    public GetAvailableGifts getAvailableGifts(){
        return new GetAvailableGifts(api);
    }

    /**
     * Use this method to get the current bot name for the given user language
     * @return {@link io.github.natanimn.telebof.requests.get.GetMyName}
     */
    public GetMyName getMyName(){
        return new GetMyName(this.api);
    }

    /**
     * Use this method to change the bot's name.
     * @return {@link io.github.natanimn.telebof.requests.set.SetMyName}
     */
    public SetMyName setMyName(){
        return new SetMyName(this.api);
    }

    /**
     * Use this method to get the current bot description for the given user language.
     * @return {@link io.github.natanimn.telebof.requests.get.GetMyDescription}
     */
    public GetMyDescription getMyDescription(){
        return new GetMyDescription(api);
    }

    /**
     * Use this method to change the bot's description, which is shown in the chat with the bot if the chat is empty.
     * @return {@link io.github.natanimn.telebof.requests.set.SetMyDescription}
     */
    public SetMyDescription setMyDescription(){
        return new SetMyDescription(api);
    }

    /**
     * Use this method to get data for high score tables. Will return the score of the specified user and several of their neighbors in a game.<br>
     * <br>
     * This method will currently return scores for the target user, plus two of their closest neighbors on each side.
     * Will also return the top three users if the user and their neighbors are not among them. Please note that this behavior is subject to change.
     * @param chatId Required if inlineMessageId is not specified. Unique identifier for the target chat
     * @param userId Target user id
     * @param messageId Required if inlineMessageId is not specified. Identifier of the sent message
     * @return {@link io.github.natanimn.telebof.requests.get.GetGameHighScores}
     */
    public GetGameHighScores getGameHighScores(long chatId, long userId, int messageId) {
        return new GetGameHighScores(chatId, userId, messageId, this.api);
    }

    /**
     * Use this method to get data for high score tables. Will return the score of the specified user and several of their neighbors in a game.<br>
     * <br>
     * This method will currently return scores for the target user, plus two of their closest neighbors on each side.
     * Will also return the top three users if the user and their neighbors are not among them. Please note that this behavior is subject to change.
     * @param inlineMessageId Required if chatId and messageId are not specified. Identifier of the inline message
     * @param userId Target user id
     * @return {@link io.github.natanimn.telebof.requests.get.GetGameHighScores}
     */
    public GetGameHighScores getGameHighScores(String inlineMessageId, long userId) {
        return new GetGameHighScores(inlineMessageId, userId, this.api);
    }

    /**
     * Use this method to set new state in group/supergroup chat for a user
     * @param chatId Unique identifier for the target chat
     * @param userId Target user id
     * @param name state name
     */
    public void setState(long chatId, long userId, String name){
        storage.save(chatId, userId, name);
    }

    /**
     * Use this method to set new state in private chat for a user
     * @param userId Target user id
     * @param name state name
     */
    public void setState(long userId, String name){
        storage.save(userId, name);
    }

    /**
     * Use this method to clear an existing state when it is no longer needed in a group/supergroup chat for a user.
     * @param chatId Unique identifier for the target chat
     * @param userId Target user id
     */
    public void clearState(long chatId, long userId){
        storage.clear(chatId, userId);
    }

    /**
     * Use this method to clear an existing state when it is no longer needed in a private chat for a user.
     * @param userId Target user id
     */
    public void clearState(long userId){
        storage.clear(userId);
    }

    /**
     * Use this method to retrieve saved state data in a group/supergroup chat for a user
     * @param chatId Unique identifier for the target chat
     * @param userId Target user id
     * @return {@link Map}
     */
    public Map<String, Object> getStateData(long chatId, long userId){
        return storage.getData(chatId, userId);
    }

    /**
     * Use this method to retrieve saved state data in a private chat for a user
     * @param userId Target user id
     * @return {@link Map}
     */
    public Map<String, Object> getStateData(long userId){
        return storage.getData(userId);
    }

    /**
     * Use this method to receive incoming updates using long polling
     * @return {@link io.github.natanimn.telebof.requests.get.GetUpdates}
     */
    public GetUpdates getUpdates(){
        return new GetUpdates(api);
    }
}
