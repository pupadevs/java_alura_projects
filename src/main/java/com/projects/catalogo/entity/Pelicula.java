package com.projects.catalogo.entity;


import com.projects.catalogo.entity.stringvalueObject.Catalogo.*;

public class Pelicula {

    private final PeliculaID peliculaID;

    private Nombre nombre;

    private Categoria categoria;

    private Duracion duracion;
    private Año ano;

    public Pelicula(PeliculaID peliculaID, Nombre nombre, Categoria categoria, Duracion duracion,Año ano){

        this.peliculaID = peliculaID;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.ano = ano;
    }

    public static Pelicula createPelicula(Nombre name, Categoria categoria, Duracion duracion, Año ano){
            return new Pelicula(
                    new PeliculaID(),
                    name,
                    categoria,
                    duracion,
                    ano

            );
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
    public Año getAno(){return this.ano;}

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-20s | %-20s | %-20s |",
                this.peliculaID.getUuid().getId(),
                this.nombre.ToString(),
                this.categoria.ToString(),
                this.duracion.ToString(),
                this.ano.ToString());
    }
}

