package com.projects.catalogo.utils.query;

import com.projects.catalogo.classes.Pelicula;
import com.projects.catalogo.exceptions.PeliculaNotFoundException;


import java.util.Scanner;

import static com.projects.catalogo.CatalogoMain.peliculas;

public class BuscarPelicula {
    private  static Scanner input = new Scanner(System.in);
    public static Pelicula buscarPeliculasPorTitulo() throws PeliculaNotFoundException {
        System.out.println("Introduzca el titulo de la pelicula");
        String titulo = input.nextLine();

        for (Pelicula pelicula: peliculas){
            if(pelicula.getNombre().ToString().equalsIgnoreCase(titulo)){
                return pelicula;
            }
        }
        throw new PeliculaNotFoundException();
    }

    public static Pelicula buscarPeliculasPorCategoria() throws PeliculaNotFoundException {
        System.out.println("Introduzca la categoria de la pelicula");
        String categoria = input.nextLine();

        for (Pelicula pelicula: peliculas){
            if(pelicula.getCategoria().ToString().equals(categoria)){

                return pelicula;

            }
        }
        throw new PeliculaNotFoundException();


    }
}
