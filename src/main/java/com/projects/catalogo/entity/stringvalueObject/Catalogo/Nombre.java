package com.projects.catalogo.entity.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

public class Nombre implements StringValueObject, StringRequestInterface {

    private String nombre;

    public Nombre(String nombre) throws StringRequestException {
       stringRequest(nombre);
        this.nombre = nombre;
    }

    @Override
    public String ToString() {
        return this.nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void stringRequest(String nombre) throws StringRequestException {
        if(nombre == null || nombre.length() < 2){
            throw  new StringRequestException();
        }
    }

}
