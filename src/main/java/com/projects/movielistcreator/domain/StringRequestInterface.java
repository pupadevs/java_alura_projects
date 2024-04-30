package com.projects.movielistcreator.domain;

import com.projects.movielistcreator.domain.valueObject.StringRequestException;

public interface StringRequestInterface {

    public void stringRequest(String nombre) throws StringRequestException;

}
