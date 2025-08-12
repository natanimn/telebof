package io.github.natanimn;

import io.github.natanimn.enums.ChatAction;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.enums.StickerFormat;
import io.github.natanimn.requests.*;
import io.github.natanimn.requests.answer.*;
import io.github.natanimn.requests.create.*;
import io.github.natanimn.requests.delete.*;
import io.github.natanimn.requests.edit.*;
import io.github.natanimn.requests.get.*;
import io.github.natanimn.requests.send.*;
import io.github.natanimn.requests.service.*;
import io.github.natanimn.requests.set.*;
import io.github.natanimn.states.StateMemoryStorage;
import io.github.natanimn.types.bot.BotCommand;
import io.github.natanimn.types.chat_and_user.ChatPermissions;
import io.github.natanimn.types.gift_and_giveaway.Gifts;
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.input.InputMedia;
import io.github.natanimn.types.input.InputPaidMedia;
import io.github.natanimn.types.input.InputPollOption;
import io.github.natanimn.types.input.InputSticker;
import io.github.natanimn.types.payments.LabeledPrice;
import io.github.natanimn.types.passport.PassportElementError;
import io.github.natanimn.types.web.WebhookInfo;

import java.io.File;
import java.util.Map;

/**
 * @author Natanim
 * @since March 3, 2025
 * @version 0.8
 */
@SuppressWarnings("unused")
public class BotContext {
    private final RequestSender requestSender;
    private StateMemoryStorage storage;

    public BotContext( RequestSender requestSender, StateMemoryStorage storage){
        this.requestSender = requestSender;
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
     * @see <a href="https://core.telegram.org/bots/api#setwebhook">Telegram Documetation</a>
     */
    public SetWebhook setWebhook(String url){
        return new SetWebhook(url, requestSender);
    }

    public WebhookInfo getWebhookInfo(){
        return new GetWebhookInfo(requestSender).exec();
    }

    /**
     * Use this method to remove webhook integration if you decide to back getUpdates.
     * @see <a href="https://core.telegram.org/bots/api#deletewebhook">Delete Webhook</a>
     */
    public void deleteWebhook(){
        new DeleteWebhook(requestSender).exec();
    }

    /**
     * A simple method for testing your bot's authentication token.
     * @return {@link io.github.natanimn.requests.get.GetMe}
     */
    public GetMe getMe() {
        return new GetMe(this.requestSender);
    }

    /**
     * Use this method to log out from the cloud Bot API server before launching the bot locally.
     * You must log out the bot before running it locally, otherwise there is no guarantee that the bot will receive updates.
     * After a successful call, you can immediately log in on a local server, but will not be able to log in back to the cloud Bot API server for 10 minutes.
     * @return {@link io.github.natanimn.requests.service.LogOut}
     */
    public LogOut logOut() {
        return new LogOut(this.requestSender);
    }

    /**
     * Use this method to close the bot instance before moving it from one local server to another. 
     * You need to delete the webhook before calling this method to ensure that the bot isn't launched again after server restart. 
     * The method will return error 429 in the first 10 minutes after the bot is launched.
     * @return {@link io.github.natanimn.requests.service.Close}
     */
    public Close close() {
        return new Close(this.requestSender);
    }

    /**
     * Use this method to send text messages.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param text Text of the message to be sent, 1-4096 characters after entities parsing
     * @return {@link io.github.natanimn.requests.send.SendMessage}
     */
    public SendMessage sendMessage(Object chat_id, String text) {
        return new SendMessage(chat_id, text, this.requestSender);
    }

    /**
     * Use this method to download files up to 20MB in size. On success, a {@link io.github.natanimn.types.media_and_service.File}  object is returned.
     * @param file_path taken from {@link io.github.natanimn.requests.get.GetFile} response.
     *                  It is guaranteed that the link will be valid for at least 1 hour.
     *                  When the link expires, a new one can be requested by calling {@link #getFile(String)} again
     * @return array of byte
     */
    public byte[] downloadFile(String file_path) {
        return requestSender.downloadFile(file_path);
    }

    /**
     * Use this method to forward messages of any kind. Service messages and messages with protected content can't be forwarded.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param from_chat_id Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     * @param message_id Message identifier in the chat specified in from_chat_id
     * @return {@link io.github.natanimn.requests.service.ForwardMessage}
     */
    public ForwardMessage forward(Object chat_id, Object from_chat_id, int message_id) {
        return new ForwardMessage(chat_id, from_chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to copy messages of any kind. Service messages, paid media messages, giveaway messages, giveaway winners messages, and invoice messages can't be copied.
     * A quiz poll can be copied only if the value of the field correct_option_id is known to the bot.
     * The method is analogous to the method forwardMessage, but the copied message doesn't have a link to the original message.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param from_chat_id Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     * @param message_id  Message identifier in the chat specified in from_chat_id
     * @return {@link io.github.natanimn.requests.service.CopyMessage}
     */
    public CopyMessage copy(Object chat_id, Object from_chat_id, int message_id) {
        return new CopyMessage(chat_id, from_chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to forward multiple messages of any kind. If some of the specified messages can't be found or forwarded, they are skipped.
     * Service messages and messages with protected content can't be forwarded. Album grouping is kept for forwarded messages.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param from_chat_id Unique identifier for the chat where the original messages were sent (or channel username in the format @channelusername)
     * @param message_id A JSON-serialized list of 1-100 identifiers of messages in the chat from_chat_id to forward. The identifiers must be specified in a strictly increasing order.
     * @return {@link io.github.natanimn.requests.service.ForwardMessages}
     */
    public ForwardMessages forwardMessages(Object chat_id, Object from_chat_id, int[] message_id) {
        return new ForwardMessages(chat_id, from_chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to send photos.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo Photo to send. Pass a file_id as String to send a photo that exists on the Telegram servers (recommended),
     *              pass an HTTP URL as a String for Telegram to get a photo from the Internet
     * @return {@link io.github.natanimn.requests.send.SendPhoto}
     */
    public SendPhoto sendPhoto(Object chat_id, String photo) {
        return new SendPhoto(chat_id, photo, this.requestSender);
    }

    /**
     * Use this method to send photos.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo Photo to send. Upload new photo using {@link File}.
     *              The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total.
     *              Width and height ratio must be at most 20
     * @return {@link io.github.natanimn.requests.send.SendPhoto}
     */
    public SendPhoto sendPhoto(Object chat_id, File photo) {
        return new SendPhoto(chat_id, photo, this.requestSender);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display them in the music player.
     * Your audio must be in the .MP3 or .M4A format. Bots can currently send audio files of up to 50 MB in size, this limit may be changed in the future
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param audio Audio file to send. Pass a file_id as String to send an audio file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL as a String for Telegram to get an audio file from the Internet.
     * @return {@link io.github.natanimn.requests.send.SendAudio}
     */
    public SendAudio sendAudio(Object chat_id, String audio) {
        return new SendAudio(chat_id, audio, this.requestSender);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display them in the music player.
     * Your audio must be in the .MP3 or .M4A format. Bots can currently send audio files of up to 50 MB in size, this limit may be changed in the future
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param audio Audio file to send. Upload using {@link File}.
     * @return {@link io.github.natanimn.requests.send.SendAudio}
     */
    public SendAudio sendAudio(Object chat_id, File audio) {
        return new SendAudio(chat_id, audio, this.requestSender);
    }

    /**
     * Use this method to send general files.
     * Bots can currently send files of any type of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param document File to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), or
     *                 pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @return {@link io.github.natanimn.requests.send.SendDocument}
     */
    public SendDocument sendDocument(Object chat_id, String document) {
        return new SendDocument(chat_id, document, this.requestSender);
    }

    /**
     * Use this method to send general files.
     * Bots can currently send files of any type of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param document File to send. Upload using {@link File}
     * @return {@link io.github.natanimn.requests.send.SendDocument}
     */
    public SendDocument sendDocument(Object chat_id, File document) {
        return new SendDocument(chat_id, document, this.requestSender);
    }

    /**
     * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may be sent as Document).
     * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video Video to send. Pass a file_id as String to send a video that exists on the Telegram servers (recommended), or
     *             pass an HTTP URL as a String for Telegram to get a video from the Internet
     * @return {@link io.github.natanimn.requests.send.SendVideo}
     */
    public SendVideo sendVideo(Object chat_id, String video) {
        return new SendVideo(chat_id, video, this.requestSender);
    }

    /**
     * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may be sent as Document).
     * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video Video to send. Upload using {@link File}
     * @return {@link io.github.natanimn.requests.send.SendVideo}
     */
    public SendVideo sendVideo(Object chat_id, File video) {
        return new SendVideo(chat_id, video, this.requestSender);
    }

    /**
     * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound).
     * Bots can currently send animation files of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param animation Animation to send. Pass a file_id as String to send an animation that exists on the Telegram servers (recommended), or
     *                 pass an HTTP URL as a String for Telegram to get an animation from the Internet.
     * @return {@link io.github.natanimn.requests.send.SendAnimation}
     */
    public SendAnimation sendAnimation(Object chat_id, String animation) {
        return new SendAnimation(chat_id, animation, this.requestSender);
    }

    /**
     * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound).
     * Bots can currently send animation files of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param animation Animation to send. Upload using {@link File}.
     * @return {@link io.github.natanimn.requests.send.SendAnimation}
     */
    public SendAnimation sendAnimation(Object chat_id, File animation) {
        return new SendAnimation(chat_id, animation, this.requestSender);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
     * For this to work, your audio must be in an .OGG file encoded with OPUS, or in .MP3 format, or in .M4A format (other formats may be sent as Audio or Document).
     * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param voice Audio file to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL as a String for Telegram to get a file from the Internet.
     * @return {@link io.github.natanimn.requests.send.SendVoice}
     */
    public SendVoice sendVoice(Object chat_id, String voice) {
        return new SendVoice(chat_id, voice, this.requestSender);
    }

    /**
     * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
     * For this to work, your audio must be in an .OGG file encoded with OPUS, or in .MP3 format, or in .M4A format (other formats may be sent as Audio or Document).
     * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param voice Audio file to send. Upload using {@link File}
     * @return {@link io.github.natanimn.requests.send.SendVoice}
     */
    public SendVoice sendVoice(Object chat_id, File voice) {
        return new SendVoice(chat_id, voice, this.requestSender);
    }

    /**
     * As of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>, Telegram clients support rounded square MPEG4 videos of up to 1 minute long. <br>
     * Use this method to send video messages.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video_note Video note to send. Pass a file_id as String to send a video note that exists on the Telegram servers (recommended)
     * @return {@link io.github.natanimn.requests.send.SendVideoNote}
     */
    public SendVideoNote sendVideoNote(Object chat_id, String video_note) {
        return new SendVideoNote(chat_id, video_note, this.requestSender);
    }

    /**
     * As of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>, Telegram clients support rounded square MPEG4 videos of up to 1 minute long. <br>
     * Use this method to send video messages.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param video_note Video note to send. Upload using {@link File}
     * @return {@link io.github.natanimn.requests.send.SendVideoNote}
     */
    public SendVideoNote sendVideoNote(Object chat_id, File video_note) {
        return new SendVideoNote(chat_id, video_note, this.requestSender);
    }

    /**
     * Use this method to send a group of photos, videos, documents or audios as an album.
     * Documents and audio files can be only grouped in an album with messages of the same type.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param media An array of {@link io.github.natanimn.types.input.InputMediaVideo}, {@link io.github.natanimn.types.input.InputMediaAudio},
     *              {@link io.github.natanimn.types.input.InputMediaPhoto}, or {@link io.github.natanimn.types.input.InputMediaDocument}
     *               describing messages to be sent, must include 2-10 items.
     * @return {@link io.github.natanimn.requests.send.SendMediaGroup}
     */
    public SendMediaGroup sendMediaGroup(Object chat_id, InputMedia[] media) {
        return new SendMediaGroup(chat_id, media, this.requestSender);
    }

    /**
     * Use this method to send paid media.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     *                If the chat is a channel, all Telegram Star proceeds from this media will be credited to the chat's balance.
     *                Otherwise, they will be credited to the bot's balance.
     * @param star_count The number of Telegram Stars that must be paid to buy access to the media; 1-10000
     * @param media A JSON-serialized array describing the media to be sent; up to 10 items
     * @return {@link io.github.natanimn.requests.send.SendPaidMedia}
     */
    public SendPaidMedia sendPaidMedia(Object chat_id, short star_count, InputPaidMedia[] media){
        return new SendPaidMedia(chat_id, star_count, media, requestSender);
    }

    /**
     * Use this method to send point on the map.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     * @return {@link io.github.natanimn.requests.send.SendLocation}
     */
    public SendLocation sendLocation(Object chat_id, double latitude, double longitude) {
        return new SendLocation(chat_id, latitude, longitude, this.requestSender);
    }

    /**
     * Use this method to edit live location messages.
     * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
     * On success, the edited Message is returned.
     * @param chat_id Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of new location
     * @param longitude Longitude of new location
     * @param message_id Required if inline_message_id is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.requests.edit.EditMessageLiveLocation}
     */
    public EditMessageLiveLocation editMessageLiveLocation(Object chat_id, double latitude, double longitude, int message_id) {
        return new EditMessageLiveLocation(chat_id, latitude, longitude, message_id, this.requestSender);
    }

    /**
     * Use this method to edit live location messages.
     * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
     * On success, True is returned.
     * @param inline_message_id Required if chat_id and message_id are not specified. Identifier of the inline message
     * @param latitude Latitude of new location
     * @param longitude Longitude of new location
     * @return {@link io.github.natanimn.requests.edit.EditMessageLiveLocation}
     */
    public EditMessageLiveLocation editMessageLiveLocation(String inline_message_id, double latitude, double longitude) {
        return new EditMessageLiveLocation(inline_message_id, latitude, longitude, this.requestSender);
    }

    /**
     * This a method that allows the bot to cancel or re-enable extension of a subscription paid in Telegram Stars.
     * @param user_id Identifier of the user whose subscription will be edited
     * @param telegram_charge_id Telegram payment identifier for the subscription
     * @param is_cancelled Pass True to cancel extension of the user subscription; the subscription must be active up to the end of the current subscription period.
     *                     Pass False to allow the user to re-enable a subscription that was previously canceled by the bot.
     * @return {@link io.github.natanimn.requests.edit.EditUserStarSubscription}
     */
    public EditUserStarSubscription editUserStarSubscription(long user_id, String telegram_charge_id, boolean is_cancelled){
        return new EditUserStarSubscription(user_id, telegram_charge_id, is_cancelled, requestSender);
    }

    /**
     * Use this method to stop updating a live location message before live_period expires.
     * On success, the edited Message is returned.
     * @param chat_id Required if inline_message_id is not specified.
     *                Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Required if inline_message_id is not specified. Identifier of the message with live location to stop
     * @return {@link io.github.natanimn.requests.service.StopMessageLiveLocation}
     */
    public StopMessageLiveLocation stopMessageLiveLocation(Object chat_id, int message_id) {
        return new StopMessageLiveLocation(chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to stop updating a live location message before live_period expires.
     * On success, True is returned.
     * @param inline_message_id <b>Required if chat_id and message_id are not specified.</b><br>
     *                         Identifier of the inline message
     * @return {@link io.github.natanimn.requests.service.StopMessageLiveLocation}
     */
    public StopMessageLiveLocation stopMessageLiveLocation(String inline_message_id) {
        return new StopMessageLiveLocation(inline_message_id, this.requestSender);
    }

    /**
     * Use this method to send information about a venue.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param latitude Latitude of the venue
     * @param longitude Longitude of the venue
     * @param title Name of the venue
     * @param address Address of the venue
     * @return {@link io.github.natanimn.requests.send.SendVenue}
     */
    public SendVenue sendVenue(Object chat_id, double latitude, double longitude, String title, String address) {
        return new SendVenue(chat_id, latitude, longitude, title, address, this.requestSender);
    }

    /**
     * Use this method to send phone contacts.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param phone_number Contact's phone number
     * @param first_name Contact's first name
     * @return {@link io.github.natanimn.requests.send.SendContact}
     */
    public SendContact sendContact(Object chat_id, String phone_number, String first_name) {
        return new SendContact(chat_id, phone_number, first_name, this.requestSender);
    }

    /**
     * Use this method to send a native poll.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param question Poll question, 1-300 characters
     * @param options A JSON-serialized list of 2-12 answer options
     * @return {@link io.github.natanimn.requests.send.SendPoll}
     */
    public SendPoll sendPoll(Object chat_id, String question, InputPollOption[] options) {
        return new SendPoll(chat_id, question, options, this.requestSender);
    }

    /**
     * Use this method to send an animated emoji that will display a random value.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.send.SendDice}
     */
    public SendDice sendDice(Object chat_id) {
        return new SendDice(chat_id, this.requestSender);
    }

    /**
     * Use this method when you need to tell the user that something is happening on the bot's side.
     * The status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients clear its typing status).
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param action Type of action to broadcast. Choose one, depending on what the user is about to receive:
     *               {@link ChatAction#TYPING} for text messages, {@link ChatAction#UPLOAD_PHOTO} for photos,
     *               {@link ChatAction#RECORD_VIDEO} or {@link ChatAction#UPLOAD_VIDEO} for videos,
     *               {@link ChatAction#RECORD_VOICE} or {@link ChatAction#UPLOAD_VOICE} for voice notes,
     *               {@link ChatAction#UPLOAD_DOCUMENT} for general files, {@link ChatAction#CHOSE_STICKER} for stickers,
     *               {@link ChatAction#FIND_LOCATION} for location data, {@link ChatAction#RECORD_VIDEO_NOTE} or {@link ChatAction#UPLOAD_VIDEO_NOTE} for video notes.
     * @return {@link io.github.natanimn.requests.send.SendChatAction}
     */
    public SendChatAction sendChatAction(Object chat_id, ChatAction action) {
        return new SendChatAction(chat_id, action, this.requestSender);
    }

    /**
     * Sends a gift to the given user or channel chat. The gift can't be converted to Telegram Stars by the receiver
     * @param user_id Unique identifier of the target user who will receive the gift.
     * @param gift_id Identifier of the gift
     * @return {@link io.github.natanimn.requests.send.SendGift}
     */
    public SendGift sendGift(long user_id, String gift_id){
        return new SendGift(user_id, gift_id, requestSender);
    }

    /**
     * Sends a gift to the given user or channel chat. The gift can't be converted to Telegram Stars by the receiver
     * @param chat_id Unique identifier for the chat or username of the channel (in the format @channelusername) that will receive the gift.
     * @param gift_id Identifier of the gift
     * @return {@link io.github.natanimn.requests.send.SendGift}
     */
    public SendGift sendGift(Object chat_id, String gift_id){
        return new SendGift(chat_id, gift_id, requestSender);
    }

    /**
     * Use this method to get a list of profile pictures for a user.
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.get.GetUserProfilePhotos}
     */
    public GetUserProfilePhotos getUserProfilePhotos(long user_id) {
        return new GetUserProfilePhotos(user_id, this.requestSender);
    }

    /**
     * Refunds a successful payment in Telegram Stars.
     * @param user_id Identifier of the user whose payment will be refunded
     * @param telegram_payment_change_id Telegram payment identifier
     * @return {@link io.github.natanimn.requests.service.RefundStarPayment}
     */
    public RefundStarPayment refundStarPayment(long user_id, String telegram_payment_change_id) {
        return new RefundStarPayment(user_id, telegram_payment_change_id, requestSender);
    }

    /**
     * Verifies a user on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
     * @param user_id Unique identifier of the target user
     * @return {@link VerifyUser}
     */
    public VerifyUser verifyUser(long user_id){
        return new VerifyUser(user_id, requestSender);
    }

    /**
     * Verifies a c chat on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> which is represented by the bot.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link VerifyUser}
     */
    public VerifyChat verifyUChat(Object chat_id){
        return new VerifyChat(chat_id, requestSender);
    }

    /**
     * Removes verification from a user who is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
     * @param user_id Unique identifier of the target user
     * @return {@link RemoveUserVerification}
     */
    public RemoveUserVerification removeUserVerification(long user_id){
        return new RemoveUserVerification(user_id, requestSender);
    }

    /**
     * Removes verification from a chat that is currently verified on <a hre="https://telegram.org/verify#third-party-verification">behalf of the organization</a> represented by the bot.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link RemoveUserVerification}
     */
    public RemoveChatVerification removeChatVerification(Object chat_id){
        return new RemoveChatVerification(chat_id, requestSender);
    }

    /**
     * Use this method to get basic information about a file and prepare it for downloading. 
     * For the moment, bots can download files of up to 20MB in size. The file can then be downloaded via {@link #downloadFile(String)} where field file_path is taken from the response.
     * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile again.
     * @param file_id File identifier to get information about
     * @return {@link io.github.natanimn.requests.get.GetFile}
     */
    public GetFile getFile(String file_id) {
        return new GetFile(file_id, this.requestSender);
    }

    /**
     * Use this method to ban a user in a group, a supergroup or a channel.
     * In the case of supergroups and channels, the user will not be able to return to the chat on their own using invite links, etc., unless unbanned first.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.service.BanChatMember}
     */
    public BanChatMember banChatMember(Object chat_id, long user_id) {
        return new BanChatMember(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to unban a previously banned user in a supergroup or channel.
     * The user will not return to the group or channel automatically, but will be able to join via link, etc.
     * The bot must be an administrator for this to work. By default, this method guarantees that after the call the user is not a member of the chat, but will be able to join it.
     * So if the user is a member of the chat they will also be removed from the chat. If you don't want this, use the parameter only_if_banned.
     * @param chat_id Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.service.UnbanChatMember}
     */
    public UnbanChatMember unbanChatMember(Object chat_id, long user_id) {
        return new UnbanChatMember(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to unban a previously banned channel chat in a supergroup or channel.
     * The bot must be an administrator for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sender_chat_id Unique identifier of the target sender chat
     * @return {@link io.github.natanimn.requests.service.UnbanChatSenderChat}
     */
    public UnbanChatSenderChat unbanChatSenderChat(Object chat_id, long sender_chat_id){
        return new UnbanChatSenderChat(chat_id, sender_chat_id, requestSender);
    }

    /**
     * Use this method to restrict a user in a supergroup.
     * The bot must be an administrator in the supergroup for this to work and must have the appropriate administrator rights.
     * Pass True for all permissions to lift restrictions from a user.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param user_id Unique identifier of the target user
     * @param permissions A JSON-serialized object for new user permissions
     * @return {@link io.github.natanimn.requests.service.RestrictChatMember}
     */
    public RestrictChatMember restrictChatMember(Object chat_id, long user_id, ChatPermissions permissions) {
        return new RestrictChatMember(chat_id, user_id, permissions, this.requestSender);
    }

    /**
     * Use this method to promote or demote a user in a supergroup or a channel.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Pass False for all boolean parameters to demote a user
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.service.PromoteChatMember}
     */
    public PromoteChatMember promoteChatMember(Object chat_id, long user_id) {
        return new PromoteChatMember(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to set a custom title for an administrator in a supergroup promoted by the bot. Returns True on success.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param user_id Unique identifier of the target user
     * @param custom_title New custom title for the administrator; 0-16 characters, emoji are not allowed
     * @return {@link io.github.natanimn.requests.set.SetChatAdministratorCustomTitle}
     */
    public SetChatAdministratorCustomTitle setChatAdministratorCustomTitle(Object chat_id, long user_id, String custom_title) {
        return new SetChatAdministratorCustomTitle(chat_id, user_id, custom_title, this.requestSender);
    }

    /**
     * This method Changes the emoji status for a given user that previously allowed the bot to manage their emoji status
     * via the Mini App method <a href="https://core.telegram.org/bots/webapps#initializing-mini-apps">requestEmojiStatusAccess</a>.
     * Return True on success
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.set.SetUserEmojiStatus}
     */
    public SetUserEmojiStatus setUserEmojiStatus(long user_id){
        return new SetUserEmojiStatus(user_id, requestSender);
    }

    /**
     * Use this method to ban a channel chat in a supergroup or a channel.
     * Until the chat is unbanned, the owner of the banned chat won't be able to send messages on behalf of any of their channels.
     * The bot must be an administrator in the supergroup or channel for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sender_chat_id Unique identifier of the target sender chat
     * @return {@link io.github.natanimn.requests.service.BanChatSenderChat}
     */
    public BanChatSenderChat banChatSenderChat(Object chat_id, long sender_chat_id) {
        return new BanChatSenderChat(chat_id, sender_chat_id, this.requestSender);
    }

    /**
     * Use this method to set default chat permissions for all members.
     * The bot must be an administrator in the group or a supergroup for this to work and must have the can_restrict_members administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param permissions A JSON-serialized object for new default chat permissions
     * @return {@link io.github.natanimn.requests.set.SetChatPermissions}
     */
    public SetChatPermissions setChatPermissions(Object chat_id, ChatPermissions permissions) {
        return new SetChatPermissions(chat_id, permissions, this.requestSender);
    }

    /**
     * Use this method to generate a new primary invite link for a chat; any previously generated primary link is revoked.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @apiNote Each administrator in a chat generates their own invite links.
     * Bots can't use invite links generated by other administrators. If you want your bot to work with invite links,
     * it will need to generate its own link using {@link #exportChatInviteLink} or by calling the {@link #getChat} method.
     * If your bot needs to generate a new primary invite link replacing its previous one, use  {@link #exportChatInviteLink} again.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.service.ExportChatInviteLink}
     */
    public ExportChatInviteLink exportChatInviteLink(Object chat_id) {
        return new ExportChatInviteLink(chat_id, this.requestSender);
    }

    /**
     * Use this method to create an additional invite link for a chat.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * The link can be revoked using the method {@link #revokeChatInviteLink}.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.create.CreateChatInviteLink}
     */
    public CreateChatInviteLink createChatInviteLink(Object chat_id) {
        return new CreateChatInviteLink(chat_id, this.requestSender);
    }

    /**
     * Use this method to create a subscription invite link for a channel chat.
     * The bot must have the can_invite_users administrator rights.
     * The link can be edited using the method {@link #editChatSubscriptionInviteLink}  or revoked using the method {@link #revokeChatInviteLink}.
     * @param chat_id Unique identifier for the target channel chat or username of the target channel (in the format @channelusername)
     * @param subscription_period The number of seconds the subscription will be active for before the next payment. Currently, it must always be 2592000 (30 days).
     * @param subscription_price The amount of Telegram Stars a user must pay initially and after each subsequent subscription period to be a member of the chat; 1-10000
     * @return {@link io.github.natanimn.requests.create.CreateChatSubscriptionInviteLink}
     */
    public CreateChatSubscriptionInviteLink createChatSubscriptionInviteLink(Object chat_id, int subscription_period,
                                                                             int subscription_price) {
        return new CreateChatSubscriptionInviteLink(chat_id, subscription_period, subscription_price, this.requestSender);
    }

    /**
     * Use this method to edit a non-primary invite link created by the bot.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param invite_link The invite link to edit
     * @return {@link io.github.natanimn.requests.edit.EditChatInviteLink}
     */
    public EditChatInviteLink editChatInviteLink(Object chat_id, String invite_link) {
        return new EditChatInviteLink(chat_id, invite_link, this.requestSender);
    }

    /**
     * Use this method to edit a subscription invite link created by the bot. The bot must have the can_invite_users administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param invite_link The invite link to edit
     * @return {@link io.github.natanimn.requests.edit.EditChatSubscriptionInviteLink}
     */
    public EditChatSubscriptionInviteLink editChatSubscriptionInviteLink(Object chat_id, String invite_link) {
        return new EditChatSubscriptionInviteLink(chat_id, invite_link, this.requestSender);
    }

    /**
     * Use this method to revoke an invite link created by the bot. If the primary link is revoked, a new link is automatically generated.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier of the target chat or username of the target channel (in the format @channelusername)
     * @param invite_link The invite link to revoke
     * @return {@link io.github.natanimn.requests.service.RevokeChatInviteLink}
     */
    public RevokeChatInviteLink revokeChatInviteLink(Object chat_id, String invite_link) {
        return new RevokeChatInviteLink(chat_id, invite_link, this.requestSender);
    }

    /**
     * Use this method to approve a chat join request.
     * The bot must be an administrator in the chat for this to work and must have the can_invite_users administrator right.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.service.ApproveChatJoinRequest}
     */
    public ApproveChatJoinRequest approveChatJoinRequest(Object chat_id, long user_id) {
        return new ApproveChatJoinRequest(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to decline a chat join request.
     * The bot must be an administrator in the chat for this to work and must have the can_invite_users administrator right.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.service.DeclineChatJoinRequest}
     */
    public DeclineChatJoinRequest declineChatJoinRequest(Object chat_id, long user_id) {
        return new DeclineChatJoinRequest(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to set a new profile photo for the chat. Photos can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param photo New chat photo, uploaded using {@link File}
     * @return {@link io.github.natanimn.requests.set.SetChatPhoto}
     */
    public SetChatPhoto setChatPhoto(Object chat_id, File photo) {
        return new SetChatPhoto(chat_id, photo, this.requestSender);
    }

    /**
     * Use this method to delete a chat photo. Photos can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.delete.DeleteChatPhoto}
     */
    public DeleteChatPhoto deleteChatPhoto(Object chat_id) {
        return new DeleteChatPhoto(chat_id, this.requestSender);
    }

    /**
     * Use this method to change the title of a chat. Titles can't be changed for private chats.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param title New chat title, 1-128 characters
     * @return {@link io.github.natanimn.requests.set.SetChatTitle}
     */
    public SetChatTitle setChatTitle(Object chat_id, String title) {
        return new SetChatTitle(chat_id, title, this.requestSender);
    }


    /**
     * Use this method to change the description of a group, a supergroup or a channel.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param description New chat description, 0-255 characters
     * @return {@link io.github.natanimn.requests.set.SetChatDescription}
     */
    public SetChatDescription setChatDescription(Object chat_id, String description) {
        return new SetChatDescription(chat_id, description, this.requestSender);
    }

    /**
     * Use this method to add a message to the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the
     * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right in a channel
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of a message to pin
     * @return {@link io.github.natanimn.requests.service.PinChatMessage}
     */
    public PinChatMessage pinChatMessage(Object chat_id, int message_id) {
        return new PinChatMessage(chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to remove a message from the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the
     * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right in a channel.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.service.UnpinChatMessage}
     */
    public UnpinChatMessage unpinChatMessage(Object chat_id) {
        return new UnpinChatMessage(chat_id, this.requestSender);
    }

    /**
     * Use this method to clear the list of pinned messages in a chat.
     * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have the 'can_pin_messages'
     * administrator right in a supergroup or 'can_edit_messages' administrator right in a channel
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.service.UnpinAllChatMessages}
     */
    public UnpinAllChatMessages unpinAllChatMessages(Object chat_id) {
        return new UnpinAllChatMessages(chat_id, this.requestSender);
    }

    /**
     * Returns the bot's Telegram Star transactions in chronological order.
     * @return {@link io.github.natanimn.requests.get.GetStarTransactions}
     */
    public GetStarTransactions getStarTransactions(){
        return new GetStarTransactions(requestSender);
    }

    /**
     * Use this method for your bot to leave a group, supergroup or channel.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.service.LeaveChat}
     */
    public LeaveChat leaveChat(Object chat_id) {
        return new LeaveChat(chat_id, this.requestSender);
    }

    /**
     * Use this method to get up-to-date information about the chat.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.get.GetChat}
     */
    public GetChat getChat(Object chat_id) {
        return new GetChat(chat_id, this.requestSender);
    }

    /**
     * Use this method to get the list of boosts added to a chat by a user. Requires administrator rights in the chat.
     * @param chat_id Unique identifier for the chat or username of the channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.get.GetUserChatBoosts}
     */
    public GetUserChatBoosts getUserChatBoosts(Object chat_id, long user_id){
        return new GetUserChatBoosts(chat_id, user_id, requestSender);
    }

    /**
     * Use this method to get a list of administrators in a chat, which aren't bots.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.get.GetChatAdministrators}
     */
    public GetChatAdministrators getChatAdministrators(Object chat_id) {
        return new GetChatAdministrators(chat_id, this.requestSender);
    }

    /**
     * Use this method to get the number of members in a chat.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @return {@link io.github.natanimn.requests.get.GetChatMemberCount}
     */
    public GetChatMemberCount getChatMemberCount(Object chat_id) {
        return new GetChatMemberCount(chat_id, this.requestSender);
    }

    /**
     * Use this method to get information about a member of a chat.
     * The method is only guaranteed to work for other users if the bot is an administrator in the chat
     * @param chat_id Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     * @param user_id Unique identifier of the target user
     * @return {@link io.github.natanimn.requests.get.GetChatMember}
     */
    public GetChatMember getChatMember(Object chat_id, long user_id) {
        return new GetChatMember(chat_id, user_id, this.requestSender);
    }

    /**
     * Use this method to change the chosen reactions on a message. Service messages of some types can't be reacted to.
     * Automatically forwarded messages from a channel to its discussion group have the same available reactions as messages in the channel.
     * Bots can't use paid reactions.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of the target message. If the message belongs to a media group, the reaction is set to the first non-deleted message in the group instead.
     * @return {@link io.github.natanimn.requests.set.SetMessageReaction}
     */
    public SetMessageReaction setMessageReaction(Object chat_id, int message_id){
        return new SetMessageReaction(chat_id, message_id, requestSender);
    }

    /**
     * Use this method to set a new group sticker set for a supergroup.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Use the field can_set_sticker_set optionally returned in {@link #getChat} requests to check if the bot can use this method.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param sticker_set_name Name of the sticker set to be set as the group sticker set
     * @return {@link io.github.natanimn.requests.set.SetChatStickerSet}
     */
    public SetChatStickerSet setChatStickerSet(Object chat_id, String sticker_set_name) {
        return new SetChatStickerSet(chat_id, sticker_set_name, this.requestSender);
    }

    /**
     * Use this method to delete a group sticker set from a supergroup.
     * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
     * Use the field can_set_sticker_set optionally returned in {@link #getChat} requests to check if the bot can use this method.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.delete.DeleteChatStickerSet}
     */
    public DeleteChatStickerSet deleteChatStickerSet(Object chat_id) {
        return new DeleteChatStickerSet(chat_id, this.requestSender);
    }

    /**
     * Use this method to get custom emoji stickers, which can be used as a forum topic icon by any user. Requires no parameters.
     * @return {@link io.github.natanimn.requests.get.GetForumTopicIconStickers}
     */
    public GetForumTopicIconStickers getForumTopicIconStickers() {
        return new GetForumTopicIconStickers(this.requestSender);
    }

    /**
     * Use this method to create a topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param name Topic name, 1-128 characters
     * @return {@link io.github.natanimn.requests.create.CreateForumTopic}
     */
    public CreateForumTopic createForumTopic(Object chat_id, String name) {
        return new CreateForumTopic(chat_id, name, this.requestSender);
    }

    /**
     * Use this method to edit name and icon of a topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param message_thread_id Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.requests.edit.EditForumTopic}
     */
    public EditForumTopic editForumTopic(Object chat_id, int message_thread_id) {
        return new EditForumTopic(chat_id, message_thread_id, this.requestSender);
    }

    /**
     * Use this method to close an open topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param message_thread_id Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.requests.service.CloseForumTopic}
     */
    public CloseForumTopic closeForumTopic(Object chat_id, int message_thread_id){
        return new CloseForumTopic(chat_id, message_thread_id, requestSender);
    }

    /**
     * Use this method to reopen a closed topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights, unless it is the creator of the topic.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param message_thread_id Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.requests.service.ReopenForumTopic}
     */
    public ReopenForumTopic reopenForumTopic(Object chat_id, int message_thread_id) {
        return new ReopenForumTopic(chat_id, message_thread_id, this.requestSender);
    }

    /**
     * Use this method to delete a forum topic along with all its messages in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_delete_messages administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param message_thread_id Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.requests.delete.DeleteForumTopic}
     */
    public DeleteForumTopic deleteForumTopic(Object chat_id, int message_thread_id) {
        return new DeleteForumTopic(chat_id, message_thread_id, this.requestSender);
    }

    /**
     * Use this method to clear the list of pinned messages in a forum topic.
     * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param message_thread_id Unique identifier for the target message thread of the forum topic
     * @return {@link io.github.natanimn.requests.service.UnpinAllForumTopicMessages}
     */
    public UnpinAllForumTopicMessages unpinAllForumTopicMessages(Object chat_id, int message_thread_id) {
        return new UnpinAllForumTopicMessages(chat_id, message_thread_id, this.requestSender);
    }

    /**
     * Use this method to edit the name of the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @param name New topic name, 1-128 characters
     * @return {@link io.github.natanimn.requests.edit.EditGeneralForumTopic}
     */
    public EditGeneralForumTopic editGeneralForumTopic(Object chat_id, String name) {
        return new EditGeneralForumTopic(chat_id, name, this.requestSender);
    }

    /**
     * Use this method to close an open 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.service.CloseForumTopic}
     */
    public CloseGeneralForumTopic closeGeneralForumTopic(Object chat_id) {
        return new CloseGeneralForumTopic(chat_id, this.requestSender);
    }

    /**
     * Use this method to reopen a closed 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * The topic will be automatically unhidden if it was hidden.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.service.ReopenGeneralForumTopic}
     */
    public ReopenGeneralForumTopic reopenGeneralForumTopic(Object chat_id) {
        return new ReopenGeneralForumTopic(chat_id, this.requestSender);
    }

    /**
     * Use this method to hide the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * The topic will be automatically closed if it was open.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.service.HideGeneralForumTopic}
     */
    public HideGeneralForumTopic hideGeneralForumTopic(Object chat_id) {
        return new HideGeneralForumTopic(chat_id, this.requestSender);
    }

    /**
     * Use this method to unhide the 'General' topic in a forum supergroup chat.
     * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.service.UnHideGeneralForumTopic}
     */
    public UnHideGeneralForumTopic unHideGeneralForumTopic(Object chat_id) {
        return new UnHideGeneralForumTopic(chat_id, this.requestSender);
    }

    /**
     * Use this method to clear the list of pinned messages in a General forum topic.
     * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
     * @param chat_id Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     * @return {@link io.github.natanimn.requests.service.UnpinAllGeneralForumTopicMessages}
     */
    public UnpinAllGeneralForumTopicMessages unpinAllGeneralForumTopicMessages(Object chat_id){
        return new UnpinAllGeneralForumTopicMessages(chat_id, this.requestSender);
    }


    /**
     * Use this method to send answers to callback queries sent from inline keyboards.
     * The answer will be displayed to the user as a notification at the top of the chat screen or as an alert.
     * @param callback_query_id Unique identifier for the query to be answered
     * @return {@link io.github.natanimn.requests.answer.AnswerCallbackQuery}
     */
    public AnswerCallbackQuery answerCallbackQuery(String callback_query_id) {
        return new AnswerCallbackQuery(callback_query_id, this.requestSender);
    }

    /**
     * {@link #answerCallbackQuery} with text parameter
     * @param callback_query_id Unique identifier for the query to be answered
     * @param text text Text of the notification.
     * @return {@link io.github.natanimn.requests.answer.AnswerCallbackQuery}
     */
    public AnswerCallbackQuery answerCallbackQuery(String callback_query_id, String text) {
        return new AnswerCallbackQuery(callback_query_id, this.requestSender).text(text);
    }

    /**
     * Use this method to change the list of the bot's commands.
     * @see <a href="https://core.telegram.org/bots/features#commands">this manual</a> for more details about bot commands.
     * @param commands A JSON-serialized list of bot commands to be set as the list of the bot's commands. At most 100 commands can be specified.
     * @return {@link io.github.natanimn.requests.set.SetMyCommands}
     */
    public SetMyCommands setMyCommands(BotCommand[] commands) {
        return new SetMyCommands(commands, this.requestSender);
    }

    /**
     * Use this method to delete the list of the bot's commands for the given scope and user language.
     * After deletion, <a href="https://core.telegram.org/bots/api#determining-list-of-commands">higher level commands</a> will be shown to affected users.
     * @return {@link io.github.natanimn.requests.delete.DeleteMyCommands}
     */
    public DeleteMyCommands deleteMyCommands() {
        return new DeleteMyCommands(this.requestSender);
    }

    /**
     * Use this method to get the current list of the bot's commands for the given scope and user language.
     * @return {@link io.github.natanimn.requests.get.GetMyCommands}
     */
    public GetMyCommands getMyCommands() {
        return new GetMyCommands(this.requestSender);
    }

    /**
     * Use this method to change the bot's menu button in a private chat, or the default menu button.
     * @return {@link io.github.natanimn.requests.set.SetChatMenuButton}
     */
    public SetChatMenuButton setChatMenuButton() {
        return new SetChatMenuButton(this.requestSender);
    }

    /**
     * Use this method to get the current value of the bot's menu button in a private chat, or the default menu button.
     * @return {@link io.github.natanimn.requests.get.GetChatMenuButton}
     */
    public GetChatMenuButton getChatMenuButton() {
        return new GetChatMenuButton(this.requestSender);
    }

    /**
     * Use this method to change the default administrator rights requested by the bot when it's added as an administrator to groups or channels.
     * These rights will be suggested to users, but they are free to modify the list before adding the bot.
     * @return {@link io.github.natanimn.requests.set.SetMyDefaultAdministratorRights}
     */
    public SetMyDefaultAdministratorRights setMyDefaultAdministratorRights() {
        return new SetMyDefaultAdministratorRights(this.requestSender);
    }

    /**
     * Use this method to get the current default administrator rights of the bot. Returns ChatAdministratorRights on success.
     * @return {@link io.github.natanimn.requests.get.GetMyDefaultAdministratorRights}
     */
    public GetMyDefaultAdministratorRights getMyDefaultAdministratorRights() {
        return new GetMyDefaultAdministratorRights(this.requestSender);
    }

    /**
     * Use this method to edit text and game messages.
     * On success,  the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param text New text of the message, 1-4096 characters after entities parsing
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of the message to edit
     * @return {@link io.github.natanimn.requests.edit.EditMessageText}
     */
    public EditMessageText editMessageText(String text, Object chat_id, int message_id) {
        return new EditMessageText(text, chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to edit text and game messages.
     * On success, True is returned. Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param text ew text of the message, 1-4096 characters after entities parsing
     * @param inline_message_id Identifier of the inline message
     * @return {@link io.github.natanimn.requests.edit.EditMessageText}
     */
    public EditMessageText editMessageText(String text, String inline_message_id) {
        return new EditMessageText(text, inline_message_id, this.requestSender);
    }

    /**
     * Use this method to edit captions of messages. On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of the message to edit
     * @return {@link io.github.natanimn.requests.edit.EditMessageCaption}
     */
    public EditMessageCaption editMessageCaption(Object chat_id, int message_id) {
        return new EditMessageCaption(chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to edit captions of messages.
     * On success, True is returned. Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param inline_message_id Identifier of the inline message
     * @return {@link io.github.natanimn.requests.edit.EditMessageCaption}
     */
    public EditMessageCaption editMessageCaption(String inline_message_id) {
        return new EditMessageCaption(inline_message_id, this.requestSender);
    }

    /**
     * Use this method to edit animation, audio, document, photo, or video messages, or to add media to text messages.
     * If a message is part of a message album, then it can be edited only to an audio for audio albums, only to a document for document albums and to a photo or a video otherwise.
     * When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify a URL.
     * On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chat_id Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param media A JSON-serialized object for a new media content of the message
     * @param message_id Required if inline_message_id is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.requests.edit.EditMessageMedia}
     */
    public EditMessageMedia editMessageMedia(Object chat_id, InputMedia media, int message_id) {
        return new EditMessageMedia(media, chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to edit animation, audio, document, photo, or video messages, or to add media to text messages.
     * If a message is part of a message album, then it can be edited only to an audio for audio albums, only to a document for document albums and to a photo or a video otherwise.
     * When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify a URL.
     * On success, True is returned.
     * @param inline_message_id Required if chat_id and message_id are not specified. Identifier of the inline message
     * @param media A JSON-serialized object for a new media content of the message
     * @return {@link io.github.natanimn.requests.edit.EditMessageMedia}
     */
    public EditMessageMedia editMessageMedia(String inline_message_id, InputMedia media) {
        return new EditMessageMedia(media, inline_message_id, this.requestSender);
    }

    /**
     * Use this method to edit only the reply markup of messages.
     * On success, the edited Message is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param chat_id Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Required if inline_message_id is not specified. Identifier of the message to edit
     * @return {@link io.github.natanimn.requests.edit.EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup editMessageReplyMarkup(Object chat_id, int message_id) {
        return new EditMessageReplyMarkup(chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to edit only the reply markup of messages.
     * On success, True is returned.
     * Note that business messages that were not sent by the bot and do not contain an inline keyboard can only be edited within 48 hours from the time they were sent.
     * @param inline_message_id Required if chat_id and message_id are not specified. Identifier of the inline message
     * @return {@link io.github.natanimn.requests.edit.EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup editMessageReplyMarkup(String inline_message_id) {
        return new EditMessageReplyMarkup(inline_message_id, this.requestSender);
    }

    /**
     * Use this method to stop a poll which was sent by the bot.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of the original message with the poll
     * @return {@link io.github.natanimn.requests.service.StopPoll}
     */
    public StopPoll stopPoll(Object chat_id, int message_id) {
        return new StopPoll(chat_id, message_id, this.requestSender);
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
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_id Identifier of the message to delete
     * @return {@link io.github.natanimn.requests.delete.DeleteMessage}
     */
    public DeleteMessage deleteMessage(Object chat_id, int message_id) {
        return new DeleteMessage(chat_id, message_id, this.requestSender);
    }

    /**
     * Use this method to delete multiple messages simultaneously. If some of the specified messages can't be found, they are skipped.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param message_ids A JSON-serialized list of 1-100 identifiers of messages to delete.
     * @return
     */
    public DeleteMessages deleteMessages(Object chat_id, int[] message_ids) {
        return new DeleteMessages(chat_id, message_ids, this.requestSender);
    }

    /**
     * Use this method to send static .WEBP, <a href="https://telegram.org/blog/animated-stickers">animated</a> .TGS, or <a href="https://telegram.org/blog/video-stickers-better-reactions">video</a> .WEBM stickers.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sticker Sticker to send. Pass .WEBM file
     * @return {@link io.github.natanimn.requests.send.SendSticker}
     */
    public SendSticker sendSticker(Object chat_id, File sticker) {
        return new SendSticker(chat_id, sticker, this.requestSender);
    }

    /**
     * Use this method to send static .WEBP, <a href="https://telegram.org/blog/animated-stickers">animated</a> .TGS, or <a href="https://telegram.org/blog/video-stickers-better-reactions">video</a> .WEBM stickers.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param sticker Sticker to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     *                pass an HTTP URL as a String for Telegram to get a .WEBP sticker from the Internet, or upload a new .WEBP, .TGS,
     *                Video and animated stickers can't be sent via an HTTP URL.
     * @return {@link io.github.natanimn.requests.send.SendSticker}
     */
    public SendSticker sendSticker(Object chat_id, String sticker) {
        return new SendSticker(chat_id, sticker, this.requestSender);
    }

    /**
     * Use this method to get a sticker set.
     * @param name Name of the sticker set
     * @return {@link io.github.natanimn.requests.get.GetStickerSet}
     */
    public GetStickerSet getStickerSet(String name) {
        return new GetStickerSet(name, this.requestSender);
    }

    /**
     * Use this method to get information about custom emoji stickers by their identifiers.
     * @param custom_emoji_ids A JSON-serialized list of custom emoji identifiers. At most 200 custom emoji identifiers can be specified.
     * @return {@link io.github.natanimn.requests.get.GetCustomEmojiStickers}
     */
    public GetCustomEmojiStickers getCustomEmojiStickers(String[] custom_emoji_ids) {
        return new GetCustomEmojiStickers(custom_emoji_ids, this.requestSender);
    }

    /**
     * Use this method to upload a file with a sticker for later use in the {@link #createNewStickerSet}, {@link #addStickerToSet}, or {@link #replaceStickerInSet} methods (the file can be used multiple times).
     * @param user_id User identifier of sticker file owner
     * @param sticker A file with the sticker in .WEBP, .PNG, .TGS, or .WEBM format.
     * @param sticker_format Format of the sticker
     * @return {@link io.github.natanimn.requests.service.UploadStickerFile}
     */
    public UploadStickerFile uploadStickerFile(long user_id, File sticker, StickerFormat sticker_format) {
        return new UploadStickerFile(user_id, sticker, sticker_format, this.requestSender);
    }

    /**
     * Use this method to create a new sticker set owned by a user. The bot will be able to edit the sticker set thus created.
     * @param user_id User identifier of created sticker set owner
     * @param name Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals).
     *             Can contain only English letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in "_by_<bot_username>".
     *             <bot_username> is case-insensitive. 1-64 characters.
     * @param title Sticker set title, 1-64 characters
     * @param stickers A JSON-serialized list of 1-50 initial stickers to be added to the sticker set
     * @return {@link io.github.natanimn.requests.create.CreateNewStickerSet}
     */
    public CreateNewStickerSet createNewStickerSet(long user_id, String name, String title, InputSticker[] stickers) {
        return new CreateNewStickerSet(user_id, name, title, stickers, this.requestSender);
    }

    /**
     * Use this method to add a new sticker to a set created by the bot.
     * Emoji sticker sets can have up to 200 stickers. Other sticker sets can have up to 120 stickers.
     * @param user_id User identifier of sticker set owner
     * @param name Sticker set name
     * @param sticker A JSON-serialized object with information about the added sticker.
     *                If exactly the same sticker had already been added to the set, then the set isn't changed.
     * @return {@link io.github.natanimn.requests.service.AddStickerToSet}
     */
    public AddStickerToSet addStickerToSet(long user_id, String name, InputSticker sticker) {
        return new AddStickerToSet(user_id, name, sticker, this.requestSender);
    }

    /**
     * Use this method to move a sticker in a set created by the bot to a specific position.
     * @param sticker File identifier of the sticker
     * @param position New sticker position in the set, zero-based
     * @return {@link io.github.natanimn.requests.set.SetStickerPositionInSet}
     */
    public SetStickerPositionInSet setStickerPositionInSet(String sticker, int position) {
        return new SetStickerPositionInSet(sticker, position, this.requestSender);
    }

    /**
     * Use this method to delete a sticker from a set created by the bot.
     * @param sticker File identifier of the sticker
     * @return {@link io.github.natanimn.requests.delete.DeleteStickerFromSet}
     */
    public DeleteStickerFromSet deleteStickerFromSet(String sticker) {
        return new DeleteStickerFromSet(sticker, this.requestSender);
    }

    /**
     * Use this method to change the list of emoji assigned to a regular or custom emoji sticker.
     * The sticker must belong to a sticker set created by the bot.
     * @param sticker File identifier of the sticker
     * @param emoji_list A JSON-serialized list of 1-20 emoji associated with the sticker
     * @return {@link io.github.natanimn.requests.set.SetStickerEmojiList}
     */
    public SetStickerEmojiList setStickerEmojiList(String sticker, String[] emoji_list) {
        return new SetStickerEmojiList(sticker, emoji_list, this.requestSender);
    }

    /**
     * Use this method to change search keywords assigned to a regular or custom emoji sticker.
     * The sticker must belong to a sticker set created by the bot
     * @param sticker File identifier of the sticker
     * @param keywords A JSON-serialized list of 0-20 search keywords for the sticker with total length of up to 64 characters
     * @return {@link io.github.natanimn.requests.set.SetStickerKeywords}
     */
    public SetStickerKeywords setStickerKeywords(String sticker, String[] keywords) {
        return new SetStickerKeywords(sticker, keywords, this.requestSender);
    }

    /**
     * Use this method to change the mask position of a mask sticker.
     * The sticker must belong to a sticker set that was created by the bot.
     * @param sticker File identifier of the sticker
     * @return {@link io.github.natanimn.requests.set.SetStickerMaskPosition}
     */
    public SetStickerMaskPosition setStickerMaskPosition(String sticker) {
        return new SetStickerMaskPosition(sticker, this.requestSender);
    }

    /**
     * Use this method to set the title of a created sticker set.
     * @param name Sticker set name
     * @param title Sticker set title, 1-64 characters
     * @return {@link io.github.natanimn.requests.set.SetStickerSetTitle}
     */
    public SetStickerSetTitle setStickerSetTitle(String name, String title) {
        return new SetStickerSetTitle(name, title, this.requestSender);
    }

    /**
     * Use this method to replace an existing sticker in a sticker set with a new one.
     * The method is equivalent to calling {@link #deleteStickerFromSet}, then {@link #addStickerToSet}, then {@link #setStickerPositionInSet}.
     * @param user_id User identifier of the sticker set owner
     * @param name Sticker set name
     * @param old_sticker File identifier of the replaced sticker
     * @param sticker A JSON-serialized object with information about the added sticker. If exactly the same sticker had already been added to the set, then the set remains unchanged.
     * @return {@link io.github.natanimn.requests.service.ReplaceStickerInSet}
     */
    public ReplaceStickerInSet replaceStickerInSet(long user_id, String name, String  old_sticker, InputSticker sticker){
        return new ReplaceStickerInSet(user_id, name, old_sticker, sticker, requestSender);
    }

    /**
     * Use this method to set the thumbnail of a regular or mask sticker set.
     * The format of the thumbnail file must match the format of the stickers in the set.
     * @param name Sticker set name
     * @param user_id User identifier of the sticker set owner
     * @param thumbnail A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width and height of exactly 100px, or a .TGS animation with a thumbnail up to 32 kilobytes in size.
     *                  <a href="https://core.telegram.org/stickers#animation-requirements">animation-requirements</a> for animated sticker technical requirements), or a .WEBM video with the thumbnail up to 32 kilobytes in size;
     *                  <a href="https://core.telegram.org/stickers#video-requirements">see</a> for video sticker technical requirements.
     *                  Pass a file_id as a String to send a file that already exists on the Telegram servers, or
     *                  pass an HTTP URL as a String for Telegram to get a file from the Internet
     * @param format Format of the thumbnail, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, or {@link StickerFormat#VIDEO} for a .WEBM video
     * @return {@link io.github.natanimn.requests.set.SetStickerSetThumbnail}
     */
    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long user_id, File thumbnail, StickerFormat format) {
        return new SetStickerSetThumbnail(name, user_id, thumbnail, format, this.requestSender);
    }

    /**
     * Use this method to set the thumbnail of a regular or mask sticker set.
     * The format of the thumbnail file must match the format of the stickers in the set.
     * @param name Sticker set name
     * @param user_id User identifier of the sticker set owner
     * @param thumbnail A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width and height of exactly 100px, or a .TGS animation with a thumbnail up to 32 kilobytes in size.
     *                  <a href="https://core.telegram.org/stickers#animation-requirements">animation-requirements</a> for animated sticker technical requirements), or a .WEBM video with the thumbnail up to 32 kilobytes in size;
     *                  <a href="https://core.telegram.org/stickers#video-requirements">see</a> for video sticker technical requirements.
     *                  Upload using {@link File}
     * @param format Format of the thumbnail, must be one of {@link StickerFormat#STATIC} for a .WEBP or .PNG image,
     *               {@link StickerFormat#ANIMATED} for a .TGS animation, or {@link StickerFormat#VIDEO} for a .WEBM video
     * @return {@link io.github.natanimn.requests.set.SetStickerSetThumbnail}
     */
    public SetStickerSetThumbnail setStickerSetThumbnail(String name, long user_id, String thumbnail, StickerFormat format) {
        return new SetStickerSetThumbnail(name, user_id, thumbnail, format, this.requestSender);
    }

    /**
     * Use this method to set the thumbnail of a custom emoji sticker set.
     * @param name Sticker set name
     * @return {@link io.github.natanimn.requests.set.SetCustomEmojiStickerSetThumbnail}
     */
    public SetCustomEmojiStickerSetThumbnail setCustomEmojiStickerSetThumbnail(String name) {
        return new SetCustomEmojiStickerSetThumbnail(name, this.requestSender);
    }

    /**
     * Use this method to delete a sticker set that was created by the bot.
     * @param name Sticker set name
     * @return {@link io.github.natanimn.requests.delete.DeleteStickerSet}
     */
    public DeleteStickerSet deleteStickerSet(String name) {
        return new DeleteStickerSet(name, this.requestSender);
    }

    /**
     * Use this method to get information about the connection of the bot with a business account.
     * @param business_connection_id Unique identifier of the business connection
     * @return {@link io.github.natanimn.requests.get.GetBusinessConnection}
     */
    public GetBusinessConnection getBusinessConnection(String business_connection_id){
        return new GetBusinessConnection(business_connection_id, requestSender);
    }

    /**
     * Use this method to send answers to an inline query.
     * No more than 50 results per query are allowed.
     * @param inline_query_id Unique identifier for the answered query
     * @param results A JSON-serialized array of results for the inline query
     * @return {@link io.github.natanimn.requests.answer.AnswerInlineQuery}
     */
    public AnswerInlineQuery answerInlineQuery(String inline_query_id, InlineQueryResult[] results) {
        return new AnswerInlineQuery(inline_query_id, results, this.requestSender);
    }

    /**
     * Stores a message that can be sent by a user of a Mini App. Returns a {@link io.github.natanimn.types.media_and_service.PreparedInlineMessage} object.
     * @param user_id Unique identifier of the target user that can use the prepared message
     * @param result {@link InlineQueryResult} object describing the message to be sent
     * @return {@link io.github.natanimn.requests.service.SavePreparedInlineMessage}
     */
    public SavePreparedInlineMessage savePreparedInlineMessage(long user_id, InlineQueryResult result){
        return new SavePreparedInlineMessage(user_id, result, requestSender);
    }

    /**
     * Use this method to set the result of an interaction with a Web App and send a corresponding message on behalf of the user to the chat from which the query originated.
     * @param web_app_query_id Unique identifier for the query to be answered
     * @param result A JSON-serialized object describing the message to be sent
     * @return {@link io.github.natanimn.requests.answer.AnswerWebAppQuery}
     */
    public AnswerWebAppQuery answerWebAppQuery(String web_app_query_id, InlineQueryResult result) {
        return new AnswerWebAppQuery(web_app_query_id, result, this.requestSender);
    }

    /**
     * Use this method to send invoices.
     * @param chat_id Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * @param title Product name, 1-32 characters
     * @param description Product description, 1-255 characters
     * @param payload Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use it for your internal processes.
     * @param currency Three-letter ISO 4217 currency code, <a href="https://core.telegram.org/bots/payments#supported-currencies">see more on currencies.</a>
     *                Pass “XTR” for payments in Telegram Stars.
     * @param prices Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.).
     *              Must contain exactly one item for payments in Telegram Stars.
     * @return {@link io.github.natanimn.requests.send.SendInvoice}
     */
    public SendInvoice sendInvoice(Object chat_id, String title, String description, String payload, String currency,
                                   LabeledPrice[] prices) {
        return new SendInvoice(chat_id, title, description, payload, currency, prices, this.requestSender)
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
     * @return {@link io.github.natanimn.requests.create.CreateInvoiceLink}
     */
    public CreateInvoiceLink createInvoiceLink(String title, String description, String payload, String currency, LabeledPrice[] prices) {
        return new CreateInvoiceLink(title, description, payload, currency, prices, this.requestSender);
    }

    /**
     * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified, the Bot API will send an Update with a shipping_query field to the bot.
     * Use this method to reply to shipping queries. On success, True is returned.
     * @param shipping_query_id Unique identifier for the query to be answered
     * @param ok Pass True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible)
     * @return {@link io.github.natanimn.requests.answer.AnswerShippingQuery}
     */
    public AnswerShippingQuery answerShippingQuery(String shipping_query_id, boolean ok) {
        return new AnswerShippingQuery(shipping_query_id, ok, this.requestSender);
    }

    /**
     * Once the user has confirmed their payment and shipping details, the Bot API sends the final confirmation in the form of an Update with the field pre_checkout_query.
     * Use this method to respond to such pre-checkout queries.
     * <b>Note:</b> The Bot API must receive an answer within 10 seconds after the pre-checkout query was sent.
     * @param pre_checkout_query_id Unique identifier for the query to be answered
     * @param ok Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
     * @return {@link io.github.natanimn.requests.answer.AnswerPreCheckoutQuery}
     */
    public AnswerPreCheckoutQuery answerPreCheckoutQuery(String pre_checkout_query_id, boolean ok) {
        return new AnswerPreCheckoutQuery(pre_checkout_query_id, ok, this.requestSender);
    }

    /**
     * Informs a user that some of the Telegram Passport elements they provided contains errors.
     * The user will not be able to re-submit their Passport to you until the errors are fixed (the contents of the field for which you returned the error must change). <br>
     *<br>
     * Use this if the data submitted by the user doesn't satisfy the standards your service requires for any reason.
     * For example, if a birthday date seems invalid, a submitted document is blurry, a scan shows evidence of tampering, etc.
     * Supply some details in the error message to make sure the user knows how to correct the issues.
     * @param user_id User identifier
     * @param errors A JSON-serialized array describing the errors
     * @return {@link io.github.natanimn.requests.set.SetPassportDataErrors}
     */
    public SetPassportDataErrors setPassportDataErrors(long user_id, PassportElementError[] errors) {
        return new SetPassportDataErrors(user_id, errors, this.requestSender);
    }

    /**
     * Use this method to send a game
     * @param chat_id Unique identifier for the target chat
     * @param game_short_name Short name of the game, serves as the unique identifier for the game. Set up your games via @BotFather.
     * @return {@link io.github.natanimn.requests.send.SendGame}
     */
    public SendGame sendGame(long chat_id, String game_short_name) {
        return new SendGame(chat_id, game_short_name, this.requestSender);
    }

    /**
     * Use this method to set the score of the specified user in a game message.
     * On success, the Message is returned. Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
     * @param chat_id Required if inline_message_id is not specified. Unique identifier for the target chat
     * @param user_id User identifier
     * @param score New score, must be non-negative
     * @param message_id Required if inline_message_id is not specified. Identifier of the sent message
     * @return {@link io.github.natanimn.requests.set.SetGameScore}
     */
    public SetGameScore setGameScore(long chat_id, long user_id, int score, int message_id) {
        return new SetGameScore(chat_id, user_id, score, message_id, this.requestSender);
    }

    /**
     * Use this method to set the score of the specified user in a game message.
     * On success, True is returned. Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
     * @param inline_message_id Required if chat_id and message_id are not specified. Identifier of the inline message
     * @param user_id User identifier
     * @param score New score, must be non-negative
     * @return {@link io.github.natanimn.requests.set.SetGameScore}
     */
    public SetGameScore setGameScore(String inline_message_id, long user_id, int score) {
        return new SetGameScore(inline_message_id, user_id, score, this.requestSender);
    }

    /**
     * Returns the list of gifts that can be sent by the bot to users and channel chats. Requires no parameters.
     * Returns a {@link Gifts} object.
     * @return {@link io.github.natanimn.requests.get.GetAvailableGifts}
     */
    public GetAvailableGifts getAvailableGifts(){
        return new GetAvailableGifts(requestSender);
    }

    /**
     * Use this method to get the current bot name for the given user language
     * @return {@link io.github.natanimn.requests.get.GetMyName}
     */
    public GetMyName getMyName(){
        return new GetMyName(this.requestSender);
    }

    /**
     * Use this method to change the bot's name.
     * @return {@link io.github.natanimn.requests.set.SetMyName}
     */
    public SetMyName setMyName(){
        return new SetMyName(this.requestSender);
    }

    /**
     * Use this method to get the current bot description for the given user language.
     * @return {@link io.github.natanimn.requests.get.GetMyDescription}
     */
    public GetMyDescription getMyDescription(){
        return new GetMyDescription(requestSender);
    }

    /**
     * Use this method to change the bot's description, which is shown in the chat with the bot if the chat is empty.
     * @return {@link io.github.natanimn.requests.set.SetMyDescription}
     */
    public SetMyDescription setMyDescription(){
        return new SetMyDescription(requestSender);
    }

    /**
     * Use this method to get data for high score tables. Will return the score of the specified user and several of their neighbors in a game.<br>
     * <br>
     * This method will currently return scores for the target user, plus two of their closest neighbors on each side.
     * Will also return the top three users if the user and their neighbors are not among them. Please note that this behavior is subject to change.
     * @param chat_id Required if inline_message_id is not specified. Unique identifier for the target chat
     * @param user_id Target user id
     * @param message_id Required if inline_message_id is not specified. Identifier of the sent message
     * @return {@link io.github.natanimn.requests.get.GetGameHighScores}
     */
    public GetGameHighScores getGameHighScores(long chat_id, long user_id, int message_id) {
        return new GetGameHighScores(chat_id, user_id, message_id, this.requestSender);
    }

    /**
     * Use this method to get data for high score tables. Will return the score of the specified user and several of their neighbors in a game.<br>
     * <br>
     * This method will currently return scores for the target user, plus two of their closest neighbors on each side.
     * Will also return the top three users if the user and their neighbors are not among them. Please note that this behavior is subject to change.
     * @param inline_message_id Required if chat_id and message_id are not specified. Identifier of the inline message
     * @param user_id Target user id
     * @return {@link io.github.natanimn.requests.get.GetGameHighScores}
     */
    public GetGameHighScores getGameHighScores(String inline_message_id, long user_id) {
        return new GetGameHighScores(inline_message_id, user_id, this.requestSender);
    }

    /**
     * Use this method to set new state in group/supergroup chat for a user
     * @param chat_id Unique identifier for the target chat
     * @param user_id Target user id
     * @param name state name
     */
    public void setState(long chat_id, long user_id, String name){
        storage.save(chat_id, user_id, name);
    }

    /**
     * Use this method to set new state in private chat for a user
     * @param user_id Target user id
     * @param name state name
     */
    public void setState(long user_id, String name){
        storage.save(user_id, name);
    }

    /**
     * Use this method to clear an existing state when it is no longer needed in a group/supergroup chat for a user.
     * @param chat_id Unique identifier for the target chat
     * @param user_id Target user id
     */
    public void clearState(long chat_id, long user_id){
        storage.clear(chat_id, user_id);
    }

    /**
     * Use this method to clear an existing state when it is no longer needed in a private chat for a user.
     * @param user_id Target user id
     */
    public void clearState(long user_id){
        storage.clear(user_id);
    }

    /**
     * Use this method to retrieve saved state data in a group/supergroup chat for a user
     * @param chat_id Unique identifier for the target chat
     * @param user_id Target user id
     * @return {@link Map}
     */
    public Map<String, Object> getStateData(long chat_id, long user_id){
        return storage.getData(chat_id, user_id);
    }

    /**
     * Use this method to retrieve saved state data in a private chat for a user
     * @param user_id Target user id
     * @return {@link Map}
     */
    public Map<String, Object> getStateData(long user_id){
        return storage.getData(user_id);
    }

    /**
     * Use this method to receive incoming updates using long polling
     * @return {@link io.github.natanimn.requests.get.GetUpdates}
     */
    public GetUpdates getUpdates(){
        return new GetUpdates(requestSender);
    }
}
