package io.github.natanimn.telebof.types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * JsonFormatter interface class.
 * @author Natanim
 * @since 2.3
 */
public interface JsonFormatter {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    default String toJson(){
        return gson.toJson(this);
    }
}
