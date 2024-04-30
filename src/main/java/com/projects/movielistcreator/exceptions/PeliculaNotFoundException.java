package com.projects.movielistcreator.exceptions;

public class PeliculaNotFoundException extends RuntimeException {

    public PeliculaNotFoundException() {
        super("La pelicula que desea buscar, no esta en nuestra base de datos.");
    }
}
