package com.projects.movielistcreator.domain.valueObject;

import com.google.gson.annotations.SerializedName;
import com.projects.Helper.StringValueObject;
import com.projects.movielistcreator.domain.StringRequestInterface;

public class Genre implements StringValueObject, StringRequestInterface {
    @SerializedName("Genre")

    private String categoria;

    public Genre(String categoria)  {
       // this.stringRequest(categoria);
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
