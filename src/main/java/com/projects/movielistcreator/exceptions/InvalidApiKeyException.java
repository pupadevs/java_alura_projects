package com.projects.movielistcreator.exceptions;

public class InvalidApiKeyException extends  RuntimeException{

    public InvalidApiKeyException(){
        super("API-KEY invalida!!");
    }
}
