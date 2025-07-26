package io.github.natanimn;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import io.github.natanimn.types.bot.BotCommand;
import io.github.natanimn.types.chat_and_user.ChatMember;
import io.github.natanimn.types.media_and_service.GameHighScore;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.Sticker;
import io.github.natanimn.types.updates.Update;

import java.lang.reflect.Type;
import java.util.List;
/**
 * Util class
 * @author Natanim
 * @since March 3, 2025
 * @version 0.1
 */
abstract public class Util {
    static Gson gson = new Gson();

    public static boolean isCommand(String text) {
        if (text == null) return false;
        return text.startsWith("/");
    }

    public static String extractCommand(String text) {
        if (isCommand(text)) {
            try {
                String command;
                if (text.contains("@")) {
                    command = text.split("@")[0].split("/")[1];
                } else {
                    command = text.split("/")[1];
                }
                return command.split(" ")[0];

            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static String extractText(String text) {
        if (isCommand(text)) {
            String[] smart = text.split(" ");
            int len = smart.length;
            if (len == 1) return null;
            List<String> smarts = List.of(smart);
            return String.join(" ", smarts.subList(1, len));
        }
        return null;
    }

    public static String escapeHtml(String text) {
        if (text == null)
            return null;
        else return text
                .replace("&", "&amp;")
                .replace(">", "&gt;")
                .replace("<", "&lt;");

    }


    public static <T> ApiResponse<T> parseApiResponse(String json, Type type) {
        Type responseType = com.google.gson.reflect.TypeToken.getParameterized(ApiResponse.class, type).getType();
        return gson.fromJson(json, responseType);
    }

    public static <T> T parse(Object jsonString, Class<T> res) {
        return gson.fromJson(gson.toJson(jsonString), res);
    }

    public static <T> List<T> parseList(Object object, Class<T> tClass){
        Type $type = com.google.gson.reflect.TypeToken.getParameterized(List.class, tClass).getType();
        String string = gson.toJson(object);
        return gson.fromJson(string, $type);

    }
    public static List<Update> parseUpdates(Object json) {
        Type type = new TypeToken<List<Update>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }

    public static List<Sticker> parseSticker(Object json) {
        Type type = new TypeToken<List<Sticker>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }

    public static List<ChatMember> parseChatMember(Object json) {
        Type type = new TypeToken<List<ChatMember>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }

    public static List<GameHighScore> parseGameHighScore(Object json) {
        Type type = new TypeToken<List<GameHighScore>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }

    public static List<Message> parseMessages(Object json) {
        Type type = new TypeToken<List<Message>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }

    public static List<BotCommand> parseGetMyCommands(Object json) {
        Type type = new TypeToken<List<BotCommand>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }
}


    

