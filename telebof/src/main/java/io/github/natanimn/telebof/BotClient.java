package io.github.natanimn.telebof;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.Proxy;

import java.util.*;

import io.github.natanimn.telebof.annotations.*;
import io.github.natanimn.telebof.annotations.meta.*;
import io.github.natanimn.telebof.exceptions.*;
import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.log.BotLog;
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


/**
 * Main class of Telebof library
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
final public class BotClient {
    record UpdateInfo(TelegramUpdate update, Updates uname){}

    record RequestInfo(String token, boolean test, Proxy proxy, String localApi){}

    record GetUpdateInfo(int limit, int timeout, Updates[] allowed){}

    private Integer offset;
    private final AtomicBoolean stopPolling = new AtomicBoolean(false);
    private boolean skipOldUpdates;
    private final ExecutorService executor;
    private User bot;
    private final StateMemoryStorage storage;
    private final Dispatcher dispatcher;
    private final RequestInfo requestInfo;
    private final GetUpdateInfo getUpdateInfo;
    public BotContext context;
    private Boolean isConnected;
    private ExecutorService pollingExecutor;
    private GetUpdates getUpdates;
    private static final Map<Function<Update, TelegramUpdate>, Updates> updateMap = new LinkedHashMap<>();

    static {
        updateMap.put(Update::getMessage, Updates.MESSAGE);
        updateMap.put(Update::getCallbackQuery, Updates.CALLBACK_QUERY);
        updateMap.put(Update::getInlineQuery, Updates.INLINE_QUERY);
        updateMap.put(Update::getChannelPost, Updates.CHANNEL_POST);
        updateMap.put(Update::getChatMember, Updates.MY_CHAT_MEMBER);
        updateMap.put(Update::getEditedMessage, Updates.EDITED_MESSAGE);
        updateMap.put(Update::getEditedChannelPost, Updates.EDITED_CHANNEL_POST);
        updateMap.put(Update::getPoll, Updates.POLL);
        updateMap.put(Update::getChatMember, Updates.CHAT_MEMBER);
        updateMap.put(Update::getMessageReaction, Updates.MESSAGE_REACTION);
        updateMap.put(Update::getMessageReactionCount, Updates.MESSAGE_REACTION_COUNT);
        updateMap.put(Update::getChatBoost, Updates.CHAT_BOOST);
        updateMap.put(Update::getRemovedChatBoost, Updates.REMOVED_CHAT_BOOST);
        updateMap.put(Update::getPreCheckoutQuery, Updates.PRE_CHECKOUT_QUERY);
        updateMap.put(Update::getShippingQuery, Updates.SHIPPING_QUERY);
        updateMap.put(Update::getChatJoinRequest, Updates.CHAT_JOIN_REQUEST);
        updateMap.put(Update::getChosenInlineResult, Updates.CHOSEN_INLINE_RESULT);
        updateMap.put(Update::getPollAnswer, Updates.POLL_ANSWER);
        updateMap.put(Update::getBusinessConnection, Updates.BUSINESS_CONNECTION);
        updateMap.put(Update::getBusinessMessage, Updates.BUSINESS_MESSAGE);
        updateMap.put(Update::getEditedBusinessMessage, Updates.EDITED_BUSINESS_MESSAGE);
        updateMap.put(Update::getDeletedBusinessMessages, Updates.DELETED_BUSINESS_MESSAGES);
        updateMap.put(Update::getPurchasedPaidMedia, Updates.PURCHASED_PAID_MEDIA);
    }


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
        this.dispatcher = new Dispatcher<>();
        this.isConnected = false;

        var getUpdatesApi = new Api(
                requestInfo.token(),
                requestInfo.test(),
                requestInfo.proxy(),
                requestInfo.localApi()
        );

        getUpdates = new GetUpdates(getUpdatesApi)
                .allowedUpdates(getUpdateInfo.allowed())
                .limit(getUpdateInfo.limit())
                .timeout(getUpdateInfo.timeout());

        this.pollingExecutor = Executors.newSingleThreadExecutor();

        Api api = new Api(botToken, useTestServer, proxy, localBotApiUrl);

        this.context = new BotContext(api, storage);
        BotLog.info("BotClient initialized");
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

    /**
     * A builder of <b>BotClient</b> class.
     * Through this class, you create a new object of <b>BotClient</b> class.
     */
    public static class Builder {
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
         * @return {@link Builder}
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
         * @param allowedUpdates A JSON-serialized list of the update types you want your bot to receive.
         *                         Specify an empty list to receive all update types except {@link Update#getChatMember()}, {@link Update#getMessageReaction()},
         *                         and {@link Update#getMessageReactionCount()} (default). If not specified, the previous setting will be used.
         * @return {@link Builder}
         */
        public Builder allowedUpdates(Updates[] allowedUpdates) {
            this.allowedUpdates = allowedUpdates;
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
     * Use this method to register new handler for incoming {@link Update#getMessage()} update.
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
     * Use this method to register new handler for incoming {@link Update#getCallbackQuery()} update.
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
     * Use this method to register new handler for incoming {@link Update#getInlineQuery()} update.
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
     * Use this method to register new handler for incoming {@link Update#getPoll()} update.
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
     * Use this method to register new handler for incoming {@link Update#getMyChatMember()} update.
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
     * Use this method to register new handler for incoming {@link Update#getPollAnswer()} update.
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
     * Use this method to register new handler for incoming {@link Update#getPreCheckoutQuery()} update.
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
     * Use this method to register new handler for incoming {@link Update#getChatMember()} update.
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
     * Use this method to register new handler for incoming {@link Update#getEditedMessage()} update.
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
     * Use this method to register new handler for incoming {@link Update#getChannelPost()} update.
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
     * Use this method to register new handler for incoming {@link Update#getEditedChannelPost()} update.
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
     * Use this method to register new handler for incoming {@link Update#getChatJoinRequest()} update.
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
     * Use this method to register new handler for incoming {@link Update#getChosenInlineResult()} update.
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
     * Use this method to register new handler for incoming {@link Update#getShippingQuery()} update.
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
     * Use this method to register new handler for incoming {@link Update#getMessageReaction()} update.
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
     * Use this method to register new handler for incoming {@link Update#getMessageReactionCount()} update.
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
     * Use this method to register new handler for incoming {@link Update#getChatBoost()} update.
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
     * Use this method to register new handler for incoming {@link Update#getRemovedChatBoost()} update.
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
     * Use this method to register new handler for incoming {@link Update#getBusinessConnection()} update.
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
     * Use this method to register new handler for incoming {@link Update#getBusinessMessage()} update.
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
     * Use this method to register new handler for incoming {@link Update#getEditedBusinessMessage()} update.
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
     * Use this method to register new handler for incoming {@link Update#getDeletedBusinessMessages()} update.
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
     * Use this method to register new handler for incoming {@link Update#getPurchasedPaidMedia()} update.
     * @param executor pre-defined or user-defined filter
     * @param handler a handler to be executed
     */
    @SuppressWarnings("unchecked")
    public void onPurchasedPaidMedia(FilterExecutor executor, UpdateHandler<PaidMediaPurchased> handler){
        LinkedHashMap<FilterExecutor, UpdateHandler<PaidMediaPurchased>> map = new LinkedHashMap<>();
        map.put(executor, handler);
        this.dispatcher.add(Updates.PURCHASED_PAID_MEDIA, map);
    }

    private void addMessageHandler(MessageHandler handler, MethodHandle method){
        MessageHandlerMeta meta = new MessageHandlerMeta(handler, method);
        onMessage(meta::matches, method::invoke);

    }

    private void addEditedMessageHandler(EditedMessageHandler handler, MethodHandle method) {
        var meta = new EditedMessageHandlerMeta(handler, method);
        onEditedMessage(meta::matches, method::invoke);
    }

    private void addCallbackHandler(CallbackHandler handler, MethodHandle method){
        var meta = new CallbackHandlerMeta(handler, method);
        onCallback(meta::matches, method::invoke);
    }

    private void addChannelPostHandler(ChannelPostHandler handler, MethodHandle method) {
        var meta = new ChannelPostHandlerMeta(handler, method);
        onChannelPost(meta::matches, method::invoke);
    }

    private void addEditedChannelPostHandler(EditedChannelPostHandler handler, MethodHandle method) {
        var meta = new EditedChannelPostHandlerMeta(handler, method);
        onEditedChannelPost(meta::matches, method::invoke);
    }

    private void addInlineHandler(InlineHandler handler, MethodHandle method) {
        var meta = new InlineHandlerMeta(handler, method);
        onInline(meta::matches, method::invoke);
    }

    private void addPollHandler(PollHandler handler, MethodHandle method) {
        var meta = new PollHandlerMeta(handler, method);
        onPoll(meta::matches, method::invoke);
    }

    private void addPollAnswerHandler(PollAnswerHandler handler, MethodHandle method) {
        var meta = new PollAnswerHandlerMeta(handler, method);
        onPollAnswer(meta::matches, method::invoke);
    }

    private void addReactionHandler(ReactionHandler handler, MethodHandle method) {
        var meta = new ReactionHandlerMeta(handler, method);
        onReaction(meta::matches, method::invoke);
    }

    private void addReactionCountHandler(ReactionCountHandler handler, MethodHandle method) {
        var meta = new ReactionCountHandlerMeta(handler, method);
        onReactionCount(meta::matches, method::invoke);
    }

    private void addChatJoinRequestHandler(ChatJoinRequestHandler handler, MethodHandle method) {
        var meta = new ChatJoinRequestHandlerMeta(handler, method);
        onChatJoinRequest(meta::matches, method::invoke);
    }

    private void addPurchasedPaidMediaHandler(PurchasedPaidMediaHandler handler, MethodHandle method) {
        var meta = new PurchasedPaidMediaHandlerMeta(handler, method);
        onPurchasedPaidMedia(meta::matches, method::invoke);
    }

    private void addPreCheckoutHandler(PreCheckoutHandler handler, MethodHandle method) {
        var meta = new PreCheckoutHandlerMeta(handler, method);
        onPreCheckout(meta::matches, method::invoke);
    }

    private void addShippingHandler(ShippingHandler handler, MethodHandle method) {
        var meta = new ShippingHandlerMeta(handler, method);
        onShipping(meta::matches, method::invoke);
    }

    private void addChatBoostHandler(ChatBoostHandler handler, MethodHandle method) {
        var meta = new ChatBoostHandlerMeta(handler, method);
        onChatBoost(meta::matches, method::invoke);
    }

    private void addChatMemberHandler(ChatMemberHandler handler, MethodHandle method) {
        var meta = new ChatMemberHandlerMeta(handler, method);
        onChatMember(meta::matches, method::invoke);
    }

    private void addMyChatMemberHandler(MyChatMemberHandler handler, MethodHandle method) {
        var meta = new MyChatMemberHandlerMeta(handler, method);
        onMyChatMember(meta::matches, method::invoke);
    }

    private void addRemovedChatBoostHandler(RemovedChatBoostHandler handler, MethodHandle method) {
        var meta = new RemovedChatBoostHandlerMeta(handler, method);
        onRemovedChatBoost(meta::matches, method::invoke);
    }

    private void addBusinessMessageHandler(BusinessMessageHandler handler, MethodHandle method) {
        var meta = new BusinessMessageHandlerMeta(handler, method);
        onBusinessMessage(meta::matches, method::invoke);
    }

    private void addBusinessConnectionHandler(BusinessConnectionHandler handler, MethodHandle method) {
        var meta = new BusinessConnectionHandlerMeta(handler, method);
        onBusinessConnection(meta::matches, method::invoke);
    }

    private void addDeletedBusinessMessageHandler(DeletedBusinessMessageHandler handler, MethodHandle method) {
        var meta = new DeletedBusinessMessageHandlerMeta(handler, method);
        onDeletedBusinessMessage(meta::matches, method::invoke);
    }

    private void addEditedBusinessMessageHandler(EditedBusinessMessageHandler handler, MethodHandle method) {
        var meta = new EditedBusinessMessageHandlerMeta(handler, method);
        onEditedBusinessMessage(meta::matches, method::invoke);
    }

    private void addChosenInlineHandler(ChosenInlineHandler handler, MethodHandle method) {
        var meta = new ChosenInlineHandlerMeta(handler, method);
        onChosenInlineResult(meta::matches, method::invoke);
    }

    private void addToList(MethodHandle handle, Method method, List<AnnotatedHandler> annotatedMethods){

        for (var anno : method.getDeclaredAnnotationsByType(MessageHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(CallbackHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(EditedMessageHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChannelPostHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChannelPostHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(EditedChannelPostHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(InlineHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(PollHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(PollAnswerHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ReactionHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ReactionCountHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChatJoinRequestHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(PurchasedPaidMediaHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(PreCheckoutHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ShippingHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChatBoostHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChatMemberHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(MyChatMemberHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(RemovedChatBoostHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(BusinessMessageHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(BusinessConnectionHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(DeletedBusinessMessageHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(EditedBusinessMessageHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
        for (var anno : method.getDeclaredAnnotationsByType(ChosenInlineHandler.class))
            annotatedMethods.add(new AnnotatedHandler(handle, anno, anno.priority()));
    }

    public void addHandler(Object object) {
        try {
            var clazz = object.getClass();
            var lookup = MethodHandles.privateLookupIn(clazz, MethodHandles.lookup());
            List<AnnotatedHandler> annotatedMethods = new ArrayList<>();

            for (var method : clazz.getDeclaredMethods()) {
                var handle = lookup.unreflect(method);

                if (!Modifier.isStatic(method.getModifiers())) handle = handle.bindTo(object);
                addToList(handle, method, annotatedMethods);
            }

            annotatedMethods.sort(Comparator.comparingInt(AnnotatedHandler::getOrder));

            for (AnnotatedHandler handler : annotatedMethods) {
                if (handler.getAnnotation() instanceof MessageHandler mh)
                    addMessageHandler(mh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof EditedMessageHandler emh)
                    addEditedMessageHandler(emh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof CallbackHandler ch)
                    addCallbackHandler(ch, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ChannelPostHandler cph)
                    addChannelPostHandler(cph, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof EditedChannelPostHandler ecph)
                    addEditedChannelPostHandler(ecph, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof InlineHandler ih)
                    addInlineHandler(ih, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof PollHandler ph)
                    addPollHandler(ph, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof PollAnswerHandler pah)
                    addPollAnswerHandler(pah, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ReactionHandler rh)
                    addReactionHandler(rh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ReactionCountHandler rch)
                    addReactionCountHandler(rch, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ChatJoinRequestHandler cjrh)
                    addChatJoinRequestHandler(cjrh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof PurchasedPaidMediaHandler ppmh)
                    addPurchasedPaidMediaHandler(ppmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof PreCheckoutHandler pch)
                    addPreCheckoutHandler(pch, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ShippingHandler sh)
                    addShippingHandler(sh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ChatBoostHandler cbh)
                    addChatBoostHandler(cbh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ChatMemberHandler cmh)
                    addChatMemberHandler(cmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof MyChatMemberHandler mcmh)
                    addMyChatMemberHandler(mcmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof RemovedChatBoostHandler rcbh)
                    addRemovedChatBoostHandler(rcbh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof BusinessMessageHandler bmh)
                    addBusinessMessageHandler(bmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof BusinessConnectionHandler bch)
                    addBusinessConnectionHandler(bch, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof DeletedBusinessMessageHandler dbmh)
                    addDeletedBusinessMessageHandler(dbmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof EditedBusinessMessageHandler ebmh)
                    addEditedBusinessMessageHandler(ebmh, handler.getMethodHandle());
                else if (handler.getAnnotation() instanceof ChosenInlineHandler cih)
                    addChosenInlineHandler(cih, handler.getMethodHandle());
            }

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    private <T extends TelegramUpdate> void executeUpdate(
            Updates updateName,
            Filter filter,
            TelegramUpdate update
    ){
        List<LinkedHashMap<FilterExecutor, UpdateHandler<T>>> execs = dispatcher.get(updateName);
        if (execs != null) {
            for (LinkedHashMap<FilterExecutor, UpdateHandler<T>> exec : execs) {
                for (Map.Entry<FilterExecutor, UpdateHandler<T>> entry : exec.entrySet()) {
                    FilterExecutor _filter = entry.getKey();
                    UpdateHandler<T> handler = entry.getValue();
                    if (_filter.execute(filter)) {
                        executor.execute(() -> {
                            try {
                                handler.invoke(context, (T) update);
                            } catch (Throwable e) {
                                throw new RuntimeException(e);
                            } finally {
                                BotLog.info("Task executed");
                            }
                        });
                        return;
                    }
                }
            }
        }
    }

    /**
     * Stop the bot
     */
    synchronized public void stop(){
        stopPolling.set(true);
    }

    public User me(){
        if (!isConnected)
            throw new TelegramError("The bot hasn't started yet");
        return bot;
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
           setOffset(updates.get(count - 1).getUpdateId() + 1);
           processUpdates(updates);
        }
    }

    private void shutDown(){
        executor.shutdownNow();
        pollingExecutor.shutdownNow();
        System.exit(1);
    }

    private void runOnNewThread(){
        while (!stopPolling.get()){
            try{
                retrieveUpdates();
            } catch (TelegramError | InterruptedException err) {
                stop();
                err.printStackTrace();
                shutDown();
                BotLog.info("Polling stopped");
            } catch (FloodError error){
                int delay = error.parameters.getRetryAfter();
                BotLog.error(error.description);
                error.printStackTrace();
                BotClient.this.sleep(delay);
            } catch (TelegramApiException apiException){
                BotLog.error(apiException.description);
                apiException.printStackTrace();
            } catch (TimeoutException e) {
                sleep(1);
            } catch (ConnectionError connectionError){
                BotLog.error(connectionError.getMessage());
                System.err.println("Connection error. Trying after 5 seconds");
                this.sleep(5);
            } catch (RuntimeException exception ) {
                BotLog.error(exception.getMessage());
                exception.printStackTrace();
            }
        }
        shutDown();
    }

    /**
     * Use this method to run the bot using long polling
     */
    public void startPolling(){
        BotLog.info("Bot started running via longPolling");
//        this.bot         = this.context.getMe().exec();
        pollingExecutor.submit(() -> {
            this.isConnected = true;
            runOnNewThread();

        });

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
