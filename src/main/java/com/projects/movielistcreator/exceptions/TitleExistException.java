package com.projects.movielistcreator.exceptions;

public class TitleExistException extends  RuntimeException{

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
