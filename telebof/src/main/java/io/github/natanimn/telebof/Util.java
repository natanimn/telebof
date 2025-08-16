package io.github.natanimn.telebof;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import io.github.natanimn.telebof.types.updates.Update;

import java.lang.reflect.Type;
import java.util.List;

/**
 * A Utility class
 * @author Natanim
 * @since March 3, 2025
 * @version 0.9
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

    public static List<Update> parseUpdates(String json) {
        Type type = new TypeToken<List<Update>>() {}.getType();
        return gson.fromJson(gson.toJson(json), type);
    }
}


    

