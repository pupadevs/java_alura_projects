package com.projects.catalogo.utils.query;

import com.projects.catalogo.entity.Pelicula;
import com.projects.catalogo.utils.Tablero;

import static com.projects.catalogo.CatalogoMain.peliculas;

public class MostrarPeliculas {

    public static void verTodasLasPeliculas(){


        for (Pelicula pelicula : peliculas) {
            Tablero.PrintTablero(pelicula);
        }

    }
}
