package com.projects.catalogo.entity.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

public class Categoria implements StringValueObject, StringRequestInterface {

    private String categoria;

    public Categoria(String categoria) throws StringRequestException {
        this.stringRequest(categoria);
        this.categoria = categoria;
    }



    @Override
    public String ToString() {
        return this.categoria;

    }

    public void stringRequest(String nombre) throws StringRequestException {
        if(nombre == null || nombre.length() < 2){
            throw  new StringRequestException();
        }
    }
}
