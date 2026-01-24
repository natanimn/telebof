package io.github.natanimn.telebof.exceptions;

import io.github.natanimn.telebof.ApiResponse;
import io.github.natanimn.telebof.types.media_and_service.ResponseParameters;

/**
 * Describes Telegram error
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class TelegramApiException extends RuntimeException {
    public boolean ok;
    public String description;
    public int error_code;
    public ResponseParameters parameters;
    private String name;

    public TelegramApiException(ApiResponse response) {
        super(String.format("Error code: %d. %s", response.error_code, response.description));
        this.ok = response.ok;
        this.description = response.description;
        this.error_code = response.error_code;
        this.parameters = response.parameters;
    }

    public TelegramApiException(int error_code, String description, String name){
        super(String.format("[%s] - %s", name, description));
        this.error_code  = error_code;
        this.description = description;
        this.name = name;
    }

    public TelegramApiException(int error_code, String description, ResponseParameters parameters, String name){
        super(String.format("[%s] - %s", name, description));
        this.error_code  = error_code;
        this.description = description;
        this.parameters  = parameters;
        this.name        = name;
    }

    protected String getName(){
        return name;
    }

    public static <T> TelegramApiException throwIt(ApiResponse<T> response){

        var error_type    = response.description.split(":")[0];
        var error_message = response.description.replaceAll("\\d+", "%d")
                .replaceAll(error_type, "")
                .replaceFirst(":", "")
                .trim();

        return switch (error_type) {
            case "Bad Request" -> new BadRequest(error_message);
            case "Forbidden" -> new Forbidden(error_message);
            case "Too Many Requests" -> new FloodError(response.description, response.parameters);
            default -> new TelegramApiException(response);
        };
    }
}