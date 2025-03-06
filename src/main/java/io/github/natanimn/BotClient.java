package io.github.natanimn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.github.natanimn.errors.ConnectionError;
import io.github.natanimn.errors.TelegramError;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.enums.Updates;
import io.github.natanimn.handlers.*;
import io.github.natanimn.requests.*;
import io.github.natanimn.states.StateMemoryStorage;
import io.github.natanimn.types.Update;
import io.github.natanimn.types.User;
import io.github.natanimn.types.WebhookInfo;
import io.github.natanimn.filters.Filter;
import io.github.natanimn.filters.FilterExecutor;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
final public class BotClient {
    private Integer offset;
    private Webhook webhook;
    private final AtomicBoolean stopPolling = new AtomicBoolean(false);
    private boolean skipOldUpdates;
    private final RequestSender requestSender;
    private final ConcurrentLinkedQueue<Update> updatesQueue = new ConcurrentLinkedQueue<>();
    private final LinkedHashMap<FilterExecutor, MessageHandler> messageHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, CallbackHandler> callbackQueryHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, InlineHandler> inlineQueryHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ChannelPostHandler> channelPostHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, MyChatMemberHandler> myChatMemberHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, EditedMessageHandler> editedMessages = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, PollHandler> pollHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, PollAnswerHandler> pollAnswerHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ChatMemberHandler> chatMemberHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ChatJoinRequestHandler> chatJoinRequestHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, PreCheckoutHandler> preCheckoutHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, EditedChannelPostHandler> editedChannelPostHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ChosenInlineResultHandler> chosenInlineResultHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ShippingHandler> shippingHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, MessageReactionHandler> messageReactionHandler = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, MessageReactionCountHandler> messageReactionCountUpdated = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, ChatBoostHandler> chatBoostHandler = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, RemovedChatBoostHandler> chatBoostRemoved = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, BusinessConnectionHandler> businessConnectionHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, BusinessMessageHandler> businessMessageHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, EditedBusinessMessageHandler> editedBusinessMessageHandlers = new LinkedHashMap<>();
    private final LinkedHashMap<FilterExecutor, DeletedBusinessMessageHandler> deletedBusinessMessageHandlers = new LinkedHashMap<>();

    private Filter filter;
    private final GetUpdates getUpdates;
    private User bot;
    private final StateMemoryStorage storage;
    public BotContext context;
    private FilterExecutor filterExecutor;


    /**
     * @param botToken obtained from <a href="https://t.me/botfather">BotFather</a>
     *
     * @param parseMode default parseMode
     */
    private BotClient(String botToken, boolean log, boolean skipOldUpdates, int limit, Integer offset,
                      int timeout, Updates[] allowedUpdates, ParseMode parseMode, Proxy proxy, String localBotApiUrl,
                      boolean useTestServer) {
        this.skipOldUpdates = skipOldUpdates;

        this.requestSender = new RequestSender(botToken, useTestServer, proxy, localBotApiUrl);
        this.offset = offset;
        this.getUpdates = new GetUpdates(requestSender)
                    .allowedUpdates(allowedUpdates)
                    .limit(limit)
                    .timeout(timeout);
        this.storage = new StateMemoryStorage();
        this.context = new BotContext(null, requestSender, storage, parseMode);
        if (log) BotLog.logger.setLevel(Level.FINE);
        else BotLog.logger.setLevel(Level.OFF);

        BotLog.info("BotClient initialized");
    }

    public BotClient(String botToken){
        this(botToken, false, true, 100, null, 20, null, null, null, null, false);
    }

    public static class Builder {
        /**
         * A builder of <b>BotClient</b> class.
         * Through this class, you create a new object of <b>BotClient</b> class.
         * @apiNote This class is builder of the main class.
         *
         */

        private final String botToken;
        private ParseMode parseMode;
        private String localBotApiUrl;
        private boolean skipOldUpdates;
        private Proxy proxy;
        private boolean log;
        private int limit;
        private Integer offset;
        private int timeout;
        private Updates[] allowedUpdates;
        private boolean useTestServer;
        public Builder(String botToken){
            this.botToken = botToken;
            this.timeout = 20;
            this.localBotApiUrl = null;
            this.skipOldUpdates = true;
            this.log = false;
            this.limit = 100;
            this.allowedUpdates = null;
            this.offset = null;
            this.parseMode = null;
            this.proxy = null;
            this.useTestServer = false;
        }


        public Builder parseMode(ParseMode parseMode){
            this.parseMode = parseMode;
            return this;
        }

        public Builder localBotApiUrl(String localBotApiUrl){
            this.localBotApiUrl = localBotApiUrl;
            return this;
        }

        public Builder skipOldUpdates(boolean skip){
            this.skipOldUpdates = skip;
            return this;
        }


        public Builder proxy(Proxy proxy){
            this.proxy = proxy;
            return this;
        }

        public Builder log(boolean log){
            this.log = log;
            return this;
        }

        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        public Builder allowedUpdates(Updates[] allowedUpdates) {
            this.allowedUpdates = allowedUpdates;
            return this;
        }

        public Builder useTestServer(boolean useTestServer){
            this.useTestServer = useTestServer;
            return this;
        }

        public BotClient build(){
            return new BotClient(botToken, log, skipOldUpdates, limit, offset, timeout, allowedUpdates,
                    parseMode, proxy, localBotApiUrl, useTestServer);
        }

    }

    public void onMessage(FilterExecutor filterExecutor, MessageHandler messageHandler){
        messageHandlers.put(filterExecutor, messageHandler);
    }

    public void onMessage(MessageHandler messageHandler){
        messageHandlers.put(filter -> true, messageHandler);
    }

    public void onCallback(FilterExecutor filterExecutor, CallbackHandler callbackHandler){
        callbackQueryHandlers.put(filterExecutor, callbackHandler);
    }

    public void onCallback(CallbackHandler callbackHandler){
        callbackQueryHandlers.put(filter -> true, callbackHandler);
    }

    public void onInline(FilterExecutor filterExecutor, InlineHandler inlineHandler){
        inlineQueryHandlers.put(filterExecutor, inlineHandler);
    }

    public void onInline(InlineHandler inlineHandler){
        inlineQueryHandlers.put(filter -> true, inlineHandler);
    }

    public void onPoll(FilterExecutor filterExecutor, PollHandler pollHandler){
        pollHandlers.put(filterExecutor, pollHandler);
    }

    public void onPoll(PollHandler pollHandler){
        pollHandlers.put(filter -> true, pollHandler);
    }

    public void onMyChatMember(FilterExecutor filterExecutor, MyChatMemberHandler myChatMemberHandler){
        myChatMemberHandlers.put(filterExecutor, myChatMemberHandler);
    }

    public void onMyChatMember(MyChatMemberHandler myChatMemberHandler){
        myChatMemberHandlers.put(filter -> true, myChatMemberHandler);
    }

    public void onPollAnswer(FilterExecutor filterExecutor, PollAnswerHandler pollAnswerHandler){
        pollAnswerHandlers.put(filterExecutor, pollAnswerHandler);
    }

    public void onPollAnswer(PollAnswerHandler pollAnswerHandler){
        pollAnswerHandlers.put(filter -> true, pollAnswerHandler);
    }

    public void onPreCheckout(FilterExecutor filterExecutor, PreCheckoutHandler preCheckoutHandler){
        preCheckoutHandlers.put(filterExecutor, preCheckoutHandler);
    }

    public void onPreCheckout(PreCheckoutHandler preCheckoutHandler){
        preCheckoutHandlers.put(filter -> true, preCheckoutHandler);
    }

    public void onChatMember(FilterExecutor filterExecutor, ChatMemberHandler chatMemberHandler){
        chatMemberHandlers.put(filterExecutor, chatMemberHandler);
    }

    public void onChatMember(ChatMemberHandler chatMemberHandler){
        chatMemberHandlers.put(filter -> true, chatMemberHandler);
    }

    public void onEditedMessage(FilterExecutor filterExecutor, EditedMessageHandler editedMessageHandler){
        editedMessages.put(filterExecutor, editedMessageHandler);
    }

    public void onEditedMessage(EditedMessageHandler editedMessageHandler){
        editedMessages.put(filter -> true, editedMessageHandler);
    }

    public void onChannelPost(FilterExecutor filterExecutor, ChannelPostHandler channelPostHandler){
        channelPostHandlers.put(filterExecutor, channelPostHandler);
    }

    public void onChannelPost(ChannelPostHandler channelPostHandler){
        channelPostHandlers.put(filter -> true, channelPostHandler);
    }

    public void onEditedChannelPost(FilterExecutor filterExecutor, EditedChannelPostHandler editedChannelPostHandler) {
        editedChannelPostHandlers.put(filterExecutor, editedChannelPostHandler);
    }

    public void onEditedChannelPost(EditedChannelPostHandler editedChannelPostHandler) {
        editedChannelPostHandlers.put(filter -> true, editedChannelPostHandler);
    }

    public void onChatJoinRequest(FilterExecutor filterExecutor, ChatJoinRequestHandler chatJoinRequestHandler){
        chatJoinRequestHandlers.put(filterExecutor, chatJoinRequestHandler);
    }

    public void onChatJoinRequest(ChatJoinRequestHandler chatJoinRequestHandler){
        chatJoinRequestHandlers.put(filter -> true, chatJoinRequestHandler);
    }

    public void onChosenInlineResult(FilterExecutor filterExecutor, ChosenInlineResultHandler chosenInlineResult){
        chosenInlineResultHandlers.put(filterExecutor, chosenInlineResult);
    }

    public void onChosenInlineResult(ChosenInlineResultHandler chosenInlineResult){
        chosenInlineResultHandlers.put(filter -> true, chosenInlineResult);
    }

    public void onShipping(FilterExecutor filterExecutor, ShippingHandler shippingHandler){
        shippingHandlers.put(filterExecutor, shippingHandler);
    }

    public void onShipping(ShippingHandler shippingHandler){
        shippingHandlers.put(filter -> true, shippingHandler);
    }

    public void onReaction(FilterExecutor filterExecutor, MessageReactionHandler reactionHandler){
        messageReactionHandler.put(filterExecutor, reactionHandler);
    }

    public void onReaction(MessageReactionHandler reactionHandler){
        messageReactionHandler.put(filter -> true, reactionHandler);
    }

    public void onReactionCount(FilterExecutor filterExecutor, MessageReactionCountHandler reactionCountHandler){
        messageReactionCountUpdated.put(filterExecutor, reactionCountHandler);
    }

    public void onReactionCount(MessageReactionCountHandler reactionCountHandler){
        messageReactionCountUpdated.put(filter -> true, reactionCountHandler);
    }

    public void onChatBoost(FilterExecutor filterExecutor, ChatBoostHandler boostHandler){
        chatBoostHandler.put(filterExecutor, boostHandler);
    }

    public void onChatBoost(ChatBoostHandler boostHandler){
        chatBoostHandler.put(filter -> true, boostHandler);
    }

    public void onRemovedChatBoost(FilterExecutor filterExecutor, RemovedChatBoostHandler removedChatBoost){
        chatBoostRemoved.put(filterExecutor, removedChatBoost);
    }

    public void onRemovedChatBoost(RemovedChatBoostHandler removedChatBoost){
        chatBoostRemoved.put(filter -> true, removedChatBoost);
    }

    public void onBusinessConnection(FilterExecutor filterExecutor, BusinessConnectionHandler businessConnection){
        businessConnectionHandlers.put(filterExecutor, businessConnection);
    }

    public void onBusinessConnection(BusinessConnectionHandler businessConnection){
        businessConnectionHandlers.put(filter -> true, businessConnection);
    }

    public void onBusinessMessage(FilterExecutor filterExecutor, BusinessMessageHandler businessMessage){
        businessMessageHandlers.put(filterExecutor, businessMessage);
    }

    public void onBusinessMessage(BusinessMessageHandler businessMessage){
        businessMessageHandlers.put(filter -> true, businessMessage);
    }

    public void onEditedBusinessMessage(FilterExecutor filterExecutor, EditedBusinessMessageHandler editedBusiness){
        editedBusinessMessageHandlers.put(filterExecutor, editedBusiness);
    }

    public void onEditedBusinessMessage(EditedBusinessMessageHandler editedBusiness){
        editedBusinessMessageHandlers.put(filter -> true, editedBusiness);
    }

    public void onDeletedBusinessMessage(FilterExecutor filterExecutor, DeletedBusinessMessageHandler deletedBusiness){
        deletedBusinessMessageHandlers.put(filterExecutor, deletedBusiness);
    }

    public void onDeletedBusinessMessages(DeletedBusinessMessageHandler deletedBusiness){
        deletedBusinessMessageHandlers.put(filter -> true, deletedBusiness);
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
     * @param webhook holds parameters for webhook.
     * @see <a href="https://core.telegram.org/bots/api#setwebhook">Telegram Documetation</a>
     */
    public void setWebhook(Webhook webhook){
        this.webhook = webhook;
    }

    public WebhookInfo getWebhookInfo(){
        return new GetWebhookInfo(requestSender).exec();
    }

    /**
     * Use this method to remove webhook integration if you decide to back getUpdates.
     *
     * @see <a href="https://core.telegram.org/bots/api#deletewebhook">Delete Webhook</a>
     */

    public void deleteWebhook(){
        new DeleteWebhook(requestSender).exec();
    }


    @SuppressWarnings("unchecked")
    private void processWebhook(){
        try {
            String path = webhook.getPath();
            HttpServer server = HttpServer.create(new InetSocketAddress(webhook.getPort()), 0);
            server.createContext(path, httpExchange -> {
                if (httpExchange.getRequestMethod().equals("POST")){
                    String response = getString(httpExchange);
                    ApiResponse<List<Update>> apiResponse = Util.parseApiResponse(response, Update.class);
                    List<Update> updates = (apiResponse.result);
                    httpExchange.sendResponseHeaders(200, response.length());
                    OutputStream outputStream = httpExchange.getResponseBody();
                    outputStream.write("!".getBytes());
                    outputStream.close();
                    updates.forEach(this::notifyUpdate);
                }
            });

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static String getString(HttpExchange httpExchange) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(httpExchange.getRequestBody(), StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder requestBody = new StringBuilder();

        while(bufferedReader.readLine() != null){
            requestBody.append(bufferedReader.readLine());
        }

        bufferedReader.close();
        return requestBody.toString();
    }


    private void retrieveUpdates(){
        if (skipOldUpdates) {
            getUpdates.offset(-1).exec();
            skipOldUpdates = false;
        }

        List<Update> updates = getUpdates.offset(offset).exec();
        int count = updates.size();
        BotLog.info(String.format("Received %d updates", count));
        if (!updates.isEmpty()) {
            updatesQueue.addAll(updates);
            this.offset = updates.get(count - 1).update_id + 1;
        }
    }

    public void stop(){
        stopPolling.set(false);
    }

     /** This method notifies each of arrived updates.
     *
     * @param update Update class
     */
    public void notifyUpdate(Update update){
        this.context.setUpdate(update);
        this.filter = new Filter(update, storage);
        if (update.message != null) processMessages(update);
        else if (update.callback_query != null) processCallbackQuery(update);
        else if (update.inline_query != null) processInlineQuery(update);
        else if (update.channel_post != null) processChannelPost(update);
        else if (update.my_chat_member != null) processMyChatMember(update);
        else if (update.edited_message != null) processEditedMessages(update);
        else if (update.edited_channel_post != null) processEditedChannelPost(update);
        else if (update.poll != null) processPoll(update);
        else if (update.chat_member != null) processChatMember(update);
        else if (update.message_reaction != null) processMessageReaction(update);
        else if (update.message_reaction_count != null) processReactionCount(update);
        else if (update.chat_boost != null) processChatBoost(update);
        else if (update.removed_chat_boost != null) processRemovedChatBoost(update);
        else if (update.pre_checkout_query != null) processPreCheckoutQuery(update);
        else if (update.shipping_query != null) processShippingQuery(update);
        else if (update.chat_join_request != null) processChatJoinRequest(update);
        else if (update.chosen_inline_result != null) processChosenInlineResult(update);
        else if (update.poll_answer != null) processPollAnswer(update);
        else if (update.business_connection != null) processBusinessConnection(update);
        else if (update.business_message != null) processBusinessMessage(update);
        else if (update.edited_business_message != null) processBusinessMessage(update);
        else if (update.deleted_business_messages != null) processDeletedBusinessMessage(update);

    }

    private void processMessages(Update update) {
        for (Map.Entry<FilterExecutor, MessageHandler> entry: messageHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            MessageHandler messageHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                messageHandler.handle(this.context, update.message);
                break;
            }
        }
    }

    private void processEditedMessages(Update update) {

        for (Map.Entry<FilterExecutor, EditedMessageHandler> entry: editedMessages.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            EditedMessageHandler editedMessageHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                editedMessageHandler.handle(this.context, update.edited_message);
                break;
            }
        }
    }

    private void processChannelPost(Update update) {
        for (Map.Entry<FilterExecutor, ChannelPostHandler> entry: channelPostHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ChannelPostHandler channelPostHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                channelPostHandler.handle(this.context, update.channel_post);
                break;
            }
        }
    }

    private void processEditedChannelPost(Update update) {
        for (Map.Entry<FilterExecutor, EditedChannelPostHandler> entry: editedChannelPostHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            EditedChannelPostHandler editedChannelPostHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                editedChannelPostHandler.handle(this.context, update.edited_channel_post);
                break;
            }
        }
    }

    private void processInlineQuery(Update update) {
        for (Map.Entry<FilterExecutor, InlineHandler> entry: inlineQueryHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            InlineHandler inlineHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                inlineHandler.handle(this.context, update.inline_query);
                break;
            }
        }
    }

    private void processCallbackQuery(Update update) {
        for (Map.Entry<FilterExecutor, CallbackHandler> entry: callbackQueryHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            CallbackHandler callbackHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                callbackHandler.handle(this.context, update.callback_query);
                break;
            }
        }
    }

    private void processChosenInlineResult(Update update) {
        for (Map.Entry<FilterExecutor, ChosenInlineResultHandler> entry: chosenInlineResultHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ChosenInlineResultHandler chosenInlineResultHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                chosenInlineResultHandler.handle(this.context, update.chosen_inline_result);
                break;
            }
        }
    }

    private void processShippingQuery(Update update) {
        for (Map.Entry<FilterExecutor, ShippingHandler> entry: shippingHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ShippingHandler shippingHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                shippingHandler.handle(this.context, update.shipping_query);
                break;
            }
        }
    }

    private void processPreCheckoutQuery(Update update) {
        for (Map.Entry<FilterExecutor, PreCheckoutHandler> entry: preCheckoutHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            PreCheckoutHandler preCheckoutHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                preCheckoutHandler.handle(this.context, update.pre_checkout_query);
                break;
            }
        }
    }

    private void processPoll(Update update){
        for (Map.Entry<FilterExecutor, PollHandler> entry: pollHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            PollHandler pollHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                pollHandler.handle(this.context, update.poll);
                break;
            }
        }
    }

    private void processPollAnswer(Update update) {
        for (Map.Entry<FilterExecutor, PollAnswerHandler> entry: pollAnswerHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            PollAnswerHandler pollAnswerHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                pollAnswerHandler.handle(this.context, update.poll_answer);
                break;
            }
        }
    }

    private void processMyChatMember(Update update) {
        for (Map.Entry<FilterExecutor, MyChatMemberHandler> entry: myChatMemberHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            MyChatMemberHandler myChatMemberHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                myChatMemberHandler.handle(this.context, update.my_chat_member);
                break;
            }
        }
    }

    private void processChatMember(Update update) {
        for (Map.Entry<FilterExecutor, ChatMemberHandler> entry: chatMemberHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ChatMemberHandler chatMemberHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                chatMemberHandler.handle(this.context, update.chat_member);
                break;
            }
        }
    }

    private void processChatJoinRequest(Update update) {
        for (Map.Entry<FilterExecutor, ChatJoinRequestHandler> entry: chatJoinRequestHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ChatJoinRequestHandler chatJoinRequestHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                chatJoinRequestHandler.handle(this.context, update.chat_join_request);
                break;
            }
        }
    }

    private void processMessageReaction(Update update){
        for (Map.Entry<FilterExecutor, MessageReactionHandler> entry: messageReactionHandler.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            MessageReactionHandler reactionHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                reactionHandler.handle(this.context, update.message_reaction);
                break;
            }
        }
    }

    private void processReactionCount(Update update){
        for (Map.Entry<FilterExecutor, MessageReactionCountHandler> entry: messageReactionCountUpdated.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            MessageReactionCountHandler reactionCountHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                reactionCountHandler.handle(this.context, update.message_reaction_count);
                break;
            }
        }
    }

    private void processChatBoost(Update update){
        for (Map.Entry<FilterExecutor, ChatBoostHandler> entry: chatBoostHandler.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            ChatBoostHandler boostHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                boostHandler.handle(this.context, update.chat_boost);
                break;
            }
        }
    }

    private void processDeletedBusinessMessage(Update update){
        for (Map.Entry<FilterExecutor, DeletedBusinessMessageHandler> entry: deletedBusinessMessageHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            DeletedBusinessMessageHandler deletedBusinessMessageHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                deletedBusinessMessageHandler.handle(this.context, update.deleted_business_messages);
                break;
            }
        }
    }

    private void processRemovedChatBoost(Update update){
        for (Map.Entry<FilterExecutor, RemovedChatBoostHandler> entry: chatBoostRemoved.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            RemovedChatBoostHandler removedChatBoostHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                removedChatBoostHandler.handle(this.context, update.removed_chat_boost);
                break;
            }
        }
    }

    private void processBusinessMessage(Update update){
        for (Map.Entry<FilterExecutor, BusinessMessageHandler> entry: businessMessageHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            BusinessMessageHandler businessMessageHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                businessMessageHandler.handle(this.context, update.business_message);
                break;
            }
        }
    }

    private void processBusinessConnection(Update update){
        for (Map.Entry<FilterExecutor, BusinessConnectionHandler> entry: businessConnectionHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            BusinessConnectionHandler businessConnectionHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                businessConnectionHandler.handle(this.context, update.business_connection);
                break;
            }
        }
    }

    private void processEditedBusinessMessage(Update update){
        for (Map.Entry<FilterExecutor, EditedBusinessMessageHandler> entry: editedBusinessMessageHandlers.entrySet()){
            FilterExecutor filterExecutor = entry.getKey();
            EditedBusinessMessageHandler editedBusinessMessageHandler = entry.getValue();
            boolean executed = filterExecutor.execute(filter);
            if (executed){
                editedBusinessMessageHandler.handle(this.context, update.edited_business_message);
                break;
            }
        }
    }

    private void startPolling(){

        while (!stopPolling.get()){
            try{
                retrieveUpdates();
                if (!updatesQueue.isEmpty()) updatesQueue.forEach(this::notifyUpdate);
            } catch (TelegramError var1) {
                throw var1;
            } catch (TelegramApiException apiException){
                if (apiException.parameters !=null && apiException.parameters.retry_after != null){
                    int delay = apiException.parameters.retry_after;
                    BotLog.error(String.format("Trying after %d seconds", delay));
                    if (BotLog.logger.getLevel() == Level.OFF)
                        apiException.printStackTrace();
                    else BotLog.error(apiException.description);
                    BotClient.this.sleep(delay);
                } else {
                    if (BotLog.logger.getLevel() == Level.OFF)
                        apiException.printStackTrace();
                    else BotLog.error(apiException.description);
                }
            } catch (ConnectionError connectionError){
                if (BotLog.logger.getLevel() == Level.OFF)
                    connectionError.printStackTrace();
                else BotLog.error(connectionError.getMessage());
                BotClient.this.sleep(3);
            } catch (RuntimeException exception) {
                if (BotLog.logger.getLevel() == Level.OFF)
                    exception.printStackTrace();
                else BotLog.error(exception.getMessage());

            } finally {
                updatesQueue.clear();
            }
        }
       BotLog.info("Polling stopped");
    }


    private void sleep(int seconds){
        try{
            Thread.sleep(1000L * seconds);
        } catch (Exception exception){
            throw new RuntimeException(exception);
        }
    }

    public void run(){
        if (webhook != null){
            BotLog.info("Bot started running via webhook");
            deleteWebhook();
            setWebhook(webhook);
            processWebhook();
        } else {
            BotLog.info("Bot started running via longPolling");
            // deleteWebhook();
            startPolling();
        }
    }

}
