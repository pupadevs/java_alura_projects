package com.projects.movielistcreator.utils;

import com.projects.movielistcreator.domain.entity.Movie;

public class Table {

    public static void PrintTablero(Movie pelicula){
        System.out.println("+--------------------------------------+----------------------------+------------------------------+--------------------+---------------+");
        System.out.println("|                 Id                   |           Titulo           |           Categoria          |       Duracion     |       Año     |");
        System.out.println("+--------------------------------------+----------------------------+------------------------------+--------------------+---------------+");

            System.out.println(pelicula.toString());

        System.out.println("+--------------------------------------+----------------------------+------------------------------+--------------------+---------------+");

    }
}

