package com.projects.catalogo.classes.stringvalueObject.Catalogo;

public class NameRequestException extends Exception{
    public NameRequestException() {
        super("El campo titulo esta nulo o tiene menos de dos caracteres");
    }

    public NameRequestException(String message) {
        super(message);
    }

    public NameRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameRequestException(Throwable cause) {
        super(cause);
    }
}
