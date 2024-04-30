package com.projects.movielistcreator.domain.valueObject;


import com.projects.Helper.Identifier;
import com.projects.Helper.StringValueObject;

public class PeliculaID implements StringValueObject {
    private Identifier peliculaID;

    public PeliculaID( String peliculaID){
        if (peliculaID == null){
            this.peliculaID =   new Identifier();
        }

    }

    public PeliculaID(){
        if (peliculaID == null){
            this.peliculaID =   new Identifier();
        }else this.peliculaID = peliculaID;
    }

    @Override
    public String ToString() {
        return null;
    }


    public Identifier getUuid() {
        return this.peliculaID;
    }



}

