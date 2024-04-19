package com.projects.catalogo.entity.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

public class Año implements StringValueObject {

    private String año;

    public Año(int año){
        this.año = String.valueOf(año);
    }
    @Override
    public String ToString() {
        return this.año;
    }
}
