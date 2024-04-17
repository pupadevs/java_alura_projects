package com.projects.catalogo.classes.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

public class Nombre implements StringValueObject {

    private String nombre;

    public Nombre(String nombre)  {

        this.nombre = nombre;
    }

    @Override
    public String ToString() {
        return this.nombre;
    }

    public String getNombre(){
        return nombre;
    }

}
