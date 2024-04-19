package com.projects.catalogo.entity.stringvalueObject.Catalogo;

import com.projects.Helper.StringValueObject;

import java.sql.Time;

public class Duracion implements StringValueObject {

    private Time tiempo;

    public Duracion(Time tiempo) {
        this.tiempo = tiempo;
    }

    public Time getTiempo(){
        return this.tiempo;
    }



    @Override

    public String ToString() {
        return tiempo.toString();
    }
}

