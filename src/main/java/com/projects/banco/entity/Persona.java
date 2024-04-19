package com.projects.banco.entity;

import com.projects.banco.entity.stringvalueobject.cliente.Email;
import com.projects.banco.entity.stringvalueobject.cliente.Nombre;
import com.projects.banco.entity.stringvalueobject.cliente.Password;

abstract class Persona {

    private Nombre nombre;
    private Email email;

    private Password password;

    public Persona(Nombre nombre, Email email, Password password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public Nombre getNombre() {
        return nombre;
    }
    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }



    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }





}
