package com.projects.movielistcreator.domain.valueObject;

public class StringRequestException extends RuntimeException{
    public StringRequestException() {
        super("El campo titulo esta nulo o tiene menos de dos caracteres");
    }

    public StringRequestException(String message) {
        super(message);
    }

    public StringRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringRequestException(Throwable cause) {
        super(cause);
    }
}
