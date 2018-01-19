package br.com.kafka.exception;

/**
 * Enum that includes error codes for the different search engine projects.
 * These messages include both an integer and a default message
 */
public enum ErrorCodes {

    // GENERAL
    NOT_FOUND               (101, "Client not found"),

    ;

    private final Integer code;
    private final String message;

    private ErrorCodes(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + message;
    }
}
