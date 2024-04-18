package com.projects.catalogo.utils.query;

import com.projects.catalogo.classes.Pelicula;

import static com.projects.catalogo.CatalogoMain.peliculas;

public class MostrarPeliculas {

    public static void verTodasLasPeliculas(){
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
        System.out.println("|                 Id                   |        Titulo        |      Categoria       |       Duracion       |");
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
    }
}
