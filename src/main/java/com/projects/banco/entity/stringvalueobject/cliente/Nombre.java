package com.projects.banco.entity.stringvalueobject.cliente;

import com.projects.Helper.StringValueObject;

public class Nombre implements StringValueObject {

    private String nombre;

    public Nombre(String nombre){

        this.nombre = nombre;
    }

    @Override
    public String ToString() {
        return this.nombre;
    }
}
