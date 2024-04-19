package com.projects.banco.entity.stringvalueobject.cliente;

import com.projects.Helper.StringValueObject;
import com.projects.banco.entity.stringvalueobject.exception.EmailIsnotValidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements StringValueObject {

    private String email;

    public Email(String email) throws EmailIsnotValidException {
        this.verificarEmail( email);
        this.email = email;
    }
    @Override
    public String ToString() {
        return this.email;
    }

    private void verificarEmail(String email) throws EmailIsnotValidException {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:gmail\\.com|hotmail\\.com)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if (!result) {
            throw new EmailIsnotValidException();
        }


    }
}
