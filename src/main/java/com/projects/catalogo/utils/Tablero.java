package com.projects.catalogo.utils;

import com.projects.catalogo.classes.Pelicula;

public class Tablero {

    public static void PrintTablero(@org.jetbrains.annotations.NotNull Pelicula pelicula){
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
        System.out.println("|                 Id                   |        Titulo        |      Categoria       |       Duracion       |");
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");

            System.out.println(pelicula);

        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");

    }
}

