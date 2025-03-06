package io.github.natanimn;


/**
 * Natanim Negash
 *  3 March 2025
 */    /**
 * Natanim Negash
 *  3 March 2025
 */
public class TelegramApiException extends RuntimeException {
    public boolean ok;
    public String description;
    public int error_code;
    public ResponseParameters parameters;

    public TelegramApiException(ApiResponse response) {
        super(String.format("Error code: %d. %s", response.error_code, response.description));
        this.ok = response.ok;
        this.description = response.description;
        this.error_code = response.error_code;
        this.parameters = response.parameters;
    }

    public TelegramApiException(String errorType, int errorCode, ApiResponse response){
        super(String.format("%s: %d. %s", errorType, errorCode, response.description));
        this.ok = response.ok;
        this.description = response.description;
        this.error_code = response.error_code;
        this.parameters = response.parameters;
    }

}