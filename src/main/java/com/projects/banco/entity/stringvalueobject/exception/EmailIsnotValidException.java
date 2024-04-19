package com.projects.banco.entity.stringvalueobject.exception;

public class EmailIsnotValidException extends Exception{
    public EmailIsnotValidException() {
        super("El email debe ser valido");
    }

}
