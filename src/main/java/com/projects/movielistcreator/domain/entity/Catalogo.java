package com.projects.movielistcreator.domain.entity;

import com.projects.movielistcreator.domain.valueObject.Title;
import com.projects.movielistcreator.utils.Table;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {

    //public static ArrayList<Pelicula> peliculas;
    public static Map<String, Movie> peliculas = new HashMap<>(); ;

    private Title titleCatalogo;

    public Catalogo(){
    //this.peliculas =  new HashMap<>();

    }

    public Title getNombreCatalogo(){
        return  this.titleCatalogo;
    }
    public static void agregarPelicula(Movie movie) {
        peliculas.put(String.valueOf(movie.getPeliculaID().ToString()), movie);
    }

    public void removerPelicula(Movie movie) {
        peliculas.remove(movie);
    }

    public static void showAllMovies(){

        for (Map.Entry<String, Movie> entry : peliculas.entrySet()) {
            String id = entry.getKey();
            Movie movie = entry.getValue();
            Table.PrintTablero(movie);
        }


    }


}
