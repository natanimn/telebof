# BotContext Methods Reference

## Webhook Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `setWebhook(String url)` | Specify URL to receive incoming updates via webhook | `url`: Webhook URL | `SetWebhook` |
| `getWebhookInfo()` | Get current webhook information | None | `WebhookInfo` |
| `deleteWebhook()` | Remove webhook integration | None | `void` |

## Bot Information Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getMe()` | Get bot information | None | `GetMe` |
| `logOut()` | Log out from cloud Bot API server | None | `LogOut` |
| `close()` | Close bot instance before moving servers | None | `Close` |

## Message Sending Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `sendMessage(Object chat_id, String text)` | Send text messages | `chat_id`: Target chat, `text`: Message text | `SendMessage` |
| `sendPhoto(Object chat_id, String photo)` | Send photos (file_id or URL) | `chat_id`: Target chat, `photo`: Photo file_id/URL | `SendPhoto` |
| `sendPhoto(Object chat_id, File photo)` | Send photos (upload file) | `chat_id`: Target chat, `photo`: Photo file | `SendPhoto` |
| `sendAudio(Object chat_id, String audio)` | Send audio files (file_id or URL) | `chat_id`: Target chat, `audio`: Audio file_id/URL | `SendAudio` |
| `sendAudio(Object chat_id, File audio)` | Send audio files (upload file) | `chat_id`: Target chat, `audio`: Audio file | `SendAudio` |
| `sendDocument(Object chat_id, String document)` | Send documents (file_id or URL) | `chat_id`: Target chat, `document`: Document file_id/URL | `SendDocument` |
| `sendDocument(Object chat_id, File document)` | Send documents (upload file) | `chat_id`: Target chat, `document`: Document file | `SendDocument` |
| `sendVideo(Object chat_id, String video)` | Send video files (file_id or URL) | `chat_id`: Target chat, `video`: Video file_id/URL | `SendVideo` |
| `sendVideo(Object chat_id, File video)` | Send video files (upload file) | `chat_id`: Target chat, `video`: Video file | `SendVideo` |
| `sendAnimation(Object chat_id, String animation)` | Send animations (file_id or URL) | `chat_id`: Target chat, `animation`: Animation file_id/URL | `SendAnimation` |
| `sendAnimation(Object chat_id, File animation)` | Send animations (upload file) | `chat_id`: Target chat, `animation`: Animation file | `SendAnimation` |
| `sendVoice(Object chat_id, String voice)` | Send voice messages (file_id or URL) | `chat_id`: Target chat, `voice`: Voice file_id/URL | `SendVoice` |
| `sendVoice(Object chat_id, File voice)` | Send voice messages (upload file) | `chat_id`: Target chat, `voice`: Voice file | `SendVoice` |
| `sendVideoNote(Object chat_id, String video_note)` | Send video notes (file_id or URL) | `chat_id`: Target chat, `video_note`: Video note file_id/URL | `SendVideoNote` |
| `sendVideoNote(Object chat_id, File video_note)` | Send video notes (upload file) | `chat_id`: Target chat, `video_note`: Video note file | `SendVideoNote` |
| `sendMediaGroup(Object chat_id, InputMedia[] media)` | Send media group | `chat_id`: Target chat, `media`: Array of input media | `SendMediaGroup` |
| `sendPaidMedia(Object chat_id, short star_count, InputPaidMedia[] media)` | Send paid media | `chat_id`: Target chat, `star_count`: Star count, `media`: Paid media array | `SendPaidMedia` |
| `sendLocation(Object chat_id, double latitude, double longitude)` | Send location | `chat_id`: Target chat, `latitude`: Latitude, `longitude`: Longitude | `SendLocation` |
| `sendVenue(Object chat_id, double latitude, double longitude, String title, String address)` | Send venue information | `chat_id`: Target chat, `latitude`: Latitude, `longitude`: Longitude, `title`: Venue title, `address`: Venue address | `SendVenue` |
| `sendContact(Object chat_id, String phone_number, String first_name)` | Send phone contact | `chat_id`: Target chat, `phone_number`: Phone number, `first_name`: First name | `SendContact` |
| `sendPoll(Object chat_id, String question, InputPollOption[] options)` | Send native poll | `chat_id`: Target chat, `question`: Poll question, `options`: Poll options | `SendPoll` |
| `sendDice(Object chat_id)` | Send dice | `chat_id`: Target chat | `SendDice` |
| `sendChatAction(Object chat_id, ChatAction action)` | Send chat action | `chat_id`: Target chat, `action`: Chat action type | `SendChatAction` |
| `sendGift(long user_id, String gift_id)` | Send gift to user | `user_id`: Target user, `gift_id`: Gift identifier | `SendGift` |
| `sendGift(Object chat_id, String gift_id)` | Send gift to chat | `chat_id`: Target chat, `gift_id`: Gift identifier | `SendGift` |
| `sendSticker(Object chat_id, File sticker)` | Send stickers (upload file) | `chat_id`: Target chat, `sticker`: Sticker file | `SendSticker` |
| `sendSticker(Object chat_id, String sticker)` | Send stickers (file_id or URL) | `chat_id`: Target chat, `sticker`: Sticker file_id/URL | `SendSticker` |
| `sendGame(long chat_id, String game_short_name)` | Send game | `chat_id`: Target chat, `game_short_name`: Game short name | `SendGame` |
| `sendInvoice(Object chat_id, String title, String description, String payload, String currency, LabeledPrice[] prices)` | Send invoice | `chat_id`: Target chat, `title`: Product title, `description`: Product description, `payload`: Invoice payload, `currency`: Currency code, `prices`: Price breakdown | `SendInvoice` |

## Message Management Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `forward(Object chat_id, Object from_chat_id, int message_id)` | Forward message | `chat_id`: Target chat, `from_chat_id`: Source chat, `message_id`: Message ID | `ForwardMessage` |
| `copy(Object chat_id, Object from_chat_id, int message_id)` | Copy message | `chat_id`: Target chat, `from_chat_id`: Source chat, `message_id`: Message ID | `CopyMessage` |
| `forwardMessages(Object chat_id, Object from_chat_id, int[] message_id)` | Forward multiple messages | `chat_id`: Target chat, `from_chat_id`: Source chat, `message_id`: Array of message IDs | `ForwardMessages` |
| `editMessageText(String text, Object chat_id, int message_id)` | Edit message text | `text`: New text, `chat_id`: Target chat, `message_id`: Message ID | `EditMessageText` |
| `editMessageText(String text, String inline_message_id)` | Edit inline message text | `text`: New text, `inline_message_id`: Inline message ID | `EditMessageText` |
| `editMessageCaption(Object chat_id, int message_id)` | Edit message caption | `chat_id`: Target chat, `message_id`: Message ID | `EditMessageCaption` |
| `editMessageCaption(String inline_message_id)` | Edit inline message caption | `inline_message_id`: Inline message ID | `EditMessageCaption` |
| `editMessageMedia(Object chat_id, InputMedia media, int message_id)` | Edit message media | `chat_id`: Target chat, `media`: New media, `message_id`: Message ID | `EditMessageMedia` |
| `editMessageMedia(String inline_message_id, InputMedia media)` | Edit inline message media | `inline_message_id`: Inline message ID, `media`: New media | `EditMessageMedia` |
| `editMessageReplyMarkup(Object chat_id, int message_id)` | Edit message reply markup | `chat_id`: Target chat, `message_id`: Message ID | `EditMessageReplyMarkup` |
| `editMessageReplyMarkup(String inline_message_id)` | Edit inline message reply markup | `inline_message_id`: Inline message ID | `EditMessageReplyMarkup` |
| `editMessageLiveLocation(Object chat_id, double latitude, double longitude, int message_id)` | Edit message live location | `chat_id`: Target chat, `latitude`: New latitude, `longitude`: New longitude, `message_id`: Message ID | `EditMessageLiveLocation` |
| `editMessageLiveLocation(String inline_message_id, double latitude, double longitude)` | Edit inline message live location | `inline_message_id`: Inline message ID, `latitude`: New latitude, `longitude`: New longitude | `EditMessageLiveLocation` |
| `deleteMessage(Object chat_id, int message_id)` | Delete message | `chat_id`: Target chat, `message_id`: Message ID | `DeleteMessage` |
| `deleteMessages(Object chat_id, int[] message_ids)` | Delete multiple messages | `chat_id`: Target chat, `message_ids`: Array of message IDs | `DeleteMessages` |
| `stopPoll(Object chat_id, int message_id)` | Stop poll | `chat_id`: Target chat, `message_id`: Message ID | `StopPoll` |
| `setMessageReaction(Object chat_id, int message_id)` | Set message reaction | `chat_id`: Target chat, `message_id`: Message ID | `SetMessageReaction` |

## File Management Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `downloadFile(String file_path)` | Download file | `file_path`: File path from getFile response | `byte[]` |
| `getFile(String file_id)` | Get file information | `file_id`: File identifier | `GetFile` |

## Chat Management Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `banChatMember(Object chat_id, long user_id)` | Ban chat member | `chat_id`: Target chat, `user_id`: User ID | `BanChatMember` |
| `unbanChatMember(Object chat_id, long user_id)` | Unban chat member | `chat_id`: Target chat, `user_id`: User ID | `UnbanChatMember` |
| `unbanChatSenderChat(Object chat_id, long sender_chat_id)` | Unban chat sender | `chat_id`: Target chat, `sender_chat_id`: Sender chat ID | `UnbanChatSenderChat` |
| `restrictChatMember(Object chat_id, long user_id, ChatPermissions permissions)` | Restrict chat member | `chat_id`: Target chat, `user_id`: User ID, `permissions`: Chat permissions | `RestrictChatMember` |
| `promoteChatMember(Object chat_id, long user_id)` | Promote chat member | `chat_id`: Target chat, `user_id`: User ID | `PromoteChatMember` |
| `setChatAdministratorCustomTitle(Object chat_id, long user_id, String custom_title)` | Set admin custom title | `chat_id`: Target chat, `user_id`: User ID, `custom_title`: Custom title | `SetChatAdministratorCustomTitle` |
| `banChatSenderChat(Object chat_id, long sender_chat_id)` | Ban chat sender | `chat_id`: Target chat, `sender_chat_id`: Sender chat ID | `BanChatSenderChat` |
| `setChatPermissions(Object chat_id, ChatPermissions permissions)` | Set chat permissions | `chat_id`: Target chat, `permissions`: Chat permissions | `SetChatPermissions` |
| `exportChatInviteLink(Object chat_id)` | Export chat invite link | `chat_id`: Target chat | `ExportChatInviteLink` |
| `createChatInviteLink(Object chat_id)` | Create chat invite link | `chat_id`: Target chat | `CreateChatInviteLink` |
| `createChatSubscriptionInviteLink(Object chat_id, int subscription_period, int subscription_price)` | Create subscription invite link | `chat_id`: Target chat, `subscription_period`: Subscription period, `subscription_price`: Subscription price | `CreateChatSubscriptionInviteLink` |
| `editChatInviteLink(Object chat_id, String invite_link)` | Edit chat invite link | `chat_id`: Target chat, `invite_link`: Invite link to edit | `EditChatInviteLink` |
| `editChatSubscriptionInviteLink(Object chat_id, String invite_link)` | Edit subscription invite link | `chat_id`: Target chat, `invite_link`: Invite link to edit | `EditChatSubscriptionInviteLink` |
| `revokeChatInviteLink(Object chat_id, String invite_link)` | Revoke chat invite link | `chat_id`: Target chat, `invite_link`: Invite link to revoke | `RevokeChatInviteLink` |
| `approveChatJoinRequest(Object chat_id, long user_id)` | Approve chat join request | `chat_id`: Target chat, `user_id`: User ID | `ApproveChatJoinRequest` |
| `declineChatJoinRequest(Object chat_id, long user_id)` | Decline chat join request | `chat_id`: Target chat, `user_id`: User ID | `DeclineChatJoinRequest` |
| `setChatPhoto(Object chat_id, File photo)` | Set chat photo | `chat_id`: Target chat, `photo`: New chat photo | `SetChatPhoto` |
| `deleteChatPhoto(Object chat_id)` | Delete chat photo | `chat_id`: Target chat | `DeleteChatPhoto` |
| `setChatTitle(Object chat_id, String title)` | Set chat title | `chat_id`: Target chat, `title`: New chat title | `SetChatTitle` |
| `setChatDescription(Object chat_id, String description)` | Set chat description | `chat_id`: Target chat, `description`: New chat description | `SetChatDescription` |
| `pinChatMessage(Object chat_id, int message_id)` | Pin chat message | `chat_id`: Target chat, `message_id`: Message ID | `PinChatMessage` |
| `unpinChatMessage(Object chat_id)` | Unpin chat message | `chat_id`: Target chat | `UnpinChatMessage` |
| `unpinAllChatMessages(Object chat_id)` | Unpin all chat messages | `chat_id`: Target chat | `UnpinAllChatMessages` |
| `leaveChat(Object chat_id)` | Leave chat | `chat_id`: Target chat | `LeaveChat` |
| `getChat(Object chat_id)` | Get chat information | `chat_id`: Target chat | `GetChat` |
| `getChatAdministrators(Object chat_id)` | Get chat administrators | `chat_id`: Target chat | `GetChatAdministrators` |
| `getChatMemberCount(Object chat_id)` | Get chat member count | `chat_id`: Target chat | `GetChatMemberCount` |
| `getChatMember(Object chat_id, long user_id)` | Get chat member | `chat_id`: Target chat, `user_id`: User ID | `GetChatMember` |
| `setChatStickerSet(Object chat_id, String sticker_set_name)` | Set chat sticker set | `chat_id`: Target chat, `sticker_set_name`: Sticker set name | `SetChatStickerSet` |
| `deleteChatStickerSet(Object chat_id)` | Delete chat sticker set | `chat_id`: Target chat | `DeleteChatStickerSet` |

## Forum Topic Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getForumTopicIconStickers()` | Get forum topic icon stickers | None | `GetForumTopicIconStickers` |
| `createForumTopic(Object chat_id, String name)` | Create forum topic | `chat_id`: Target chat, `name`: Topic name | `CreateForumTopic` |
| `editForumTopic(Object chat_id, int message_thread_id)` | Edit forum topic | `chat_id`: Target chat, `message_thread_id`: Message thread ID | `EditForumTopic` |
| `closeForumTopic(Object chat_id, int message_thread_id)` | Close forum topic | `chat_id`: Target chat, `message_thread_id`: Message thread ID | `CloseForumTopic` |
| `reopenForumTopic(Object chat_id, int message_thread_id)` | Reopen forum topic | `chat_id`: Target chat, `message_thread_id`: Message thread ID | `ReopenForumTopic` |
| `deleteForumTopic(Object chat_id, int message_thread_id)` | Delete forum topic | `chat_id`: Target chat, `message_thread_id`: Message thread ID | `DeleteForumTopic` |
| `unpinAllForumTopicMessages(Object chat_id, int message_thread_id)` | Unpin all forum topic messages | `chat_id`: Target chat, `message_thread_id`: Message thread ID | `UnpinAllForumTopicMessages` |
| `editGeneralForumTopic(Object chat_id, String name)` | Edit general forum topic | `chat_id`: Target chat, `name`: New topic name | `EditGeneralForumTopic` |
| `closeGeneralForumTopic(Object chat_id)` | Close general forum topic | `chat_id`: Target chat | `CloseGeneralForumTopic` |
| `reopenGeneralForumTopic(Object chat_id)` | Reopen general forum topic | `chat_id`: Target chat | `ReopenGeneralForumTopic` |
| `hideGeneralForumTopic(Object chat_id)` | Hide general forum topic | `chat_id`: Target chat | `HideGeneralForumTopic` |
| `unHideGeneralForumTopic(Object chat_id)` | Unhide general forum topic | `chat_id`: Target chat | `UnHideGeneralForumTopic` |
| `unpinAllGeneralForumTopicMessages(Object chat_id)` | Unpin all general forum topic messages | `chat_id`: Target chat | `UnpinAllGeneralForumTopicMessages` |

## Sticker Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getStickerSet(String name)` | Get sticker set | `name`: Sticker set name | `GetStickerSet` |
| `getCustomEmojiStickers(String[] custom_emoji_ids)` | Get custom emoji stickers | `custom_emoji_ids`: Array of custom emoji IDs | `GetCustomEmojiStickers` |
| `uploadStickerFile(long user_id, File sticker, StickerFormat sticker_format)` | Upload sticker file | `user_id`: User ID, `sticker`: Sticker file, `sticker_format`: Sticker format | `UploadStickerFile` |
| `createNewStickerSet(long user_id, String name, String title, InputSticker[] stickers)` | Create new sticker set | `user_id`: User ID, `name`: Sticker set name, `title`: Sticker set title, `stickers`: Array of input stickers | `CreateNewStickerSet` |
| `addStickerToSet(long user_id, String name, InputSticker sticker)` | Add sticker to set | `user_id`: User ID, `name`: Sticker set name, `sticker`: Input sticker | `AddStickerToSet` |
| `setStickerPositionInSet(String sticker, int position)` | Set sticker position in set | `sticker`: Sticker file ID, `position`: New position | `SetStickerPositionInSet` |
| `deleteStickerFromSet(String sticker)` | Delete sticker from set | `sticker`: Sticker file ID | `DeleteStickerFromSet` |
| `setStickerEmojiList(String sticker, String[] emoji_list)` | Set sticker emoji list | `sticker`: Sticker file ID, `emoji_list`: Array of emojis | `SetStickerEmojiList` |
| `setStickerKeywords(String sticker, String[] keywords)` | Set sticker keywords | `sticker`: Sticker file ID, `keywords`: Array of keywords | `SetStickerKeywords` |
| `setStickerMaskPosition(String sticker)` | Set sticker mask position | `sticker`: Sticker file ID | `SetStickerMaskPosition` |
| `setStickerSetTitle(String name, String title)` | Set sticker set title | `name`: Sticker set name, `title`: New title | `SetStickerSetTitle` |
| `replaceStickerInSet(long user_id, String name, String old_sticker, InputSticker sticker)` | Replace sticker in set | `user_id`: User ID, `name`: Sticker set name, `old_sticker`: Old sticker ID, `sticker`: New sticker | `ReplaceStickerInSet` |
| `setStickerSetThumbnail(String name, long user_id, File thumbnail, StickerFormat format)` | Set sticker set thumbnail (upload file) | `name`: Sticker set name, `user_id`: User ID, `thumbnail`: Thumbnail file, `format`: Thumbnail format | `SetStickerSetThumbnail` |
| `setStickerSetThumbnail(String name, long user_id, String thumbnail, StickerFormat format)` | Set sticker set thumbnail (file_id or URL) | `name`: Sticker set name, `user_id`: User ID, `thumbnail`: Thumbnail file_id/URL, `format`: Thumbnail format | `SetStickerSetThumbnail` |
| `setCustomEmojiStickerSetThumbnail(String name)` | Set custom emoji sticker set thumbnail | `name`: Sticker set name | `SetCustomEmojiStickerSetThumbnail` |
| `deleteStickerSet(String name)` | Delete sticker set | `name`: Sticker set name | `DeleteStickerSet` |

## Inline Query Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `answerInlineQuery(String inline_query_id, InlineQueryResult[] results)` | Answer inline query | `inline_query_id`: Inline query ID, `results`: Array of inline query results | `AnswerInlineQuery` |
| `savePreparedInlineMessage(long user_id, InlineQueryResult result)` | Save prepared inline message | `user_id`: User ID, `result`: Inline query result | `SavePreparedInlineMessage` |
| `answerWebAppQuery(String web_app_query_id, InlineQueryResult result)` | Answer web app query | `web_app_query_id`: Web app query ID, `result`: Inline query result | `AnswerWebAppQuery` |

## Payment Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `createInvoiceLink(String title, String description, String payload, String currency, LabeledPrice[] prices)` | Create invoice link | `title`: Product title, `description`: Product description, `payload`: Invoice payload, `currency`: Currency code, `prices`: Price breakdown | `CreateInvoiceLink` |
| `answerShippingQuery(String shipping_query_id, boolean ok)` | Answer shipping query | `shipping_query_id`: Shipping query ID, `ok`: Delivery possible | `AnswerShippingQuery` |
| `answerPreCheckoutQuery(String pre_checkout_query_id, boolean ok)` | Answer pre-checkout query | `pre_checkout_query_id`: Pre-checkout query ID, `ok`: Order ready | `AnswerPreCheckoutQuery` |

## Game Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `setGameScore(long chat_id, long user_id, int score, int message_id)` | Set game score | `chat_id`: Target chat, `user_id`: User ID, `score`: New score, `message_id`: Message ID | `SetGameScore` |
| `setGameScore(String inline_message_id, long user_id, int score)` | Set inline game score | `inline_message_id`: Inline message ID, `user_id`: User ID, `score`: New score | `SetGameScore` |
| `getGameHighScores(long chat_id, long user_id, int message_id)` | Get game high scores | `chat_id`: Target chat, `user_id`: User ID, `message_id`: Message ID | `GetGameHighScores` |
| `getGameHighScores(String inline_message_id, long user_id)` | Get inline game high scores | `inline_message_id`: Inline message ID, `user_id`: User ID | `GetGameHighScores` |

## Bot Settings Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `setMyCommands(BotCommand[] commands)` | Set bot commands | `commands`: Array of bot commands | `SetMyCommands` |
| `deleteMyCommands()` | Delete bot commands | None | `DeleteMyCommands` |
| `getMyCommands()` | Get bot commands | None | `GetMyCommands` |
| `setChatMenuButton()` | Set chat menu button | None | `SetChatMenuButton` |
| `getChatMenuButton()` | Get chat menu button | None | `GetChatMenuButton` |
| `setMyDefaultAdministratorRights()` | Set default admin rights | None | `SetMyDefaultAdministratorRights` |
| `getMyDefaultAdministratorRights()` | Get default admin rights | None | `GetMyDefaultAdministratorRights` |
| `getMyName()` | Get bot name | None | `GetMyName` |
| `setMyName()` | Set bot name | None | `SetMyName` |
| `getMyDescription()` | Get bot description | None | `GetMyDescription` |
| `setMyDescription()` | Set bot description | None | `SetMyDescription` |

## User Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getUserProfilePhotos(long user_id)` | Get user profile photos | `user_id`: User ID | `GetUserProfilePhotos` |
| `setUserEmojiStatus(long user_id)` | Set user emoji status | `user_id`: User ID | `SetUserEmojiStatus` |
| `getUserChatBoosts(Object chat_id, long user_id)` | Get user chat boosts | `chat_id`: Target chat, `user_id`: User ID | `GetUserChatBoosts` |

## Business Account Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getBusinessConnection(String business_connection_id)` | Get business connection | `business_connection_id`: Business connection ID | `GetBusinessConnection` |
| `readBusinessMessage(long chat_id, String business_connection_id, int message_id)` | Read business message | `chat_id`: Chat ID, `business_connection_id`: Business connection ID, `message_id`: Message ID | `ReadBusinessMessage` |
| `deleteBusinessMessages(String business_connection_id, Integer[] message_ids)` | Delete business messages | `business_connection_id`: Business connection ID, `message_ids`: Array of message IDs | `DeleteBusinessMessages` |
| `setBusinessAccountName(String business_connection_id, String first_name)` | Set business account name | `business_connection_id`: Business connection ID, `first_name`: First name | `SetBusinessAccountName` |
| `setBusinessAccountUsername(String business_connection_id)` | Set business account username | `business_connection_id`: Business connection ID | `SetBusinessAccountUsername` |
| `setBusinessAccountBio(String business_connection_id)` | Set business account bio | `business_connection_id`: Business connection ID | `SetBusinessAccountBio` |
| `setBusinessAccountProfilePhoto(String business_connection_id, InputProfilePhoto photo)` | Set business account profile photo | `business_connection_id`: Business connection ID, `photo`: Profile photo | `SetBusinessAccountProfilePhoto` |
| `removeBusinessAccountProfilePhoto(String business_connection_id)` | Remove business account profile photo | `business_connection_id`: Business connection ID | `RemoveBusinessAccountProfilePhoto` |
| `setBusinessAccountGiftSettings(String business_connection_id, boolean show_gift_button, AcceptedGiftTypes accepted_gift_types)` | Set business account gift settings | `business_connection_id`: Business connection ID, `show_gift_button`: Show gift button, `accepted_gift_types`: Accepted gift types | `SetBusinessAccountGiftSettings` |
| `getBusinessAccountStarBalance(String business_connection_id)` | Get business account star balance | `business_connection_id`: Business connection ID | `GetBusinessAccountStarBalance` |
| `transferBusinessAccountStars(String business_connection_id, short star_count)` | Transfer business account stars | `business_connection_id`: Business connection ID, `star_count`: Star count | `TransferBusinessAccountStars` |
| `getBusinessAccountGifts(String business_connection_id)` | Get business account gifts | `business_connection_id`: Business connection ID | `GetBusinessAccountGifts` |
| `convertGiftToStars(String business_connection_id, String owned_gift_id)` | Convert gift to stars | `business_connection_id`: Business connection ID, `owned_gift_id`: Owned gift ID | `ConvertGiftToStars` |
| `upgradeGift(String business_connection_id, String owned_gift_id)` | Upgrade gift | `business_connection_id`: Business connection ID, `owned_gift_id`: Owned gift ID | `UpgradeGift` |
| `transferGift(String business_connection_id, String owned_gift_id, long new_owner_chat_id)` | Transfer gift | `business_connection_id`: Business connection ID, `owned_gift_id`: Owned gift ID, `new_owner_chat_id`: New owner chat ID | `TransferGift` |
| `postStory(String business_connection_id, InputStoryContent content, Integer active_period)` | Post story | `business_connection_id`: Business connection ID, `content`: Story content, `active_period`: Active period | `PostStory` |
| `editStory(String business_connection_id, Integer story_id, InputStoryContent content)` | Edit story | `business_connection_id`: Business connection ID, `story_id`: Story ID, `content`: Story content | `EditStory` |
| `deleteStory(String business_connection_id, Integer story_id)` | Delete story | `business_connection_id`: Business connection ID, `story_id`: Story ID | `DeleteStory` |

## Star Transactions Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getStarTransactions()` | Get star transactions | None | `GetStarTransactions` |
| `refundStarPayment(long user_id, String telegram_payment_change_id)` | Refund star payment | `user_id`: User ID, `telegram_payment_change_id`: Telegram payment change ID | `RefundStarPayment` |
| `editUserStarSubscription(long user_id, String telegram_charge_id, boolean is_cancelled)` | Edit user star subscription | `user_id`: User ID, `telegram_charge_id`: Telegram charge ID, `is_cancelled`: Is cancelled | `EditUserStarSubscription` |

## Verification Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `verifyUser(long user_id)` | Verify user | `user_id`: User ID | `VerifyUser` |
| `verifyUChat(Object chat_id)` | Verify chat | `chat_id`: Chat ID | `VerifyChat` |
| `removeUserVerification(long user_id)` | Remove user verification | `user_id`: User ID | `RemoveUserVerification` |
| `removeChatVerification(Object chat_id)` | Remove chat verification | `chat_id`: Chat ID | `RemoveChatVerification` |

## Gift Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `giftPremiumSubscription(long user_id, Integer month_count, Integer star_count)` | Gift premium subscription | `user_id`: User ID, `month_count`: Month count, `star_count`: Star count | `GiftPremiumSubscription` |
| `getAvailableGifts()` | Get available gifts | None | `GetAvailableGifts` |

## State Management Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `setState(long chat_id, long user_id, String name)` | Set state (group chat) | `chat_id`: Chat ID, `user_id`: User ID, `name`: State name | `void` |
| `setState(long user_id, String name)` | Set state (private chat) | `user_id`: User ID, `name`: State name | `void` |
| `clearState(long chat_id, long user_id)` | Clear state (group chat) | `chat_id`: Chat ID, `user_id`: User ID | `void` |
| `clearState(long user_id)` | Clear state (private chat) | `user_id`: User ID | `void` |
| `getStateData(long chat_id, long user_id)` | Get state data (group chat) | `chat_id`: Chat ID, `user_id`: User ID | `Map<String, Object>` |
| `getStateData(long user_id)` | Get state data (private chat) | `user_id`: User ID | `Map<String, Object>` |

## Update Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `getUpdates()` | Get updates | None | `GetUpdates` |

## Callback Query Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `answerCallbackQuery(String callback_query_id)` | Answer callback query | `callback_query_id`: Callback query ID | `AnswerCallbackQuery` |
| `answerCallbackQuery(String callback_query_id, String text)` | Answer callback query with text | `callback_query_id`: Callback query ID, `text`: Notification text | `AnswerCallbackQuery` |

## Live Location Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `stopMessageLiveLocation(Object chat_id, int message_id)` | Stop message live location | `chat_id`: Target chat, `message_id`: Message ID | `StopMessageLiveLocation` |
| `stopMessageLiveLocation(String inline_message_id)` | Stop inline message live location | `inline_message_id`: Inline message ID | `StopMessageLiveLocation` |

## Passport Methods

| Method | Description | Parameters | Return Type |
|--------|-------------|------------|-------------|
| `setPassportDataErrors(long user_id, PassportElementError[] errors)` | Set passport data errors | `user_id`: User ID, `errors`: Array of passport element errors | `SetPassportDataErrors` |