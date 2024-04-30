package com.projects.movielistcreator.domain.valueObject;

import com.projects.Helper.StringValueObject;

public class Year implements StringValueObject {

    private String year;

    public Year(String year){
        this.year = year;
    }
    @Override
    public String ToString() {
        return this.year;
    }
}
