package edu.studenorder.exception;

public class CityRegisterException extends Exception {
    private String code;

    public CityRegisterException(String message) {
        super(message);
    }

    public CityRegisterException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CityRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }
}
