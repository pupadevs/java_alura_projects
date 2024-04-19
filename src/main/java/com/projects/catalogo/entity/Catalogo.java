package com.projects.catalogo.entity;

import com.projects.catalogo.entity.stringvalueObject.Catalogo.Nombre;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Pelicula> peliculas;
    private Nombre nombreCatalogo;

    public Catalogo(Nombre nombreCatalogo){
    this.peliculas = new ArrayList<>();
    this.nombreCatalogo = nombreCatalogo;
    }

    public Nombre getNombreCatalogo(){
        return  this.nombreCatalogo;
    }
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void removerPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }


}
