package com.projects.catalogo.exceptions;

public class PeliculaNotFoundException extends Exception {

    public PeliculaNotFoundException() {
        super("La pelicula que desea buscar, no esta en nuestra base de datos.");
    }
}
