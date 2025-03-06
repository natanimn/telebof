package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultsButton implements Serializable {
    private String text, start_parameter;
    private WebAppInfo web_app_info;

    public InlineQueryResultsButton(String text){
        this.text = text;
    }

    public InlineQueryResultsButton webAppInfo(WebAppInfo webAppInfo){
        this.web_app_info = webAppInfo;
        return this;
    }

    public InlineQueryResultsButton startParameter(String startParameter){
        this.start_parameter = startParameter;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineQueryResultsButton that = (InlineQueryResultsButton) object;
        return Objects.equals(text, that.text) &&
                Objects.equals(start_parameter, that.start_parameter) &&
                Objects.equals(web_app_info, that.web_app_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, start_parameter, web_app_info);
    }
}
