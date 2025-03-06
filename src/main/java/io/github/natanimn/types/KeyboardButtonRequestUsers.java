package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class KeyboardButtonRequestUsers implements Serializable {
    private Long request_id;
    private Boolean user_is_bot, user_is_premium, request_name, request_username, request_photo;
    private Integer max_quantity;

    public KeyboardButtonRequestUsers(long requestId) {
        this.request_id = requestId;
    }

    public KeyboardButtonRequestUsers userIsBot(boolean userIsBot) {
        this.user_is_bot = userIsBot;
        return this;
    }

    public KeyboardButtonRequestUsers userIsPremium(boolean userIsPremium) {
        this.user_is_premium = userIsPremium;
        return this;
    }

    public KeyboardButtonRequestUsers maxQuantity(Integer max_quantity){
        this.max_quantity = max_quantity;
        return this;
    }

    public  KeyboardButtonRequestUsers requestName(boolean request_name){
        this.request_name = request_name;
        return this;
    }

    public  KeyboardButtonRequestUsers requestUsername(boolean request_username){
        this.request_username = request_username;
        return this;
    }

    public  KeyboardButtonRequestUsers requestPhoto(boolean request_photo){
        this.request_photo = request_photo;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        KeyboardButtonRequestUsers that = (KeyboardButtonRequestUsers) object;
        return Objects.equals(request_id, that.request_id) && Objects.equals(user_is_bot, that.user_is_bot) &&
                Objects.equals(user_is_premium, that.user_is_premium) && Objects.equals(request_name, that.request_name) &&
                Objects.equals(request_username, that.request_username) && Objects.equals(request_photo, that.request_photo) &&
                Objects.equals(max_quantity, that.max_quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request_id, user_is_bot, user_is_premium, request_name, request_username, request_photo, max_quantity);
    }
}
