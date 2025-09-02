package io.github.natanimn.telebof;

import java.net.Proxy;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import io.github.natanimn.telebof.exceptions.ConnectionError;
import io.github.natanimn.telebof.exceptions.FloodError;
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.exceptions.TelegramError;
import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.requests.get.GetUpdates;
import io.github.natanimn.telebof.states.StateMemoryStorage;
import io.github.natanimn.telebof.types.updates.*;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.filters.Filter;
import io.github.natanimn.telebof.filters.FilterExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

record UpdateInfo(TelegramUpdate update, Updates uname){}

record RequestInfo(String token, boolean test, Proxy proxy, String localApi){}

record GetUpdateInfo(int limit, int timeout, Updates[] allowed){}

/**
 * Main class of Telebof library
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
final public class BotClient {
    private Integer offset;
    private final AtomicBoolean stopPolling = new AtomicBoolean(false);
    private boolean skipOldUpdates;
    private ExecutorService executor;
    private User bot;
    private final StateMemoryStorage storage;
    private Dispatcher dispatcher;
    private RequestInfo requestInfo;
    private GetUpdateInfo getUpdateInfo;
    public BotContext context;
    private Boolean isConnected;
    private GetUpdates getUpdates;

    /**
     * @param botToken bot token obtained from @BotFather
     * @param skipOldUpdates skip last 24 hours update(supported on long polling)
     * @param limit number of updates to receive(supported on long polling)
     * @param offset offset (supported on long polling)
     * @param timeout timeout (supported on long polling)
     * @param allowedUpdates allowed updates to receive
     * @param proxy custom proxy
     * @param localBotApiUrl local bot api url
     * @param useTestServer test server
     * @param numThreads number of threads to run handlers parallel
     */
    private BotClient(
            String botToken,
            boolean skipOldUpdates,
            int limit,
            Integer offset,
            int timeout,
            Updates[] allowedUpdates,
            Proxy proxy,
            String localBotApiUrl,
            boolean useTestServer,
            int numThreads
    ) {

        this.skipOldUpdates = skipOldUpdates;
        this.getUpdateInfo = new GetUpdateInfo(limit, timeout, allowedUpdates);
        this.offset = offset;
        this.requestInfo = new RequestInfo(botToken, useTestServer, proxy, localBotApiUrl);
        this.storage = new StateMemoryStorage();
        this.executor  = Executors.newFixedThreadPool(numThreads);
        this.dispatcher = new Dispatcher();
        this.isConnected = false;

        BotLog.info("BotClient initialized");

        var request = new Api(
                requestInfo.token(),
                requestInfo.test(),
                requestInfo.proxy(),
                requestInfo.localApi()
        );

        var getUpdatesApi = new Api(
                requestInfo.token(),
                requestInfo.test(),
                requestInfo.proxy(),
                requestInfo.localApi()
        );

        this.getUpdates = new GetUpdates(getUpdatesApi)
                .allowedUpdates(getUpdateInfo.allowed())
                .limit(getUpdateInfo.limit())
                .timeout(getUpdateInfo.timeout());

        this.context = new BotContext(
                request,
                storage
        );
    }

    public BotClient(String botToken){
        this(
                botToken,
                true,
                100,
                null,
                20,
                null,
                null,
                null,
                false,
                2
        );
    }

    public static class Builder {
        /**
         * A builder of <b>BotClient</b> class.
         * Through this class, you create a new object of <b>BotClient</b> class.
         */
        private final String botToken;
        private String localBotApiUrl;
        private boolean skipOldUpdates;
        private Proxy proxy;
        private int limit;
        private Integer offset;
        private int timeout;
        private Updates[] allowedUpdates;
        private boolean useTestServer;
        private int numThreads;
        public Builder(String botToken){
            this.botToken = botToken;
            this.timeout = 20;
            this.localBotApiUrl = null;
            this.skipOldUpdates = true;
            this.limit = 100;
            this.allowedUpdates = null;
            this.offset = null;
            this.proxy = null;
            this.useTestServer = false;
            this.numThreads = 2;
        }

        /**
         * Optional. Default is 2
         * @param numThreads number of threads
         * @return {@link Builder}
         */
        public Builder numThreads(int numThreads){
            this.numThreads = numThreads;
            return this;
        }

        /**
         * Optional
         * @param localBotApiUrl local bot api url.
         * @return {@link Builder}
         * @see <a href="https://core.telegram.org/bots/api#using-a-local-bot-api-server">Using local bot api server</a>
         */
        public Builder localBotApiUrl(String localBotApiUrl){
            this.localBotApiUrl = localBotApiUrl;
            return this;
        }

        /**
         * Optional
         * @param skip skip last 24 hours update(supported on long polling)
         * @return {@link Builder}
         */
        public Builder skipOldUpdates(boolean skip){
            this.skipOldUpdates = skip;
            return this;
        }

        /**
         * Optional
         * @param proxy custom proxy server
         * @return {@link Builder}
         */
        public Builder proxy(Proxy proxy){
            this.proxy = proxy;
            return this;
        }

        /**
         * Optional
         * @param limit limit number of updates to receive(supported on long polling)
         * @return {@link }
         */
        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Optional
         * @param timeout Timeout in seconds for long polling. Default is 20
         * @return {@link Builder}
         */
        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Optional
         * @param offset Identifier of the first update to be returned.
         * @return {@link Builder}
         */
        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Optional
         * @param allowed_updates A JSON-serialized list of the update types you want your bot to receive.
         *                         Specify an empty list to receive all update types except {@link Update#chat_member}, {@link Update#message_reaction},
         *                         and {@link Update#message_reaction_count} (default). If not specified, the previous setting will be used.
         * @return {@link Builder}
         */
        public Builder allowedUpdates(Updates[] allowed_updates) {
            this.allowedUpdates = allowed_updates;
            return this;
        }

        /**
         * Optional
         * @param useTestServer Run the bot on test server
         * @return {@link Builder}
         */
        public Builder useTestServer(boolean useTestServer){
            this.useTestServer = useTestServer;
            return this;
        }

        public BotClient build(){
            return new BotClient(
                    botToken,
                    skipOldUpdates,
                    limit,
                    offset,
                    timeout,
                    allowedUpdates,
                    proxy,
                    localBotApiUrl,
                    useTestServer,
                    numThreads
            );
        }

    }

    /**
     * Use this method to register new handler for incoming {@link Update#message} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onMessage(FilterExecutor executor, UpdateHandler<Message> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.MESSAGE, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#callback_query} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onCallback(FilterExecutor executor, UpdateHandler<CallbackQuery> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<CallbackQuery>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CALLBACK_QUERY, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#inline_query} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onInline(FilterExecutor executor, UpdateHandler<InlineQuery> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<InlineQuery>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.INLINE_QUERY, map);

    }


    /**
     * Use this method to register new handler for incoming {@link Update#poll} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onPoll(FilterExecutor executor, UpdateHandler<Poll> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Poll>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.POLL, map);

    }


    /**
     * Use this method to register new handler for incoming {@link Update#my_chat_member} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onMyChatMember(FilterExecutor executor, UpdateHandler<ChatMemberUpdated> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChatMemberUpdated>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.MY_CHAT_MEMBER, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#poll_answer} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onPollAnswer(FilterExecutor executor, UpdateHandler<PollAnswer> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<PollAnswer>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.POLL_ANSWER, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#pre_checkout_query} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onPreCheckout(FilterExecutor executor, UpdateHandler<PreCheckoutQuery> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<PreCheckoutQuery>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.PRE_CHECKOUT_QUERY, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#chat_member} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onChatMember(FilterExecutor executor, UpdateHandler<ChatMemberUpdated> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChatMemberUpdated>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CHAT_MEMBER, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#edited_message} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onEditedMessage(FilterExecutor executor, UpdateHandler<Message> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.EDITED_MESSAGE, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#channel_post} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onChannelPost(FilterExecutor executor, UpdateHandler<Message> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CHANNEL_POST, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#edited_channel_post} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onEditedChannelPost(FilterExecutor executor, UpdateHandler<Message> handler) {
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.EDITED_CHANNEL_POST, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#chat_join_request} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onChatJoinRequest(FilterExecutor executor, UpdateHandler<ChatJoinRequest> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChatJoinRequest>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CHAT_JOIN_REQUEST, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#chosen_inline_result} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onChosenInlineResult(FilterExecutor executor, UpdateHandler<ChosenInlineResult> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChosenInlineResult>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CHOSEN_INLINE_RESULT, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#shipping_query} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onShipping(FilterExecutor executor, UpdateHandler<ShippingQuery> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ShippingQuery>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.SHIPPING_QUERY, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#message_reaction} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onReaction(FilterExecutor executor, UpdateHandler<MessageReactionUpdated> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<MessageReactionUpdated>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.MESSAGE_REACTION, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#message_reaction_count} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onReactionCount(FilterExecutor executor, UpdateHandler<MessageReactionCountUpdated> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<MessageReactionCountUpdated>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.MESSAGE_REACTION_COUNT, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#chat_boost} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onChatBoost(FilterExecutor executor, UpdateHandler<ChatBoostUpdated> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChatBoostUpdated>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.CHAT_BOOST, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#removed_chat_boost} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onRemovedChatBoost(FilterExecutor executor, UpdateHandler<ChatBoostRemoved> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<ChatBoostRemoved>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.REMOVED_CHAT_BOOST, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#business_connection} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onBusinessConnection(FilterExecutor executor, UpdateHandler<BusinessConnection> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<BusinessConnection>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.BUSINESS_CONNECTION, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#business_message} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onBusinessMessage(FilterExecutor executor, UpdateHandler<Message> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.BUSINESS_MESSAGE, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#edited_business_message} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onEditedBusinessMessage(FilterExecutor executor, UpdateHandler<Message> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<Message>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.EDITED_BUSINESS_MESSAGE, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#deleted_business_messages} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onDeletedBusinessMessage(FilterExecutor executor, UpdateHandler<BusinessMessagesDeleted> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<BusinessMessagesDeleted>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.DELETED_BUSINESS_MESSAGES, map);
    }


    /**
     * Use this method to register new handler for incoming {@link Update#purchased_paid_media} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onPurchasedPaidMedia(FilterExecutor executor, UpdateHandler<PaidMediaPurchased> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<PaidMediaPurchased>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.PURCHASED_PAID_MEDIA, map);
    }

    @SuppressWarnings("unchecked")
    private <T extends TelegramUpdate> void executeUpdate(
            Updates updateName,
            Filter filter,
            TelegramUpdate update
    ){
        List<LinkedHashMap<FilterExecutor, UpdateHandler<T>>> execs = dispatcher.get(updateName);
        if (execs != null) {
            try {
                for (LinkedHashMap<FilterExecutor, UpdateHandler<T>> exec : execs) {
                    for (Map.Entry<FilterExecutor, UpdateHandler<T>> entry : exec.entrySet()) {
                        FilterExecutor _filter = entry.getKey();
                        UpdateHandler<T> handler = entry.getValue();
                        if (_filter.execute(filter)) {
                            executor.execute(() -> {
                                handler.invoke(context, (T) update);
                                BotLog.info("Task executed");
                            });
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Stop the bot
     */
    public void stop(){
        stopPolling.set(true);
    }

    public User me(){
        if (!isConnected)
            throw new TelegramError("The bot hasn't started yet");
        return bot;
    }

    private static final Map<Function<Update, TelegramUpdate>, Updates> updateMap = new LinkedHashMap<>();

    static {
        updateMap.put(u -> u.message, Updates.MESSAGE);
        updateMap.put(u -> u.callback_query, Updates.CALLBACK_QUERY);
        updateMap.put(u -> u.inline_query, Updates.INLINE_QUERY);
        updateMap.put(u -> u.channel_post, Updates.CHANNEL_POST);
        updateMap.put(u -> u.my_chat_member, Updates.MY_CHAT_MEMBER);
        updateMap.put(u -> u.edited_message, Updates.EDITED_MESSAGE);
        updateMap.put(u -> u.edited_channel_post, Updates.EDITED_CHANNEL_POST);
        updateMap.put(u -> u.poll, Updates.POLL);
        updateMap.put(u -> u.chat_member, Updates.CHAT_MEMBER);
        updateMap.put(u -> u.message_reaction, Updates.MESSAGE_REACTION);
        updateMap.put(u -> u.message_reaction_count, Updates.MESSAGE_REACTION_COUNT);
        updateMap.put(u -> u.chat_boost, Updates.CHAT_BOOST);
        updateMap.put(u -> u.removed_chat_boost, Updates.REMOVED_CHAT_BOOST);
        updateMap.put(u -> u.pre_checkout_query, Updates.PRE_CHECKOUT_QUERY);
        updateMap.put(u -> u.shipping_query, Updates.SHIPPING_QUERY);
        updateMap.put(u -> u.chat_join_request, Updates.CHAT_JOIN_REQUEST);
        updateMap.put(u -> u.chosen_inline_result, Updates.CHOSEN_INLINE_RESULT);
        updateMap.put(u -> u.poll_answer, Updates.POLL_ANSWER);
        updateMap.put(u -> u.business_connection, Updates.BUSINESS_CONNECTION);
        updateMap.put(u -> u.business_message, Updates.BUSINESS_MESSAGE);
        updateMap.put(u -> u.edited_business_message, Updates.EDITED_BUSINESS_MESSAGE);
        updateMap.put(u -> u.deleted_business_messages, Updates.DELETED_BUSINESS_MESSAGES);
        updateMap.put(u -> u.purchased_paid_media, Updates.PURCHASED_PAID_MEDIA);
    }

    private UpdateInfo getInfoFromUpdate(Update update) {
        for (Map.Entry<Function<Update, TelegramUpdate>, Updates> entry : updateMap.entrySet()) {
            TelegramUpdate val = entry.getKey().apply(update);
            if (val != null) {
                return new UpdateInfo(val, entry.getValue());
            }
        }
        return null;
    }

    /**
     * Process updates retrieved from long polling or webhook
     * @param updates array of {@link Update}
     */
    public void processUpdates(List<Update> updates){
        BotLog.info("Processing updates");
        for (Update update: updates) {
            UpdateInfo info = getInfoFromUpdate(update);
            var filter      = new Filter(update, storage);
            if (info != null)
                executeUpdate(info.uname(), filter, info.update());
        }
    }

    /**
     * Retrieve updates
     * @throws InterruptedException exception
     */
    private void retrieveUpdates() throws InterruptedException {

        if (skipOldUpdates) {
            getUpdates.offset(-1).exec();
            skipOldUpdates = false;
        }

        List<Update> updates = getUpdates.offset(this.offset).exec();

        int count = updates.size();
        BotLog.info(String.format("Received %d updates", count));
        if (!updates.isEmpty()){
           setOffset(updates.get(count - 1).update_id + 1);
           processUpdates(updates);
        }
    }

    /**
     * Use this method to run the bot using long polling
     */
    public void startPolling(){
        BotLog.info("Bot started running via longPolling");
        byte maxRetry    = 10, tried = 0;
        this.bot         = this.context.getMe().exec();
        this.isConnected = true;
        while (!stopPolling.get()){
            try{
                retrieveUpdates();
            } catch (TelegramError var1) {
                throw var1;
            } catch (FloodError error){
                int delay = error.parameters.retry_after;
                BotLog.error(error.description);
                error.printStackTrace();
                BotClient.this.sleep(delay);
            } catch (TelegramApiException apiException){
                    BotLog.error(apiException.description);
                    apiException.printStackTrace();
            } catch (ConnectionError connectionError){
                if (tried == maxRetry) break;
                BotLog.error(connectionError.getMessage());
                System.err.println("Connection error. Trying after 5 seconds");
                this.sleep(5);
                tried += 1;

            } catch (RuntimeException exception ) {
              BotLog.error(exception.getMessage());
              exception.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
        Thread.currentThread().interrupt();
        BotLog.info("Polling stopped");
    }

    private synchronized void setOffset(int offset){
        this.offset = offset;
    }

    private void sleep(int seconds){
        try{
            Thread.sleep(1000L * seconds);
        } catch (Exception exception){
            throw new RuntimeException(exception);
        }
    }
}
