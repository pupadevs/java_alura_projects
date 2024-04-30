package com.projects.movielistcreator.domain.valueObject;

import com.google.gson.annotations.SerializedName;
import com.projects.Helper.StringValueObject;
import com.projects.movielistcreator.domain.StringRequestInterface;

public class Title implements StringValueObject, StringRequestInterface {

    @SerializedName("Title")

    private String title;

    public Title(String nombre) throws StringRequestException {
      stringRequest(nombre);
        this.title = nombre;
    }

    @Override
    public String ToString() {
        return this.title;
    }

    public String getNombre(){
        return title;
    }

    public void stringRequest(String nombre) throws StringRequestException {
        if(nombre == null || nombre.length() < 2){
            throw  new StringRequestException();
        }
    }

}
