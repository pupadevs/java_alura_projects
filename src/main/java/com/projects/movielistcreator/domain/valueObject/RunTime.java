package com.projects.movielistcreator.domain.valueObject;

import com.projects.Helper.StringValueObject;

public class RunTime implements StringValueObject {



    private String tiempo;

    public RunTime(String tiempo) {
        this.tiempo = tiempo;
    }





    @Override

    public String ToString() {
        return this.tiempo;
    }
}

