package com.projects.catalogo.classes;

import com.projects.catalogo.classes.stringvalueObject.Catalogo.Nombre;

import javax.naming.Name;
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
