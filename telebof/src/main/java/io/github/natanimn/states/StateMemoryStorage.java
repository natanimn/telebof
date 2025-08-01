package io.github.natanimn.states;

import java.util.Map;
import java.util.HashMap;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class StateMemoryStorage {
    private final Map<Long, Map<Long, Map<String, Object>>> chatStorage = new HashMap<>();
    private final Map<Long, Map<String, Object>> userStorage = new HashMap<>();

    public void save(long chatId, long userId, String name) {

        if (chatStorage.get(chatId) != null) {
            if (chatStorage.get(chatId).get(userId) != null) {
                chatStorage.get(chatId).get(userId).put("state", name);
            } else {
                Map<String, Object> data = new HashMap<>();
                data.put("state", name);
                data.put("data", new HashMap<>());
                chatStorage.get(chatId).put(userId, data);
            }

        } else {
            Map<Long, Map<String, Object>> state = new HashMap<>();
            Map<String, Object> userState = new HashMap<>();
            userState.put("state", name);
            userState.put("data", new HashMap<>());
            state.put(userId, userState);
            chatStorage.put(chatId, state);
        }
    }

    public void save(long userId, String name){
        if (userStorage.get(userId) != null){
            userStorage.get(userId).put("state", name);

        } else {
            Map<String, Object> state = new HashMap<>();
            state.put("state", name);
            state.put("data", new HashMap<>());
            userStorage.put(userId, state);
        }
    }

    public void clear(long chatId, long userId){
        if (chatStorage.get(chatId) != null) {
            if (chatStorage.get(chatId).get(userId) != null) {
                chatStorage.get(chatId).remove(userId);
            }
        }
    }

    public void clear(long userId){
        if (userStorage.get(userId) != null) {
            userStorage.remove(userId);
        }
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> getData(long chatId, long userId){
        if (chatStorage.get(chatId) != null && chatStorage.get(chatId).get(userId) != null){
            return (Map<String, Object>) chatStorage.get(chatId).get(userId).get("data");
        } else return null;
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> getData(long userId){
        if (userStorage.get(userId) != null){
            return (Map<String, Object>) userStorage.get(userId).get("data");
        } else return null;
    }

    public String getName(long chatId, long userId){
        if (chatStorage.get(chatId) != null && chatStorage.get(chatId).get(userId) != null){
            return (String) chatStorage.get(chatId).get(userId).get("state");
        }
        else return null;
    }

    public String getName(long userId){
        if (userStorage.get(userId) != null){
            return (String) userStorage.get(userId).get("state");
        } else return null;
    }

}
