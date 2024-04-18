package com.projects.catalogo.exceptions;

public class TitleExistException extends  Exception{

    public TitleExistException() {
        super("El título ya existe.");
    }

    public TitleExistException(String message) {
        super(message);
    }

    public TitleExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public TitleExistException(Throwable cause) {
        super(cause);
    }
}
