package com.projects.catalogo.classes.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

public class Categoria implements StringValueObject {

    private String categoria;

    public Categoria(String categoria){
        this.categoria = categoria;
    }

    public String categoria() {
        return this.categoria;
    }

    @Override
    public String ToString() {
        return this.categoria;

    }
}
