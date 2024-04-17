package com.projects.catalogo.classes;


import com.projects.catalogo.classes.stringvalueObject.Catalogo.Categoria;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Duracion;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Nombre;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.PeliculaID;

public class Pelicula {

    private PeliculaID peliculaID;

    private Nombre nombre;

    private Categoria categoria;

    private Duracion duracion;

    public Pelicula(PeliculaID peliculaID, Nombre nombre, Categoria categoria, Duracion duracion){

        this.peliculaID = peliculaID;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public PeliculaID getPeliculaID() {
        return this.peliculaID;
    }

    public Nombre getNombre() {
        return this.nombre;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public Duracion getDuracion(){
        return this.duracion;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-20s | %-20s",
                this.peliculaID.getUuid().getId(),
                this.nombre.toString(),
                this.categoria.toString(),
                this.duracion.toString());
    }
}

